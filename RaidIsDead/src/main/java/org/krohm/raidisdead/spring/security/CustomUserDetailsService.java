/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.krohm.raidisdead.spring.security;

import org.krohm.raidisdead.data.beans.UserBean;
import org.krohm.raidisdead.data.beans.dao.UserBeanDao;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 *
 * @author arnaud
 */
public class CustomUserDetailsService implements UserDetailsService, InitializingBean {

    private UserBeanDao userBeanDao;

    public UserBeanDao getUserBeanDao() {
        return userBeanDao;
    }

    public void setUserBeanDao(UserBeanDao userBeanDao) {
        this.userBeanDao = userBeanDao;
    }



    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException, DataAccessException {
        UserBean userBean = userBeanDao.findByLogin(login);
        UserDetails returnUserDetails = new CustomUserDetails(userBean);
        return returnUserDetails;
    }

    public void afterPropertiesSet() throws Exception {
        //
        // Probably nothing to initialize
        //
    }
}
