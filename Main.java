import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        File file = new File("input.txt");

        int a = 0;
        int b = 0;

        if (file.exists()) {
            Scanner sc = new Scanner(file);
            a = sc.nextInt();
            b = sc.nextInt();
            sc.close();
        }

        System.out.println("======= JAVA CLOUD PROGRAM =======");
        System.out.println("First number  : " + a);
        System.out.println("Second number : " + b);

        System.out.println("----------------------------------");
        System.out.println("Addition       : " + Calculator.add(a, b));
        System.out.println("Subtraction    : " + Calculator.sub(a, b));
        System.out.println("Multiplication : " + Calculator.mul(a, b));
        System.out.println("Division       : " + Calculator.div(a, b));
    }
}