Ordering System: The system makes it easier to place orders for items or services. It has features for calculating the total price of an order, creating invoices, and sending email notifications to clients.
Classes:
        • CalculateTotalService: This function determines the overall cost of an order by multiplying the quantity by the item's price.
        • GenerateInvoiceService: Manages the production of PDF invoices.
        • PlaceOrderService: Oversees the ordering process, keeping track of addresses and customer information.
        • SendEmailNotificationService: Manages the distribution of email alerts to clients.
        • OrderAction: Represents the act of placing an order and implements the Order interface. To complete the order placement procedure, it makes use of instances of the aforementioned services.
        • TestOrder: Has a primary mechanism for testing the functionality of placing orders.

Interface:
          • Order: Specifies the agreement made while placing an order. A method called placeOrder(String customerName, String address) is included.

![SolidPrinciple](https://github.com/ItsMaynardk/SolidPrinciple/assets/142737277/eb19c411-71bc-41b1-85c1-16fdc280a93f)
