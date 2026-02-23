import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        int a = 5;   // default value
        int b = 3;   // default value

        File file = new File("input.txt");

        if (file.exists()) {

            Scanner sc = new Scanner(file);

            if (sc.hasNextInt()) {
                a = sc.nextInt();
            }

            if (sc.hasNextInt()) {
                b = sc.nextInt();
            }

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
