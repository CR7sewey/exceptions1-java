package model.exceptions;

public class DomainException extends Exception  { // RunTimeException nao obriga a tratar, so quebra programa a correr!

	
	private static final long serialVersionUID = 1L; // RunTImeEception nao obriga a tratar
	
	
	public DomainException(String msg) {
		super(msg);
	}
	

}
