public class CumulativeSum {

    public static void cumulativeSum(int... numbers) {
        int totalSum = 0;
        for (int num : numbers) {
            int cumulativeSum = (num * (num + 1)) / 2;
            totalSum += cumulativeSum; // Add cumulative sum to total sum
            System.out.println("Parameter: " + num + ", Cumulative Sum: " + cumulativeSum);
        }
        System.out.println("Total Sum: " + totalSum);
    }

    public static void main(String[] args) {
        cumulativeSum(4, 5, 10); // Given input parameters
    }
}