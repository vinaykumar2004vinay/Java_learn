import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class seven {
    public static void main(String[] args) {
        // Original array
        int[] prices = {199, 129, 98, 78, 11, 171, 1055};

        // 1. Copy the array
        int[] copiedPrices = Arrays.copyOf(prices, prices.length);
        System.out.println("Copied Array: " + Arrays.toString(copiedPrices));

        // 2. Create a discounted array (50% off)
        int[] discountedPrices = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            discountedPrices[i] = prices[i] / 2;
        }
        System.out.println("Discounted Array: " + Arrays.toString(discountedPrices));

        // 3. Filter prices greater than 100
        List<Integer> filteredList = new ArrayList<>();
        for (int price : prices) {
            if (price > 100) {
                filteredList.add(price);
            }
        }
        int[] filteredPrices = filteredList.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("Filtered Array (>100): " + Arrays.toString(filteredPrices));

        // 4. Sorted array
        int[] sortedPrices = Arrays.copyOf(prices, prices.length);
        Arrays.sort(sortedPrices);
        System.out.println("Sorted Array: " + Arrays.toString(sortedPrices));
    }
}