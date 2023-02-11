import java.util.Scanner;

public class UI {

    /**
     * @param question
     * @return
     */
    public static String ask(String question) {
        System.out.println(question);
        Scanner scan = new Scanner(System.in);
        String result = scan.nextLine();

        return result;
    }

    /**
     * function that ask a numbre to the user and catch the potentiel outofbounds exeption
     * @param question Question that are ask to people to enter a number
     * @return return the value of the number entered by the user
     */
    public static double askDouble(String question) {
        double value;
        try {
            value = Double.parseDouble(ask(question));
        } catch (Exception e) {
            throw new OutOfBoundsException();
        }
        return value;
    }

    /**
     * @param question
     * @return
     */
    public static int askInt(String question) {
        int value;
        try {
            value = Integer.parseInt(ask(question));
        } catch (Exception e) {
            throw new OutOfBoundsException();
        }
        return value;
    }

    public static Byte askByte(String question) {
        Byte monByte = (byte) askIntBetween(question, 0, 127);
        return monByte;
    }

    public static int askIntBetween(String question, int min, int max) {
        int monInt = askInt(question);
        if (monInt <= max && monInt >= min) {
            return monInt;
        } else {
            throw new OutOfBoundsException();
        }
    }
}
