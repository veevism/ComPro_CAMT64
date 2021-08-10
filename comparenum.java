import java.util.Scanner;
public class comparenum {
    public static void main(String[] args) {
        Scanner mamamia = new Scanner(System.in);

        System.out.println("enter num1");
        int num1 = mamamia.nextInt();

        System.out.println("enter num2");
        int num2 = mamamia.nextInt();

        if (num1 > num2) {

            System.out.println("The first number is greater than the second");
        }
        else if (num1 < num2) {

            System.out.println("The first number is no greater than the second");
        }
        else {

            System.out.println("These two numbers are equal");
        }



    }
}
