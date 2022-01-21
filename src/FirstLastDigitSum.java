public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit (int number) {

        if(number < 0) {
            return -1;
        }

        // calculates the least significant number
        int lastDigit = number % 10;

        while (number >= 10) {
            // discards the least significant number until only one digit is left
            number /= 10;
        }

        int firstDigit = number;

        return  firstDigit + lastDigit;
    }
}
