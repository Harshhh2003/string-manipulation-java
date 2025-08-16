import java.util.*;

public class togglecharacterstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;

            if (ascii >= 65 && ascii <= 90) {  
                // capital ==small
                ascii += 32;
                str.setCharAt(i, (char) ascii);
            } else if (ascii >= 97 && ascii <= 122) { 
                // small --= capital
                ascii -= 32;
                str.setCharAt(i, (char) ascii);
            }
        }
   
        System.out.println(str.toString());
    }
}
