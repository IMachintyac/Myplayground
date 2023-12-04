number1=int(input("Enter number 1: "))
number2=int(input("Enter number 2: "))
def add():
    return number1+number2
def sub():
    return number1-number2
def div():
    try:
        number1/number2
        return number1/number2
    except ZeroDivisionError:
        print("Cant divide with Zero")
def multiply():
    return number2*number1

print(f"1)Addition\n2)Subtraction\n3)Division\n4)Multiplication")
userInput=int(input("Enter your Input: "))
if userInput==1:
    print(add())
elif userInput==2:
    print(sub())
elif userInput==3:
    print(div())
elif userInput==4:
    print(multiply())
else:
    print("Please enter valid input")
    
