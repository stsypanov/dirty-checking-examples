package com.luxoft.logeek.benchmark;

import com.luxoft.logeek.AppConfig;
import org.openjdk.jmh.annotations.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.concurrent.TimeUnit;

@Fork(1)
@State(Scope.Thread)
@Warmup(iterations = 20)
@Measurement(iterations = 100)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class ContextAwareBenchmarkBase {
    protected Random random;
    protected AnnotationConfigApplicationContext context;

    protected void initContext() {
        random = new Random();
        context = new AnnotationConfigApplicationContext(AppConfig.class);
    }

    protected <T> T getBean(Class<T> beanClass) {
        return context.getBean(beanClass);
    }
}
