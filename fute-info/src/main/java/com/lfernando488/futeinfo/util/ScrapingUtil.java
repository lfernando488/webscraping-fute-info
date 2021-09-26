package com.lfernando488.futeinfo.util;

import com.lfernando488.futeinfo.dto.PartidaGoogleDTO;

public class ScrapingUtil {
	
	private static final String BASE_URL_GOOGLE = "https://www.google.com.br/search?q=";
	private static final String COMPLEMENTO_IRL_GOOGLE = "&hl=pt-BR";
	
	public static void main(String[] args) {
		
		PartidaGoogleDTO partida = new PartidaGoogleDTO();
		partida.getStatusPartida();
		
	}
}
