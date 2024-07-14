import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);

        String m1, m2, m3;
        int step;

        m1 = "How many steps do you want an inverted triangle : ";

        System.out.print(m1);
        step = abc.nextInt();

        for (int g = step; g > 0; g--) {


            for (int i = 1; i <= (2 * g) - 1; i++) {
                System.out.print("*");

            }
            System.out.println(" ");
        }
        System.out.println();

    }

}
