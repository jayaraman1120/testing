import json

#convert python to json and print in console

json_python = {
    "name" : "jayaraman",
    "age" : 20,
    "Address" : "DVM",

}

json_o = json.dumps(json_python,sort_keys=False,indent=4,separators=(":","="))

print(json_o)

#convert json to python
json_o = '{"name":"jayaraman","age":20}'

python_json = json.loads(json_o)

#print(python_json)

#print(json.dumps(20))
#print(type(json.dumps(20)))


with open("./Test/json.txt",mode="r") as jsonfile:
    data = json.load(jsonfile)

#print(data)

print(data["name"])
print(type(data))

with open("./Test/jsonwrite.json",mode="w") as jsonwrite:
    json.dump(data,jsonwrite)