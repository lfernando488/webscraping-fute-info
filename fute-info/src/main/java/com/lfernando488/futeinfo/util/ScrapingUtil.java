package com.lfernando488.futeinfo.util;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import com.lfernando488.futeinfo.dto.PartidaGoogleDTO;



public class ScrapingUtil {

	private static final Logger LOGGER = LoggerFactory.getLogger(ScrapingUtil.class);
	private static final String BASE_URL_GOOGLE = "https://www.google.com.br/search?q=";
	private static final String COMPLEMENTO_IRL_GOOGLE = "&hl=pt-BR";

	public static void main(String[] args) {
		String url = BASE_URL_GOOGLE + "corinthians+x+palmeiras+25/09/2021" + COMPLEMENTO_IRL_GOOGLE;
		ScrapingUtil scrapingUtil = new ScrapingUtil();
		scrapingUtil.obtemInformacoesPartida(url);
	}

	public PartidaGoogleDTO obtemInformacoesPartida(String url) {
		PartidaGoogleDTO partida = new PartidaGoogleDTO();

		Document document = null;
		try {
			document = Jsoup.connect(url).get();
			String title = document.title();
			LOGGER.info("Titulo da pagina: {}", title);
		} catch (IOException e) {
			LOGGER.error("Erro aotentar conectar no google com JSOUP ->{}", e.getMessage());
		}

		return partida;
	}
}
