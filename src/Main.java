public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int term1 = 12;
        int term2 = 24;
        int term3 = 36;
        System.out.println();
        double mountlyPay1 = service.calculate(1_000_000, 9.99, term1);
        System.out.println("При сроке кредита " + term1 + " мес. ежемесячный платеж равен: " + (int) mountlyPay1 + " рублей");
        System.out.println();
        double mountlyPay2 = service.calculate(1_000_000, 9.99, term2);
        System.out.println("При сроке кредита " + term2 + " мес. ежемесячный платеж равен: " + (int) mountlyPay2 + " рублей");
        System.out.println();
        double mountlyPay3 = service.calculate(1_000_000, 9.99, term3);
        System.out.println("При сроке кредита " + term3 + " мес. ежемесячный платеж равен: " + (int) mountlyPay3 + " рублей");
    }
}
