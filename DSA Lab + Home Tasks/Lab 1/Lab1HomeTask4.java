package lab1hometask4;
import java.util.ArrayList;
public class Lab1HomeTask4 {
    public static void main(String[] args) {
        String input = "hello world";
        System.out.println("Original: " + input);
        System.out.println("Reversed Vowels: " + reverseVowels(input));
    }
    public static String reverseVowels(String s) {
        ArrayList<Character> vowels = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                vowels.add(c);
            }
        }
        StringBuilder result = new StringBuilder();
        int vowelIndex = vowels.size() - 1;
        for (char c : s.toCharArray()) {
            result.append(isVowel(c) ? vowels.get(vowelIndex--) : c);
        }
        return result.toString();
    }
    private static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}