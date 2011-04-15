/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.krohm.raidisdead.spring.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.krohm.raidisdead.data.beans.UserBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 *
 * @author arnaud
 */
public class CustomUserDetails implements UserDetails {

    private String username = null;
    private String password = null;
    private boolean accountNonExpired = true;
    private boolean accountNonLocked = true;
    private boolean credentialsNonExpired = true;
    private boolean enabled = true;
    private final static Logger logger = LoggerFactory.getLogger(CustomUserDetails.class);

    public CustomUserDetails(UserBean userBean) {
        if (userBean == null) {
            return;
        }
        username = userBean.getEmail();
        password = userBean.getPassword();
    }

    public Collection<GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> tmpList = new ArrayList<GrantedAuthority>();
        tmpList.add(new CustomGrantedAuthority());
        return tmpList;
    }

    public String getPassword() {
        return this.password;
    }

    public String getUsername() {
        return this.username;
    }

    public boolean isAccountNonExpired() {
        return true;
    }

    public boolean isAccountNonLocked() {
        return true;
    }

    public boolean isCredentialsNonExpired() {
        return true;
    }

    public boolean isEnabled() {
        return true;
    }

    private class CustomGrantedAuthority implements GrantedAuthority {

        private static final String userValue = "ROLE_USER";

        public String getAuthority() {
            return userValue;
        }
    }
}
