public class Main {
    public static void main(String[] args) {

        int BalanceBefore = 85; //баланс до пополнения
        int IncomingPayment = 1800; // сумма пополнения
        int payment = 1000; // сумма при превышении которой начисляются бонусы
        int bonus = IncomingPayment>payment ? ((IncomingPayment-payment) / 100) : (0); // если платеж >1000, то рассчитать бонус с разницы превышающей суммы;
        System.out.println(bonus);
        int BalanceAfter = BalanceBefore+IncomingPayment+bonus; // рассчитать итоговый баланс (баланс до пополнения+ сумма пополнения + бонус)
        System.out.println(BalanceAfter);
    }
}