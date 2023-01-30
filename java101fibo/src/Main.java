import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a=0,b=1,m,n;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı girin : ");
        n = inp.nextInt();

        System.out.print(0);

        for (int i = 1;i<=n;i++){
            m = a+b;
            a=b;
            b=m;
            System.out.print("  " + a);


        }


    }
}