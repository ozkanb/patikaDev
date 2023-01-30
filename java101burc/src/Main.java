import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mount, day;

        Scanner inp = new Scanner(System.in);
        System.out.print("Doğduğunuz ay : ");
        mount = inp.nextInt();
        System.out.print("Doğduğunuz gün : ");
        day = inp.nextInt();

        switch (mount){
            case 1:
                if (day>=1 && day<=31) {
                    if (day < 22) {
                        System.out.println("Oğlak");
                    } else {
                        System.out.println("Kova");
                    }
                } else{
                    System.out.println("Geçersiz bir tarih girdiniz.");
                }
                break;
            case 2:
                if (day>=1 && day<=28) {
                    if (day < 20) {
                        System.out.println("Kova");
                    } else {
                        System.out.println("Balık");
                    }
                } else{
                    System.out.println("Geçersiz bir tarih girdiniz.");
                }
                break;
            case 3:
                if (day>=1 && day<=31) {
                    if (day < 21) {
                        System.out.println("Balık");
                    } else {
                        System.out.println("Koç");
                    }
                } else{
                    System.out.println("Geçersiz bir tarih girdiniz.");
                }
                break;
            case 4:
                if (day>=1 && day<=30) {
                    if (day < 21) {
                        System.out.println("Koç");
                    } else {
                        System.out.println("Boğa");
                    }
                } else{
                    System.out.println("Geçersiz bir tarih girdiniz.");
                }
                break;
            case 5:
                if (day>=1 && day<=31) {
                    if (day < 22) {
                        System.out.println("Boğa");
                    } else {
                        System.out.println("İkizler");
                    }
                } else{
                    System.out.println("Geçersiz bir tarih girdiniz.");
                }
                break;
            case 6:
                if (day>=1 && day<=30) {
                    if (day < 23) {
                        System.out.println("İkizler");
                    } else {
                        System.out.println("Yengeç");
                    }
                } else{
                    System.out.println("Geçersiz bir tarih girdiniz.");
                }
                break;
            case 7:
                if (day>=1 && day<=31) {
                    if (day < 23) {
                        System.out.println("Yengeç");
                    } else {
                        System.out.println("Aslan");
                    }
                } else{
                    System.out.println("Geçersiz bir tarih girdiniz.");
                }
                break;
            case 8:
                if (day>=1 && day<=31) {
                    if (day < 23) {
                        System.out.println("Aslan");
                    } else {
                        System.out.println("Başak");
                    }
                } else{
                    System.out.println("Geçersiz bir tarih girdiniz.");
                }
                break;
            case 9:
                if (day>=1 && day<=30) {
                    if (day < 23) {
                        System.out.println("Başak");
                    } else {
                        System.out.println("Terazi");
                    }
                } else{
                    System.out.println("Geçersiz bir tarih girdiniz.");
                }
                break;
            case 10:
                if (day>=1 && day<=31) {
                    if (day < 23) {
                        System.out.println("Terazi");
                    } else {
                        System.out.println("Akrep");
                    }
                } else{
                    System.out.println("Geçersiz bir tarih girdiniz.");
                }
                break;
            case 11:
                if (day>=1 && day<=30) {
                    if (day < 22) {
                        System.out.println("Akrep");
                    } else {
                        System.out.println("Yay");
                    }
                } else{
                    System.out.println("Geçersiz bir tarih girdiniz.");
                }
                break;
            case 12:
                if (day>=1 && day<=31) {
                    if (day < 22) {
                        System.out.println("Yay");
                    } else {
                        System.out.println("Oğlak");
                    }
                } else{
                    System.out.println("Geçersiz bir tarih girdiniz.");
                }
                break;
        }
    }
}