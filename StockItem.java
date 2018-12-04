/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentWork;

/**
 *
 * @author owengregory
 */
class TestStockItem {

    public static void main(String[] args) {
        StockItem Unknown = new StockItem();

        Unknown.parts();
        Unknown.VAT();
        Unknown.addStock(50);
        Unknown.parts();
        Unknown.sellStock(1);

    }

}

public class StockItem {

    String stockName;
    final String STOCK_CODE;
    String stockDescription;
    int quantityInStock;
    double priceOfTheStockedItem;

    StockItem() {
        stockName = "Unknown Stock Name";
        stockDescription = "Unknown Stock Description";
        quantityInStock = 10;
        priceOfTheStockedItem = 99.99;
        STOCK_CODE = "W101";
        
        
        System.out.println("Creating a stock of " + quantityInStock + " units "
                + stockName + ", the price is £" + priceOfTheStockedItem
                + " each, and the item code is: " + STOCK_CODE + "\n");
    }

    public void parts() {
        System.out.println("Printing item stock information: " + "\n" + "Stock "
                + "type: " + stockName + "\n" + "Description: "
                + stockDescription + "\n" + "Stock code: " + STOCK_CODE
                + "\n" + "Total unit in stock: " + quantityInStock + "\n");
    }

    public void VAT() {
        System.out.println("The price without VAT: £" + priceOfTheStockedItem);
        double withVAT = priceOfTheStockedItem * 1.175;
        System.out.println("The price with VAT: £" + withVAT + "\n");
    }

    public boolean sellStock(int x) {
        if (x < 1) {
            System.out.println("The error was: Sold item must be greater"
                    + " than or equal to one. ");
        }
        if (x > 0 && x <= quantityInStock) {
            System.out.println("Sold " + x + " units");
            return true;
        }
        else return false;
    }

    public void addStock(int i1) {
        if (i1 > 0 && i1 <= 100) {
            System.out.println("Increasing " + i1 + " more units");
            quantityInStock += i1;
        }
        if (i1 < 1) {
            System.out.println("The error was: Increased item must be greater"
                    + " than or equal to one. ");
        }
        if (i1 > 100) {
            System.out.println("The error was: Increased item  cannot exceed"
                    + " 100. ");
        }

    }
}
