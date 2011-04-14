/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.krohm.raidisdead.wicket.generic.page;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.krohm.raidisdead.wicket.generic.panel.HeaderPanel;

/**
 *
 * @author arnaud
 */
public class MainPage extends WebPage {

    public MainPage(PageParameters parameters) {
        super(parameters);
        add(new HeaderPanel("HeaderPanel"));
    }
}
