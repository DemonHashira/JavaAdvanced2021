import java.util.Scanner;

public class HairSalon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int goal = Integer.parseInt(scanner.nextLine());
        String service = scanner.nextLine();
        int income = 0;

        while (!service.equals("closed")) {
            String servicetype = scanner.nextLine();

            if (income >= goal) {
                break;
            }

            if (service.equals("haircut")) {
                if (servicetype.equals("mens")) {
                    income += 15;
                } else if (servicetype.equals("ladies")) {
                    income += 20;
                } else {
                    income += 10;
                }
            } else if (service.equals("color")) {
                if (servicetype.equals("touch up")) {
                    income += 20;
                } else {
                    income += 30;
                }
            }

            if (income >= goal) {
                break;
            }

            service = scanner.nextLine();
        }
        if (income >= goal) {
            System.out.println("You have reached your target for the day!");
        } else {
            int needed = goal - income;
            System.out.println("Target not reached! You need" + " " + needed + "lv. more.");
        }
        System.out.println("Earned money:" + " " + income + "lv.");
    }
}
