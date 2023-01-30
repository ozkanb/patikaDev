import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, a=0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı girin : ");
        n = inp.nextInt();

        for (int i = 1;i<n;i++){
            if (n%i == 0){
                a+=i;
            }
        }
        if (n == a){
            System.out.println(n + " mükemmel sayıdır.");
        }else{
            System.out.println(n + " mükemmel sayı değildir.");
        }
    }
}