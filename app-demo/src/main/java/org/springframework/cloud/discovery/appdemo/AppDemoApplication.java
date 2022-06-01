package org.springframework.cloud.discovery.appdemo;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AppDemoApplication {

    public static void main(final String[] args) {
        SpringApplication.run(AppDemoApplication.class, args);
    }

    @Bean
    public String configServerInstanceProvider(final ObjectProvider<DiscoveryClient> discoveryClient) {
        discoveryClient.stream().map(DiscoveryClient::toString).forEach(System.out::println);
        return "test";
    }
}
