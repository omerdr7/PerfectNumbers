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

    public static void main(String[] args) {

    }

}
