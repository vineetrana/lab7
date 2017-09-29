package lab7;

import java.io.Serializable;

public class songs implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String singer_name;
	String song_name;
	String duration;
	songs(String song_name, String singer_name, String duration)
	{
		this.song_name=song_name;
		this.singer_name=singer_name;
		this.duration=duration;
	}
}
