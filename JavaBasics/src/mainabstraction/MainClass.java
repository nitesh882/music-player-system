package mainabstraction;

import abstraction.Sample;
import abstraction.SampleImplement;

public class MainClass {
    public static void main(String[] args) {
        // we cannot create objects for abstraction class
        SampleImplement sampleImplement = new SampleImplement();
        sampleImplement.abstractMethod();
        sampleImplement.concreteMethod();
    }
}
