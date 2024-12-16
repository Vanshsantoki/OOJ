class BMSCollegeThread extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("BMS College of Engineering");
                Thread.sleep(10000); // sleep for 10 seconds
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class CSEThread extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("CSE");
                Thread.sleep(2000); // sleep for 2 seconds
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BMSCollegeThread bmsThread = new BMSCollegeThread();
        CSEThread cseThread = new CSEThread();

        bmsThread.start(); // Start the thread to display "BMS College of Engineering"
        cseThread.start(); // Start the thread to display "CSE"
    }
}
