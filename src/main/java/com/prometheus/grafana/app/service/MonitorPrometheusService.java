package com.prometheus.grafana.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prometheus.grafana.app.dao.MonitorPrometheusDao;
import com.prometheus.grafana.app.entity.GrafanaPrometheus;

@Service
public class MonitorPrometheusService {

	@Autowired
	private MonitorPrometheusDao monitorPrometheusDao;

	public GrafanaPrometheus inserir(String nome, Integer idade, String endereco, String enderecoComplemento,int numeroResidencial, int numeroApartamento) {

		GrafanaPrometheus grafanaPrometheus = new GrafanaPrometheus();

		grafanaPrometheus.setIdade(idade);
		grafanaPrometheus.setNome(nome);
		grafanaPrometheus.setEndereco(enderecoComplemento);
		grafanaPrometheus.setEnderecoComplemento(enderecoComplemento);
		grafanaPrometheus.setNumeroApartamento(numeroApartamento);
		grafanaPrometheus.setNumeroResidencial(numeroResidencial);

		return monitorPrometheusDao.inserir(grafanaPrometheus);
	}

	public List<GrafanaPrometheus> listaTodos() {

		return monitorPrometheusDao.listaTodos();
	}

	public GrafanaPrometheus buscaporId(Integer id) {

		Optional<GrafanaPrometheus> GrafanaPrometheusExiste = monitorPrometheusDao.buscaporId(id);

		if (GrafanaPrometheusExiste.isPresent()) {

			return GrafanaPrometheusExiste.get();

		} else {

			return null;
		}
	}

	public GrafanaPrometheus atualiza(GrafanaPrometheus grafanaPrometheus) {

		return monitorPrometheusDao.atualiza(grafanaPrometheus);
	}

	public GrafanaPrometheus delete(Integer id) {

		GrafanaPrometheus grafanaPrometheus = existeNabaseDados(id);

		if (null != grafanaPrometheus) {

			monitorPrometheusDao.delete(id);

			return grafanaPrometheus;
		} else {

			return null;
		}
	}

	public GrafanaPrometheus existeNabaseDados(Integer id) {

		Optional<GrafanaPrometheus> GrafanaPrometheusExiste = monitorPrometheusDao.buscaporId(id);

		if (GrafanaPrometheusExiste.isPresent()) {

			return GrafanaPrometheusExiste.get();

		} else {

			return null;
		}
	}

}
