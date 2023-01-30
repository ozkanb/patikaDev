import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Basamak sayısını girin : ");
        int n = inp.nextInt();
        int i = 1;
        while(i<=n){
            int k = 1;
            while (k<=(n-i)){
                System.out.print(" ");
                k++;
            }
            int j = 1;
            while (j <= (2*i)-1){
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println(" ");
        }
















        /*for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }*/





















        /*Scanner inp = new Scanner(System.in);
        System.out.print("N sayısını girin : ");
        int n = inp.nextInt();
        double result = 0;


        for (double i = 1; i <= n; i++){
            result += (1/i);
        }
        System.out.println(result);*/
    }
}