package abstraction;

public abstract class Sample {

    // abstract method - methods without body
    // concrete method - method with body
    public abstract void abstractMethod();
    public void concreteMethod(){
        System.out.println("Concrete method inside Sample class");
    }
}
