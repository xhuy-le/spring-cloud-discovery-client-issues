# Consul registry
In this scenario we replace the Eureka server by the Consul registry. Spin up a Consul container  with Docker command

```
docker run --rm -d --name consul -p 8500:8500 consul
```

# Config server
In the `config-server` project, launch the config server that will register itself with the Consul service

```
gradle clean bootRun
```

# Demo app
In the `app-demo` project, launch the demo app

```
gradle clean bootRun
```

The app starts successfully and uses Consul discovery client to fetch Config server address, despite `eureka.client.enabled=false` and `spring.cloud.consul.discovery.enabled=false`. An error would be expected because both discovery clients are disabled.
