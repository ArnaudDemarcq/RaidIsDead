package org.krohm.raidisdead.data.beans.dao;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Transactional
public class GenericDao<DATA, KEY> {

    @PersistenceContext(unitName = "default")
    protected EntityManager em;
    private static final Logger logger = LoggerFactory.getLogger(GenericDao.class);
    private Class<DATA> dataClass;
    private Class<KEY> keyClass;

    public GenericDao(Class<DATA> dataClass, Class<KEY> keyClass) {
        this.dataClass= dataClass;
        this.keyClass =keyClass;
    }

    @Transactional(readOnly = true)
    public DATA findById(KEY id) {
        return (DATA) em.find(dataClass, id);
    }

    @Transactional
    public void flush() {
        em.flush();
    }

    @Transactional
    public void create(DATA o) {
        em.persist(o);
    }

    @Transactional
    public void update(DATA o) {
        em.merge(o);
    }

    @Transactional
    public void delete( KEY id) {
        Object o = em.getReference(this.dataClass, id);
        em.remove(o);
    }
}
