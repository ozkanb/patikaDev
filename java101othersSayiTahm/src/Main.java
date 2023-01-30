import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);
        int right = 0;

        Scanner inp = new Scanner(System.in);


        while (right <5){
            System.out.print("Tahmininizi girin : ");
            int select = inp.nextInt();
            if (select<0 || select>99){
                System.out.println("0-99 arası bir sayı girin !");
                right++;
                System.out.println("Kalan hak : " + (5 - right));
            }
            if (select == number){
                System.out.println("Tebrikler ! Doğru tahmin !");
            }
            else{
                System.out.println("Tutturamadınız !");
                if (select>number){
                    System.out.println(select + " sayısı, gizli sayıdan büyük !");
                }else{
                    System.out.println(select + " sayısı, gizli sayıdan küçük !");
                }
            }
            System.out.println("Random gelen sayı : " + number);
        }
    }
}