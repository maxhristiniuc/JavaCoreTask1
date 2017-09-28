import model.Human;
import model.Intern;

import java.util.Scanner;
public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        Scanner scanner = new Scanner(System.in);
        Intern maxim = new Intern("Maxim", "Hristiniuc");
        Intern ion = new Intern("Ion", "Siroshenco");

        System.out.printf("Today intern %s was:\n", ion.toString());
        doActivities(ion);

        System.out.printf("\nEnter your message for intern %s:\n", ion.toString());
        String mess = scanner.nextLine();
        maxim.sendMessage(ion, mess);
    }

    private static void doActivities(Human homoSapiensSapiens) {
        for (int i = 0; i < 4; i++)
            homoSapiensSapiens.doActivity();
    }
}
