class Playlist{
	protected String name;
	protected String[] musics;
	protected int qttMusics;

	public Playlist(String name, String[] musics){
		this.name = name;
		this.musics = musics;
		this.qttMusics = musics.length;
	}

	public String[] musicsList(){
		return musics;
	}

	public void edtPlaylist(String name, String[] musics){
		//If theres a new name, update it
		if(name != this.name)
			this.name = name;
		//Always update the music list with the new
		this.musics = musics;
		qttMusics = musics.length;
	}

	public void addMusic(String name){
		if(!this.existsMusic(name))
			musics[qttMusics++] = name;
	}

	public void delMusic(String name){
		for(int i = 0; i < qttMusics; i++)
			if(musics[i] == name)
				musics[i] = musics[--qttMusics];
	}

	public boolean existsMusic(String name){
		for(int i = 0; i < qttMusics; i++)
			if(musics[i] == name)
				return true;
		return false;
	}
}