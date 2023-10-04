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

class TestException(Exception):
    print("line1")
    print("line")
    pass



try:
    with open("./Test/json.txt",mode="r") as readfile:
        a=int(input("enter value to print"))
        raise TestException("Testing exception by raising this")
except FileNotFoundError as error:
    print(error)
    #raise IndexError raise another exception
except TestException as error:
    print(error)
except Exception as error:
    print(f"error {type(error).__name__}")
else:
    print("Else block runs")
finally:
    print("printing finally block")

