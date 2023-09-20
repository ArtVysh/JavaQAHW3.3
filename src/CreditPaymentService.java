public class CreditPaymentService {
    public double calculate(int loanSum, double Rate, int loanTermInMonth) {
        return loanSum * (Rate / 100 / 12) * Math.pow((1 + (Rate / 100 / 12)), loanTermInMonth) / ((Math.pow((1 + (Rate / 100 / 12)), loanTermInMonth) - 1));
    }
}
