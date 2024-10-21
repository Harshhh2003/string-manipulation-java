import java.util.*;
public class strings2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        String str =  "Harsh bhardwaj";
        String str2 = " and ms dhoni  ";
        System.out.println(str.contains("xyz"));
        System.out.println(str.startsWith("bha"));
        System.out.println(str.endsWith("waj"));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.concat(str2));
     


        
    }
}