package com.luxoft.logeek.benchmark.runner;

import com.luxoft.logeek.benchmark.dirtychecking.hibernate.SimpleDirtyCheckingBenchmark;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class BenchmarkRunner {

	public static void main(String[] args) throws RunnerException {
		Options opt = new OptionsBuilder()
//				.include(ByteCodeInstrumentationBenchmark.class.getSimpleName())
				.include(SimpleDirtyCheckingBenchmark.class.getSimpleName())
//				.include(DistinctVsSetBenchmark.class.getSimpleName())
//				.include(ProjectionVsDataBenchmark.class.getSimpleName())
//				.warmupIterations(10)
//				.measurementIterations(10)
				.forks(1)//0 makes debugging possible
				.build();

		new Runner(opt).run();
	}
}