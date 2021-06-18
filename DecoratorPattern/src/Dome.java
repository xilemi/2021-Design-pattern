public class Dome {
    public static void main(String[] args){
        Component c1 = new ConcreteComponent ();
        Decorator decoratorA = new ConcreteDecoratorA(c1);
        decoratorA .operation();
        System.out.println("------------------------------------------------");
        Decorator decoratorBandA = new ConcreteDecoratorA(decoratorA);
        decoratorBandA.operation();
    }
}
