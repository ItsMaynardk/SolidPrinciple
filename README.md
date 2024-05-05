## Ordering System
The system simplifies the process of placing orders for items or services. It includes features for calculating the total price of an order, generating invoices, and sending email notifications to clients.

### Classes:
- **CalculateTotalService:** Computes the total cost of an order by multiplying the quantity by the item's price.
- **GenerateInvoiceService:** Manages the creation of PDF invoices.
- **PlaceOrderService:** Oversees the ordering process, managing addresses and customer information.
- **SendEmailNotificationService:** Handles the distribution of email notifications to clients.
- **OrderAction:** Represents the act of placing an order and implements the Order interface. It utilizes instances of the aforementioned services to complete the order placement process.
- **TestOrder:** Provides a primary mechanism for testing the functionality of placing orders.

### Interface:
- **Order:** Specifies the agreement made during order placement. It includes a method called `placeOrder(String customerName, String address)`.


![SolidPrinciple](https://github.com/ItsMaynardk/SolidPrinciple/assets/142737277/eb19c411-71bc-41b1-85c1-16fdc280a93f)
