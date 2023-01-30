import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner inp = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;

        while (right>0) {
            System.out.print("Kullanıcı Adı : ");
            userName = inp.nextLine();
            System.out.print("Şifre : ");
            password = inp.nextLine();
            if (userName.equals("patika") && password.equals("java123")){
                System.out.println("SiberBank'a hoşgeldiniz");
                do {
                    System.out.println("1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgula\n4-Çıkış");
                    System.out.print("Yapmak istediğiniz işlemi seçin : ");
                    select = inp.nextInt();
                    if (select ==1){
                        System.out.println("Para miktarı : ");
                        int price = inp.nextInt();
                        balance += price;
                        System.out.println("Kalan bakiye : " + balance);
                    } else if (select ==2) {
                        System.out.println("Para miktarı : ");
                        int price = inp.nextInt();
                        if (price>balance){
                            System.out.println("Bakiye yetersiz !");
                        }else {
                            balance -= price;
                            System.out.println("Kalan bakiye : " + balance);
                        }
                    } else if (select == 3){
                        System.out.println("Bakiyeniz : " + balance);
                    }
                }while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;

            }else{
                right--;
                System.out.println("Hatalı giriş yaptınız !");
                if (right==0){
                    System.out.println("Hesabınız bloke olmuştur !");
                }else {
                    System.out.println("Kalan hakkınız : " + right);
                }

            }
        }


    }
}