package com.luxoft.logeek.benchmark.dirtychecking.single;

import com.luxoft.logeek.benchmark.ContextAwareBenchmarkBase;
import com.luxoft.logeek.entity.EntityWithManyStringFields;
import com.luxoft.logeek.repository.EntityWithManyStringFieldsRepository;
import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class SingleEntityFieldModificationBenchmark extends ContextAwareBenchmarkBase {
    private EntityWithManyStringFieldsRepository repository;
    private EntityWithManyStringFields modifiedEntity;
    private EntityWithManyStringFields unmodifiedEntity;

    @Setup
    public void initTrial() {
        super.initContext();
        repository = context.getBean(EntityWithManyStringFieldsRepository.class);
    }

    @Setup(Level.Invocation)
    public void initIteration() {
        modifiedEntity = new EntityWithManyStringFields();
        modifiedEntity.setField1(random.nextGaussian() + "");
        modifiedEntity.setField2(random.nextGaussian() + "");
        modifiedEntity.setField3(random.nextGaussian() + "");
        modifiedEntity.setField4(random.nextGaussian() + "");
        modifiedEntity.setField5(random.nextGaussian() + "");
        modifiedEntity.setField6(random.nextGaussian() + "");
        modifiedEntity.setField7(random.nextGaussian() + "");
        modifiedEntity.setField8(random.nextGaussian() + "");

        modifiedEntity = repository.saveAndFlush(modifiedEntity);

        unmodifiedEntity = new EntityWithManyStringFields();
        unmodifiedEntity.setField1(random.nextGaussian() + "");
        unmodifiedEntity.setField2(random.nextGaussian() + "");
        unmodifiedEntity.setField3(random.nextGaussian() + "");
        unmodifiedEntity.setField4(random.nextGaussian() + "");
        unmodifiedEntity.setField5(random.nextGaussian() + "");
        unmodifiedEntity.setField6(random.nextGaussian() + "");
        unmodifiedEntity.setField7(random.nextGaussian() + "");
        unmodifiedEntity.setField8(random.nextGaussian() + "");

        unmodifiedEntity = repository.saveAndFlush(unmodifiedEntity);
    }

    @Setup(Level.Invocation)
    public void modifyEntity() {
        modifiedEntity.setField1(random.nextGaussian() + "");
    }

    @TearDown(Level.Invocation)
    public void tearDown() {
        repository.deleteAllInBatch();
    }

    @Benchmark
    public EntityWithManyStringFields measureDirtyCheckingOfModifiedField() {
        return repository.saveAndFlush(modifiedEntity);
    }

    @Benchmark
    public EntityWithManyStringFields measureDirtyCheckingOfNonModifiedField() {
        return repository.saveAndFlush(unmodifiedEntity);
    }
}
