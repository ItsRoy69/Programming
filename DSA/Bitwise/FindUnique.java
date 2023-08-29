public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 4, 2, 6, 4};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int unique = 0;

        for(int n : arr) { //  The loop variable n takes on the value of each element in the array in turn
            unique ^= n;
        }

        return unique;
    }
}