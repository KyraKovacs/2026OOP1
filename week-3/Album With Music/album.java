import java.util.Comparator;
import java.util.Optional;
import java.util.List;
import java.util.ArrayList;

public class Album
{
	private List<Song> songs;
	private String artist;
	
	public Album(String artist)
	{
		this.songs=new ArrayList<>();
		this.artist=artist;
	}
	
	public List<Song> getSongs()
	{
		return this.songs;
	}
	
	public void setSongs(List<Song> songs)
	{
		this.songs=songs;
	}
	
	public String getArtist()
	{
		return this.artist;
	}
	
	public void setArtist(String artist)
	{
		this.artist=artist;
	}
	
	public void addSong(List<Song> songs) 
	{
        this.songs.add(song);
    }
	
	public static Optional<Song> getMostPopularSong() 
	{
		return songs.stream()
			.max(Comparator.comparingInt(Song::getTimesPlayed));
	}
	
	public static int getTotalPlayingTimeInSeconds()
	{
		return.this.Integer.sum(playTimeInSeconds);
	}
	
	public static boolean isRoadTripWorthy(int playTimeInSeconds, int timesPlayed)
	{
		if (playTimeInSeconds*timesPlayed > 60*60)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static List<Song> filterByTitle(String text) 
	{
		return songs.stream()
			.filter(song -> song.getTitle().contains(text))
			.toList();
	}
}
