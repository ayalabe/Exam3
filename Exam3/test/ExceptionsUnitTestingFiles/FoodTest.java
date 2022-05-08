package ExceptionsUnitTestingFiles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FoodTest {
	public Food food = new Food("Pizza", Taste.SWEET, Category.FAT);

	@Test
	void checkIsDesert() {
		boolean flage = false;
		assertEquals(flage, food.isDesert());
	}
	@Test
	void checkSetName() {
		try {
			food.setNme("ayala");
		}catch(NonCapatilizedException e) {
			System.out.println(e);
		}
		
	}
	
	
}
