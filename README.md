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
