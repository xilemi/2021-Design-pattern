public class HomeContext {
    private State state;
    public void setState(State s){
        System.out.println("修改状态！！");
        state=s;
        state.handle();
    }

}
