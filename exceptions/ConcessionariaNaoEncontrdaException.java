package exceptions;

public class ConcessionariaNaoEncontrdaException extends Exception {
	public ConcessionariaNaoEncontrdaException() {
		super("Concessionária não encontrada");
	}
}
