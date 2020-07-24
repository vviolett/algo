package ex.patterns.factoryMethod;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloper("java");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    static DeveloperFactory createDeveloper(String speciality){
        if(speciality.equals("java")){
            return new JavaDeveloperFactory();
        } else if(speciality.equals("cpp")){
            return new CppDeveloperFactory();
        } else{
            throw new RuntimeException("");
        }
    }
}
