import com.payment.methods.CreditCardPayment;
import com.payment.service.PaymentService;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.makePayment((new CreditCardPayment(5000)));
    }
}