package lab7;

import java.io.Serializable;
import java.util.ArrayList;

public class playlist implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ArrayList<songs> list = new ArrayList<songs>();
	int i;
	playlist()
	{
		i=0;
	}
	public void total_songs()
	{
		System.out.println("Total number of songs: " + i);
	}
	public void add(String song_name, String singer_name, String duration)
	{
		songs singit = new songs(song_name,singer_name,duration);
		list.add(singit);
		i++;
	}
	public void delete(String s_name)
	{
		int p=0;
		for(int j=0;j<i;j++)
		{
			songs s;
			s=list.get(j);
			if(s.song_name.equals(s_name))
			{
				p=1;
				list.remove(j);
				i--;
				System.out.println("Number of songs after deleting: " + i);
				break;
			}
		}
		if(p==0)
		{
			System.out.println("Error: song not found");
		}
	}
	public String search(String s_name)
	{
		songs s;
		int p=0;
		String temp="";
		for(int j=0;j<i;j++)
		{
			s=list.get(j);
			if(s.song_name.equals(s_name))
			{
				p=1;
				temp=temp+s.song_name + " " + s.singer_name + " " + s.duration + "\n";
				return(temp);
			}
		}
		return("Error:song not found");
	}
	public String show()
	{
		String temp="";
		songs s;
		if(i!=0)
		{
			for(int j=0;j<i;j++)
			{
				s=list.get(j);
				temp=temp+s.song_name + " " + s.singer_name + " " + s.duration + "\n"; 
			}
			return(temp);
		}
		return("No Song Exist");
	}
}

