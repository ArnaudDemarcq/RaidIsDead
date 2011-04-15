package org.krohm.raidisdead.wicket.generic.panel;

import java.util.Collections;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.request.Request;
import org.apache.wicket.session.HttpSessionStore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.wicket.protocol.http.servlet.ServletWebRequest;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author arnaud
 */
public class HeaderPanel extends Panel {

    private static final Logger logger = LoggerFactory.getLogger(HeaderPanel.class);

    public HeaderPanel(String id) {
        super(id);
        add(new Label("LoginName", "LoginName"));
        Request test = getRequest();
        HttpSessionStore tmp = null;

        ServletWebRequest plop = (ServletWebRequest) this.getWebRequest();
        HttpSession currentSession = plop.getHttpServletRequest().getSession();
        List<String> testList = Collections.list(currentSession.getAttributeNames());
        for (String currentString : testList) {
           Object  currentObject  = currentSession.getAttribute(currentString);
           String currentToString = null;
           if (currentObject != null){
               currentToString = currentObject.toString();
           }
            logger.error("@@@@" + testList + "=>>>>>>>] " + currentToString);

        }

        logger.error("##########################" + testList);

    }
}
