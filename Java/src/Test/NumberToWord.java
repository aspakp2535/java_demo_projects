package Test;

import java.util.Scanner;

public class NumberToWord {
    private static final String[] units = {"Zero", "One", "Two", "Three", "Four",
                                            "Five", "Six", "Seven", "Eight", "Nine", "Ten",
                                            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
                                            "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty",
                                            "Sixty", "Seventy", "Eighty", "Ninety"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println(convertNumberToWord(num));
    }

    public static String convertNumberToWord(int num) {
        if (num < 0 || num > 9999) {
            return "Number out of range";
        }
        
        if (num == 100) {
            return "One Hundred";
        }

        if (num < 20) {
            return units[num];
        }

        if (num < 100) {
            return tens[num / 10] + ((num % 10 != 0) ? " " : "") + units[num % 10];
        }

        if (num < 1000) {
            return units[num / 100] + " Hundred" + ((num % 100 != 0) ? " " : "") + convertNumberToWord(num % 100);
        }

        return units[num / 1000] + " Thousand" + ((num % 1000 != 0) ? " " : "") + convertNumberToWord(num % 1000);
    }
}

