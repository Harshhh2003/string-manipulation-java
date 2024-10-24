import java.util.Scanner;

public class CheckDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();

        boolean isDigitOnly = true;

   
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                isDigitOnly = false;
                break;
            }
        }


        if (isDigitOnly) {
            System.out.println("The string contains only digits.");
        } else {
            System.out.println("The string contains non-digit characters.");
        }

        sc.close();
    }
}
