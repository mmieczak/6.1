import java.util.Scanner;

public class Utils {

    public static String[] fillArrayWithNames(String[] names) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write down your names:");
        for (int i = 0; i < names.length; i++) {
            System.out.print(i + 1 + " name is : ");
            names[i] = sc.nextLine();
        }
        sc.close();
        return names;
    }

    public static void displayArray(String[] names) {
        for (int i = names.length; i > 0; i--) {
            System.out.println("Hi " + names[i - 1]);
        }
    }


}
