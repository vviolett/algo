package ex.patterns.abstractFactory;

public class PM implements Manager{
    @Override
    public void manage() {
        System.out.println("manage proj");
    }
}
