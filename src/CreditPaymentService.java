public class CreditPaymentService {
    public double calculate(double month, double summ, double percent) {
        double monthPercent = percent / 12 / 100; //процент в месяц

        double a1 = Math.pow(1 + monthPercent, month); // возведение в степень для формулы
        double a2 = Math.pow(1 + monthPercent, month) - 1; // возведение в степень и минус 1 для формулы
        double payment = monthPercent * a1 / a2 * summ;

        return payment;
    }
}