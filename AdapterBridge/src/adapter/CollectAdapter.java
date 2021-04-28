package adapter;

import adapter.CollectJDBCImpl;
import adapter.CollectText;

public class CollectAdapter implements CollectText {
    private CollectJDBC collectJDBC;
    /*private  CollectText collect;
    public CollectAdapter(String type){
        if (type.equalsIgnoreCase("jdbc")){
            collectJDBC=new CollectJDBCImpl();
        }
        else{
            collect=new CollectTextIml();
        }
    }

    @Override
    public String collect(String type) {
        if (type.equalsIgnoreCase("jdbc")){
            return  collectJDBC.jdbcCollect();
        }
        else {
            return collect.collect(type);
        }
    }*/
    public CollectAdapter(){
        collectJDBC =new CollectJDBCImpl();
    }
    public String collect(String type){
        return collectJDBC.jdbcCollect();
    }
}
