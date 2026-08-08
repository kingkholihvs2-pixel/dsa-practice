public class NumberChecker {
    public static void main(String[] args) {
        int[] numbers = {12, 7, 25, 8, 33, 4};

        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num + " is even");
            } else {
                System.out.println(num + " is odd");
            }
        }

        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Largest number: " + max);
    }
}