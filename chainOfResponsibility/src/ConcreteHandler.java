public class ConcreteHandler extends Handler {
    @Override
    public void HandleRequest(int request) {
        System.out.println(this.getClass().getName()+"处理请求");
    }
}
