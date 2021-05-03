# java-spring-boot-actuator-prometheus-grafana
java spring boot actuator prometheus grafana exemplo basico.


# O que é Actuator?

m essência, o Actuator traz recursos prontos para produção para nossa aplicação.
Monitorar nosso aplicativo, reunir métricas, entender o tráfego ou o estado de nosso banco de dados torna-se trivial com essa dependência.
O principal benefício dessa biblioteca é que podemos obter ferramentas de nível de produção sem ter que implementar esses recursos por conta própria.
Actuator é usado principalmente para expor informações operacionais sobre o aplicativo em execução - integridade, métricas, informações, despejo, env, etc. Ele usa endpoints HTTP ou beans JMX para nos permitir interagir com ele.

## Utilizando o Actuator.
Para habilitar o Spring Boot Actuator, só precisamos adicionar a dependência spring-boot-atuator ao nosso gerenciador de pacotes.
No Maven:
````
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
````

No seu arquivo yml que fica em sua aplicação vamos colocar essas propriedades.
````
##-----------------------------------------------------------
## Configuração - Spring Boot Actuator
##-----------------------------------------------------------
management:
  endpoints:
    web:
      exposure:
        include: '*' # exibir todos os endpoints
  endpoint:
    health:
      show-details: always # Você pode usar as informações de health para verificar o status do aplicativo em execução. 
````

Para testar é bem simples apos colocar a dependência no maven é chamar o endpoint.

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

http://localhost:7009/actuator/metrics - Detalha as métricas de nosso aplicativo. Isso pode incluir métricas genéricas e personalizadas.

http://localhost:7009/actuator/prometheus - Retorna métricas como o anterior, mas formatado para funcionar com um servidor Prometheus.

http://localhost:7009/actuator/scheduledtasks - Fornece detalhes sobre cada tarefa schedulada em nosso aplicativo.

http://localhost:7009/actuator/sessions - Lista as sessões HTTP, uma vez que estamos usando Spring Session.

http://localhost:7009/actuator/shutdown - Executa um desligamento normal do aplicativo.

http://localhost:7009/actuator/threaddump - Despeja as informações de encadeamento da JVM subjacente


## Grafana ... to do

# O que é Grafana?
Grafana é uma solução de código aberto para executar análises de dados, obtendo métricas que dão sentido à enorme quantidade de dados e para monitorar nossos aplicativos com a ajuda de painéis personalizáveis.


## Prometheus ... to do
# O que é Prometheus?
é um aplicativo de software gratuito usado para monitoramento e alerta de eventos. Ele registra métricas em tempo real em um banco de dados de série temporal (permitindo alta dimensionalidade) construído usando um modelo de pull HTTP, com consultas flexíveis e alertas em tempo real.

Para habilitar o Prometheus, só precisamos adicionar a dependência spring-boot-atuator ao nosso gerenciador de pacotes.
No Maven:
````
<dependency>
    <groupId>io.micrometer</groupId>
    <artifactId>micrometer-registry-prometheus</artifactId>
</dependency>
````
## Obervação é importante que ja tenha neste projeto a dependência maven do actuator.
Apos colocar a dependência maven do prometheus em seu projeto execute e chame o endpoint:
http://localhost:7009/actuator/prometheus  se tudo deu certo o seu resultado deverá ser algo parecido com esse resultado abaixo.

````
# HELP hikaricp_connections_min Min connections
# TYPE hikaricp_connections_min gauge
hikaricp_connections_min{pool="HikariPool-1",} 10.0
# HELP logback_events_total Number of error level events that made it to the logs
# TYPE logback_events_total counter
logback_events_total{level="warn",} 1.0
logback_events_total{level="debug",} 0.0
logback_events_total{level="error",} 0.0
logback_events_total{level="trace",} 0.0
logback_events_total{level="info",} 17.0
# HELP process_cpu_usage The "recent cpu usage" for the Java Virtual Machine process
# TYPE process_cpu_usage gauge
process_cpu_usage 0.13505454042560547
# HELP jdbc_connections_min Minimum number of idle connections in the pool.
# TYPE jdbc_connections_min gauge
jdbc_connections_min{name="dataSource",} 10.0
# HELP hikaricp_connections_pending Pending threads
# TYPE hikaricp_connections_pending gauge
hikaricp_connections_pending{pool="HikariPool-1",} 0.0
# HELP hikaricp_connections_max Max connections
# TYPE hikaricp_connections_max gauge
hikaricp_connections_max{pool="HikariPool-1",} 10.0
# HELP jdbc_connections_idle Number of established but idle connections.
# TYPE jdbc_connections_idle gauge
jdbc_connections_idle{name="dataSource",} 10.0
# HELP jvm_gc_memory_promoted_bytes_total Count of positive increases in the size of the old generation memory pool before GC to after GC
# TYPE jvm_gc_memory_promoted_bytes_total counter
jvm_gc_memory_promoted_bytes_total 1.8221296E7
# HELP jvm_gc_pause_seconds Time spent in GC pause
# TYPE jvm_gc_pause_seconds summary
jvm_gc_pause_seconds_count{action="end of major GC",cause="Metadata GC Threshold",} 2.0
jvm_gc_pause_seconds_sum{action="end of major GC",cause="Metadata GC Threshold",} 0.554
jvm_gc_pause_seconds_count{action="end of minor GC",cause="Metadata GC Threshold",} 2.0
jvm_gc_pause_seconds_sum{action="end of minor GC",cause="Metadata GC Threshold",} 0.023
jvm_gc_pause_seconds_count{action="end of minor GC",cause="Allocation Failure",} 2.0
jvm_gc_pause_seconds_sum{action="end of minor GC",cause="Allocation Failure",} 0.035
# HELP jvm_gc_pause_seconds_max Time spent in GC pause
# TYPE jvm_gc_pause_seconds_max gauge
jvm_gc_pause_seconds_max{action="end of major GC",cause="Metadata GC Threshold",} 0.0
jvm_gc_pause_seconds_max{action="end of minor GC",cause="Metadata GC Threshold",} 0.0
jvm_gc_pause_seconds_max{action="end of minor GC",cause="Allocation Failure",} 0.0
# HELP hikaricp_connections_creation_seconds_max Connection creation time
# TYPE hikaricp_connections_creation_seconds_max gauge
hikaricp_connections_creation_seconds_max{pool="HikariPool-1",} 0.0
# HELP hikaricp_connections_creation_seconds Connection creation time
# TYPE hikaricp_connections_creation_seconds summary
hikaricp_connections_creation_seconds_count{pool="HikariPool-1",} 0.0
hikaricp_connections_creation_seconds_sum{pool="HikariPool-1",} 0.0
# HELP jvm_memory_committed_bytes The amount of memory in bytes that is committed for the Java virtual machine to use
# TYPE jvm_memory_committed_bytes gauge
jvm_memory_committed_bytes{area="heap",id="PS Survivor Space",} 2.2020096E7
jvm_memory_committed_bytes{area="heap",id="PS Old Gen",} 1.3631488E8
jvm_memory_committed_bytes{area="heap",id="PS Eden Space",} 2.72105472E8
jvm_memory_committed_bytes{area="nonheap",id="Metaspace",} 6.3004672E7
jvm_memory_committed_bytes{area="nonheap",id="Code Cache",} 1.114112E7
jvm_memory_committed_bytes{area="nonheap",id="Compressed Class Space",} 9043968.0
# HELP jvm_gc_memory_allocated_bytes_total Incremented for an increase in the size of the (young) heap memory pool after one GC to before the next
# TYPE jvm_gc_memory_allocated_bytes_total counter
jvm_gc_memory_allocated_bytes_total 5.25964E8
# HELP hikaricp_connections_idle Idle connections
# TYPE hikaricp_connections_idle gauge
hikaricp_connections_idle{pool="HikariPool-1",} 10.0
# HELP tomcat_sessions_created_sessions_total  
# TYPE tomcat_sessions_created_sessions_total counter
tomcat_sessions_created_sessions_total 0.0
# HELP tomcat_sessions_expired_sessions_total  
# TYPE tomcat_sessions_expired_sessions_total counter
tomcat_sessions_expired_sessions_total 0.0
# HELP tomcat_sessions_rejected_sessions_total  
# TYPE tomcat_sessions_rejected_sessions_total counter
tomcat_sessions_rejected_sessions_total 0.0
# HELP jvm_buffer_count_buffers An estimate of the number of buffers in the pool
# TYPE jvm_buffer_count_buffers gauge
jvm_buffer_count_buffers{id="direct",} 12.0
jvm_buffer_count_buffers{id="mapped",} 0.0
# HELP jvm_memory_max_bytes The maximum amount of memory in bytes that can be used for memory management
# TYPE jvm_memory_max_bytes gauge
jvm_memory_max_bytes{area="heap",id="PS Survivor Space",} 2.2020096E7
jvm_memory_max_bytes{area="heap",id="PS Old Gen",} 1.396703232E9
jvm_memory_max_bytes{area="heap",id="PS Eden Space",} 6.54835712E8
jvm_memory_max_bytes{area="nonheap",id="Metaspace",} -1.0
jvm_memory_max_bytes{area="nonheap",id="Code Cache",} 2.5165824E8
jvm_memory_max_bytes{area="nonheap",id="Compressed Class Space",} 1.073741824E9
# HELP system_cpu_count The number of processors available to the Java virtual machine
# TYPE system_cpu_count gauge
system_cpu_count 4.0
# HELP tomcat_sessions_active_current_sessions  
# TYPE tomcat_sessions_active_current_sessions gauge
tomcat_sessions_active_current_sessions 0.0
# HELP jvm_threads_states_threads The current number of threads having NEW state
# TYPE jvm_threads_states_threads gauge
jvm_threads_states_threads{state="runnable",} 12.0
jvm_threads_states_threads{state="blocked",} 0.0
jvm_threads_states_threads{state="waiting",} 13.0
jvm_threads_states_threads{state="timed-waiting",} 9.0
jvm_threads_states_threads{state="new",} 0.0
jvm_threads_states_threads{state="terminated",} 0.0
# HELP system_cpu_usage The "recent cpu usage" for the whole system
# TYPE system_cpu_usage gauge
system_cpu_usage 0.8880943786490652
# HELP hikaricp_connections_usage_seconds Connection usage time
# TYPE hikaricp_connections_usage_seconds summary
hikaricp_connections_usage_seconds_count{pool="HikariPool-1",} 0.0
hikaricp_connections_usage_seconds_sum{pool="HikariPool-1",} 0.0
# HELP hikaricp_connections_usage_seconds_max Connection usage time
# TYPE hikaricp_connections_usage_seconds_max gauge
hikaricp_connections_usage_seconds_max{pool="HikariPool-1",} 0.0
# HELP hikaricp_connections Total connections
# TYPE hikaricp_connections gauge
hikaricp_connections{pool="HikariPool-1",} 10.0
# HELP tomcat_sessions_active_max_sessions  
# TYPE tomcat_sessions_active_max_sessions gauge
tomcat_sessions_active_max_sessions 0.0
# HELP jvm_classes_unloaded_classes_total The total number of classes unloaded since the Java virtual machine has started execution
# TYPE jvm_classes_unloaded_classes_total counter
jvm_classes_unloaded_classes_total 2.0
# HELP jvm_buffer_memory_used_bytes An estimate of the memory that the Java virtual machine is using for this buffer pool
# TYPE jvm_buffer_memory_used_bytes gauge
jvm_buffer_memory_used_bytes{id="direct",} 98304.0
jvm_buffer_memory_used_bytes{id="mapped",} 0.0
# HELP jdbc_connections_active Current number of active connections that have been allocated from the data source.
# TYPE jdbc_connections_active gauge
jdbc_connections_active{name="dataSource",} 0.0
# HELP jvm_gc_max_data_size_bytes Max size of long-lived heap memory pool
# TYPE jvm_gc_max_data_size_bytes gauge
jvm_gc_max_data_size_bytes 1.396703232E9
# HELP jvm_buffer_total_capacity_bytes An estimate of the total capacity of the buffers in this pool
# TYPE jvm_buffer_total_capacity_bytes gauge
jvm_buffer_total_capacity_bytes{id="direct",} 98304.0
jvm_buffer_total_capacity_bytes{id="mapped",} 0.0
# HELP jvm_threads_daemon_threads The current number of live daemon threads
# TYPE jvm_threads_daemon_threads gauge
jvm_threads_daemon_threads 30.0
# HELP hikaricp_connections_acquire_seconds Connection acquire time
# TYPE hikaricp_connections_acquire_seconds summary
hikaricp_connections_acquire_seconds_count{pool="HikariPool-1",} 0.0
hikaricp_connections_acquire_seconds_sum{pool="HikariPool-1",} 0.0
# HELP hikaricp_connections_acquire_seconds_max Connection acquire time
# TYPE hikaricp_connections_acquire_seconds_max gauge
hikaricp_connections_acquire_seconds_max{pool="HikariPool-1",} 0.0
# HELP jvm_threads_peak_threads The peak live thread count since the Java virtual machine started or peak was reset
# TYPE jvm_threads_peak_threads gauge
jvm_threads_peak_threads 39.0
# HELP hikaricp_connections_active Active connections
# TYPE hikaricp_connections_active gauge
hikaricp_connections_active{pool="HikariPool-1",} 0.0
# HELP jvm_classes_loaded_classes The number of classes that are currently loaded in the Java virtual machine
# TYPE jvm_classes_loaded_classes gauge
jvm_classes_loaded_classes 11949.0
# HELP jvm_threads_live_threads The current number of live threads including both daemon and non-daemon threads
# TYPE jvm_threads_live_threads gauge
jvm_threads_live_threads 34.0
# HELP process_start_time_seconds Start time of the process since unix epoch.
# TYPE process_start_time_seconds gauge
process_start_time_seconds 1.620005704759E9
# HELP hikaricp_connections_timeout_total Connection timeout total count
# TYPE hikaricp_connections_timeout_total counter
hikaricp_connections_timeout_total{pool="HikariPool-1",} 0.0
# HELP jvm_memory_used_bytes The amount of used memory
# TYPE jvm_memory_used_bytes gauge
jvm_memory_used_bytes{area="heap",id="PS Survivor Space",} 0.0
jvm_memory_used_bytes{area="heap",id="PS Old Gen",} 2.9758536E7
jvm_memory_used_bytes{area="heap",id="PS Eden Space",} 5.919812E7
jvm_memory_used_bytes{area="nonheap",id="Metaspace",} 5.8812272E7
jvm_memory_used_bytes{area="nonheap",id="Code Cache",} 1.1092416E7
jvm_memory_used_bytes{area="nonheap",id="Compressed Class Space",} 8257696.0
# HELP process_uptime_seconds The uptime of the Java virtual machine
# TYPE process_uptime_seconds gauge
process_uptime_seconds 208.359
# HELP jdbc_connections_max Maximum number of active connections that can be allocated at the same time.
# TYPE jdbc_connections_max gauge
jdbc_connections_max{name="dataSource",} 10.0
# HELP tomcat_sessions_alive_max_seconds  
# TYPE tomcat_sessions_alive_max_seconds gauge
tomcat_sessions_alive_max_seconds 0.0
# HELP jvm_gc_live_data_size_bytes Size of long-lived heap memory pool after reclamation
# TYPE jvm_gc_live_data_size_bytes gauge
jvm_gc_live_data_size_bytes 2.9758536E7
````

# Configurando criando o arquivo prometheus.yml
O primeiro passo é fazer a configuração do arquivo prometheus.yml, que pode ser criado dentro do projeto:

````
global:
  scrape_interval: 15s
  evaluation_interval: 15s
scrape_configs:
  - job_name: 'prometheusJob'
    scrape_interval: 5s
    static_configs:
      - targets: ['localhost:9090'] #Servidor prometheus
  - job_name: 'spring-monitoring-demo' # pode ser o nome do projeto
    scrape_interval: 5s
    metrics_path: '/actuator/prometheus'
    static_configs:
      - targets: ['localhost:8087'] #Servidor da minha aplicação
 ````
