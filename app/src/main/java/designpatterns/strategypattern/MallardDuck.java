package designpatterns.strategypattern;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehaviour = new Flywithwings();
        
    }


    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
        
    }
    
}
