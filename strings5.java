import java.util.*;
public class strings5{
    
    public static void main(String[] args) {
        String h = "abcde";
        for(int i = 0; i <= 4; i++) {
            // Declaring j in the second loop
            for(int j = i + 1; j <= 5; j++) {
                System.out.print(h.substring(i, j) + "    ");
            }
        }
    }
}
