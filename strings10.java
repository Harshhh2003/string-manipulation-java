import java.util.Scanner;

public class strings10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int i = 0, j = s.length() - 1;
        int flag = 0;

        // if flag is 0 it means the string is a palindrome
        while (i < j && flag == 0) {
            if (s.charAt(i) != s.charAt(j)) {
                flag = 1;  
            }
            i++;
            j--;
        }

        if (flag == 0) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        
    }
}
