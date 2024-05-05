public class OrderAction implements  Order {
    private final CalculateTotalService totalService;
    private final PlaceOrderService orderService;
    private final GenerateInvoiceService invoiceService;
    private final SendEmailNotificationService emailService;

    public OrderAction() {
        this.totalService = new CalculateTotalService();
        this.orderService = new PlaceOrderService();
        this.invoiceService = new GenerateInvoiceService();
        this.emailService = new SendEmailNotificationService();
    }

    @Override
    public void placeOrder(String customerName, String address) {
        orderService.placeOrder(customerName, address);
        double total = totalService.calculateTotal(10.0, 2);
        System.out.println("Order total: $" + total);

        invoiceService.generateInvoice("order_123.pdf");
        emailService.sendEmailNotification("johndoe@example.com");
    }
}