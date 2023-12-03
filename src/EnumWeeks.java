import java.util.Scanner;

public class EnumWeeks {
    enum Week {SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY}

    public static void main(String[] args) {
        System.out.println("Введите сегодняшний день недели");
        Scanner inputString = new Scanner(System.in);
        String i = inputString.next();
        Week week = Week.valueOf(i);
        switch (week) {
            case SUNDAY:
                System.out.println("Сегодня выходной");
                break;
            case MONDAY:
                System.out.println("Сегодня будний день");
                break;
            case TUESDAY:
                System.out.println("Сегодня будний день");
                break;
            case WEDNESDAY:
                System.out.println("Сегодня будний день");
                break;
            case THURSDAY:
                System.out.println("Сегодня будний день");
                break;
            case FRIDAY:
                System.out.println("Сегодня будний день, но завтра наконец-то выходной!");
                break;
            case SATURDAY:
                System.out.println("Сегодня выходной");
                break;
            default:
                System.out.println("Введен несуществующий день недели");


        }
    }
}
