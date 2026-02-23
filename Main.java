import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        int a = 5;
        int b = 3;

        File file = new File("input.txt");

        if(file.exists()){
            Scanner sc = new Scanner(file);

            if(sc.hasNextInt()){
                a = sc.nextInt();
            }
            if(sc.hasNextInt()){
                b = sc.nextInt();
            }

            sc.close();
        }

        System.out.println("======= JAVA CLOUD PROGRAM =======");
        System.out.println("First number : " + a);
        System.out.println("Second number: " + b);
        System.out.println("----------------------------");
        System.out.println("Addition       : " + (a+b));
        System.out.println("Subtraction    : " + (a-b));
        System.out.println("Multiplication : " + (a*b));
        System.out.println("Division       : " + (b!=0 ? a/b : 0));
    }
}
