package org.example.juegotenek;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Jugar extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.jugar);
	}
	
	/*se lanza la aztividad de jugar nivel Niños*/
	 public void lanzarNinos(View view){

	      Intent i = new Intent(this, Ninos.class);

	      startActivity(i);
         finish();
 }
	

}