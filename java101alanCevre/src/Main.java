import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r, pi = 3.14, alan, cevre, parcaAlan;
        int a;

        Scanner input = new Scanner(System.in);
        Scanner inp = new Scanner(System.in);
        System.out.print("Y.çap değeri girin : ");
        r = input.nextDouble();
        System.out.print("Dilim açı değeri girin : ");
        a = inp.nextInt();

        alan = pi * r * r;
        cevre = 2 * pi * r;
        parcaAlan = (pi * r * r * a) / 360;

        System.out.println("Alan : " + alan);
        System.out.println("Çevre : " + cevre);
        System.out.println("Dilim alan : " + parcaAlan);*/





    }
}