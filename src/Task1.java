public class Task1 {
    public static int getDifference(int[] array) {
        if (array == null || array.length < 1) {
            System.out.println("Array must have at least 1 element");
            return 0;
        }

        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        return max - min;
    }
    public static void main(String[] args) {

        int[] numbers = {12, 5, 8, 21, 3};
        int result = getDifference(numbers);

        System.out.println("Difference between max and min: " + result);
    }
}
