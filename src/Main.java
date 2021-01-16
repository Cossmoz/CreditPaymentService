public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int annuityMonthlyPayment12 = (int) service.calculate(9.99F, 12F, 1_000_000F);
        int annuityMonthlyPayment24 = (int) service.calculate(9.99F, 24F, 1_000_000F);
        int annuityMonthlyPayment36 = (int) service.calculate(9.99F, 36F, 1_000_000F);

        System.out.println("Ежемесячный платеж (срок кредита 1 год) " +  annuityMonthlyPayment12 + " Р");
        System.out.println("Ежемесячный платеж (срок кредита 2 года) " +  annuityMonthlyPayment24 + " Р");
        System.out.println("Ежемесячный платеж (срок кредита 3 года) " +  annuityMonthlyPayment36 + " Р");

    }
}
