public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int payment=1100;
        int bonus;
        int newbalance;


        if (payment > 1000) {
           bonus = payment/100; newbalance=balance+payment+bonus;
        } else  {
            newbalance=balance+payment;

        }
        System.out.println("Итого баланс:"+newbalance);
    }
}
