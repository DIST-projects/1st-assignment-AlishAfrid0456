import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class RMIClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("13.60.196.189", 1099);
            StudentResult stub = (StudentResult) registry.lookup("StudentService");

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter marks 1: ");
            int m1 = sc.nextInt();
            System.out.print("Enter marks 2: ");
            int m2 = sc.nextInt();
            System.out.print("Enter marks 3: ");
            int m3 = sc.nextInt();

            int total = stub.calculateTotal(m1, m2, m3);
            double avg = stub.calculateAverage(total);

            System.out.println("Total: " + total);
            System.out.println("Average: " + avg);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
