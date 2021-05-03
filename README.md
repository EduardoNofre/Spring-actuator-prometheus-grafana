# java-spring-boot-actuator-prometheus-grafana
java spring boot actuator prometheus grafana exemplo basico.


# O que é Actuator?

m essência, o Actuator traz recursos prontos para produção para nossa aplicação.
Monitorar nosso aplicativo, reunir métricas, entender o tráfego ou o estado de nosso banco de dados torna-se trivial com essa dependência.
O principal benefício dessa biblioteca é que podemos obter ferramentas de nível de produção sem ter que implementar esses recursos por conta própria.
Actuator é usado principalmente para expor informações operacionais sobre o aplicativo em execução - integridade, métricas, informações, despejo, env, etc. Ele usa endpoints HTTP ou beans JMX para nos permitir interagir com ele.

# O que é Grafana?
Grafana é uma solução de código aberto para executar análises de dados, obtendo métricas que dão sentido à enorme quantidade de dados e para monitorar nossos aplicativos com a ajuda de painéis personalizáveis.

# O que é Prometheus?

é um aplicativo de software gratuito usado para monitoramento e alerta de eventos. Ele registra métricas em tempo real em um banco de dados de série temporal (permitindo alta dimensionalidade) construído usando um modelo de pull HTTP, com consultas flexíveis e alertas em tempo real.

## Utilizando o Actuator.
Para habilitar o Spring Boot Actuator, só precisamos adicionar a dependência spring-boot-atuator ao nosso gerenciador de pacotes.
No Maven:
````
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
````
Para testar é bem simples apos colocar a dependencia no maven é chamar o endpoint.

sem contexto:
http://localhost:7009/actuator/env

Caso tenha contexto a sua aplicação:
http://localhost:7009/api-monitor-prometheus/actuator/env

Caso tenha dado certo o resultado do seu endpoint será parecido com este abaixo:

````
{
    "_links": {
        "self": {
            "href": "http://localhost:7009/api-monitor-prometheus/actuator",
            "templated": false
        },
        "beans": {
            "href": "http://localhost:7009/api-monitor-prometheus/actuator/beans",
            "templated": false
        },
        "caches-cache": {
            "href": "http://localhost:7009/api-monitor-prometheus/actuator/caches/{cache}",
            "templated": true
        },
        "caches": {
            "href": "http://localhost:7009/api-monitor-prometheus/actuator/caches",
            "templated": false
        },
        "health": {
            "href": "http://localhost:7009/api-monitor-prometheus/actuator/health",
            "templated": false
        },
        "health-path": {
            "href": "http://localhost:7009/api-monitor-prometheus/actuator/health/{*path}",
            "templated": true
        },
        "info": {
            "href": "http://localhost:7009/api-monitor-prometheus/actuator/info",
            "templated": false
        },
        "conditions": {
            "href": "http://localhost:7009/api-monitor-prometheus/actuator/conditions",
            "templated": false
        },
        "configprops": {
            "href": "http://localhost:7009/api-monitor-prometheus/actuator/configprops",
            "templated": false
        },
        "env": {
            "href": "http://localhost:7009/api-monitor-prometheus/actuator/env",
            "templated": false
        },
        "env-toMatch": {
            "href": "http://localhost:7009/api-monitor-prometheus/actuator/env/{toMatch}",
            "templated": true
        },
        "loggers": {
            "href": "http://localhost:7009/api-monitor-prometheus/actuator/loggers",
            "templated": false
        },
        "loggers-name": {
            "href": "http://localhost:7009/api-monitor-prometheus/actuator/loggers/{name}",
            "templated": true
        },
        "heapdump": {
            "href": "http://localhost:7009/api-monitor-prometheus/actuator/heapdump",
            "templated": false
        },
        "threaddump": {
            "href": "http://localhost:7009/api-monitor-prometheus/actuator/threaddump",
            "templated": false
        },
        "prometheus": {
            "href": "http://localhost:7009/api-monitor-prometheus/actuator/prometheus",
            "templated": false
        },
        "scheduledtasks": {
            "href": "http://localhost:7009/api-monitor-prometheus/actuator/scheduledtasks",
            "templated": false
        },
        "mappings": {
            "href": "http://localhost:7009/api-monitor-prometheus/actuator/mappings",
            "templated": false
        },
        "refresh": {
            "href": "http://localhost:7009/api-monitor-prometheus/actuator/refresh",
            "templated": false
        },
        "features": {
            "href": "http://localhost:7009/api-monitor-prometheus/actuator/features",
            "templated": false
        }
    }
}
````
