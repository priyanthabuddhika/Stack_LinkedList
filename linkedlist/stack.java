package linkedlist;

class Car
{
    // test commm
    int number;
    String model;
    public Car(int number,String model)
    {
        this.number=number;
        this.model=model;
    }

}
class Node
{
    public Car data;
    public Node next;
    Node(Car car)
    {
        super();
        data=car;
    }
    public void displayNode()
    {
        System.out.println("Car "+ data.model+" "+data.number);
    }
}


class CarList
{
   private Node first;
   public void CarList()
   {
       first=null;
   }
   public boolean isempty()
   {
       return(first==null);
   }

   public void insert(Car Num)
   {
       Node newnode=new Node(Num);
       newnode.next=first;
       first=newnode;
   }

   public Node deletefirst()
   {
       Node temp=first;
       first=first.next;
       temp.next=null;
       return temp;
   }

   public void displaylirst()
   {
       Node current=first;
       while(current!=null)
       {
           System.out.print("Display cars: ");
           current.displayNode();
           current=current.next;
       }
       System.out.println("");
   }

   public void displayfirst()
   {
       Node ftemp=first;
       System.out.print("peek of the linklist: ");
       ftemp.displayNode();
       System.out.println();
   }

}



class Stacks
{
    CarList car;

    public Stacks()
    {
        car=new CarList();
    }
    public void push(Car insertvalue)
    {
      System.out.println("Values are pushing into the Stack.......");
      car.insert(insertvalue);

    }

    public void pop()
    {
       System.out.println("\nValues are poping from the Stack.......");
       car.deletefirst();
       car.displaylirst();
    }

    public void peek()
    {
        car.displayfirst();
    }

}

