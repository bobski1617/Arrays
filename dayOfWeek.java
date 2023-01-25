import java.util.Scanner;

public class dayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayNumber = Integer.parseInt(scanner.nextLine());

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday"};


        if (dayNumber>=1 && dayNumber<=7){

        System.out.println(days[dayNumber-1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
