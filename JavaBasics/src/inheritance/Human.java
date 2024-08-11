package inheritance;

public class Human extends Animal{
    // extends derives the features from animal to human class

    public void think(){
        System.out.println("Human can think");
    }

    public void talk(){
        System.out.println("Human can talk");
    }

    @Override
    public void see() {
       // super.see(); - uses same implementation of parent class
        System.out.println("Human can see");
    }

    @Override
    public void smell() {
        System.out.println("Human can smell");
    }

    @Override
    public void breathe() {
        System.out.println("Human can breathe");
    }
}
