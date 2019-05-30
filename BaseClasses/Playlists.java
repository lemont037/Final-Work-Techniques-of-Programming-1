public class Playlists{
	protected Playlist[] playlists;
	protected int qttPlaylists;

	public Playlist[] listPlaylists(){
		return playlists;
	}

	public void addPlaylist(String name, String[] musics){
		//Creating a new Playlist object
		Playlist newPl = new Playlist(name, musics);
		//Appending it in the playlists list and increasing qttPlaylists 
		playlists[qttPlaylists++] = newPl;
	}
	
	public void delPlaylist(String name){
		//Searching by the playlist
		for(int i = 0; i < qttPlaylists; i++)
			if(playlists[i].name == name)
				//Changing it with the last and decrementing qttPlaylists 
				playlists[i] = playlists[--qttPlaylists];
	}

	public boolean existsPlaylist(String name){
		for(int i = 0; i < qttPlaylists; i++)
			if(playlists[i].name == name)
				return true;
		return false;
	}

}