package ex.patterns.prototype;

public class VCRunner {
    public static void main(String[] args) {
        Project proj = new Project(1, "2");
        System.out.println(proj.toString());

        ProjectFactory projectFactory = new ProjectFactory(proj);
        Project project = projectFactory.copyProject();
        System.out.println(proj.toString());
    }
}
