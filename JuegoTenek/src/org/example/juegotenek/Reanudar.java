package org.example.juegotenek;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Reanudar extends Activity{
	
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.reanudar);
	}
	
	 /*Se lanza pantalla previa*/
	 public void lanzarAtras(View view){

	      Intent i = new Intent(this, MainActivity.class);

	      startActivity(i);
	      finish();
	 }
}
