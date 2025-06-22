# 🧾 Exercise 3: PL/SQL Stored Procedures

## 📘 Scenario 1: Monthly Interest for Savings Accounts

**Question:**
Create a stored procedure to process monthly interest for all savings accounts.

* Procedure name: `ProcessMonthlyInterest`
* Adds 1% interest to all accounts with type `'Savings'`
* Executed without any input parameters

📸 **Before Interest Update:**
![Accounts Table Before Interest Update](./Output/01_AccountsTable_BeforeInterestUpdate.png)

📸 **After Interest Update:**
![Account Balance After Transfer](./Output/04_Account_Balance_After_Transfer.png)

## 📘 Scenario 2: Department-Based Employee Bonus

**Question:**
Create a stored procedure that updates employee salaries based on department and a given bonus percentage.

* Procedure name: `UpdateEmployeeBonus`
* Inputs: `DeptId`, `BonusPercent`
* Adds the percentage bonus to employees of that department

📸 **Before Bonus Update:**
![Employees Table Before VIP Update](./Output/02_EmployeesTable_BeforeVIPUpdate.png)

📸 **After Bonus Update:**
![Employees Table After Transfer](./Output/05_Employees_Table_After_Transfer.png)

## 📘 Scenario 3: Fund Transfer Between Accounts

**Question:**
Create a stored procedure to transfer funds between two accounts.

* Procedure name: `TransferFunds`
* Inputs: `FromAccountId`, `ToAccountId`, `Amount`
* Checks balance and transfers if sufficient funds exist, else throws error

📸 **Before Transfer (With Error):**
![Transfer Error](./Output/03_TransferFunds_InsufficientBalance_Error.png)

📸 **Successful Transfer – Updated Balance:**
![Account Balance After Transfer](./Output/04_Account_Balance_After_Transfer.png)

## ▶️ How to Run

```sql
-- Run monthly interest for savings accounts
EXEC ProcessMonthlyInterest;

-- Add 10% bonus to employees in department 101
EXEC UpdateEmployeeBonus(101, 10);

-- Attempt fund transfer
EXEC TransferFunds(1, 2, 500);
```