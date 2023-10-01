import os

#ref - https://realpython.com/python-exceptions/
#ref - https://realpython.com/python-raise-exception/
#ref - https://realpython.com/python-catch-multiple-exceptions/

#os.system("cls")

#print(dir(locals()['__builtins__'])) -- Builtin Exceptions

#try:
#    #raise Exception("Testing it")
#    #assert False,"Assertion Error Generated"
#    raise FileNotFoundError
#
#except AssertionError as error:
#    print("Assertion error",error)
#    pass
#
#except :
#    print("testing default")
#
#print ("Try block over")

try:
    with open("new.txt",mode="r") as readfile:
        pass
except FileNotFoundError as error:
    print(error)
else:
    print("Else block runs")
finally:
    print("printing finally block")
