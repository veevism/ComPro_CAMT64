import java.util.Scanner;
public class sortnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please input num1");
        int input1 = input.nextInt();

        System.out.println("Please input num2");
        int input2 = input.nextInt();

        System.out.println("Please input num3");
        int input3 = input.nextInt();

        if (input1 >= input2) {
                if (input2 >= input3) {
                    
                    System.out.println(input3+" "+input2+" "+input1);
                }
                else if (input3 >= input1) {
                    
                    System.out.println(input2+" "+input1+" "+input3);
                }
                else if (input1 > input3){

                    System.out.println(input2+" "+input3+" "+input1);
                }
        }

        if (input2 > input1) {
            if (input3 >= input2) {

                System.out.println(input1+" "+input2+" "+input3);
            }
            else if (input3 >= input1) {

                System.out.println(input1+" "+input3+" "+input2);
            }
            else if (input1 > input3) {
                System.out.println(input3+" "+input1+" "+input2);
            }
        }



    }
}
