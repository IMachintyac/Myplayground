class A extends Thread{
    public void run(){
        for(int i=0;i<6;i++){
            System.out.println(i);
        }
    }}
    class B extends Thread{
        public void run(){
            for(int i=0;i<6;i++){
                System.out.println(i);
            }
        }
    }
    class Demo{
    public static void main(String[]arg){
        A thread1=new A();
        B thread2=new B();
        thread1.start();
        thread2.start();
    }
}