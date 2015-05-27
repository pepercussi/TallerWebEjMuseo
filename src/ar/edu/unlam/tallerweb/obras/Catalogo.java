package ar.edu.unlam.tallerweb.obras;

import java.util.TreeSet;

public class Catalogo {
	
	private TreeSet<ObraDeArte> listaObrasDeArte = new TreeSet<ObraDeArte>();

	public void agregarObra(ObraDeArte nuevaObraDeArte) throws Exception{
			if(this.listaObrasDeArte.add(nuevaObraDeArte)==false){
				throw new Exception("No se puede agregar el objeto");
			}
	}//End method agregarObra
	
	public int ontenerCantidadObras(){
		return  this.listaObrasDeArte.size();
	}//End method obtenerCantidadObras
	
	public boolean existeObra(ObraDeArte obraDeArteBuscada){
		//System.out.print(this.listaObrasDeArte.contains(obraDeArteBuscada));
		return this.listaObrasDeArte.contains(obraDeArteBuscada);
	}//End method existeObra
	

	public TreeSet<ObraDeArte> getObras(){
		return this.listaObrasDeArte;
	}//End method getObras
	
	
}
