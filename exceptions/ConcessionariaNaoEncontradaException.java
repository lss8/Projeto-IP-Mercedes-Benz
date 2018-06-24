package exceptions;

public class ConcessionariaNaoEncontradaException extends Exception {
	public ConcessionariaNaoEncontradaException() {
		super("Concessionária não encontrada");
	}
}
