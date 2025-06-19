//Financial Forecasting using Recursion

import java.util.*;

public class FinancialForecast {

    // Recursive prediction based on difference
    public static double predictNextValue(double[] values, int stepsAhead) {
        double[] diffs = new double[values.length - 1];

        // Calculate differences
        for (int i = 0; i < values.length - 1; i++) {
            diffs[i] = values[i + 1] - values[i];
        }

        // Check if all differences are equal
        boolean allSame = true;
        for (int i = 1; i < diffs.length; i++) {
            if (diffs[i] != diffs[0]) {
                allSame = false;
                break;
            }
        }

        double stepDifference;
        if (allSame) {
            stepDifference = diffs[0];
        } else {
            // Find most frequent (mode) difference
            Map<Double, Integer> freqMap = new HashMap<>();
            for (double diff : diffs) {
                freqMap.put(diff, freqMap.getOrDefault(diff, 0) + 1);
            }
            double mode = diffs[0];
            int maxCount = 0;
            for (Map.Entry<Double, Integer> entry : freqMap.entrySet()) {
                if (entry.getValue() > maxCount) {
                    maxCount = entry.getValue();
                    mode = entry.getKey();
                }
            }
            stepDifference = mode;
        }

        // Recursive projection
        return recursiveForecast(values[values.length - 1], stepDifference, stepsAhead);
    }

    // Recursive helper
    private static double recursiveForecast(double currentValue, double stepDiff, int stepsLeft) {
        if (stepsLeft == 0) 
            return currentValue;
        return recursiveForecast(currentValue + stepDiff, stepDiff, stepsLeft - 1);
    }

    // Test it
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of past financial values:");
        int n = sc.nextInt();
        System.out.println("Enter past financial values:");
        double[] pastValues = new double[n];
        for (int i = 0; i < n; i++) {
            pastValues[i] = sc.nextDouble();
        }
        System.out.print("Enter the number of years ahead to predict:");
        int yearsAhead = sc.nextInt();
        double forecast = predictNextValue(pastValues, yearsAhead);
        System.out.printf("Predicted value after %d years: %.2f%n", yearsAhead, forecast);
        sc.close();
    }
}