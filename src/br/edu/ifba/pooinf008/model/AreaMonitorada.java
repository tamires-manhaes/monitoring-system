package br.edu.ifba.pooinf008.model;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.pooinf008.controller.AreaMonitoradaIF;

public class AreaMonitorada implements AreaMonitoradaIF{
	private List<UnidadeMonitora> unidades = new ArrayList<>();
	
	public AreaMonitorada() {
	}
	
	public String monitorar(Localizacao localizacao, boolean video,
			boolean termometro, boolean co2, boolean ch4) {
		return null;
	}
	
	public UnidadeMonitora unidadeMaisProxima(Localizacao localizacao) {
		UnidadeMonitora unidade = null;
		Double maiorDistancia = Double.MAX_VALUE;
		for(UnidadeMonitora u : unidades) {
			if(u.calcularDistancia(localizacao) < maiorDistancia) {
				unidade = u;
			}	
		}
		return unidade;
	}
}