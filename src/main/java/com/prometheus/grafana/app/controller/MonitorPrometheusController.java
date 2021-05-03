package com.prometheus.grafana.app.controller;

import java.util.List;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prometheus.grafana.app.entity.GrafanaPrometheus;
import com.prometheus.grafana.app.service.MonitorPrometheusService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RequestMapping("/api/prometheus-grafana/")
@Tag(name = "Prometheus Controller", description = "Prometheus Grafana crud API")
@Validated
@RestController
public class MonitorPrometheusController {
	
	@Autowired
	private MonitorPrometheusService monitorPrometheusService;

	@ApiResponses(value = { @ApiResponse(responseCode = "", description = ""
			+ " <br />responseCode = 200, Encontrado com sucesso"
			+ " <br />responseCode = 400, Erro processar a requisição" 
			+ " <br />responseCode = 401, Não autorizado."
			+ " <br />responseCode = 404, Não encontrado."
			+ " <br />responseCode = 500, Erro interno sem causa mapeada."
			+ " <br />responseCode = 504, Gateway Time-Out.")})
	@Operation(summary = "lista Todos", description = "lista Todos", tags = {"lista Todos"})
	@GetMapping(value = "todos")
	public  ResponseEntity<List<GrafanaPrometheus>>listaTodos() {

		return new ResponseEntity<List<GrafanaPrometheus>> (monitorPrometheusService.listaTodos(), HttpStatus.OK);
	}
	
	@ApiResponses(value = { @ApiResponse(responseCode = "", description = ""
			+ " <br />responseCode = 200, Encontrado com sucesso"
			+ " <br />responseCode = 400, Erro processar a requisição" 
			+ " <br />responseCode = 401, Não autorizado."
			+ " <br />responseCode = 404, Não encontrado."
			+ " <br />responseCode = 500, Erro interno sem causa mapeada."
			+ " <br />responseCode = 504, Gateway Time-Out.") })
	@Operation(summary = "Busca por id", description = "Busca por id no banco de dados", tags = {"Busca por id"})
	@GetMapping(value = "id/{id}")
	public ResponseEntity<GrafanaPrometheus>  buscaPorId(@Parameter(description = "Nome.", required = true) @PathVariable Integer id) {

		return new ResponseEntity<GrafanaPrometheus> (monitorPrometheusService.buscaporId(id), HttpStatus.OK);
	}

	@Operation(summary = "Atualizar dados no banco", description = "Atualizar dados no banco", tags = {"Atualizar dados no banco"})
	@ApiResponses(value = { @ApiResponse(responseCode = "", description = ""
			+ " <br />responseCode = 200, Encontrado com sucesso"
			+ " <br />responseCode = 400, Erro processar a requisição" 
			+ " <br />responseCode = 401, Não autorizado."
			+ " <br />responseCode = 404, Não encontrado."
			+ " <br />responseCode = 500, Erro interno sem causa mapeada."
			+ " <br />responseCode = 504, Gateway Time-Out.") })
	@PostMapping(value = "cadastro")
	public ResponseEntity<GrafanaPrometheus> atualiza(@RequestBody  @Valid GrafanaPrometheus grafanaPrometheus) {
		
		return new ResponseEntity<GrafanaPrometheus> (monitorPrometheusService.atualiza(grafanaPrometheus), HttpStatus.OK);

	}

	@ApiResponses(value = { @ApiResponse(responseCode = "", description = ""
			+ " <br />responseCode = 200, Encontrado com sucesso"
			+ " <br />responseCode = 400, Erro processar a requisição" 
			+ " <br />responseCode = 401, Não autorizado."
			+ " <br />responseCode = 404, Não encontrado."
			+ " <br />responseCode = 500, Erro interno sem causa mapeada."
			+ " <br />responseCode = 504, Gateway Time-Out.") })
	@Operation(summary = "Busca por id", description = "Busca empresa por id no banco de dados", tags = {"Atualizar"})
	@PutMapping(value = "inserir/nome{ nome}/idade{ idade}/ endereco{endereco}/enderecoComplemento{enderecoComplemento}/numeroResidencial{numeroResidencial}/numeroApartamento{numeroApartamento}")
	public ResponseEntity<GrafanaPrometheus>  atualizar(
					@Parameter(description = "Nome.", required = true) @PathVariable String nome,
					@Parameter(description = "Idade.", required = true) @PathVariable Integer idade,
					@Parameter(description = "Endereco.", required = true) @PathVariable String endereco,
					@Parameter(description = "Enderec oComplemento.", required = true) @PathVariable String enderecoComplemento,
					@Parameter(description = "Numero residencial.", required = true) @PathVariable int numeroResidencial,
					@Parameter(description = "Numero apartamento.", required = true) @PathVariable int numeroApartamento) {

		return new ResponseEntity<GrafanaPrometheus> (monitorPrometheusService.inserir(nome, idade, endereco, enderecoComplemento, numeroResidencial, numeroApartamento), HttpStatus.OK);
		
	}

	@Operation(summary = "Remover por id", description = "Remover do banco de dados", tags = {"Remover por id"})
	@ApiResponses(value = { @ApiResponse(responseCode = "", description = ""
			+ " <br />responseCode = 200, Encontrado com sucesso"
			+ " <br />responseCode = 400, Erro processar a requisição" + " <br />responseCode = 401, Não autorizado."
			+ " <br />responseCode = 404, Não encontrado."
			+ " <br />responseCode = 500, Erro interno sem causa mapeada."
			+ " <br />responseCode = 504, Gateway Time-Out.") })
	@DeleteMapping(value = "path/{id}")
	public ResponseEntity<GrafanaPrometheus>remover(@Parameter(description = "id", required = true) @PathVariable Integer id) {

		return new ResponseEntity<GrafanaPrometheus> (monitorPrometheusService.delete(id), HttpStatus.OK);
	}

}
