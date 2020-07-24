package ex.patterns.abstractFactory;

public interface TeamFactory {
    Developer getDeveloper();
    Manager getManager();
    Tester getTester();
}
