package com.luxoft.logeek;

import org.junit.Before;
import org.junit.Test;

public class InstrumentationTest extends TestBase {


    @Before
    @Override
    public void setUp() throws Exception {
        super.setUp();
        /*Parent papa = new Parent("папа");
        Parent mama = new Parent("мама");

        Child child1 = new Child(papa);
        Child child2 = new Child(papa);
        Child child3 = new Child(papa);
        Child child4 = new Child(papa);

        Child child5 = new Child(mama);
        Child child6 = new Child(mama);


        papa.addChild(child1);
        papa.addChild(child2);
        papa.addChild(child3);
        papa.addChild(child4);

        mama.addChild(child5);
        mama.addChild(child6);

        parentRepository.save(Arrays.asList(papa,mama));*/
    }

    @Test
    public void testSave() throws Exception {
//        List<Parent> parents = parentRepository.findAll();
    }
}
