
public class Vendor extends CreditRequestHandler {
	@Override
	public void creditRequest(int amount) throws CreditRequestHandlerException {
		if (amount <= 500)
			if (Math.random() < .2)
				System.out.println("Accepted by the Sales Manager");
			else
				System.out.println("Not accepted by the Sales Manager");
		else
			forwardCreditRequest(amount);
	}
}
