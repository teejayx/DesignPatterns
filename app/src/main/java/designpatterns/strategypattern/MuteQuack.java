package designpatterns.strategypattern;

public class MuteQuack implements QuackBehavior {

    public void quack() {
        System.out.println("<< silence >>");
        
    }
    
}
