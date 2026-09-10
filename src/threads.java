class thread1 implements Runnable{
    @Override
    public void run() {
        while(true){
            System.out.println("this is running");
        }
    }
}
class thread2 implements Runnable{
    @Override
    public void run() {
         int i = 0;
        while(i<10){
            System.out.println("this is also running");
            i++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class thread3 extends Thread{

    public void run(){
        System.out.println("2");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
public class threads {

    public static void main(String[] args){

        thread1 t1 = new thread1();
        Thread t01 = new Thread(t1);

        thread2 t2 = new thread2();
        Thread t02 = new Thread(t2);

       // t01.start();
        t02.start();


        try{
            t02.join();
        }
        catch (InterruptedException e){
            System.out.println(e);
        }

        thread3 t3 = new thread3();
        Thread t03 = new Thread(t3,"Omer");

        t03.start();
        System.out.println(t03.getName());
        t03.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t03.getPriority());
        System.out.println(t03.getState());

    }

}
