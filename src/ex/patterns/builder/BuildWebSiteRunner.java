package ex.patterns.builder;

public class BuildWebSiteRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new EnterpriceWebSiteBuilder());

        WebSite webSite = director.buildWebsite();
        System.out.println(webSite.toString());
    }
}
