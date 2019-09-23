import java.util.ArrayList;

public class Playlist implements IComponent {

	public String playlistName;
	public ArrayList<IComponent> playlist = new ArrayList();

	public Playlist(String playlistName) {
		this.playlistName = playlistName;
	}

  public void play(){
		System.out.println("play the playlist " + this.playlistName);
  }

  public void setPlaybackSpeed(float speed){
		for(IComponent song: this.playlist){
			song.setPlaybackSpeed(speed);
		}
  }

  public String getName(){
		return playlistName;
  }

  public void add(IComponent component){
		playlist.add(component);
  }

  public void remove(IComponent component){
		playlist.remove(component);
  }
}
