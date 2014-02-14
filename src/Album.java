
public class Album {
	//titulo, año, artista, genero
	private String titulo, genero;
	private int anio;
	private Artista artista;
	
	//ARREGLO: coleccion de pistas
	private Pista[] pistas = new Pista[6];
	
	
	public String getTitulo(){ return this.titulo; }
	public void setTitulo(String Titulo){ this.titulo = Titulo; }
	public String getGenero(){ return this.genero; }
	public void setGenero(String Genero){ this.genero = Genero; }
	public int getAnio(){ return this.anio; }
	public void setAnio(int Anio){ this.anio = Anio; }
	
	public Artista getArtista(){ return this.artista; }
	public void setArtista(Artista _artista){ 
		this.artista = _artista; 
	}
	
	//get y set para el arreglo de pistas
	public Pista[] getPistas(){ return this.pistas; }
	
	public void setPistas(Pista[] Pistas){ this.pistas = Pistas; }
	
	
	
}
