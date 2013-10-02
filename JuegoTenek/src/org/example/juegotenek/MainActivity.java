package org.example.juegotenek;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

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

}
