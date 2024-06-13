package perfectnumbers;

public class PerfectNumbers {

    public static boolean isPerfect(int sayi) {
        boolean control = false;
        int sumOfFactors = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                sumOfFactors += i;
            }
        }
        if (sumOfFactors == sayi) {
            control = true;
        }
        return control;
    }

    public static int isPerfect2() {
        int sayi = 0;
        for (int i = 1000; i < 10000; i++) {
            if (isPerfect(i)) {
                sayi = i;
            }
        }
        return sayi;
    }

    public static void main(String[] args) {
        System.out.println(isPerfect2());
    }

}
