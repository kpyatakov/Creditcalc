public class CreditPaymentService {
    public double calculate(double month, double summ, double percent) {
        double month_percent = percent / 12 / 100; //процент в месяц

        double a1 = Math.pow(1 + month_percent, month); // возведение в степень для формулы
        double a2 = Math.pow(1 + month_percent, month) - 1; // возведение в степень и минус 1 для формулы
        double payment = month_percent * a1 / a2 * summ;

        return payment;
    }
}