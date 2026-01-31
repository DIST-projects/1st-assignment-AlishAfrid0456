import java.rmi.Remote;
import java.rmi.RemoteException;

public interface StudentResult extends Remote {
    int calculateTotal(int m1, int m2, int m3) throws RemoteException;
    double calculateAverage(int total) throws RemoteException;
}
