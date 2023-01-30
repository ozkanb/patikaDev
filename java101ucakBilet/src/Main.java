import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km,yas,yolcTipi;
        double brKm = 0.10, normTutar,yasIndirim,indirimliFiyat,gdIndirim;


        Scanner inp = new Scanner(System.in);
        System.out.print("Mesafeyi km olarak girin : ");
        km = inp.nextInt();
        System.out.print("Yaşınız : ");
        yas = inp.nextInt();
        System.out.print("Yolculuk tipi (1->Tek Y\u00F6n , 2->Gidi\u015F D\u00F6n\u00FC\u015F) : ");
        yolcTipi = inp.nextInt();

        normTutar = km * brKm;


        switch (yolcTipi){
            case 1:
                if (yas<12){
                    yasIndirim = normTutar / 2;
                    indirimliFiyat = normTutar - yasIndirim;
                    System.out.println("Normal Tutar : " + normTutar);
                    System.out.println("Yaş İndirimi : " + yasIndirim);
                    System.out.println("Toplam Tutar : " + indirimliFiyat);
                } else if (yas>=12 && yas<=24) {
                    yasIndirim = normTutar / 10;
                    indirimliFiyat = normTutar - yasIndirim;
                    System.out.println("Normal Tutar : " + normTutar);
                    System.out.println("Yaş İndirimi : " + yasIndirim);
                    System.out.println("Toplam Tutar : " + indirimliFiyat);
                } else if (yas>=65) {
                    yasIndirim = normTutar * 3 / 10;
                    indirimliFiyat = normTutar - yasIndirim;
                    System.out.println("Normal Tutar : " + normTutar);
                    System.out.println("Yaş İndirimi : " + yasIndirim);
                    System.out.println("Toplam Tutar : " + indirimliFiyat);
                }else{
                    System.out.println("Toplam Tutar : " + normTutar);
                }
                break;
            case 2:
                if (yas<12){
                    yasIndirim = normTutar / 2;
                    gdIndirim = normTutar / 5;
                    indirimliFiyat = normTutar - yasIndirim - gdIndirim;
                    System.out.println("Normal Tutar : " + normTutar);
                    System.out.println("Yaş İndirimi : " + yasIndirim);
                    System.out.println("Gidiş Dönüş İndirimi : " + gdIndirim);
                    System.out.println("Toplam Tutar : " + indirimliFiyat);
                } else if (yas>=12 && yas<=24) {
                    yasIndirim = normTutar / 10;
                    gdIndirim = normTutar / 5;
                    indirimliFiyat = normTutar - yasIndirim - gdIndirim;
                    System.out.println("Normal Tutar : " + normTutar);
                    System.out.println("Yaş İndirimi : " + yasIndirim);
                    System.out.println("Gidiş Dönüş İndirimi : " + gdIndirim);
                    System.out.println("Toplam Tutar : " + indirimliFiyat);
                } else if (yas>=65) {
                    yasIndirim = normTutar * 3 / 10;
                    gdIndirim = normTutar / 5;
                    indirimliFiyat = normTutar - yasIndirim - gdIndirim;
                    System.out.println("Normal Tutar : " + normTutar);
                    System.out.println("Yaş İndirimi : " + yasIndirim);
                    System.out.println("Gidiş Dönüş İndirimi : " + gdIndirim);
                    System.out.println("Toplam Tutar : " + indirimliFiyat);
                }else{
                    gdIndirim = normTutar / 5;
                    indirimliFiyat = normTutar - gdIndirim;
                    System.out.println("Normal Tutar : " + normTutar);
                    System.out.println("Gidiş Dönüş İndirimi : " + gdIndirim);
                    System.out.println("Toplam Tutar : " + indirimliFiyat);
                }
                break;
            default:
                System.out.println("Yolculuk Tipini yanlış seçtiniz !");
        }





    }
}