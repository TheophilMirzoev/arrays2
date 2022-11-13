public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {      // задача 1 сумма за месяц
           // System.out.println(arr[i]);

            sum += arr[i];

        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        // задача 2 большее и меньшее значение

        int maxExpense = 0;
        int minExpense = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxExpense) {

                maxExpense = arr[i];

            } else if (minExpense > arr[i]) {

                minExpense = arr[i];

            }
        }

        System.out.println("Максимальная сумма трат за день составила " + maxExpense + " рублей.");
        System.out.println("Минимальная сумма трат за день составила " + minExpense + " рублей.");


        // задача 3

        double averageValue = (double)sum / (double)arr.length;

        System.out.println("Средняя сумма трат за месяц составила " + averageValue  + " рублей");


        // задача 4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 10; i > -1; --i) {

            System.out.print(reverseFullName[i]);
        }

    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

}