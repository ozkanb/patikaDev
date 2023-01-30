import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı girin : ");
        a = inp.nextInt();


        for (int i = 1; i <= a; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}