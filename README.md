# 📦 StockItem Java Demo

A simple Java application demonstrating basic stock management functionality. It was developed as part of an educational assignment to explore object-oriented programming concepts like constructors, constants, method overloading, and basic validation.

## 🧰 Features

- ✅ **Default Stock Initialization**  
  Creates a stock item with pre-defined name, description, quantity, price, and a fixed stock code.

- 📊 **Display Stock Info**  
  Prints current item information including stock type, description, quantity, and code.

- 💷 **VAT Calculation**  
  Computes and displays the item price with 17.5% VAT.

- ➕ **Add Stock**  
  Adds a specified number of items to the current stock (valid range: 1–100).

- ➖ **Sell Stock**  
  Simulates a sale by reducing stock quantity if enough units are available.

## 📁 Project Structure

```plaintext
assignmentWork/
├── TestStockItem.java  // Contains the main method for testing
└── StockItem.java      // Main class implementing stock item behavior
```

🚀 Getting Started
Requirements
Java Development Kit (JDK) 8 or newer

Running the Code
Clone this repository or download the files.

Open the project in your IDE (like IntelliJ or Eclipse), or compile manually via terminal:

```plaintext
javac assignmentWork/StockItem.java assignmentWork/TestStockItem.java
java assignmentWork.TestStockItem
```

You should see output displaying item details, price with VAT, restocking confirmation, and sale simulation.
