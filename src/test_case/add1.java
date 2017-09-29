package test_case;
import lab7.*;
import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import org.junit.Test;

public class add1 {

	@Test
	public void test() throws FileNotFoundException, IOException, ClassNotFoundException {
		lab7 l = new lab7();
		ObjectInputStream in = null;
		in= new ObjectInputStream( new FileInputStream("/home/winrana/Desktop/lab7/list1.txt"));
		playlist read = (playlist) in.readObject();
		read.add("dhadkan", "Raghav", "40:00");
		String testing= "Drugs_na_lena Baba Ram Rahim 5:44" + "\n" + "Kaisa laga mera gana Mayank Sehrawat 3:33" + "\n" + "Aunty ki ghanti Omprakash Mishra 5:45" + "\n" + "dhadkan Raghav 40:00"+"\n";
		assertEquals(testing,read.show());
	}

}
