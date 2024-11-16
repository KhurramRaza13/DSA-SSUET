class Lab5Task3 {
    void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1, n2 = r - m;
        int[] L = new int[n1], R = new int[n2];
        System.arraycopy(arr, l, L, 0, n1);
        System.arraycopy(arr, m + 1, R, 0, n2);
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            arr[k++] = (L[i] <= R[j]) ? L[i++] : R[j++];}
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];}
    void sort(int arr[], int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);}}
    static void printArray(int arr[]) {
        for (int num : arr) System.out.print(num + " ");
        System.out.println();}
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        System.out.println("Given Array");
        printArray(arr);
        Lab5Task3 ob = new Lab5Task3();
        ob.sort(arr, 0, arr.length - 1);
        System.out.println("\nSorted Array");
        printArray(arr);}}