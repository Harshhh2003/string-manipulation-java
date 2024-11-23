public class CapitalizeWords {
    public static String capitalize(String input) {
        String result = "";
        String[] words = input.split(" ");
        
        for (String word : words) {
            result += word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
        }
        
        return result.trim();
    }

    public static void main(String[] args) {
        String input = "hello world from java";
        String result = capitalize(input);
        System.out.println(result);
    }
}
