import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner inp = new Scanner(System.in);

        System.out.print("Hava sıcaklığı girin : ");
        heat = inp.nextInt();

        if (heat<5){
            System.out.println("Hava kayak yapmak için çok uygun !");
        } else if (heat>=5 && heat<=25) {
            if (heat <= 15) {
                System.out.println("Hava sinemaya gitmek için çok uygun !");
            }
            if (heat >= 10) {
                System.out.println("Hava piknik yapmak için çok uygun !");
            }
        }
        else {
            System.out.println("Yüzmek için harika bir gün !");
        }

    }
}