package org.example.juegotenek;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ninos_nivel extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ninos_nivel);
	}
	
	/*Se lanza nivel de animales*/
	 public void lanzarNinos(View view){

	      Intent i = new Intent(this, Ninos.class);

	      startActivity(i);
         finish();
	 }
	 
	 /*Se lanza nivel de numeros*/
	 public void lanzarNinosNumeros(View view){

	      Intent i = new Intent(this, Ninos_numeros.class);

	      startActivity(i);
         finish();
	 }
	
	 
	 /*Se lanza pantalla previa*/
	 public void lanzarAtras(View view){

	      Intent i = new Intent(this, Jugar.class);

	      startActivity(i);
	      finish();
	 }
}
