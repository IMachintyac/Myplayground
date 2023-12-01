import java.util.Scanner;
interface A{
    float pi=3.14f;
    float AreaCircle(float radius);
}
interface B{
    float AreaSquare(float side);
}
interface C extends A,B{
}
class Demo implements C{
    float areaC=0;
    public float AreaCircle(float radius){
        areaC=pi*radius*radius;
        System.out.println("Area of Circle will be: ");
        return areaC;
    }
    public float AreaSquare(float side){
        float areaSq=side*side;
        System.out.println("Area of Square will be: ");
        return areaSq;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Demo obj=new Demo();
        System.out.println("Enter Radius of Circle (in cm): ");
        System.out.println(obj.AreaCircle(scan.nextFloat()));
        System.out.println("Enter Side of Sqaure (in cm)");
        System.out.println(obj.AreaSquare(scan.nextFloat()));

    }

}