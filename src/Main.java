public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double payment = service.calculate(12, 1000000, 9.99); // срок в месяцах
        System.out.println("Ежемесячный платеж по кредиту на 1 год " + Math.round(payment) + " процентная ставка " + "9.99%");

        System.out.println("Ежемесячный платеж по кредиту на 2 года " + Math.round(service.calculate(24, 1000000, 9.99)) + " процентная ставка " + "9.99%");

        System.out.println("Ежемесячный платеж по кредиту на 3 года " + Math.round(service.calculate(36, 1000000, 9.99)) + " процентная ставка " + "9.99%");

    }

}

