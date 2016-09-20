package br.com.caelum.estoque.ws;

import java.util.List;

import javax.jws.WebService;

import br.com.caelum.estoque.modelo.item.Item;
import br.com.caelum.estoque.modelo.item.ItemDao;

/**
 * @author Ramon Vieira
 *
 */

@WebService
public class EstoqueWS {

	private ItemDao itemDao = new ItemDao();
	
	public List<Item> getItems(){
		System.out.println("Processando o getItems()");
		return itemDao.todosItens();
	}
	
}
