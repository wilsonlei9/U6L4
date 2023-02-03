import java.util.Scanner;
import java.util.Arrays;

class ConverterRunner {
    public static void main(String[] args) {
        System.out.println("Welcome to the Number Converter!");
        System.out.println("--------------------------------");
        System.out.print("Enter the base of your number (2, 8, 10): ");

        Scanner s = new Scanner(System.in);
        String choice = s.nextLine();
        while (!choice.equals("2"))
        {
            if (choice.equals("8"))
            {
                break;
            }
            if (choice.equals("10"))
            {
                break;
            }
            System.out.println("Try again");
            choice = s.nextLine();
        }
        int base = Integer.parseInt(choice);


        System.out.print("Enter your number: ");
        String number = s.nextLine();
        int n = Integer.parseInt(number);


        s.close();

        NumberConverter nc = new NumberConverter(n, base);
        int[] digits = nc.getDigits();
        System.out.println("\n\nDigit array: " + Arrays.toString(digits));
        System.out.print("Number: " + nc.displayOriginalNumber());
        if (base == 2)
        {
            System.out.println("Decimal: " + Arrays.toString(nc.convertToDecimal()));
            System.out.println("Octal: " + Arrays.toString(nc.convertToOctal()));
        }
        if (base == 8)
        {
            System.out.println("Binary: " + Arrays.toString(nc.convertToBinary()));
            System.out.println("Decimal: " + Arrays.toString(nc.convertToDecimal()));
        }
        if (base == 10)
        {
            System.out.println("Binary: " + Arrays.toString(nc.convertToBinary()));
            System.out.println("Octal: " + Arrays.toString(nc.convertToOctal()));
        }

    }
}

