package br.com.caelum.estoque.ws;

import javax.xml.ws.Endpoint;

/**
 * @author Ramon Vieira
 *
 */

public class PublicaEstoqueWS {

	public static void main(String[] args) {

		String url = "http://localhost:8080/estoquews?wsdl";
		EstoqueWS estoqueWS = new EstoqueWS();
		
		Endpoint.publish(url, estoqueWS);
		System.out.println("[" + url + "] - EstoqueWS em execução...");
	}

}
