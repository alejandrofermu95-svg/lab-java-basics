public class Task2 {
    public static void main(String[] args) {

        int[] numbers = {8, 7, 1, 9, 15, 5}; // valores inventados

        findTwoSmallest(numbers);
    }

    public static void findTwoSmallest(int[] numbers) {
        if (numbers == null || numbers.length < 2) {
            System.out.println("Array must have at least 2 elements");
            return;
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                secondSmallest = smallest;
                smallest = numbers[i];
            } else if (numbers[i] < secondSmallest && numbers[i] != smallest) {
                secondSmallest = numbers[i];
            }
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Second smallest: " + secondSmallest);
    }
}
