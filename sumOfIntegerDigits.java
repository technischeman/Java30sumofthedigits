import java.util.Scanner;

public class sumOfIntegerDigits {
    public static void main(String[] args) {
        digitsum();

    }
    public static void digitsum() {
        Scanner input=new Scanner(System.in);
        System.out.println("write a number; ");
        int number=input.nextInt();
        String stringversionx = String.valueOf(number);
        char[] intarr = stringversionx.toCharArray();
        int digitsum = 0;
        for (int i = 0; i < intarr.length; i++) {
            digitsum += Integer.valueOf(String.valueOf(intarr[i]));


        }
        System.out.println("sum of digits; "+digitsum);
    }
}
