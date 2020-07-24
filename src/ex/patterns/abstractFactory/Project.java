package ex.patterns.abstractFactory;

public class Project {
    public static void main(String[] args) {
        TeamFactory teamFactory = new JavaTeamFactory();
        Developer javaDev = teamFactory.getDeveloper();
        Manager pm = teamFactory.getManager();
        Tester tester = teamFactory.getTester();

        javaDev.writesCode();
        pm.manage();
        tester.test();
    }
}
