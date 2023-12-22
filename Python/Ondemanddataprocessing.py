import pandas as pd
import json

# Step 1: Read CSV File
input_file_path = r'C:\Users\jaya-8047\Downloads\Ondemand_Data_Collector_3287384000004800011.csv'
df = pd.read_csv(input_file_path, encoding='latin1')  # You can try 'latin1' or other encodings


# Display the input DataFrame
print("Input DataFrame:")
print(df)

# Print the 'Output' column before modification
print("\n'Output' column before modification:")
print(df['Output'])

# Step 2: Handle JSON Decode Error and Replace with 'Blank field'
def handle_json_error(x):
    try:
        return json.loads(x.replace("'", '"')) if isinstance(x, str) and x.strip() != '' else x
    except json.JSONDecodeError:
        return 'Blank field'

df['Output'] = df['Output'].apply(handle_json_error)

# Step 3: Explode the List of Dictionaries
df_expanded = df.explode('Output')

# Step 4: Further explode the dictionaries
df_expanded = df_expanded.join(pd.json_normalize(df_expanded['Output'])).drop('Output', axis=1)

# Step 5: Create a new column 'value' containing the key and value
df_expanded['value'] = df_expanded.apply(lambda x: f"{x.name}: {x[x.first_valid_index()]}" if x.name != 'Output' else x[x.first_valid_index()], axis=1)

# Display the output DataFrame
print("\nOutput DataFrame:")
print(df_expanded)

# Step 6: Write Output to CSV
output_file_path = r'C:\Users\jaya-8047\Downloads\output.csv'
df_expanded.to_csv(output_file_path, index=False)

print(f"\nOutput written to: {output_file_path}")
