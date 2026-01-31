import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class StudentResultImpl extends UnicastRemoteObject implements StudentResult {

    protected StudentResultImpl() throws RemoteException {
        super();
    }

    public int calculateTotal(int m1, int m2, int m3) {
        return m1 + m2 + m3;
    }

    public double calculateAverage(int total) {
        return total / 3.0;
    }
}
