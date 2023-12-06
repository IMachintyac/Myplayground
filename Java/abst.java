 abstract class abst{
    public void Animal(){
        System.out.println("I am normal");
    }
    abstract void  rk();
}
class Demo extends abst{
    void rk(){
        System.out.println("Hi I am Ranir Kapoor");
    }
    public static void main(String[] args) {
    Demo obj=new Demo();
    obj.rk();
    obj.Animal();
            
        
    }
}
