# nameList=[]
# scoreList=[]
# x=[]
# for _ in range(int(input("Enter N: "))):
#     name=input("Enter Name: ")
#     score=int(input("Enter Score"))
#     nameList.append(name)
#     scoreList.append(score)
#     y=scoreList.sort()
#     for i in scoreList:
#         if i>min(scoreList):
#             x.append(score.index(i))
#             continue
# x.sort()
# for j in x:
#     print(x.sort())


# lis=[[]]
l1=[1,"Pk"]
l2=[16,"Aak"]
l3=[14,"Aj"]
# # lis[1][1]=[["Pk",20],["Aak",10]]
# print(list)
lis=[l1,l2,l3]
lis.sort()
print(lis)
for i in range(0,3):
    print(lis[i][1])







