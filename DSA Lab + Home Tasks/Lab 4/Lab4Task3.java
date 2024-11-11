public class Lab4Task3 {
    public static void main(String[] args) {
        String[] words = {"Level", "World", "Madam", "Java", "Mom", "Dad", "Racecar", "Khurram", "Raza", "Noon"};
        for (String word : words) {
            String reversed = new StringBuilder(word.toLowerCase()).reverse().toString();
            if (word.toLowerCase().equals(reversed)) {
                System.out.println(word + " is a palindrome");} else {
                System.out.println(word + " is not a palindrome");}}}}