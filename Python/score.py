if __name__ == '__main__':
    
    lname=[]
    lscore=[]
    ln2=[]
    lsc2=[]
    for _ in range(int(input())):
        name = input()
        score = float(input())
        lname.append(name)
        lscore.append(score)
    for k in lscore:
        lsc2.append(k)
   
    
    lsc2.sort()
    
    
    min1=min(lsc2)
    for i in range(0,len(lsc2)):
        if lsc2[i]>min1:
            min2=lsc2[i]
            
            break
   
    for j in range(0,len(lscore)):
        
        
        if lscore[j] == min2:
            
            
            ln2.append(lname[j])

    ln2.sort()
    for x in ln2:
        print(x)
   
  