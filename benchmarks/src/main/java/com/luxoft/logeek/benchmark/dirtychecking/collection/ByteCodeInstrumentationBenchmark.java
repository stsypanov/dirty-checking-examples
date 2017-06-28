package com.luxoft.logeek.benchmark.dirtychecking.collection;

import com.luxoft.logeek.benchmark.ContextAwareBenchmarkBase;
import com.luxoft.logeek.entity.EntityWithManyStringFields;
import com.luxoft.logeek.service.ExecutionService;
import org.openjdk.jmh.annotations.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class ByteCodeInstrumentationBenchmark extends ContextAwareBenchmarkBase {
	private ExecutionService service;

	@Param({"1", "10", "100", "1000", "10000"})
	private int entityCount;

	@Setup
	public void initTrial() {
		super.initContext();
		service = context.getBean(ExecutionService.class);
	}

	@Setup(Level.Invocation)
	public void init() {
		service.setUp(entityCount);
	}

	@TearDown(Level.Invocation)
	public void tearDown() {
		service.tearDown();
	}

	@Benchmark
	public List<EntityWithManyStringFields> measureDirtyCheckingForModifiedFields() {
		return service.executeFieldModification();
	}

	@Benchmark
	public List<EntityWithManyStringFields> measureDirtyCheckingForNonModifiedFields() {
		return service.executeWithoutFieldModification();
	}
}
