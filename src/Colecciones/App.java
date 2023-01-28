package Colecciones;

import java.util.ArrayList;
import java.util.Collections;

public class App {

	public static void main(String[] args) {
		
		Restaurant rest1 = new Restaurant ("Can Roca", 10);
		Restaurant rest2 = new Restaurant ("Arzak", 9);
		Restaurant rest3 = new Restaurant ("El Bulli", 11);
		Restaurant rest4 = new Restaurant ("Biko", 9);
		
		
		ArrayList <Restaurant> listaRest = new ArrayList<Restaurant>();
		
		listaRest.add(rest1);
		listaRest.add(rest2);
		listaRest.add(rest3);
		listaRest.add(rest4);
		
		Collections.sort(listaRest);
		
		for (Restaurant restaurante : listaRest) {
			System.out.println(restaurante.getNombre()+ " y su puntación es "+ restaurante.getPuntuacion());
		}
		
		
	}

}
