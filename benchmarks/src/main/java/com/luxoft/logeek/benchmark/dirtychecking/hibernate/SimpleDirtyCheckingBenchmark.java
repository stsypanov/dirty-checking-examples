package com.luxoft.logeek.benchmark.dirtychecking.hibernate;

import com.luxoft.logeek.hibernate.EnhancedEntityWithManyStringFields;
import org.openjdk.jmh.annotations.*;

import java.util.Random;
import java.util.concurrent.TimeUnit;

@Fork(1)
@State(Scope.Thread)
@Warmup(iterations = 50)
@Measurement(iterations = 100)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class SimpleDirtyCheckingBenchmark {
	private Random random= new Random();
	private EnhancedEntityWithManyStringFields entity;
	
	@Setup(Level.Invocation)
	public void init() {
		entity = new EnhancedEntityWithManyStringFields();
		
		entity.setField1(random.nextGaussian() + "");
		entity.setField2(random.nextGaussian() + "");
		entity.setField3(random.nextGaussian() + "");
		entity.setField4(random.nextGaussian() + "");
		entity.setField5(random.nextGaussian() + "");
		entity.setField6(random.nextGaussian() + "");
		entity.setField7(random.nextGaussian() + "");
		entity.setField8(random.nextGaussian() + "");
	}
	
	@Benchmark
	public String[] measureGetDirtyAttributes_entityModified() {
		entity.setField8(random.nextGaussian() + "");
		return entity.$$_hibernate_getDirtyAttributes();
	}

//	@Benchmark
	public String[] measureGetDirtyAttributes_entityNotModified() {
		return entity.$$_hibernate_getDirtyAttributes();
	}

//	@Benchmark
	public Class measureClassRetrievement() {
		final Class xClass = entity.getClass();
		return xClass;
	}
}
