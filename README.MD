# This project contains benchmarks needed to measure how bytecode instrumentation provided by Hibernate 5.2 affects performance

**How to use?**

1. Checkout project
2. The project has 2 profiles: no-instrumentation (active by default) and instrumentation. In order to build benchmarks for non-enhanced entities run  `mvn clean install `.
To build benchmarks for non-enhanced entities run `mvn clean install -P instrumentation`.
3. Run `cd benchmarks/target` to go to target folder of benchmarks module. There you find `benchmarks.jar`.
4. To run `benchmarks.jar` from command line execute `java -jar benchmarks.jar`
5. Be patient until execution is done :).
6. Analyze your results.

How to write your own benchmarks?

Extend your benchmark class from `com.luxoft.logeek.benchmark.ContextAwareBenchmarkBase`. This class provides basic infrastructure for benchmarking. To retrieve needed component from Spring application context use
```java
ContextAwareBenchmarkBase#getBean(Class<T> beanClazz)
```

See available benchmark classes for example.