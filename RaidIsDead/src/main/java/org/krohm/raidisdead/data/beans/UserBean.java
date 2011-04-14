/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.krohm.raidisdead.data.beans;

/**
 *
 * @author arnaud
 */
public class UserBean {

    private Long id;
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    

}
