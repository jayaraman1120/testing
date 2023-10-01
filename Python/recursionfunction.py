#learning recursive function of python
#https://realpython.com/python-recursion/
import os
import sys, math
os.system("cls")
#sys.setrecursionlimit(3000)

def function():
    x=10
    function()

#function() -- Commenting to stop execution - 1000 times can be called

def factorial(n):
    print(f"function called for this value {n}")
    return_value = 1 if n<=1 else n*factorial(n-1)
    print(f"return is caled with this value {return_value}")
    return return_value

#print(factorial(5))
#print(math.factorial(10))


#counting elements in list
input_list=[]

def count_element(input_list):
    count = 0
    if len(input_list) == 1:
        return 1
    else:
        for ele in input_list:
            if isinstance(ele, list):
                count = count +count_element(ele)
            else:
                count = count + 1
    return count

print(count_element(input_list))