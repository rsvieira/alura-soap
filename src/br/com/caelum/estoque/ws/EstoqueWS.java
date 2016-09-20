package br.com.caelum.estoque.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import br.com.caelum.estoque.modelo.item.Filtros;
import br.com.caelum.estoque.modelo.item.Item;
import br.com.caelum.estoque.modelo.item.ItemDao;

/**
 * @author Ramon Vieira
 *
 */

@WebService
public class EstoqueWS {

	private ItemDao itemDao = new ItemDao();
	
	@WebMethod(operationName="todosOsItens")
	@WebResult(name="item")
	@ResponseWrapper(localName="Itens")
	@RequestWrapper(localName="listaItens")
	public List<Item> getItems(){
		System.out.println("Processando o getItems()");
		return itemDao.todosItens();
	}
	
	// Usando Filtros
	//@WebMethod(operationName="todosOsItens")
	@WebMethod(exclude=true)
	@WebResult(name="item")
	@ResponseWrapper(localName="Itens")
	public List<Item> getItemsComFiltros(Filtros filtros){
		System.out.println("Processando o getItems()");
		return itemDao.todosItens(filtros.getLista());
	}
	
	@WebMethod(exclude=true)
	public void otherMethod(){
		System.out.println("Method que não está no wsdl");
	}
	
}
