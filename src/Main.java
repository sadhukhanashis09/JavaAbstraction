import com.payment.methods.CreditCardPayment;
import com.payment.methods.UpiPayment;
import com.payment.service.PaymentService;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.makePayment((new CreditCardPayment(5000)));
        System.out.println("***********************************");
        paymentService.makePayment((new UpiPayment(2000)));
    }
}