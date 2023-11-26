import java.util.Scanner;
abstract class Abstraction{
    abstract void Eligibilty();
    int age;
}
class Demo extends Abstraction{
    Scanner sc=new Scanner(System.in);

    void Input(){
        age=sc.nextInt();
    }
    void Eligibilty(){
        if(age>=18){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are too young to vote");
        }
    }
    public static void main(String[] champak) {
        System.out.println("Enter your age: ");
        Demo obj1=new Demo();
        obj1.Input();
        obj1.Eligibilty();

    }
}