import java.util.Scanner;

public class convertcelfar {
    public static void main(String[] args) {
        Scanner mamamia = new Scanner(System.in);

        System.out.println("CTOF or FTOC");
        String formu = mamamia.next();

        String ctof = "CTOF";
        String ftoc = "FTOC";

        if (formu.equals("CTOF")) {

            System.out.println("input Celcius");
            double cel = mamamia.nextDouble();

            double far = ((9 * cel) / 5) + 32;

            System.out.println(far);
        }

        if (formu.equals("FTOC")) {

            System.out.println("input Farenheit");
            double far = mamamia.nextDouble();

            double cel = ((far - 32) * 5) / 9;

            System.out.println(cel);
        }

    }
}
