package ExceptionsUnitTestingFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.Random;



public class Runner {
	
	private static void ObjectFoodWriter(Food food)  {
		try (FileOutputStream fileOut = new FileOutputStream("myFiles/objFile1.dat");
				// Creates an ObjectOutputStream
				ObjectOutputStream objOut = new ObjectOutputStream(fileOut)) {

			objOut.writeObject(food);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private static void ObjectFoodWriter(Dragon dragon)  {
		try (FileOutputStream fileOut = new FileOutputStream("myFiles/objFile1.dat");
				// Creates an ObjectOutputStream
				ObjectOutputStream objOut = new ObjectOutputStream(fileOut)) {

			objOut.writeObject(dragon);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private static void ObjectReader() {
		try (FileInputStream file = new FileInputStream("myFiles/objFile1.dat");
				// Creates an ObjectOutputStream
				ObjectInputStream objStream = new ObjectInputStream(file);) {
			try {
			System.out.println("Food :" + (Dragon)objStream.readObject());
			}catch(ClassCastException e) {
				System.out.println("Dragon :" + (Dragon)objStream.readObject());
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		final int TIME = 2;
		int step = 0;
		LocalDate date = LocalDate.of(887, 8, 8);   
		Food food1 = new Food("Pizza", Taste.SWEET, Category.FAT);
		Food food2 = new Food("Falafel", Taste.SOUR, Category.PROTEIN);
		Dragon dragon1 = new Dragon("lolo", LocalDate.now(), 5);
		Dragon dragon2 = new Dragon("koko", date, 4);
		Random rand = new Random();
		ObjectFoodWriter(dragon1);
		try {
			dragon1.setBirthdate(date);
		}catch(TooYoungException e) {
			System.out.println("throw TooYoungException");
		}
//		ObjectFoodWriter(food2);
//		try {
//			food2.setNme("Ayala");
//		}catch(NonCapatilizedException e) {
//			System.out.println("trow NonCapatilizedException");
//		}
//		while(step < TIME) {
//			int rand_int = rand.nextInt(4);
//		switch(rand_int) {
//		case 0:
//			ObjectFoodWriter(food1);
//			break;
//		case 1:
//			ObjectFoodWriter(food2);
//			break;
//		case 2:
//			ObjectFoodWriter(dragon1);
//			break;
//		case 3:
//			ObjectFoodWriter(dragon2);
//			break;
//		}
//		step++;
//		}
		
		ObjectReader(); 
	}

}
