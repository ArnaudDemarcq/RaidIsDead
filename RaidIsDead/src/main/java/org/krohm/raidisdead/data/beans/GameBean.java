/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.krohm.raidisdead.data.beans;

/**
 *
 * @author arnaud
 */
public class GameBean {

    private Long id;
    private String name;
    private String editor;

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
