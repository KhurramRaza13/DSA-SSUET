package lab1hometask5;
public class Lab1HomeTask5 {
    public static void main(String[] args) {
        String sentence = "Write a Java program to find the longest word";
        String longest = findLongestWord(sentence);
        System.out.println("Longest Word: " + longest);
    }
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}