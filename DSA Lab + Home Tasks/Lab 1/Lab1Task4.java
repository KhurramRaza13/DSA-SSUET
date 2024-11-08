package lab1task4;
public class Lab1Task4 {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int length1 = word1.length();
        int length2 = word2.length();
        int minLength = Math.min(length1, length2);
        for (int i = 0; i < minLength; i++) {
            merged.append(word1.charAt(i));
            merged.append(word2.charAt(i));
        }
        if (length1 > minLength) {
            merged.append(word1.substring(minLength));
        }
        if (length2 > minLength) {
            merged.append(word2.substring(minLength));
        }
        return merged.toString();
    }
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2)); // Output: "apbqcr"
    }
}