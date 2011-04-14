/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.krohm.raidisdead.data.beans.dao.generic;

import org.krohm.raidisdead.data.beans.GameBean;
import org.krohm.raidisdead.data.beans.dao.GenericDao;

/**
 *
 * @author arnaud
 */
public class GameBeanDao extends GenericDao<GameBean,Long>{

    public GameBeanDao() {
        super(GameBean.class, Long.class);
    }

}
