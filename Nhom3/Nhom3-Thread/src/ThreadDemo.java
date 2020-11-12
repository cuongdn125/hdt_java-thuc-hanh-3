
public class ThreadDemo extends Thread{
    private int num;
    public ThreadDemo(String name,int num){
        super(name);
        this.num=num;
    }
    @Override
    public void run(){
        System.out.println("Bat dau "+getName());
        for (int i = 0; i < num; i++) {
            System.out.println(getName()+" :"+i);
            try{
               sleep(1000);//1000-1s 
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println(getName()+" ket thuc");
    }    
}
