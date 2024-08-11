package interfaceexample;

public class DemoImplements implements Demo{
    // implements - which implemets the interface methods
    @Override
    public void print() {
        System.out.println("abc is : "+abc);
    }
}
