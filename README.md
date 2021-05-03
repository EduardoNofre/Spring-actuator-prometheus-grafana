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
http://localhost:7009/actuator/

Caso tenha contexto a sua aplicação:
http://localhost:7009/api-monitor-prometheus/actuator/

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

## alguns endpoints foram adicionados, alguns removidos e alguns foram reestruturados:

http://localhost:7009/actuator/auditevents - lista eventos relacionados à auditoria de segurança, como login / logout do usuário. Além disso, podemos filtrar por principal ou tipo entre outros campos.

http://localhost:7009/actuator/beans - Retorna todos os beans disponíveis em nossa BeanFactory. Ao contrário de / auditevents, ele não oferece suporte à filtragem.

http://localhost:7009/actuator/conditions - Anteriormente conhecido como / autoconfig, cria um relatório das condições em torno da configuração automática.

http://localhost:7009/actuator/configprops - Nos permite buscar todos os beans @ConfigurationProperties.

http://localhost:7009/actuator/env - Retorna as propriedades do ambiente atual. Além disso, podemos recuperar propriedades únicas.

http://localhost:7009/actuator/flyway - fornece detalhes sobre nossas migrações de banco de dados Flyway.

http://localhost:7009/actuator/health - Resume o estado de saúde de nosso aplicativo.

http://localhost:7009/actuator/heapdump - Constrói e retorna um dump de heap da JVM usado por nosso aplicativo.

http://localhost:7009/actuator/info - Retorna informações gerais. Podem ser dados personalizados, informações de construção ou detalhes sobre o último commit.

http://localhost:7009/actuator/liquibase - Se comporta como / flyway, mas para Liquibase.

http://localhost:7009/actuator/logfile - Retorna logs de aplicativo comuns.

http://localhost:7009/actuator/loggers - Nos permite consultar e modificar o nível de registro de nosso aplicativo.

http://localhost:7009/actuator/metrics - 

http://localhost:7009/actuator/prometheus - 

http://localhost:7009/actuator/scheduledtasks - 

http://localhost:7009/actuator/sessions - 

http://localhost:7009/actuator/shutdown - 

http://localhost:7009/actuator/threaddump - 






