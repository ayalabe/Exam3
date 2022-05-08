package ExceptionsUnitTestingFiles;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class DragonTest {
	Dragon dragon = new Dragon("dada",LocalDate.now(),6);

	@Test
	void checkSetName() {
		try {
			dragon.setBirthdate(LocalDate.now());
		}catch(TooYoungException e) {
			System.out.println(e);
		}
		
	}

}
