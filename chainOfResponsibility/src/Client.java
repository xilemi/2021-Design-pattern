public class Client {
    public static void main(String[] args) {
        Handler h1=new ConcreteHandler1();
        Handler h2=new ConcreteHandler2();
        Handler h3=new ConcreteHandler3();
        Handler h= new ConcreteHandler();
        h1.setSuccessor(h2);
        h2.setSuccessor(h3);
        h3.setSuccessor(h);
        int[] request={2,5,14,22,18,3,27,20,40};
        for (int i=0;i<request.length;i++){
            h1.HandleRequest(request[i]);
        }
    }
}
