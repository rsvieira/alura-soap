/**
 * 
 */
package br.com.caelum.estoque.modelo.usuario;

import java.util.Date;

import javax.xml.ws.WebFault;

/**
 * @author Ramon Vieira
 *
 */

@WebFault(name="AutorizacaoFault",messageName="AutorizacaoFault")
public class AutorizationException extends Exception {

	private static final long serialVersionUID = -5615135081201479951L;

	public AutorizationException(){
		
	}
	
	public AutorizationException(String message){
		super(message);
	}
	
	public InfoFault getFaultInfo(){
		return new InfoFault("Token invalido" , new Date());
	}

}
