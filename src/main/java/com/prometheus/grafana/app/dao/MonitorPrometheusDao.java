package com.prometheus.grafana.app.dao;

import java.util.List;
import java.util.Optional;

import com.prometheus.grafana.app.entity.GrafanaPrometheus;

public interface MonitorPrometheusDao {

	List<GrafanaPrometheus> listaTodos();
	Optional<GrafanaPrometheus> buscaporId(Integer id);
	GrafanaPrometheus atualiza(GrafanaPrometheus grafanaPrometheus);
	void delete(Integer id);
	GrafanaPrometheus inserir(GrafanaPrometheus grafanaPrometheus);
	
}
