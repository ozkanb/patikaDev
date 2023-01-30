import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adı : ");
        userName = input.nextLine();
        System.out.print("Şifre : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("Başarıyla giriş yapıldı");
        }else{
            System.out.println("Bilgiler yanlış");
            System.out.println("Şifre sıfırlamak ister misin ? (E/H)");

            String answer;
            answer = input.nextLine();
            if (answer.equals("E")) {
                System.out.println("Yeni Şifre : ");
                String newPassword;
                newPassword = input.nextLine();
                if (newPassword.equals("java123")) {
                    System.out.println("Son kullanılan şifre kullanılamaz !");
                } else {
                    System.out.println("Yeni şifre oluşturuldu.");
                }
            }
            else {
                System.out.println("......");
                }
        }
    }


}



