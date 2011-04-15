/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.krohm.raidisdead.data.beans.dao;

import java.util.List;
import org.krohm.raidisdead.data.beans.UserBean;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author arnaud
 */
public class UserBeanDao extends GenericDao<UserBean, Long> {

    private static final String queryCountAllString = "UserBeanCountAll";
    private static final String queryConnectionByLogin = "UserBeanByLogin";

    public UserBeanDao() {
        super(UserBean.class, Long.class);
    }

    @Transactional(readOnly = true)
    public Long countAll() {
        return (Long) em.createNamedQuery(queryCountAllString).getSingleResult();
    }

    @Transactional(readOnly = true)
    public UserBean findByLogin(String login) {
        List testList = em.createNamedQuery(queryConnectionByLogin).setParameter("login", login).getResultList();
        if (testList.isEmpty()) {
            return null;
        }
        return (UserBean) testList.get(0);
    }
}
