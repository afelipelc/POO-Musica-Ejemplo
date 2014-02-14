
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//AQUI VAMOS A CREAR LOS OBJETOS
		
		//Artista
		Artista artista1 = new Artista();
		artista1.setNombre("Pancho Fulgencio");
		artista1.setEdad(34);
		artista1.setNacionalidad("Italiana");
		
		Artista artista2 = new Artista();
		artista2.setNombre("Telesforo");
		artista2.setEdad(23);
		artista2.setNacionalidad("Alemana");
		
		//Autor
		Autor autor1 = new Autor();
		autor1.setNombre("Teodoro");
		autor1.setEdad(30);
		autor1.setAntiguedad(25);
		
		Autor autor2 = new Autor();
		autor2.setNombre("Lucrecia");
		autor2.setEdad(21);
		autor2.setAntiguedad(5);
		
		//Pista
		Pista pista1 = new Pista();
		pista1.setNumero(1);
		pista1.setTitulo("Una infantil");
		pista1.setDuracion(264);
		pista1.setGenero("Infantil");
		pista1.setAutor(autor2); //aqui asociamos los objetos: autor2
		pista1.setArtista(artista2); //aqui asociamos los objetos: artista2
		
		//mostrar los datos en pantalla
		System.out.println("Tenemos 2 pistas");
		System.out.println("La pista 1 se llama " + pista1.getTitulo());
		System.out.println("La duración es de " + (pista1.getDuracion()/60) + ":" + (pista1.getDuracion()%60) + " min.");
		
		//Crear arreglo de Pistas
		Pista[] pistas = new Pista[6]; //arreglo de 6 pistas
		//ya tenemos 1 pista, vamos a agregarla al arreglo
		String[] cadenas = new String[5];
		cadenas[0] = "Hola";
		cadenas[2] = "como estan";
		cadenas[1] = "a todos";
		
		//mostrar los valores del arreglo
		System.out.println("La posicion 2 tiene: " + cadenas[2]);
		System.out.println("La posicion 1 tiene: " + cadenas[1]);
		System.out.println("La posicion 0 tiene: " + cadenas[0]);
		
		//recorrer el arreglo con un ciclo FOR
		for(int i=0; i < cadenas.length; i++){
			System.out.println("La posicion " + i + " tiene: " + cadenas[i]);
		}
		
		//recorrerlo con un EACH
		for(String item : cadenas){
			System.out.println("El valor es: " + item);
		}
		
		
		//VOLVEMOS A LAS PISTAS
		//ya tenemos declarado un arreglo pistas en este metodo
		//ya tenemos un objeto llamado pista1
		pistas[0] = pista1;
		//Crear otro objeto pista y meterlo en la posicion 1
		
		//hágalo usted
		Pista pista2 = new Pista();
		pista2.setTitulo("El próximo viaje");
		pista2.setDuracion(301);
		pista2.setArtista(artista1);
		pista2.setAutor(autor1);
		pista2.setGenero("Infantil");
		pista2.setNumero(2);
		
		pistas[1] = pista2;
		
		//indicar que el album tiene las pistas que hemos creado
		Album album1 = new Album();
		album1.setAnio(2014);
		album1.setArtista(artista1);
		album1.setGenero("Mix");
		album1.setTitulo("Mi primer album");
		album1.setPistas(pistas); //nuestro arreglo lleva 2 pistas
		
		//mostrar datos del album
		System.out.println("\n\nEl album se titula: " + album1.getTitulo());
		System.out.println("El album es del año: " + album1.getAnio());
		System.out.println("El artista del album es: " 
		+ album1.getArtista().getNombre());
		
		System.out.println("El número de pistas es: " 
		+ album1.getPistas().length); 
		
		System.out.println("Las pistas del álbum son: ");
		
		//Accedemos al arreglo a través de un método
		System.out.println("Pista " + album1.getPistas()[0].getNumero());
		System.out.println("Título " + album1.getPistas()[0].getTitulo());
		
		System.out.println("\nPista " + album1.getPistas()[1].getNumero());
		System.out.println("Título " + album1.getPistas()[1].getTitulo());
		
	}
}




