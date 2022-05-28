In this scenario, both Eureka and Consul discovery clients are present in the classpath of the `app-demo` project. The Eureka discovery client is enabled (`eureka.client.enabled=true`) and the Consul discovery client is disabled (`spring.cloud.consul.discovery.enabled=false`). In the `app-demo` project, the `application.yml` file is replaced by `bootstrap.yml` file, and the artifact `spring-cloud-starter-bootstrap` is also added to the `app-demo` project classpath. **Unlike the `feature/without_bootstrap` branch, the app starts successfully as expected**.

# EUREKA server
In the `eureka` project, start the Eurka server :

```
gradle clean bootRun
```

# Config server
In the `config-server` project, launch the config server that will register itself with the Eureka server :

```
gradle clean bootRun
```

# Demo app
In the `app-demo` project, launch the demo app

```
gradle clean bootRun
```
