package service.endpoint;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import operation.TovarOperationImpl;

import types.ListOfTovar;
import types.Tovar;

@WebService()
public class TovarService {
static TovarOperationImpl  obj = new TovarOperationImpl();

@WebMethod()
public ListOfTovar getAllTovar()
{
    ListOfTovar IstRet = null;
    List<Tovar> Ist = obj.getListOfTovar();
    if(Ist != null){
        IstRet = new ListOfTovar();
    IstRet.setItem(Ist);
    }
       return IstRet;
}
@WebMethod()
    public ListOfTovar setNewTovar(Tovar tovar){
        ListOfTovar IstRet = null;
        List<Tovar> Ist = obj.addNewTovar(tovar);
        if(Ist != null)
        {
            IstRet = new ListOfTovar();
            IstRet.setItem(Ist);
        }
        return IstRet;
    }
    @WebMethod()
    public int getSumOfTovar()
    {
        return obj.getSumofTovar();
    }
}
