package ex.patterns.builder;

public class EnterpriceWebSiteBuilder extends WebSiteBuilder{
    @Override
    void buildName() {
        webSite.setName("enterprice");
    }

    @Override
    void buildCms() {
        webSite.setCms(Cms.AP);
    }

    @Override
    void buildPrice() {
        webSite.setPrice(700);
    }
}
