class Genres{
	protected Genre[] genres;
	protected int qttGenres;

	public Genre[] listGenres(){
		return genres;
	}

	public void addGenres(String name, String[] musics){
		Genre newGen = new Genre(name, musics);
		genres[qttGenres++] = newGen;
	}

	public boolean existsGenres(String name){
		for(int i = 0; i < qttGenres; i++)
			if(genres[i].name == name)
				return true;
		return false;
	}
}