# 📈 Exercise 7: Financial Forecasting

### 📘 Scenario:
You are developing a financial forecasting tool that predicts future values based on past data.

### ✅ Steps & Solutions:

#### 1. Understand Recursive Algorithms:

Recursion means a function calling itself repeatedly. It’s helpful when the problem can be broken down into smaller sub-problems.  
In this case, each future prediction is calculated from the previous value, so recursion fits well here.

#### 2. Setup:

Created a method that takes:
- past financial values
- number of years to predict
- and calculates future value recursively

#### 3. Implementation:

Used a recursive method that calculates average growth and applies it for the remaining years using `yearsLeft - 1` until `0`.

#### 4. Analysis:

- **Time Complexity**:  
  `O(n)` — it runs `n` times for `n` years of prediction.

- **Optimization**:  
  Used tail-recursion logic, and in real-world usage, we can go for memoization or convert to loop if needed for larger data to avoid stack overflow.

### 🖼 Output

![Output](./Output/output.png)

### ▶️ Run Instructions

```bash
javac FinancialForecast.java
java FinancialForecast
```