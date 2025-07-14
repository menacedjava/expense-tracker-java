import java.util.*;

public class ExpenseTracker {
    public static void main(String[] args) {
        Map<String, Double> expenses = new HashMap<>();
        expenses.put("Food", 120.50);
        expenses.put("Transport", 75.0);
        expenses.put("Internet", 45.99);

        double total = expenses.values().stream().mapToDouble(Double::doubleValue).sum();
        System.out.println("Total expenses: $" + total);
    }
}
