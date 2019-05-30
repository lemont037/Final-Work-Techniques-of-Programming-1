class Artists{
	protected Artist[] artists;
	protected int qttArtists;

	public Artist[] listArtists(){
		return artists;
	}

	public void addArtist(String name, String[] musics){
		Artist newArt = new Artist(name, musics);
		artists[qttArtists++] = newArt;
	}

	public boolean existsArtist(String name){
		for(int i = 0; i < qttArtists; i++)
			if(artists[i].name == name)
				return true;
		return false;
	}
}