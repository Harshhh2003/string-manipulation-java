public class WordCount {
    public static void main(String[] args) {
        String str = "Java is a popular language";
        int count = countWords(str);
        System.out.println("Number of words: " + count);
    }

    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
}
