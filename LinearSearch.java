public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return index if target found
            }
        }
        return -1; // Return -1 if target not found
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        int target = 3;
        int result = linearSearch(numbers, target);
        System.out.println("Element " + target + " found at index " + result);
    }
}
