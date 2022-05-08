package ExceptionsUnitTestingFiles;

public class NonCapatilizedException extends Exception {

	private static final long serialVersionUID = 2789621496280322197L;

	private String name;

	public NonCapatilizedException() {
		super();
		this.name = "The name does not begin with a capital letter";
	}

	
}
