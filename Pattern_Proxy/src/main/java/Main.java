import controllers.Client;
import proxy.ProxyCashe;
import proxy.SecuredProxy;
import services.IService;
import services.IServiceImpl;

public class Main {
    public static void main(String[] args) {

       // IService service = new IServiceImpl();
        IService cache = new ProxyCashe();
        var securedProxy  = new  SecuredProxy();
        // il faut identifier
        securedProxy.setPassword("1234");
        securedProxy.setTarget(cache);

        Client client = new Client();
        client.setService(securedProxy);
        System.out.println(" RES = " + client.perform(23));
        System.out.println(" RES = " + client.perform(23));
        System.out.println(" RES = " + client.perform(23));
    }
}
