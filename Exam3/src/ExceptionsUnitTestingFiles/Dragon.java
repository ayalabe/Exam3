package ExceptionsUnitTestingFiles;

import java.io.Serializable;
import java.time.LocalDate;

public class Dragon implements Serializable {

	private static final long serialVersionUID = -7411298211144089298L;
	private String name;
	private LocalDate birthdate;
	private int flameIntensity;
	private final LocalDate END_DATE = LocalDate.of(888, 8,8);
	
	
	
	public Dragon(String name, LocalDate birthdate, int flameIntensity) {
		super();
		this.name = name;
		this.birthdate = birthdate;
		setFlameIntensity(flameIntensity);
	}



	@Override
	public String toString() {
		return "Dragon [name=" + name + ", birthdate=" + birthdate + ", flameIntensity=" + flameIntensity + "]";
	}



	private void setFlameIntensity(int flameIntensity) {
		if(flameIntensity >= 0 && flameIntensity <= 10)
			this.flameIntensity = flameIntensity;
		else
			this.flameIntensity = 1;
	}



	public void setBirthdate(LocalDate birthdate) {
		if(birthdate.isAfter(END_DATE))
			throw new TooYoungException("the birth date is after 8/8/888", null);
		else
			this.birthdate = birthdate;
	}
	
	
}
