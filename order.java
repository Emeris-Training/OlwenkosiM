public class Order {

    // Private variables (Encapsulation)
    private String customerName;
    private String studentNumber;
    private String itemOrdered;
    private int quantity;
    private double pricePerItem;

    // Constant for VAT
    public static final double VAT_RATE = 0.15;

    // Constructor
    public Order(String customerName, String studentNumber, String itemOrdered, int quantity, double pricePerItem) {
        this.customerName = customerName;
        this.studentNumber = studentNumber;
        this.itemOrdered = itemOrdered;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    // Calculate subtotal
    public double calculateSubtotal() {
        return quantity * pricePerItem;
    }

    // Calculate discount
    public double calculateDiscount() {
        if (quantity > 3) {
            return calculateSubtotal() * 0.10;
        }
        return 0;
    }

    // Calculate VAT
    public double calculateVAT() {
        double subtotalAfterDiscount = calculateSubtotal() - calculateDiscount();
        return subtotalAfterDiscount * VAT_RATE;
    }

    // Calculate final total
    public double calculateTotal() {
        double subtotalAfterDiscount = calculateSubtotal() - calculateDiscount();
        return subtotalAfterDiscount + calculateVAT();
    }

    // Getters
    public String getCustomerName() {
        return customerName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getItemOrdered() {
        return itemOrdered;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }
}/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author olwenkosimaliba
 */
public class order {
    
}
