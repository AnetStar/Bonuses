public class Main {
    public static void main(String[] args) {

        int account = 1500;
        int cash = 2000;
        int bonus;
        int priceBonus = 100;

        if (cash > 1000) {

            bonus = cash / priceBonus;

            System.out.println("На счету: " + (account + cash + bonus) + " руб.");
            System.out.println("Начислено бонусных рублей: " + bonus);
        } else {
            System.out.println("На счету: " + (account + cash) + " руб.");
            System.out.println("Начислено бонусных рублей: 0");
        }
    }
}