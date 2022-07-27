package Store;

import Interfaces.WorkingWithPayment;

public class PaymentProcessor implements WorkingWithPayment {
    @Override
    public boolean pay(double wallet, double currentAmount) {
        return !(wallet < currentAmount);

    }
}
