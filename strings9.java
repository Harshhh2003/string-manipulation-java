// Toggle the Case of Characters in a String
import java.util.*;

public class strings9 {
    public static void main(String[] args) {
        String str = "HaRsh";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result += (char)(ch + 32);
            } else if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 32);
            } else {
                result += ch;
            }
        }
        
        System.out.println("Toggled string: " + result);
    }
}
