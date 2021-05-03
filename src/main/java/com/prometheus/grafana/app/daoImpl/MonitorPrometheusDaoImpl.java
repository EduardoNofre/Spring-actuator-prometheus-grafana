package com.prometheus.grafana.app.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.prometheus.grafana.app.dao.MonitorPrometheusDao;
import com.prometheus.grafana.app.entity.GrafanaPrometheus;
import com.prometheus.grafana.app.repository.MonitorPrometheusRepository;
@Component
public class MonitorPrometheusDaoImpl implements MonitorPrometheusDao {

	@Autowired
	private MonitorPrometheusRepository monitorPrometheusRepository;

	@Override
	public List<GrafanaPrometheus> listaTodos() {
		return monitorPrometheusRepository.findAll();
	}

	@Override
	public Optional<GrafanaPrometheus> buscaporId(Integer id) {
		return monitorPrometheusRepository.findById(id);
	}

	@Override
	public GrafanaPrometheus atualiza(GrafanaPrometheus grafanaPrometheus) {
		return monitorPrometheusRepository.save(grafanaPrometheus);
	}

	@Override
	public void delete(Integer id) {

		monitorPrometheusRepository.deleteById(id);
	}

	@Override
	public GrafanaPrometheus inserir(GrafanaPrometheus grafanaPrometheus) {
		return monitorPrometheusRepository.save(grafanaPrometheus);
	}

}
