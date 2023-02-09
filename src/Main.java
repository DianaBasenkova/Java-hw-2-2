public class Main {
    public static void main(String[] args) {

        int balanceBefore = 85; //баланс до пополнения
        int incomingPayment = 900; // сумма пополнения
        int payment = 1000; // сумма при превышении которой начисляются бонусы
        int bonus = incomingPayment>payment ? ((incomingPayment - payment) / 100) : (0); // если платеж >1000, то рассчитать бонус с разницы превышающей суммы;
        System.out.println(bonus + " бонусных рублей");
        int balanceAfter = balanceBefore+incomingPayment+bonus; // рассчитать итоговый баланс (баланс до пополнения+ сумма пополнения + бонус)
        System.out.println(balanceAfter + " итоговый баланс");
    }
}