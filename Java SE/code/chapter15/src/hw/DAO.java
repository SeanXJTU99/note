package hw;

import java.util.*;

public class DAO<T> {
    private Map<String, T> map = new HashMap<>();
    public T get(String id){
        return map.get(id);
    }
    public void update(String id ,T entity){
        map.put(id,entity);
    }
    public List<T> list(){
        Set<String> keySet = map.keySet();
        List<T> ts = new ArrayList<>();
        for (String key :keySet) {
            ts.add(map.get(key));
        }
        return ts;


//        return (List<T>)map.values();
    }
    public void save(String id, T entity){
        map.put(id,entity);
    }
    public void delete(String id){
        map.remove(id);
    }
}
