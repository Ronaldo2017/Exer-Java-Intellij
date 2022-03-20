package services;

public class PaypalService implements OnlinePaymentService {

	private static final double PAYMENT_FEE = 0.02;//taxa de pagamento
	private static final double MONTHLY_INTEREST = 0.01;//juro mensal

	//taxa de pagamento
	@Override
	public double paymentFee(double amount) {
		return amount * PAYMENT_FEE;
	}

	//taxa de juros
	@Override
	public double interest(double amount, int months) {
		return amount * months * MONTHLY_INTEREST;
	}
}
