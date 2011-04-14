package test;

import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;
import org.krohm.raidisdead.wicket.page.HomePage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyApplication extends WebApplication {

    private static final Logger logger = LoggerFactory.getLogger(WebApplication.class);

    public Class<HomePage> getHomePage() {
        return HomePage.class;
    }

    @Override
    protected void init() {
        // For Wicket
        super.init();
        // For Spring
        springInjection();
        // For GAE
        //getResourceSettings().setResourcePollFrequency(null);
    }

    protected void springInjection() {
        this.getComponentInstantiationListeners().add(new SpringComponentInjector(this));
    }
}
