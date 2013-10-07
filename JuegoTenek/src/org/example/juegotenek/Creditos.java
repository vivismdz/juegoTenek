package org.example.juegotenek;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Creditos extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.creditos);
	}
	
	 /*Se lanza pantalla previa*/
	 public void lanzarAtras(View view){

	      Intent i = new Intent(this, MainActivity.class);

	      startActivity(i);
	      finish();
	 }

}
