package proxy;

import services.IService;
import services.IServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class ProxyCashe implements IService {

    private IServiceImpl service;
    private Map<Integer, Double> cache = new HashMap<>();

    @Override
    public double compute(int t) {
        if(service == null){service = new IServiceImpl();}
        if(!cache.containsKey(t)){
            double result = service.compute(t);
            cache.put(t,result);
            return result;
        }else {
            return cache.get(t);
        }
    }
}
