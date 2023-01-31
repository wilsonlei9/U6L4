public class NumberConverter {
    int[] digits;
    int base;

    public NumberConverter(int number, int base) {
        String numberAsString = Integer.toString(number);
        digits = new int[numberAsString.length()];
        for (int i = 0; i < numberAsString.length(); i++) {
            String single = numberAsString.substring(i,i+1);
            int d = Integer.parseInt(single);
            digits[i] = d;
        }
        this.base = base;
    }

    public String displayOriginalNumber() {
        String o = "";
        for (int i = 0; i < digits.length; i++) {
            o = o + digits[i];
        }
        o = o + "\n";
        return o;
    }

    public int[] getDigits() {
        return digits;
    }

    public int convertToDecimal() {
        int d = 0;
        if (base == 2) {
            for (int i = 0; i < digits.length; i++) {
                d += digits[i] * Math.pow(2, digits.length - (i+1));
            }
        }
        if (base == 8) {
            for (int i = 0; i < digits.length; i++) {
                d += digits[i] * Math.pow(8, digits.length - (i+1));
            }
        }
        return d;
    }

    public int convertToBinary() {
        int number = 0;
        String n = "";
        int binary = 0;
        String b = "";
        if (base == 10)
        {
            for (int i = 0; i < digits.length; i++)
            {
                n += digits[i];
            }
            number = Integer.parseInt(n);
            int[] binaryNum = new int[1000];
            int i = 0;
            while (number > 0)
            {
                binaryNum[i] = number % 2;
                number = number / 2;
                i++;
            }
            for (int j = i - 1; j >= 0; j--)
            {
                b +=binaryNum[j];
            }
            binary = Integer.parseInt(b);
        }

        if (base == 8)
        {
            int d = 0;
            for (int i = 0; i < digits.length; i++) {
                d += digits[i] * Math.pow(8, digits.length - (i+1));
            }
            int[] binaryNum = new int[1000];
            int i = 0;
            while (d > 0)
            {
                binaryNum[i] = d % 2;
                d = d / 2;
                i++;
            }
            for (int j = i - 1; j >= 0; j--)
            {
                b +=binaryNum[j];
            }
            binary = Integer.parseInt(b);
        }
        return binary;
    }

    public int convertToOctal() {
        int d = 0;
        int number = 0;
        String n = "";
        int octal = 0;
        String b = "";
        if (base == 2)
        {
            for (int i = 0; i < digits.length; i++) {
                d += digits[i] * Math.pow(2, digits.length - (i+1));
            }
            int[] binaryNum = new int[1000];
            int i = 0;
            while (d > 0)
            {
                binaryNum[i] = d % 8;
                d = d / 8;
                i++;
            }
            for (int j = i - 1; j >= 0; j--)
            {
                b +=binaryNum[j];
            }
            octal = Integer.parseInt(b);
        }

        if (base == 10)
        {
            for (int i = 0; i < digits.length; i++)
            {
                n += digits[i];
            }
            number = Integer.parseInt(n);
            int[] binaryNum = new int[1000];
            int i = 0;
            while (number > 0)
            {
                binaryNum[i] = number % 8;
                number = number / 8;
                i++;
            }
            for (int j = i - 1; j >= 0; j--)
            {
                b +=binaryNum[j];
            }
            octal = Integer.parseInt(b);
        }
        return octal;
    }
}

