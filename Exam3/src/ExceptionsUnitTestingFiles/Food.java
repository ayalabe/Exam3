package ExceptionsUnitTestingFiles;

import java.io.Serializable;

public class Food implements Serializable {

	private static final long serialVersionUID = -2415326952382586222L;
	private String name;
	private Taste taste;
	private Category category;

	public Food(String nme, Taste taste, Category category) {
		super();
		this.name = nme;
		this.taste = taste;
		this.category = category;
	}

	@Override
	public String toString() {
		return "Food [nme=" + name + ", taste=" + taste + ", category=" + category + "]";
	}

	public boolean isDesert() {
		return this.taste == Taste.SWEET && this.category == Category.CARBO_HYDRATE;
	}


	public void setNme(String name) throws NonCapatilizedException {
		if(Character.isUpperCase(name.charAt(0)))
			this.name = name;
		else 
			throw new NonCapatilizedException();
	}

}
