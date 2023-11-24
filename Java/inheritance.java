class Parent{
    int a=24;
}
class Child extends Parent{
    public static void main(String[] args) {
        System.out.print("Number entered is: ");
        Child obj=new Child();
        System.out.print(obj.a);

    }
}