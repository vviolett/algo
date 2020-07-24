package ex.patterns.abstractFactory;

public class JavaTeamFactory implements TeamFactory{
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Manager getManager() {
        return new PM();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }
}
