class DemoThread implements Runnable {
    String name;
    Thread t;

    DemoThread(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New thread created");
        t.start();
    }

    public void run() {
        try {
            for(int i = 0; i < 5; i++) {
                System.out.println(name + " : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + name + " was interrupted");
        }
        System.out.println("Thread " + name + " stopped.");
    }
}

class DemoJoin {
    public static void main(String[] args) {
        DemoThread t1 = new DemoThread("T1");
        DemoThread t2 = new DemoThread("T2");
        DemoThread t3 = new DemoThread("T3");

        System.out.println("Thread T1 is running : " + t1.t.isAlive());
        System.out.println("Thread T2 is running : " + t2.t.isAlive());
        System.out.println("Thread T3 is running : " + t3.t.isAlive());

        try {
            System.out.println("Waiting for child threads");
            t1.t.join();
            t2.t.join();
            t3.t.join();
        } catch (InterruptedException e) {
            System.out.println("The thread was stopped.");
        }

        System.out.println("Thread T1 is running : " + t1.t.isAlive());
        System.out.println("Thread T2 is running : " + t2.t.isAlive());
        System.out.println("Thread T3 is running : " + t3.t.isAlive());

        System.out.println("Main thread stopped.");
    }
}
