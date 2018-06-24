package exceptions;

public class ConcessionariaJaCadastradaException extends Exception {
	public ConcessionariaJaCadastradaException() {
		super("Concessionária já cadastrada");
	}
}
