package com.luxoft.logeek;

import com.luxoft.logeek.entity.EntityWithManyStringFields;
import com.luxoft.logeek.entity.EntityWithManyStringFieldsDynamicUpdate;
import org.hibernate.Session;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.annotation.Commit;

import java.io.Serializable;

public class ModificationTest extends TestBase {

    private Serializable id;

    @Commit
    @Before
    @Override
    public void setUp() throws Exception {
        super.setUp();

        EntityWithManyStringFields entity = createEntity();

        Session session = getSession();
        id = session.save(entity);
        session.flush();
    }

    @Test
    @Commit
    public void test_noModification_expectNoUpdate() throws Exception {
        Session session = getSession();

        EntityWithManyStringFields entity = session.find(EntityWithManyStringFields.class, id);

        session.save(entity);
        session.flush();
    }

    @Test
    @Commit
    public void test_withModification_expectUpdateQueryExecuted() throws Exception {
        Session session = getSession();

        EntityWithManyStringFields entity = session.find(EntityWithManyStringFields.class, id);
        entity.setField5(random.nextGaussian() + "");

        session.save(entity);
        session.flush();
    }

    @Test
    @Commit
    public void test_withModification_expectUpdateQueryExecutedForOnylOneField() throws Exception {
        Session session = getSession();

        EntityWithManyStringFields entity = session.find(EntityWithManyStringFields.class, id);
        entity.setField5(random.nextGaussian() + "");

        session.save(entity);
        session.flush();
    }

    private EntityWithManyStringFields createEntity() {
        EntityWithManyStringFields entity = new EntityWithManyStringFields();
        entity.setField1(random.nextGaussian() + "");
        entity.setField2(random.nextGaussian() + "");
        entity.setField3(random.nextGaussian() + "");
        entity.setField4(random.nextGaussian() + "");
        entity.setField5(random.nextGaussian() + "");
        entity.setField6(random.nextGaussian() + "");
        entity.setField7(random.nextGaussian() + "");
        entity.setField8(random.nextGaussian() + "");
        return entity;
    }

    private EntityWithManyStringFieldsDynamicUpdate createEntityWithManyStringFieldsDynamicUpdate() {
        EntityWithManyStringFieldsDynamicUpdate entity = new EntityWithManyStringFieldsDynamicUpdate();
        entity.setField1(random.nextGaussian() + "");
        entity.setField2(random.nextGaussian() + "");
        entity.setField3(random.nextGaussian() + "");
        entity.setField4(random.nextGaussian() + "");
        entity.setField5(random.nextGaussian() + "");
        entity.setField6(random.nextGaussian() + "");
        entity.setField7(random.nextGaussian() + "");
        entity.setField8(random.nextGaussian() + "");
        return entity;
    }
}
