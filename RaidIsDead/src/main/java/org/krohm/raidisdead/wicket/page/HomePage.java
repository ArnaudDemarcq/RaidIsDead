package org.krohm.raidisdead.wicket.page;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.krohm.raidisdead.wicket.generic.page.MainPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Homepage
 */
public class HomePage extends MainPage {

    private static final long serialVersionUID = 1L;
    private static final Logger logger = LoggerFactory.getLogger(HomePage.class);

    public HomePage(final PageParameters parameters) {
       
        super(parameters);

    }
}
