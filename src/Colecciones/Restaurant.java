package Colecciones;

public class Restaurant implements Comparable<Restaurant> {
	
	protected String nombre;
	protected int puntuacion;
	
	public Restaurant(String nombre, int puntuacion) {
		this.nombre=nombre;
		this.puntuacion=puntuacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
	
	
	
	@Override
    public int compareTo(Restaurant otroRest) {
        int resultado = this.nombre.compareTo(otroRest.nombre);
        if (resultado == 0) {
            resultado = Integer.compare(this.puntuacion, otroRest.puntuacion);
        }
        return resultado;
    }
}
