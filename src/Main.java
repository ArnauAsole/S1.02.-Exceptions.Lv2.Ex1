public class Main {
    public static void main(String[] args) {
        byte age = InputClass.readByte("Enter your age (byte)");
        int year = InputClass.readInt("Enter a year (int)");
        float height = InputClass.readFloat("Enter your height (float)");
        double weight = InputClass.readDouble("Enter your weight (double)");
        char gender = InputClass.readChar("Enter your gender (M/F)");
        String name = InputClass.readString("Enter your name");
        boolean wantsNewsletter = InputClass.readYesNo("Do you want to subscribe to our newsletter");

        System.out.println("\n✔️ Thank you, here is your data:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + ", Year: " + year);
        System.out.println("Height: " + height + ", Weight: " + weight);
        System.out.println("Gender: " + gender);
        System.out.println("Wants newsletter: " + (wantsNewsletter ? "Yes" : "No"));
    }
}