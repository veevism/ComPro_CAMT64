import java.util.Scanner;

public class morethan80 {
    public static void main(String[] args) {
        Scanner mamamia = new Scanner(System.in);

        int score = mamamia.nextInt();

        if (score >= 80) {
            System.out.println("You're pass");
        } else {
            System.out.println("You're fail");
        }
    }
}
