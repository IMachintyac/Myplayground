import java.util.*;
class Duplication{
    public static void main(String[] args) {
        int a[]={20,20,30,40,50,50,50};
        ArrayList<Integer> b=new ArrayList<>();
        int i=0,j=0,count=0;
        for (j=0;j<a.length;j++){
            // System.out.println("I am J"+j);
            for(i=j;i<a.length;i++){
                if(a[j]==a[i]){
                    count=count+1;
                    
                }
                if(count==1){
                    b.add(a[j]);
                }
                count=0;
                System.out.println("I am I"+count);
            }
            // count=0;
            System.out.println("\n");
            // System.out.println("I am J"+count);
            
        }
        System.out.println(b);
    }
}