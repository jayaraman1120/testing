import pandas as pd

# Step 1: Read CSV File
input_file_path = 'path/to/your/input.csv'
df = pd.read_csv(input_file_path)

# Display the input DataFrame
print("Input DataFrame:")
print(df)

# Step 2: Convert Input to Desired Output
df_expanded = df.explode('array')
df_output = df_expanded.rename(columns={'array': 'value'})

# Display the output DataFrame
print("\nOutput DataFrame:")
print(df_output)

# Step 3: Write Output to CSV
output_file_path = 'path/to/your/Downloads/output.csv'
df_output.to_csv(output_file_path, index=False)

print(f"\nOutput written to: {output_file_path}")
