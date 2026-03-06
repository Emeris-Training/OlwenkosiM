# Campus QuickServe Ordering System

## Problem Description

The Campus QuickServe Ordering System is a simple Java prototype application created for a campus food vendor. The system allows a user to enter customer and order information, calculate the order total including VAT, apply discounts when applicable, and display a formatted receipt.

The program uses a graphical user interface (GUI) with JOptionPane dialogs to collect input and display the final receipt.

---

## Program Structure

The system is structured using two main classes:

### 1. Order Class
This class represents a customer order and contains the attributes and calculation methods.

Methods included:
- calculateSubtotal()
- calculateDiscount()
- calculateVAT()
- calculateTotal()

### 2. QuickServeApp Class
This is the main application class.

Responsibilities:
- Collect user input using JOptionPane
- Create an Order object
- Call calculation methods from the Order class
- Display the final formatted receipt

---

## How I Approached the Problem

First, I created the project in NetBeans and structured the application using object-oriented programming principles. I created a separate Order class to handle order information and calculations.

The main class (QuickServeApp) was responsible for interacting with the user through GUI dialogs. The program collects order details, performs calculations such as subtotal, discount, VAT, and final total, and then displays the results in a formatted receipt.

The development process was managed using Git and GitHub with regular commits to track progress.

---

## OOP Concepts Used

### Class vs Object
The Order class defines the structure and behavior of an order. An object of the Order class is created in the main program to represent a specific customer order.

### Encapsulation
The variables in the Order class are private, and getter methods are used to access them. This protects the data and follows good object-oriented design principles.

### Constants
A constant variable (VAT_RATE) is used to store the VAT percentage (15%) so it can be reused in calculations.

### Methods
Several methods were created to perform calculations such as subtotal, discount, VAT, and final total. This improves code organization and readability.

---

## Screenshot

Below is a screenshot of the final receipt output:

====== Campus QuickServe Receipt ======

Customer: John
Student Number: 12345
Item: Burger
Quantity: 4
Price per item: R25

Subtotal: R100
Discount Applied: R10
VAT (15%): R13.50
Final Total: R103.50
