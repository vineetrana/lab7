package lab7;
import java.io.*;
import java.util.*;
public class lab7 {
	public static void serialize() throws FileNotFoundException, IOException
	{
		playlist playlist1 = new playlist();
		playlist1.add("Drugs_na_lena", "Baba Ram Rahim", "5:44");
		playlist1.add("Kaisa laga mera gana", "Mayank Sehrawat", "3:33");
		playlist1.add("Aunty ki ghanti", "Omprakash Mishra", "5:45");
		ObjectOutputStream out = null;
		out= new ObjectOutputStream( new FileOutputStream("/home/winrana/Desktop/lab7/list1.txt"));
		out.writeObject(playlist1);
		out.close();
		out= new ObjectOutputStream( new FileOutputStream("/home/winrana/Desktop/lab7/list2.txt"));
		out.writeObject(playlist1);
		out.close();
		out= new ObjectOutputStream( new FileOutputStream("/home/winrana/Desktop/lab7/list3.txt"));
		out.writeObject(playlist1);
		out.close();
	}
	public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException{
		// TODO Auto-generated method stub
		Reader.init(System.in);
		Scanner obj = new Scanner(System.in);
		serialize();
		int status = 1;
		while(status==1)
{
		System.out.println("1.list1\n" + "2.list2\n" + "3.list3\n" + "Enter the playlist name:\t");
		String abc = Reader.next();
		ObjectInputStream in = null;
		in= new ObjectInputStream( new FileInputStream("/home/winrana/Desktop/lab7/"+abc+".txt"));
		playlist read = (playlist) in.readObject();
		read.total_songs();
		int option=0;
		System.out.println("1. Add​​ ​ a ​ ​ new​ ​ song​ ​ in​ ​ playlist\n" + "2. Delete​​ ​ a ​ ​ song​ ​ from​ ​ playlist​\n" + "3. Search​​ ​ for​ ​ a ​ ​ song​ ​ in​ ​ playlist​\n" + "4. Show​​ ​ all​ ​ songs​ ​ in​ ​ the​ ​ playlist\n" + "5. Back​ ​ to​ ​ menu\n" + "6. Exit​​ ​ the​ ​ app​ ​ option\n");
		option=Reader.nextInt();
		String song_name, singer_name, duration;
		switch(option)
		{
		case 1 :System.out.println("Enter the song name:\t");	
				song_name= obj.nextLine();
				System.out.println("Enter the singer name:\t");
				singer_name=obj.nextLine();
				System.out.println("Enter the duration of the song");
				duration=obj.nextLine();
				read.add(song_name, singer_name, duration);
				read.total_songs();
				break;
				
		case 2: System.out.println("Enter the name of the song:\t");
				song_name=obj.nextLine();
				read.delete(song_name);
				break;
				
		case 3: System.out.println("Enter the name of the song:\t");
				song_name=obj.nextLine();
				System.out.println(read.search(song_name));
				break;
				
		case 4: System.out.println(read.show());
				break;
		
		case 5: break;
		
		case 6: status=0;
				break;
				
		}
		ObjectOutputStream out= new ObjectOutputStream( new FileOutputStream("/home/winrana/Desktop/lab7/"+abc+".txt"));
		out.writeObject(read);
		in.close();
		out.close();
}
	}

}
class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    /** call this method to initialize reader for InputStream */
    static void init(InputStream input) {
        reader = new BufferedReader(
                     new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
    }

    /** get next word */
    static String next() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {
            //TODO add check for of if necessary
            tokenizer = new StringTokenizer(
                   reader.readLine() );
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt( next() );
    }
	
    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    
}}
