public class OnlyDigitsCheck {
    public static void main(String[] args) {
        String str = "123456";
        if (isOnlyDigits(str)) {
            System.out.println("String contains only digits");
        } else {
            System.out.println("String does not contain only digits");
        }
    }

    public static boolean isOnlyDigits(String str) {
        return str.matches("\\d+");
    }
}
