import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int math, physics, chemical, lang, history, music;
        double avarage;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notu : ");
        math = inp.nextInt();
        if (0 > math || math > 100) {
            math = 0;
        } else {
            math = math;
        }

        System.out.print("Fizik notu : ");
        physics = inp.nextInt();
        if (0 > physics || physics > 100) {
            physics = 0;
        } else {
            physics = physics;
        }

        System.out.print("Kimya notu : ");
        chemical = inp.nextInt();
        if (0 > chemical || chemical > 100) {
            chemical = 0;
        } else {
            chemical = chemical;
        }


        System.out.print("Türkçe notu : ");
        lang = inp.nextInt();
        if (0 > lang || lang > 100) {
            lang = 0;
        } else {
            lang = lang;
        }

        System.out.print("Tarih notu : ");
        history = inp.nextInt();
        if (0 > history || history > 100) {
            history = 0;
        } else {
            history = history;
        }

        System.out.print("Müzik notu : ");
        music = inp.nextInt();
        if (0 > music || music > 100) {
            music = 0;
        } else {
            music = music;
        }

        avarage = (math + physics + chemical + lang + history + music) / 6;

        if (avarage >= 45) {
            System.out.println("Sınıfı geçti. Not Ort : " + avarage);
        } else {
            System.out.println("Sınıf tekrarı. Not Ort : " + avarage);
        }


    }
}