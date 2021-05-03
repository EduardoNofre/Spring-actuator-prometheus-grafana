package com.prometheus.grafana.app.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prometheus.grafana.app.entity.GrafanaPrometheus;
@Repository
public interface MonitorPrometheusRepository extends JpaRepository<GrafanaPrometheus, Integer>{

}
