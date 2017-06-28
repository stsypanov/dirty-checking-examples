package com.luxoft.logeek;

import com.luxoft.logeek.repository.ChildRepository;
import com.luxoft.logeek.repository.ParentRepository;
import org.hibernate.Session;
import org.junit.After;
import org.junit.runner.RunWith;
import org.openjdk.jmh.annotations.Setup;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    protected ChildRepository childRepository;
    @Autowired
    protected ParentRepository parentRepository;

    protected Random random;

    @Setup
    public void setUp() throws Exception {
		random = new Random();
    }

	@After
	public void tearDown() throws Exception {
		parentRepository.deleteAllInBatch();
		childRepository.deleteAllInBatch();
	}

	protected Session getSession(){
        return em.unwrap(Session.class);
    }
}
