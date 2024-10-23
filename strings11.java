import java.util.Scanner;

public class strings11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

       
        for (int i = 0; i < s.length(); i++) {
            boolean ans = true;

         
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    ans = false;
                    break; 
                }
            }

      
            if (ans) {
                System.out.println(s.charAt(i));
                break;
            }
        }

        sc.close();
    }
}
