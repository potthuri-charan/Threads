public class MultipleThread {
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        MultipleThread m=new MultipleThread();
        m.run();
    }
}
