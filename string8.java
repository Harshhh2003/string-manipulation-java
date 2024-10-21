import java.util.*;
public class string8{
    public static void main(String[] args) {
        StringBuilder  str = new StringBuilder("hello harsh " );
        str.append(" i am 9 years old");
        System.out.println(str);
        StringBuilder str2 =   new StringBuilder("newdelhi");
        str2.setCharAt(1, 'h');
        System.out.println(str2);
        str2.insert( 0, 'v'); System.out.println(str2);
        str2.delete(0, 1);
        System.out.println(str2);
       str2.deleteCharAt(0);
       System.out.println(str2);
        
    }
}