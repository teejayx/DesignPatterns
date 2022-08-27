package designpatterns.strategypattern;

public abstract class Duck {

   protected FlyBehaviour flyBehaviour;
   protected QuackBehavior quackBehavior;

   public Duck() {
    
   }

   public abstract void display();

   public void perfomFly(){
    flyBehaviour.fly();
   }

   public void performQuack(){
    quackBehavior.quack();
   }

   public void swim(){
    System.out.println("All ducks float, even decoys!");
   }

   public void setFlyBehavior(FlyBehaviour fb){
     flyBehaviour = fb;
   }

   public void setQuackbehavior(QuackBehavior qb){
    quackBehavior = qb;
   }
    
}
