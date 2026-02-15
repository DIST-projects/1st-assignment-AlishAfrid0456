import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer {
    public static void main(String[] args) {
        try {
            System.setProperty("java.rmi.server.hostname", "13.60.196.189");

            StudentResultImpl obj = new StudentResultImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("StudentService", obj);

            System.out.println("RMI Student Server running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
