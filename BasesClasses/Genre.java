class Genre{
	String name;
	String[] musics;
	int qttMusics;

	public Genre(String name, String[] musics){
		this.name = name;
		this.musics = musics;
		this.qttMusics = musics.length;
	}

	public String[] musicsList(){
		return musics;
	}

	public void edtMusicsGenre(String[] musics){
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