package org.example.juegotenek;

import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.DragShadowBuilder;
import android.view.View.OnDragListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Jovenes_numeros extends Activity{

	private TextView campo_puntos;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.jovenes_numeros);
		
		/*Se importan los botones en Espaniol*/
		findViewById(R.id.btn_esp_10).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.btn_esp_20).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.btn_esp_30).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.btn_esp_40).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.btn_esp_50).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.btn_esp_60).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.btn_esp_70).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.btn_esp_80).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.btn_esp_100).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.btn_esp_200).setOnTouchListener(new MyTouchListener());
		
		/*se importan los layout de los botones en espaniol*/
		findViewById(R.id.layout_btn_esp_10).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.layout_btn_esp_20).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.layout_btn_esp_30).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.layout_btn_esp_40).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.layout_btn_esp_50).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.layout_btn_esp_60).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.layout_btn_esp_70).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.layout_btn_esp_80).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.layout_btn_esp_100).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.layout_btn_esp_200).setOnTouchListener(new MyTouchListener());
		
		
		/*se importan los layout de los botones en tenek*/
		findViewById(R.id.layout_btn_tenek_10).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.layout_btn_tenek_20).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.layout_btn_tenek_30).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.layout_btn_tenek_40).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.layout_btn_tenek_50).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.layout_btn_tenek_60).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.layout_btn_tenek_70).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.layout_btn_tenek_80).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.layout_btn_tenek_100).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.layout_btn_tenek_200).setOnTouchListener(new MyTouchListener());
		
		/* Establecer puntaje a 0, al momento de lanzar la actividad.
	    *  campo_puntos es la vista encargada de mostrar los puntos en este nivel,
	    *  sera de igual forma para los otros niveles.
	    */
	    MainActivity.PUNTOS = 0;
	    campo_puntos = (TextView) findViewById(R.id.textView2);
	    campo_puntos.setText("0");
	}
	
	/*Clase interna para el touch*/
	 private final class MyTouchListener implements OnTouchListener {
		    public boolean onTouch(View view, MotionEvent motionEvent) {
		      if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
		        ClipData data = ClipData.newPlainText("", "");
		        DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
		        view.startDrag(data, shadowBuilder, view, 0);
		        view.setVisibility(View.INVISIBLE);
		        return true;
		      } else {
		        return false;
		      }
		    }
		  }
	 
	 /*Funcion lanzar pantalla previa*/
	 public void lanzarAtras(View view){

	      Intent i = new Intent(this, Jugar.class);

	      startActivity(i);
	      finish();
	 }
	 
	 
	 
	 /*Clase para veridicar las respuestas correctas*/
	 class MyDragListener implements OnDragListener {

			@Override
		    public boolean onDrag(View v, DragEvent event) {
		     View akan;
				
		      
		      if( event.getAction()==DragEvent.ACTION_DROP)
		       {
		        // Dropped, reassign View to ViewGroup
		        View view = (View) event.getLocalState();
		        ViewGroup owner = (ViewGroup) view.getParent();
		        owner.removeView(view);
		        LinearLayout container = (LinearLayout) v;
		        
		        switch(container.getId())
		        {
		        	case R.id.layout_btn_tenek_10:
		        		 if(R.id.btn_esp_10==view.getId())
		 		        {
		 		        Toast.makeText(Jovenes_numeros.this,"Correcto" , Toast.LENGTH_LONG).show();
		 		        container.addView(view);
		 		        akan=findViewById(R.id.btn_tenek_10);
		 		        akan.setVisibility(View.INVISIBLE);
		 		        // Incrementar puntos.
		 		        MainActivity.puntaje(campo_puntos,2);
		 		         }
		        		 else {
		        			 owner.addView(view);
			 		        view.setVisibility(View.VISIBLE);
		        		 }
		 		        	
		 		        	
		         	break;
		         	/*img_num*/
		        	case R.id.layout_btn_tenek_100:
		        				/*boton con txt*/
		        		 if(R.id.btn_esp_100==view.getId())
		 		        {
		 		        Toast.makeText(Jovenes_numeros.this,"Correcto" , Toast.LENGTH_LONG).show();
		 		        container.addView(view);
		 		        			
		 		        akan=findViewById(R.id.btn_tenek_100);
		 		        akan.setVisibility(View.INVISIBLE);
		 		        // Incrementar puntos.
		 		        MainActivity.puntaje(campo_puntos,2);
		 		        }
		        		 else {
		        			 owner.addView(view);
			 		        view.setVisibility(View.VISIBLE);
		        		 }
		 		        
		         	break;
		        	case R.id.layout_btn_tenek_20:
		        		 if(R.id.btn_esp_20==view.getId())
		 		        {
		 		        Toast.makeText(Jovenes_numeros.this,"Correcto" , Toast.LENGTH_LONG).show();
		 		        container.addView(view);
		 		        akan=findViewById(R.id.btn_tenek_20);
		 		        akan.setVisibility(View.INVISIBLE);
		 		        // Incrementar puntos.
		 		        MainActivity.puntaje(campo_puntos,2);
		 		        }
		        		 else {
		        			 owner.addView(view);
			 		        view.setVisibility(View.VISIBLE);
		        		 }
		 		        
		         	break;
		         	
		        	case R.id.layout_btn_tenek_200:
		        		 if(R.id.btn_esp_200==view.getId())
		 		        {
		 		        Toast.makeText(Jovenes_numeros.this,"Correcto" , Toast.LENGTH_LONG).show();
		 		        container.addView(view);
		 		        akan=findViewById(R.id.btn_tenek_200);
		 		        akan.setVisibility(View.INVISIBLE);
		 		    // Incrementar puntos.
		 		        MainActivity.puntaje(campo_puntos,2);
		 		        }
		        		 else {
		        			 owner.addView(view);
			 		        view.setVisibility(View.VISIBLE);
		        		 }
		 		        
		         	break;
		         	
		        	case R.id.layout_btn_tenek_30:
		        		 if(R.id.btn_esp_30==view.getId())
		 		        {
		 		        Toast.makeText(Jovenes_numeros.this,"Correcto" , Toast.LENGTH_LONG).show();
		 		        container.addView(view);
		 		        akan=findViewById(R.id.btn_tenek_30);
		 		        akan.setVisibility(View.INVISIBLE);
		 		    // Incrementar puntos.
		 		        MainActivity.puntaje(campo_puntos,2);
		 		        }
		        		 else {
		        			 owner.addView(view);
			 		        view.setVisibility(View.VISIBLE);
		        		 }
		 		        
		         	break;
		         	
		        	case R.id.layout_btn_tenek_40:
		        		 if(R.id.btn_esp_40==view.getId())
		 		        {
		 		        Toast.makeText(Jovenes_numeros.this,"Correcto" , Toast.LENGTH_LONG).show();
		 		        container.addView(view);
		 		        akan=findViewById(R.id.btn_tenek_40);
		 		        akan.setVisibility(View.INVISIBLE);
		 		    // Incrementar puntos.
		 		        MainActivity.puntaje(campo_puntos,2);
		 		        }
		        		 else {
		        			 owner.addView(view);
			 		        view.setVisibility(View.VISIBLE);
		        		 }
		 		        
		         	break;
		         	
		        	case R.id.layout_btn_tenek_50:
		        		 if(R.id.btn_esp_50==view.getId())
		 		        {
		 		        Toast.makeText(Jovenes_numeros.this,"Correcto" , Toast.LENGTH_LONG).show();
		 		        container.addView(view);
		 		        akan=findViewById(R.id.btn_tenek_50);
		 		        akan.setVisibility(View.INVISIBLE);
		 		    // Incrementar puntos.
		 		        MainActivity.puntaje(campo_puntos,2);
		 		        }
		        		 else {
		        			 owner.addView(view);
			 		        view.setVisibility(View.VISIBLE);
		        		 }
		 		        
		         	break;
		         	
		        	case R.id.layout_btn_tenek_60:
		        		 if(R.id.btn_esp_60==view.getId())
		 		        {
		 		        Toast.makeText(Jovenes_numeros.this,"Correcto" , Toast.LENGTH_LONG).show();
		 		        container.addView(view);
		 		        akan=findViewById(R.id.btn_tenek_60);
		 		        akan.setVisibility(View.INVISIBLE);
		 		    // Incrementar puntos.
		 		        MainActivity.puntaje(campo_puntos,2);
		 		        }
		        		 else {
		        			 owner.addView(view);
			 		        view.setVisibility(View.VISIBLE);
		        		 }
		 		        
		         	break;
		         	
		        	case R.id.layout_btn_tenek_70:
		        		 if(R.id.btn_esp_70==view.getId())
		 		        {
		 		        Toast.makeText(Jovenes_numeros.this,"Correcto" , Toast.LENGTH_LONG).show();
		 		        container.addView(view);
		 		        akan=findViewById(R.id.btn_tenek_70);
		 		        akan.setVisibility(View.INVISIBLE);
		 		    // Incrementar puntos.
		 		        MainActivity.puntaje(campo_puntos,2);
		 		        }
		        		 else {
		        			 owner.addView(view);
			 		        view.setVisibility(View.VISIBLE);
		        		 }
		 		        
		         	break;
		         	
		        	case R.id.layout_btn_tenek_80:
		        		 if(R.id.btn_esp_80==view.getId())
		 		        {
		 		        Toast.makeText(Jovenes_numeros.this,"Correcto" , Toast.LENGTH_LONG).show();
		 		        container.addView(view);
		 		        akan=findViewById(R.id.btn_tenek_80);
		 		        akan.setVisibility(View.INVISIBLE);
		 		    // Incrementar puntos.
		 		        MainActivity.puntaje(campo_puntos,2);
		 		        }
		        		 else {
		        			 owner.addView(view);
			 		        view.setVisibility(View.VISIBLE);
		        		 }
		 		        
		         	break;
		         	
		         	default:
		         		owner.addView(view);
	 		        	view.setVisibility(View.VISIBLE);
	 		        	Toast.makeText(Jovenes_numeros.this,"Intenta otra vez" , Toast.LENGTH_SHORT).show();
		         	break;
		        }
		        
		       
		        
		       
		       
		      }
		      return true;  
		    }
		  }
	 
}
