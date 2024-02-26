import java.util.Scanner;

public class Calculator extends MyPhon {
    public void pilyus() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write number");
        int a = scanner.nextInt();
        System.out.println("write number");
        int b = scanner.nextInt();

        System.out.println("Резултать :"+a + "+" + b + "=" + (a + b));
    }

    public void minus() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write number");
        int a = scanner.nextInt();
        System.out.println("write number");
        int b = scanner.nextInt();

        System.out.println("Резултать :"+a + "-" + b + "=" + (a - b));
    }

    public void miltiplication() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write number");
        int a = scanner.nextInt();
        System.out.println("write number");
        int b = scanner.nextInt();
        System.out.println("Резултать :"+a + "*" + b + "=" + (a * b));

    }


}
