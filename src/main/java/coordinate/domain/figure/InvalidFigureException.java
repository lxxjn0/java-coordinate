package coordinate.domain.figure;

public class InvalidFigureException extends Exception {
	public InvalidFigureException() {
	}

	public InvalidFigureException(String message) {
		super(message);
	}
}
