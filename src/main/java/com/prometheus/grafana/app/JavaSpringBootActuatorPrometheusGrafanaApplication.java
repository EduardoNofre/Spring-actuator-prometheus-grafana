package com.prometheus.grafana.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Micro Service Actuator, Prometheus e Grafana application exemplo", version = "1.0", description = " Estudo rapido "))
public class JavaSpringBootActuatorPrometheusGrafanaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaSpringBootActuatorPrometheusGrafanaApplication.class, args);
	}
}
