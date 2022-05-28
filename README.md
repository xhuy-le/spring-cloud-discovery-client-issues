In this scenario, only Eureka discovery client is present in the classpath of the `app-demo` project, the `spring-cloud-starter-consul-discovery` artifact is commented out in `build.gradle`. The Eureka discovery client is enabled (`eureka.client.enabled=true`). **The app starts successfully as expected**.

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
