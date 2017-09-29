package test_case;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import static org.junit.Assert.*;
import org.junit.Test;

import lab7.*;
public class search {
	@Test
	public void test() throws FileNotFoundException, IOException, ClassNotFoundException{
		ObjectInputStream in = null;
		in= new ObjectInputStream( new FileInputStream("/home/winrana/Desktop/lab7/list1.txt"));
		playlist read = (playlist) in.readObject();
		String testing= "Aunty ki ghanti Omprakash Mishra 5:45" + "\n";
		assertEquals(testing,read.search("Aunty ki ghanti"));
	}

}
