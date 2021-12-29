
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();

        int purposeDay;
        purposeDay = 10000;
        System.out.println("Ваша цель " + purposeDay + " шагов в день.");

        while (true) {
            printMenu();
            int command = scanner.nextInt();
            if (command == 1) {
                System.out.println("Введите новую цель по шагам: ");
                int newPurposeDay = scanner.nextInt();
                stepTracker.newPurposeDay(newPurposeDay);
            } else if (command == 2) {
                System.out.println("Выберите месяц: Январь, Февраль, Март, Апрель, Май, Июнь, " +
                                   "Июль, Август, Сентябрь, Октябрь, Ноябрь, Декабрь");
                String month = scanner.next();
                System.out.println("За какой день хотите внести шаги?");
                int day = scanner.nextInt();
                System.out.println("Введите количество шагов");
                int steps = scanner.nextInt();
                stepTracker.statistics(month, day, steps);
            } else if (command == 3) {
                System.out.println("Выберите месяц: Январь, Февраль, Март, Апрель, Май, Июнь, " +
                                   "Июль, Август, Сентябрь, Октябрь, Ноябрь, Декабрь");
                String month = scanner.next();
                stepTracker.sumMonthStepsAndDay(month);
            } else if (command == 0) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Извините, такой команды нет.");
            }
        }

    }

    public static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Внести цель по шагам: ");
        System.out.println("2 - Внести колличество пройденых шагов: ");
        System.out.println("3 - Посмотреть статистику за месяц");
        System.out.println("0 - Выход");
    }
}

