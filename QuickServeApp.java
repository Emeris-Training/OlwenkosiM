import javax.swing.JOptionPane;

public class QuickServeApp {

    public static void main(String[] args) {

        // Collect user input using GUI
        String name = JOptionPane.showInputDialog("Enter Customer Name:");
        String studentNumber = JOptionPane.showInputDialog("Enter Student Number:");
        String item = JOptionPane.showInputDialog("Enter Item Ordered:");

        int quantity = Integer.parseInt(
                JOptionPane.showInputDialog("Enter Quantity:")
        );

        double price = Double.parseDouble(
                JOptionPane.showInputDialog("Enter Price Per Item:")
        );

        // Create Order object
        Order order = new Order(name, studentNumber, item, quantity, price);

        // Perform calculations
        double subtotal = order.calculateSubtotal();
        double discount = order.calculateDiscount();
        double vat = order.calculateVAT();
        double total = order.calculateTotal();

        // Format receipt
        String receipt =
                "====== Campus QuickServe Receipt ======\n\n" +
                "Customer: " + order.getCustomerName() + "\n" +
                "Student Number: " + order.getStudentNumber() + "\n" +
                "Item Ordered: " + order.getItemOrdered() + "\n" +
                "Quantity: " + order.getQuantity() + "\n" +
                "Price Per Item: R" + order.getPricePerItem() + "\n\n" +
                "Subtotal: R" + String.format("%.2f", subtotal) + "\n" +
                "Discount Applied: R" + String.format("%.2f", discount) + "\n" +
                "VAT (15%): R" + String.format("%.2f", vat) + "\n" +
                "Final Total: R" + String.format("%.2f", total);

        // Display receipt
        JOptionPane.showMessageDialog(null, receipt);
    }
}/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author olwenkosimaliba
 */
public class QuickServeApp {
    
}
