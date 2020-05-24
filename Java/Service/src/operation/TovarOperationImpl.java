package operation;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import types.Tovar;
import java.util.ArrayList;

public class TovarOperationImpl implements TovarOperation {
    static List<Tovar> IstTovar = new ArrayList<Tovar>();
    
    @Override
    public List<Tovar> getListOfTovar(){
        return IstTovar;
    }
    @Override
    public List<Tovar> addNewTovar(Tovar item)
    {
        IstTovar.add(item);
        return IstTovar;
    }
  
    @Override
    public int getSumofTovar(){
        int sum = 0;
        for ( Tovar tovar: IstTovar)
        sum += tovar.getKol() * tovar.getPrice();
        return sum;
    }
}
