package adapter;
//模拟jdbc收集到的数据
public class CollectJDBCImpl implements CollectJDBC{
    public String jdbcCollect(){
        return "我是jdbc收集方式";
    }
}
