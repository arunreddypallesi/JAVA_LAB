import java.util.Scanner;

class TrainCodes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] trainCodes = {"TN01", "TN02", "TN03", "TN04", "TN05"};

        System.out.print("Enter train code index (0-4): ");
        int index = sc.nextInt();

        try {
            System.out.println("Train Code: " + trainCodes[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: Invalid array index!");
            System.out.println("Please enter an index between 0 and 4.");
        }

        sc.close();
    }
}
