/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.krohm.raidisdead.data.beans.dao;

import org.krohm.raidisdead.data.beans.UserBean;

/**
 *
 * @author arnaud
 */
public class UserBeanDao extends GenericDao<UserBean,Long>{

    public UserBeanDao() {
        super(UserBean.class, Long.class);
    }

}
