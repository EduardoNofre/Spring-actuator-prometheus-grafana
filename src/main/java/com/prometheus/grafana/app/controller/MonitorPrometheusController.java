package com.prometheus.grafana.app.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;

@RestController
public class MonitorPrometheusController {

	@Operation(summary = "Busca empresa por id", description = "Busca empresa por id no banco de dados", tags = {"Busca por id"})
	@ApiResponses(value = { @ApiResponse(responseCode = "", description = ""
			+ " <br />responseCode = 200, Funcionário encontrado com sucesso"
			+ " <br />responseCode = 400, Erro processar a requisição" + " <br />responseCode = 401, Não autorizado."
			+ " <br />responseCode = 404, Funcionário não encontrado."
			+ " <br />responseCode = 500, Erro interno sem causa mapeada."
			+ " <br />responseCode = 504, Gateway Time-Out.") })
	@GetMapping(value = "path")
	public void getMethodName() {

	}

	@Operation(summary = "Busca empresa por id", description = "Busca empresa por id no banco de dados", tags = {"Busca por id"})
	@ApiResponses(value = { @ApiResponse(responseCode = "", description = ""
			+ " <br />responseCode = 200, Funcionário encontrado com sucesso"
			+ " <br />responseCode = 400, Erro processar a requisição" + " <br />responseCode = 401, Não autorizado."
			+ " <br />responseCode = 404, Funcionário não encontrado."
			+ " <br />responseCode = 500, Erro interno sem causa mapeada."
			+ " <br />responseCode = 504, Gateway Time-Out.") })
	@PostMapping(value = "path")
	public void postMethodName() {
		// TODO: process POST request

	}

	@Operation(summary = "Busca empresa por id", description = "Busca empresa por id no banco de dados", tags = {"Busca por id"})
	@ApiResponses(value = { @ApiResponse(responseCode = "", description = ""
			+ " <br />responseCode = 200, Funcionário encontrado com sucesso"
			+ " <br />responseCode = 400, Erro processar a requisição" + " <br />responseCode = 401, Não autorizado."
			+ " <br />responseCode = 404, Funcionário não encontrado."
			+ " <br />responseCode = 500, Erro interno sem causa mapeada."
			+ " <br />responseCode = 504, Gateway Time-Out.") })
	@PutMapping(value = "path/{id}")
	public void putMethodName() {
		// TODO: process PUT request

	}

	@Operation(summary = "Busca empresa por id", description = "Busca empresa por id no banco de dados", tags = {"Busca por id"})
	@ApiResponses(value = { @ApiResponse(responseCode = "", description = ""
			+ " <br />responseCode = 200, Funcionário encontrado com sucesso"
			+ " <br />responseCode = 400, Erro processar a requisição" + " <br />responseCode = 401, Não autorizado."
			+ " <br />responseCode = 404, Funcionário não encontrado."
			+ " <br />responseCode = 500, Erro interno sem causa mapeada."
			+ " <br />responseCode = 504, Gateway Time-Out.") })
	@DeleteMapping(value = "path/{id}")
	public String deleteMethodName(@PathVariable String id) {
		// TODO: process DELETE request

		return "Success";
	}

}
