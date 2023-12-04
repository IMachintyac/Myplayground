inputNumber=str(input("Enter Input: "))
i=len(inputNumber)
k=i
print(i)
lis2=[]
lis=[]
flag=False
def Palindrome():
    for j in inputNumber:
        print(j)
        
        lis2.append(j)
    print(lis2)
    k=len(lis2)-1
    while (k>-1):
            
        lis.append(lis2[k])
        k-=1
    print(lis)
    for jit in range(0,len(lis2)): 
        if lis2[jit]==lis[jit]:
            flag= True
            
        else:
            flag =False
        if flag==True:
            g=1
        else:
            g=0
            break
    if g==1:
        print("Palindrome")
    else:
        print("Not a Palindrome")

Palindrome()

        



