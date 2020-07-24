package ex.patterns.builder;

public class VisitCardWebSiteBuilder extends WebSiteBuilder {
    @Override
    void buildName() {
        webSite.setName("visit site");
    }

    @Override
    void buildCms() {
        webSite.setCms(Cms.WP);
    }

    @Override
    void buildPrice() {
        webSite.setPrice(10);
    }
}
