import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı girin : ");
        int number = inp.nextInt();
        int srcNumber = number;
        int basNumber = 0;
        int basValue;
        int basPow;
        int result = 0;


        while (srcNumber != 0){
            srcNumber /= 10;
            basNumber++;
        }

        srcNumber = number;
        while (srcNumber != 0){
            basValue = srcNumber % 10;
            basPow = 1;
            for (int i = 1; i<=basNumber;i++){
                basPow *= basValue;
            }
            result += basPow;
            srcNumber /= 10;
        }
        if (result == number){
            System.out.println(number + " bir Armstrong sayısıdır.");
        }else{
            System.out.println(number + " bir Armstrong sayısı değilidr.");
        }

    }
}