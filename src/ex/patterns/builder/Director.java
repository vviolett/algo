package ex.patterns.builder;

public class Director {
    WebSiteBuilder webSiteBuilder;

    public void setBuilder(WebSiteBuilder webSiteBuilder){
        this.webSiteBuilder = webSiteBuilder;
    }

    public WebSite buildWebsite(){
        webSiteBuilder.createWebSite();
        webSiteBuilder.buildName();
        webSiteBuilder.buildCms();
        webSiteBuilder.buildPrice();

        return webSiteBuilder.getWebSite();
    }
}
