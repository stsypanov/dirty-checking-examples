package com.luxoft.logeek.benchmark.dirtychecking.single;

import com.luxoft.logeek.benchmark.ContextAwareBenchmarkBase;
import com.luxoft.logeek.entity.EntityWithManyStringFields;
import com.luxoft.logeek.repository.EntityWithManyStringFieldsRepository;
import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class NonModifyingBenchmark extends ContextAwareBenchmarkBase {
    private EntityWithManyStringFieldsRepository repository;
    private EntityWithManyStringFields entity;

    @Setup
    public void initTrial() {
        super.initContext();
        repository = context.getBean(EntityWithManyStringFieldsRepository.class);
    }

    @Setup(Level.Invocation)
    public void initIteration() {
        entity = new EntityWithManyStringFields();
        entity.setField1(random.nextGaussian() + "");
        entity.setField2(random.nextGaussian() + "");
        entity.setField3(random.nextGaussian() + "");
        entity.setField4(random.nextGaussian() + "");
        entity.setField5(random.nextGaussian() + "");
        entity.setField6(random.nextGaussian() + "");
        entity.setField7(random.nextGaussian() + "");
        entity.setField8(random.nextGaussian() + "");

        entity = repository.save(entity);
    }

    @TearDown(Level.Invocation)
    public void tearDown() {
        repository.deleteAllInBatch();
    }

    @Benchmark
    public EntityWithManyStringFields measureDirtyCheckingOfNonModifiedField() {
        return repository.saveAndFlush(entity);
    }
}
