class EvenThread extends Thread {
    public void run() {
        try {
            for (int i = 2; i <= 20; i += 2) {
                System.out.println("Even Thread: " + i);
                Thread.sleep(2000); 
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class OddThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 19; i += 2) {
                System.out.println("Odd Thread: " + i);
                Thread.sleep(5000); 
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class exp12 {
    public static void main(String[] args) {
        EvenThread t1 = new EvenThread();
        OddThread t2 = new OddThread();

        t1.start();
        t2.start();
    }
}