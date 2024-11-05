
import java.util.Arrays;

class ITEM {
    int weight;
    int value;

    public ITEM(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}

class Knapsack {

    public int getMaxValue(ITEM[] items, int maxCapacity) {
        int n = items.length;
      
        int[] dp = new int[maxCapacity + 1];

        // Iterate over each item
        for (ITEM item : items) {
            // Traverse capacities in reverse to avoid using the same item multiple times
            for (int currentCapacity = maxCapacity; currentCapacity >= item.weight; currentCapacity--) {
                // Update the DP array with the maximum value achievable
                dp[currentCapacity] = Math.max(dp[currentCapacity], 
                                                dp[currentCapacity - item.weight] + item.value);
            }
        }
        return dp[maxCapacity]; // Return the maximum value for the full capacity
    }
}

public class DAA5 {

    public static void main(String[] args) {
        ITEM[] items = {
            new ITEM(10, 60),
            new ITEM(20, 100),
            new ITEM(30, 120)
        };

        Knapsack knapsack = new Knapsack();
        int maxCapacity = 50;

        int maxProfit = knapsack.getMaxValue(items, maxCapacity);
        System.out.println("Maximum value in Knapsack = " + maxProfit);
    }
}

