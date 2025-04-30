import java.util.InputMismatchException;
import java.util.Scanner;

public class InputClass {
    private static final Scanner scanner = new Scanner(System.in);

    public static byte readByte(String message) {
        while (true) {
            try {
                System.out.print(message + ": ");
                return scanner.nextByte();
            } catch (InputMismatchException e) {
                System.out.println("Format error. Please enter a valid byte.");
                scanner.next(); // clear buffer
            }
        }
    }

    public static int readInt(String message) {
        while (true) {
            try {
                System.out.print(message + ": ");
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Format error. Please enter a valid integer.");
                scanner.nextLine();
            }
        }
    }

    public static float readFloat(String message) {
        while (true) {
            try {
                System.out.print(message + ": ");
                return scanner.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("Format error. Please enter a valid float number (use comma or dot depending on your locale).");
                scanner.nextLine();
            }
        }
    }

    public static double readDouble(String message) {
        while (true) {
            try {
                System.out.print(message + ": ");
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Format error. Please enter a valid double number.");
                scanner.nextLine();
            }
        }
    }

    public static char readChar(String message) {
        while (true) {
            try {
                System.out.print(message + ": ");
                String input = scanner.next();
                if (input.length() != 1) {
                    throw new InvalidInputException("You must enter only one character.");
                }
                return input.charAt(0);
            } catch (InvalidInputException e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine();
            }
        }
    }

    public static String readString(String message) {
        while (true) {
            try {
                System.out.print(message + ": ");
                String input = scanner.nextLine();
                if (input.trim().isEmpty()) {
                    throw new InvalidInputException("You must enter a non-empty string.");
                }
                return input;
            } catch (InvalidInputException e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine();
            }
        }
    }

    public static boolean readYesNo(String message) {
        while (true) {
            try {
                System.out.print(message + " (s/n): ");
                String input = scanner.next().toLowerCase();
                if (input.equals("s")) return true;
                else if (input.equals("n")) return false;
                else throw new InvalidInputException("Please enter 's' for yes or 'n' for no.");
            } catch (InvalidInputException e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine();
            }
        }
    }
}
