import java.util.Scanner;
class Average{
    public static void main(String[] args) {
        int n;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter Number of Products: ");
            n=scan.nextInt();
            int i;
            int sum=0;
            int avg=0;
            int pid[]=new int[n];
            String pname[]=new String[n];
            int pprice[]=new int[n];
            for (i=0;i<n;i++){
                System.out.print("Enter Product id: ");
                pid[i]=scan.nextInt();
                System.out.print("Enter Product's Name: ");
                pname[i]=scan.next();
                System.out.print("Enter Product's Price: ");
                pprice[i]=scan.nextInt();
            }
            System.out.print(pprice[2]);
            for(int j=0;j<n;j++){
                sum+=pprice[j];
            }
            System.out.println("Average of Product Price: ");
            avg=sum/n;
            System.out.print(avg);
        }
    }
}