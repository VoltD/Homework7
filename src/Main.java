public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1");
        int goal = 2_459_000;
        int amount = 0;
        int payment = 15000;
        int month = 1;
        while (amount <= goal) {
            amount = amount + payment;
            amount = amount + (amount/100);
            System.out.println("Месяц " + month + ", сумма накоплений равна " + amount + " рублей");
            month++;
        }
        System.out.println();
    }
}