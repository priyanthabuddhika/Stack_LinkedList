
import linkedlist.stack.java;

public class TestCarStack {
    public static void main(String[] args) {
         Stacks carstack =new Stacks();
         Car car1=new Car(698,"Toyota");
         Car car2=new Car(5698,"Suzuki");
         carstack.push(car1);
         carstack.push(car2);
         carstack.pop();
         carstack.peek();
    }

}



