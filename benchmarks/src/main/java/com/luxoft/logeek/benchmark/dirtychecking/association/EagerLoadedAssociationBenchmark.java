package com.luxoft.logeek.benchmark.dirtychecking.association;

import org.openjdk.jmh.annotations.OutputTimeUnit;

import java.util.concurrent.TimeUnit;

@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class EagerLoadedAssociationBenchmark {
    /*private ParentRepository parentRepository;
    private Parent parent;
    private Long parentId;

    @Param({"1", "10", "100", "1000", "10000"})
    private int childCount;

    @Setup
    public void initTrial() {
        super.initContext();
//        em = context.getBean(EntityManager.class);
        parentRepository = context.getBean(ParentRepository.class);
    }

    @Setup(Level.Iteration)
    public void initIteration() {
        Parent parent = new Parent("parent");

        for (int i = 0; i < childCount; i++) {
            parent.addChild(new Child(parent));
        }

        parent = parentRepository.saveAndFlush(parent);
        parentId = parent.getId();
    }

    @Setup(Level.Invocation)
    public void initInvocation() {
        parent = parentRepository.findOne(parentId);
    }

    @Benchmark
    public Parent measureDirtyCheckingOfNonModifiedChildCollection() {
        return parentRepository.save(parent);
    }
*/}
