
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println();

//        Task 1
        System.out.println();
        System.out.println("          Задача №1");
        int[] expensesPerWeek = {428_000, 386_000, 398_000, 302_000, 413_000};
        int expensesPerMonth = 0;
        for (int expenses : expensesPerWeek) {
            expensesPerMonth += expenses;
        }
        System.out.println("Сумма трат за месяц составила " + expensesPerMonth + " рублей");

//        Task 2
        System.out.println();
        System.out.println("          Задача №2");
        int[] expensesPerDay = {63_000, 94_000, 103_000, 108_000, 60_000};
        int expensesPerDayMax = expensesPerDay[0];
        int expensesPerDayMin = expensesPerDay[0];
        for (int expenses = 1; expenses < expensesPerDay.length; expenses++) {
            if (expensesPerDayMax < expensesPerDay[expenses]) {
                expensesPerDayMax = expensesPerDay[expenses];
            } else if (expensesPerDayMin > expensesPerDay[expenses]) {
                expensesPerDayMin = expensesPerDay[expenses];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + expensesPerDayMin + " рублей. Максимальная сумма трат за неделю составила " + expensesPerDayMax + " рублей");

//        Альтернатива 1
//        for (int expenses : expensesPerDay) {
//            if (expensesPerDayMax < expenses) {
//                expensesPerDayMax = expenses;
//            } else if (expensesPerDayMin > expenses) {
//                expensesPerDayMin = expenses;
//            }
//        }
//        System.out.println("Минимальная сумма трат за неделю составила " + expensesPerDayMin + " рублей. Максимальная сумма трат за неделю составила " + expensesPerDayMax + " рублей");

//        Альтернатива 2
//        int[] expensesPerDayTemp = Arrays.copyOf(expensesPerDay, expensesPerDay.length);
//        Arrays.sort(expensesPerDayTemp);
//        System.out.println("Минимальная сумма трат за неделю составила " + expensesPerDayTemp[0] + " рублей. Максимальная сумма трат за неделю составила " + expensesPerDayTemp[expensesPerDayTemp.length - 1] + " рублей");


//        Task 3
        System.out.println();
        System.out.println("          Задача №3");
        int[] expensesPerWeek3 = {428_000, 386_000, 398_000, 302_000, 413_000};
        int expensesPerMonth3 = 0;
        for (int expenses : expensesPerWeek3) {
            expensesPerMonth3 += expenses;
        }
        float averageMonthlyExpenses = (float) expensesPerMonth3 / expensesPerWeek3.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageMonthlyExpenses + " рублей.");

//        Task 4
        System.out.println();
        System.out.println("          Задача №4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char symbolTemp;
        for (int i = 0; i < reverseFullName.length; i++) {
            if (i < reverseFullName.length / 2) {
                symbolTemp = reverseFullName[i];
                reverseFullName[i] = reverseFullName[(reverseFullName.length - 1) - i];
                reverseFullName[(reverseFullName.length - 1) - i] = symbolTemp;
            }
            System.out.print(reverseFullName[i]);
        }
        System.out.println();

    }
}