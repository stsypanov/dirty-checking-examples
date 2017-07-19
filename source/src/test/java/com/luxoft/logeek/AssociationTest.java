package com.luxoft.logeek;

import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.luxoft.logeek.entity.association.Child;
import com.luxoft.logeek.entity.association.Parent;
import org.junit.Test;
import org.springframework.test.annotation.Commit;

import java.util.Collections;

@Commit
@DatabaseSetup("/associationTest.xml")
public class AssociationTest extends TestBase {
    private final Long parentId=1L;
    private final Long childId=1L;

    @Test
    public void loadParent() {
        Parent parent = getSession().find(Parent.class, parentId);
//        parent.addChild(new Child());
        parent.setChildren(Collections.emptyList());


    }

    @Test
    public void loadChild() {
        Child child = getSession().find(Child.class, childId);
        child.getParent();


    }
}
