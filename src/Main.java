public class Main {
    public static boolean threeIncreasingAdjacent(int[] arr) {
        boolean isTrue = false;

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] + 1 && arr[i - 1] == arr[i - 2] + 1) {
                isTrue = true;
                break;
            }
        }

        return isTrue;
    }

    public static void main(String[] args) {
        System.out.println(threeIncreasingAdjacent(new int[]{45, 23, 44, 68, 65, 70, 80, 81, 82}));
        System.out.println(threeIncreasingAdjacent(new int[]{7, 3, 5, 8, 9, 3, 1, 4}));
        System.out.println(threeIncreasingAdjacent(new int[]{6, 1, 2, 3, 9, 10, 11, 12}));
    }
}