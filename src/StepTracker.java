
import java.util.HashMap;

class StepTracker {

    HashMap<String, int[]> months = new HashMap<>();


    void statistics(String month, int day, int steps) {
        if (months.containsKey(month)) {
            int[] days = months.get(month);
            days[day - 1] = days[day - 1] + steps;
            System.out.println("Значение сохранено. Есть");
        } else {
            int[] days = new int[30];
            days[day - 1] = days[day - 1] + steps;
            months.put(month, days);
            System.out.println("Значение сохранено. Нет");
        }
    }

    void sumMonthStepsAndDay(String month) {

        int sumStepsMonth = 0;
        if (months.containsKey(month)) {
            System.out.println("Шаги за " + month + ":\n");
            int[] days = months.get(month);
            for (int i = 0; i < days.length; i++) {
                System.out.println((i + 1) + "-й день вы прошли " + days[i] + " шагов.");
            }
            System.out.println();
            for (int sum : days) {
                sumStepsMonth += sum;
                if (sum > 10000) {
                    System.out.println("В эти дни: " + sum);
                }
                System.out.println();
            }
            System.out.println("Сумма шагов за месяц " + month + ": " + sumStepsMonth + "\n");
            Converter.convert(sumStepsMonth);
        } else {
            System.out.println("По данному месяцу еще нет статистики.");
        }

    }

    void purpose(int p) {
        int purposeDay;
        purposeDay = p;
        System.out.println("Ваша цель в день: " + purposeDay + " шагов.");
    }

}
