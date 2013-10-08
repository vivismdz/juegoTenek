package org.example.juegotenek;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	// Variables para el manejo de puntos.
	public static int PUNTOS = 0;
	private static TextView NUEVOS_PUNTOS;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	/*se lanza la aztividad de juegar*/
	 public void lanzarJugar(View view){

	      Intent i = new Intent(this, Jugar.class);

	      startActivity(i);
          finish();
  }
	 /*se lanza la aztividad de reanudar juego*/
	 public void lanzarReanudar(View view){

	      Intent i = new Intent(this, Reanudar.class);

	      startActivity(i);
          finish();
 }
	 
	 /*se lanza la aztividad de creditos*/
	 public void lanzarCreditos(View view){

	      Intent act = new Intent(this, Creditos.class);
	      startActivity(act);
          finish();
 }
	 
	 // Funcion para sumar puntos segun sea el nivel de juego.
	 /* Esta funcion se llama cuando coincide el elmento arrastrado con
	  * la vista deseada.
	  * Su llamada seria MainActivity.puntaje(vistaPuntos, nivel)
	  * vistaPuntos - Vista en donde se muestran los puntos actuales.
	  * 			  Habra una en cada nivel para mostrar los puntos.
	  * nivel - Numero de nivel, segun el nivel son los puntos a sumar.
	  *  Nivel 1 : 100 puntos
	  *  Nivel 2 : 150 puntos
	  *  Nivel 3 : 200 puntos
	  *  
	  */
	 public static void puntaje(View view, int nivel){
		 switch(nivel){
		 case 1:
			 PUNTOS += 100;
			 break;
		 case 2:
			 PUNTOS += 150;
			 break;
		 case 3:
			 PUNTOS += 200;
			 break;
		 }
		 // Actualizar los puntos en la vista del puntaje.
		 NUEVOS_PUNTOS = (TextView) view;
		 NUEVOS_PUNTOS.setText(Integer.toString(PUNTOS));
		 
	 }

}
