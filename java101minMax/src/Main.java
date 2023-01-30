import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int n,sayi;
        int max = 0,min = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz? : ");
        n = inp.nextInt();
        for (int i = 1;i<=n;i++){
            System.out.print(i + ". sayıyı girin : ");
            sayi = inp.nextInt();
            if(i == 1){
                max = sayi;
                min = sayi;
            }else{
                if (sayi>max){
                    max=sayi;
                }else {
                    min = sayi;
                }
            }
        }
        System.out.println("En büyük sayı : " +max);
        System.out.println("En küçük sayı : " +min);
    }
}