import java.util.*;
public class Lab4HomeTask3 {
    public static void main(String[] args) {
        int[] arr = {10, 1, 2, 7, 6, 5};
        int target = 8;
        System.out.println(findCombinations(arr, target));}
    public static List<List<Integer>> findCombinations(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(arr, target, 0, new ArrayList<>(), result);
        return result;}
    private static void backtrack(int[] arr, int target, int start, List<Integer> temp, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(temp));
            return;}
        for (int i = start; i < arr.length && arr[i] <= target; i++) {
            if (i > start && arr[i] == arr[i - 1]) continue;
            temp.add(arr[i]);
            backtrack(arr, target - arr[i], i + 1, temp, result);
            temp.remove(temp.size() - 1);}}}