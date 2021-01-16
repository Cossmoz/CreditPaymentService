public class CreditPaymentService {
    public float calculate (float yearlyInterestRate, float creditPeriod, float creditAmount) {
        // yearlyInterestRate - годовая процентная ставка
        // creditPeriod - срок кредита
        // creditAmount - сумма кредита
        // формула для расчета взята с https://journal.tinkoff.ru/guide/credit-payment/

        float monthlyInterestRate = (yearlyInterestRate / 12) / 100; // месячная процентная ставка
        float annuityRatio = (float) ((monthlyInterestRate * (Math.pow((1 + monthlyInterestRate), creditPeriod))) /
                (Math.pow((1 + monthlyInterestRate), creditPeriod) - 1)); // коэффициент аннуитета

        int annuityMonthlyPayment = (int) (creditAmount * annuityRatio); //аннуитетный месячный платеж

        return annuityMonthlyPayment;

    }
}
