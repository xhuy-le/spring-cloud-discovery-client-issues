In this scenario, both Eureka and Consul discovery clients are present in the classpath of the `app-demo` project. The Eureka discovery client is enabled (`eureka.client.enabled=true`) and the Consul discovery client is disabled (`spring.cloud.consul.discovery.enabled=false`). **But the app systematically locate the Config server by using Consul discovery client**.

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

The app fails to start because it try to locate Config server by using Consul discovery client (instead of Eureka client) to fetch Config server address, despite `eureka.client.enabled=true` and `spring.cloud.consul.discovery.enabled=false`. **There is no means of forcing the app to use Eureka discovery client. A successful start should be expected (like on `main` or `feature/with_bootstrap` branches)**.
