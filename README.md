# demo

- For https://github.com/apache/shardingsphere/issues/34068 .
- Execute the following command on the Ubuntu 22.04.3 LTS instance with `SDKMAN!`.

```shell
sdk install java 23-open
sdk use java 23-open

git clone git@github.com:apache/shardingsphere.git
cd ./shardingsphere/
git reset --hard 2108a520547aa5fe14babe9c4eaea7e920507427
./mvnw clean install -Prelease -T1C -DskipTests -Djacoco.skip=true -Dcheckstyle.skip=true -Drat.skip=true -Dmaven.javadoc.skip=true

cd ../

git clone git@github.com:linghengqian/demo.git
cd ./demo/
./mvnw clean spring-boot:run
```

- The log is as follows,

```shell
$ ./mvnw clean spring-boot:run
[INFO] Scanning for projects...
[INFO] 
[INFO] -----------------------< com.java.encrypt:demo >------------------------
[INFO] Building demo 0.0.1-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- clean:3.2.0:clean (default-clean) @ demo ---
[INFO] Deleting /home/linghengqian/TwinklingLiftWorks/git/public/demo/target
[INFO] 
[INFO] >>> spring-boot:2.7.18:run (default-cli) > test-compile @ demo >>>
[INFO] 
[INFO] --- resources:3.2.0:resources (default-resources) @ demo ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Using 'UTF-8' encoding to copy filtered properties files.
[INFO] Copying 2 resources
[INFO] Copying 1 resource
[INFO] 
[INFO] --- compiler:3.10.1:compile (default-compile) @ demo ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 3 source files to /home/linghengqian/TwinklingLiftWorks/git/public/demo/target/classes
[INFO] 
[INFO] --- resources:3.2.0:testResources (default-testResources) @ demo ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Using 'UTF-8' encoding to copy filtered properties files.
[INFO] skip non existing resourceDirectory /home/linghengqian/TwinklingLiftWorks/git/public/demo/src/test/resources
[INFO] 
[INFO] --- compiler:3.10.1:testCompile (default-testCompile) @ demo ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /home/linghengqian/TwinklingLiftWorks/git/public/demo/target/test-classes
[INFO] 
[INFO] <<< spring-boot:2.7.18:run (default-cli) < test-compile @ demo <<<
[INFO] 
[INFO] 
[INFO] --- spring-boot:2.7.18:run (default-cli) @ demo ---
[INFO] Attaching agents: []

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::               (v2.7.18)

2024-12-16 12:25:29.272  INFO 75588 --- [           main] com.java.encrypt.demo.DemoApplication    : Starting DemoApplication using Java 23 on DESKTOP-2OCN434 with PID 75588 (/home/linghengqian/TwinklingLiftWorks/git/public/demo/target/classes started by linghengqian in /home/linghengqian/TwinklingLiftWorks/git/public/demo)
2024-12-16 12:25:29.274  INFO 75588 --- [           main] com.java.encrypt.demo.DemoApplication    : The following 1 profile is active: "uat"
2024-12-16 12:25:29.855  WARN 75588 --- [           main] o.m.s.mapper.ClassPathMapperScanner      : No MyBatis mapper was found in '[com.java.encrypt.demo]' package. Please check your configuration.
2024-12-16 12:25:30.128  INFO 75588 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 65004 (http)
2024-12-16 12:25:30.138  INFO 75588 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2024-12-16 12:25:30.139  INFO 75588 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.83]
2024-12-16 12:25:30.222  INFO 75588 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2024-12-16 12:25:30.223  INFO 75588 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 774 ms
2024-12-16 12:25:30.395  INFO 75588 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2024-12-16 12:25:30.543  INFO 75588 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
 _ _   |_  _ _|_. ___ _ |    _ 
| | |\/|_)(_| | |_\  |_)||_|_\ 
     /               |         
                        3.5.3.1 
2024-12-16 12:25:31.930  INFO 75588 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 65004 (http) with context path ''
2024-12-16 12:25:31.937  INFO 75588 --- [           main] com.java.encrypt.demo.DemoApplication    : Started DemoApplication in 2.948 seconds (JVM running for 3.217)
^C2024-12-16 12:26:23.561  INFO 75588 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
2024-12-16 12:26:23.564  INFO 75588 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  57.440 s
[INFO] Finished at: 2024-12-16T12:26:23+08:00
[INFO] ------------------------------------------------------------------------
```
