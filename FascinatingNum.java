import java.util.*;

public class FascinatingNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int product1 = num * 1;
        int product2 = num * 2;
        int product3 = num * 3;

        String concat = "" + product1 + product2 + product3;

        if (isFascinating(concat)) {
            System.out.println(num + " is a fascinating number");
        } else {
            System.out.println(num + " is NOT a fascinating number");
        }
    }

    public static boolean isFascinating(String str) {
        if (str.length() != 9) {
            return false;
        }

        boolean[] digits = new boolean[10]; 
        for (char ch : str.toCharArray()) {
            int digit = ch - '0';
            if (digit == 0 || digits[digit]) {
                return false; 
            }
            digits[digit] = true;
        }

        return true; 
    }
}
