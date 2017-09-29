package test_case;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import static org.junit.Assert.*;
import org.junit.Test;

import lab7.*;
public class delete {
	@Test
	public void test() throws FileNotFoundException, IOException, ClassNotFoundException{
//	lab7 l = new lab7();
	ObjectInputStream in = null;
	in= new ObjectInputStream( new FileInputStream("/home/winrana/Desktop/lab7/list1.txt"));
	playlist read = (playlist) in.readObject();
	read.delete("Aunty ki ghanti");
	String testing= "Drugs_na_lena Baba Ram Rahim 5:44" + "\n" + "Kaisa laga mera gana Mayank Sehrawat 3:33" + "\n";
	assertEquals(testing,read.show());
	}
	
}
