public class Main {
    public static void main(String[] args) {
        // Calculates digit count of 0.
        System.out.println(getDigitCount(0));

        // Calculates digit count of 123.
        System.out.println(getDigitCount(123));

        // Calculates digit count of -12.
        System.out.println(getDigitCount(-12));

        // Calculates digit count of 5200.
        System.out.println(getDigitCount(5200));

        // Finds the reverse of -121
        System.out.println(reverse(-121));

        // Finds the reverse of 1212
        System.out.println(reverse(1212));

        // Finds the reverse of 1234
        System.out.println(reverse(-1234));

        // Finds the reverse of -100
        System.out.println(reverse(100));

        // Prints 123 in words.
        numberToWords(123);

        // Prints 1010 in words.
        numberToWords(1010);

        // Prints 1000 in words.
        numberToWords(1000);

        // Prints -12 in words.
        numberToWords(-12);
    }

    /**
     * Prints numbers to words.
     */
    public static void numberToWords(int number) {
        // Checks for invalid value.
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        // Stores digit count of number.
        int digit = getDigitCount(number);

        // Stores the reverse of the number.
        int reverse = reverse(number);

        // Checks if reverse is 0.
        if (reverse == 0) {
            System.out.println("Zero");
            return;
        }

        // Stores number of digits in reverse.
        int digitReverse = getDigitCount(reverse);

        // Prints numbers to words
        while (reverse != 0) {
            switch (reverse % 10) {
                case 0 -> System.out.print("Zero ");
                case 1 -> System.out.print("One ");
                case 2 -> System.out.print("Two ");
                case 3 -> System.out.print("Three ");
                case 4 -> System.out.print("Four ");
                case 5 -> System.out.print("Five ");
                case 6 -> System.out.print("Six ");
                case 7 -> System.out.print("Seven ");
                case 8 -> System.out.print("Eight ");
                case 9 -> System.out.print("Nine ");
            }
            reverse /= 10;
        }

        // Prints the missing zeroes.
        if (digitReverse != digit) {
            int difference = digit - digitReverse;
            for (int i = 0; i < difference; i++) {
                System.out.print("Zero ");
            }
        }
        System.out.println();
    }

    /**
     * Returns the reverse of a number.
     */
    public static int reverse(int number) {
        // Stores the number of digits in the number.
        int digit = getDigitCount(Math.abs(number));

        // Stores the digit count.
        int copiedDigit = digit;

        // Stores the reverse number.
        int reverseNumber = 0;

        for (int i = 0; i < digit; i++) {
            int lastDigit = number % 10;
            int tens = 1;
            for (int j = 1; j < copiedDigit; j++) {
                tens *= 10;
            }
            reverseNumber += tens * lastDigit;
            number /= 10;
            copiedDigit--;
        }
        return reverseNumber;
    }
    /**
     * Calculates the number of digits in a number.
     */
    public static int getDigitCount(int number) {
        // Checks for invalid value.
        if (number < 0) {
            return -1;
        }

        // Checks if entered number is 0.
        if (number == 0) {
            return 1;
        }

        // Stores the number of digits in var. number.
        int digit = 0;

        while (number != 0) {
            digit++;
            number /= 10;
        }
        return digit;
    }
}