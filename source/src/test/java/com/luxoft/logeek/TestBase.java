package com.luxoft.logeek;

import org.hibernate.Session;
import org.junit.After;
import org.junit.runner.RunWith;
import org.openjdk.jmh.annotations.Setup;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Random;

@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public abstract class TestBase {
    @PersistenceContext
    protected EntityManager em;

    protected Random random;

    @Setup
    public void setUp() throws Exception {
		random = new Random();
    }

	@After
	public void tearDown() throws Exception {
	}

	protected Session getSession(){
        return em.unwrap(Session.class);
    }
}
