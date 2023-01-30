public class Main {

    static boolean isPalindrom(int num) {
        int temp = num, reverseNum = 0, lastNum;
        while (temp != 0) {
            lastNum = temp % 10;
            reverseNum = reverseNum * 10 + lastNum;
            temp /= 10;
        }
        if (reverseNum == num) {
            System.out.println(num + "Palindrom sayıdır.");
            return true;
        }else{
            System.out.println(num + " Palindrom sayı değildir.");
            return false;
        }

    }



    public static void main(String[] args) {
        System.out.println(isPalindrom(404));
    }
}