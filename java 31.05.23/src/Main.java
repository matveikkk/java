import java.util.Scanner;

public class Main {
    public static void timer(int x){
        int min = x / 60;
        int sec = x % 60;

        for (int j = x;) j >= 0; j--) {
            System.out.println("min =" + min + ", sec = " + sec);
            sec--;
            if (sec < 0) {
                sec = 60;
                min--;
            }
            try {
                Thread.sleep(100);
            }    catch (InterruptedException e) {
                throw new RuntimeException(e);
                System.out.println("times up");
            }
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while(i < 10) {
            i++;
            System.out.println("i = " + i);
        }
        int x = scanner.nextInt();
        for(int j = 1; j < x; j++)
            System.out.println("j = " + j);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
                System.out.println("times up")
            }


    }

}