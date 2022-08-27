package designpatterns.strategypattern;

public class ModelDuck  extends Duck {

    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehavior = new Quack();
    }
    
    public void display() {
        System.out.println("this is a model duck");
        
    }
    
}
