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

        // Task 2
        System.out.println("Task 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
    }
}