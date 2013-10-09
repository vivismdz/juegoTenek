package org.example.juegotenek;


import android.app.Activity;
import android.os.Bundle;
import android.content.ClipData;
import android.content.Intent;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.DragShadowBuilder;
import android.view.View.OnDragListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;

import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Ninos  extends Activity {
	
		/*variable para puntuación*/
		private TextView campo_puntos;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ninos);
		
		/*boton con texto del animal*/
		findViewById(R.id.animal_burro).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.animal_camello).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.animal_chango).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.animal_cocodrilo).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.animal_conejo).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.animal_gato).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.animal_hipopotamo).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.animal_jirafa).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.animal_vaca).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.animal_tortuga).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.animal_raton).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.animal_perro).setOnTouchListener(new MyTouchListener());
		
		/*linear del boton con la imagen*/
	    findViewById(R.id.linear_img_burro).setOnDragListener(new MyDragListener());
	    findViewById(R.id.linear_img_camello).setOnDragListener(new MyDragListener());
	    findViewById(R.id.linear_img_chango).setOnDragListener(new MyDragListener());
	    findViewById(R.id.linear_img_conejo).setOnDragListener(new MyDragListener());
	    findViewById(R.id.linear_img_gato).setOnDragListener(new MyDragListener());
	    findViewById(R.id.linear_img_hipopotamo).setOnDragListener(new MyDragListener());
	    findViewById(R.id.linear_img_jirafa).setOnDragListener(new MyDragListener());
	    findViewById(R.id.linear_img_perro).setOnDragListener(new MyDragListener());
	    findViewById(R.id.linear_img_raton).setOnDragListener(new MyDragListener());
	    findViewById(R.id.linear_img_tortuga).setOnDragListener(new MyDragListener());
	    findViewById(R.id.linear_img_vaca).setOnDragListener(new MyDragListener());
	    findViewById(R.id.linear_img_cocodrilo).setOnDragListener(new MyDragListener());
	    
	    /*linear del boton con texto*/
	    findViewById(R.id.animal_linear_burro).setOnDragListener(new MyDragListener());
	    findViewById(R.id.animal_linear_camello).setOnDragListener(new MyDragListener());
	    findViewById(R.id.animal_linear_chango).setOnDragListener(new MyDragListener());
	    findViewById(R.id.animal_linear_cocodrilo).setOnDragListener(new MyDragListener());
	    findViewById(R.id.animal_linear_conejo).setOnDragListener(new MyDragListener());
	    findViewById(R.id.animal_linear_vaca).setOnDragListener(new MyDragListener());
	    findViewById(R.id.animal_linear_gato).setOnDragListener(new MyDragListener());
	    findViewById(R.id.animal_linear_hipopotamo).setOnDragListener(new MyDragListener());
	    findViewById(R.id.animal_linear_jirafa).setOnDragListener(new MyDragListener());
	    findViewById(R.id.animal_linear_perro).setOnDragListener(new MyDragListener());
	    findViewById(R.id.animal_linear_raton).setOnDragListener(new MyDragListener());
	    findViewById(R.id.animal_linear_tortuga).setOnDragListener(new MyDragListener());
	   
	    /*se resetea la puntuacion*/
	    MainActivity.PUNTOS = 0;
	    campo_puntos = (TextView) findViewById(R.id.textView2);
	    campo_puntos.setText("0");
	}
	
	/*Funciones pantallas botones */
	 /*Se lanza pantalla previa*/
	 public void lanzarAtras(View view){

	      Intent i = new Intent(this, Ninos_nivel.class);

	      startActivity(i);
	      finish();
	 }
	 
	 

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
	 
	 
	 /*Funcion drag and drop*/
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
		        RelativeLayout container = (RelativeLayout) v;
		        
		        switch(container.getId())
		        {
		        	case R.id.linear_img_vaca:
		        		 if(R.id.animal_vaca==view.getId())
		 		        {
		 		        Toast.makeText(Ninos.this,"cero" , Toast.LENGTH_SHORT).show();
		 		        container.addView(view);
		 		        akan=findViewById(R.id.btn_img_vaca);
		 		        akan.setVisibility(View.INVISIBLE);
		 		        // Incrementar puntos.
		 		        MainActivity.puntaje(campo_puntos,1);
		 		         }
		        		 else {
		        			 owner.addView(view);
			 		        view.setVisibility(View.VISIBLE);
		        		 }
		 		        	
		 		        	
		         	break;
		         	/*img_num*/
		        	case R.id.linear_img_burro:
		        				/*boton con txt*/
		        		 if(R.id.animal_burro==view.getId())
		 		        {
		 		        Toast.makeText(Ninos.this,"uno" , Toast.LENGTH_SHORT).show();
		 		        container.addView(view);
		 		        			
		 		        akan=findViewById(R.id.btn_img_burro);
		 		        akan.setVisibility(View.INVISIBLE);
		 		        // Incrementar puntos.
		 		        MainActivity.puntaje(campo_puntos,1);
		 		        }
		        		 else {
		        			 owner.addView(view);
			 		        view.setVisibility(View.VISIBLE);
		        		 }
		 		        
		         	break;
		         	
		        	case R.id.linear_img_camello:
		        		 if(R.id.animal_camello==view.getId())
		 		        {
		 		        Toast.makeText(Ninos.this,"dos" , Toast.LENGTH_SHORT).show();
		 		        container.addView(view);
		 		        akan=findViewById(R.id.btn_img_camello);
		 		        akan.setVisibility(View.INVISIBLE);
		 		        // Incrementar puntos.
		 		        MainActivity.puntaje(campo_puntos,1);
		 		        }
		        		 else {
		        			 owner.addView(view);
			 		        view.setVisibility(View.VISIBLE);
		        		 }
		 		        
		         	break;
		         	
		        	case R.id.linear_img_chango:
		        		 if(R.id.animal_chango==view.getId())
		 		        {
		 		        Toast.makeText(Ninos.this,"tres" , Toast.LENGTH_SHORT).show();
		 		        container.addView(view);
		 		        akan=findViewById(R.id.btn_img_chango);
		 		        akan.setVisibility(View.INVISIBLE);
		 		    // Incrementar puntos.
		 		        MainActivity.puntaje(campo_puntos,1);
		 		        }
		        		 else {
		        			 owner.addView(view);
			 		        view.setVisibility(View.VISIBLE);
		        		 }
		 		        
		         	break;
		         	
		        	case R.id.linear_img_cocodrilo:
		        		 if(R.id.animal_cocodrilo==view.getId())
		 		        {
		 		        Toast.makeText(Ninos.this,"cuatro" , Toast.LENGTH_SHORT).show();
		 		        container.addView(view);
		 		        akan=findViewById(R.id.btn_img_cocodrilo);
		 		        akan.setVisibility(View.INVISIBLE);
		 		    // Incrementar puntos.
		 		        MainActivity.puntaje(campo_puntos,1);
		 		        }
		        		 else {
		        			 owner.addView(view);
			 		        view.setVisibility(View.VISIBLE);
		        		 }
		 		        
		         	break;
		         	
		        	case R.id.linear_img_conejo:
		        		 if(R.id.animal_conejo==view.getId())
		 		        {
		 		        Toast.makeText(Ninos.this,"cinco" , Toast.LENGTH_SHORT).show();
		 		        container.addView(view);
		 		        akan=findViewById(R.id.btn_img_conejo);
		 		        akan.setVisibility(View.INVISIBLE);
		 		    // Incrementar puntos.
		 		        MainActivity.puntaje(campo_puntos,1);
		 		        }
		        		 else {
		        			 owner.addView(view);
			 		        view.setVisibility(View.VISIBLE);
		        		 }
		 		        
		         	break;
		         	
		        	case R.id.linear_img_gato:
		        		 if(R.id.animal_gato==view.getId())
		 		        {
		 		        Toast.makeText(Ninos.this,"seis" , Toast.LENGTH_SHORT).show();
		 		        container.addView(view);
		 		        akan=findViewById(R.id.btn_img_gato);
		 		        akan.setVisibility(View.INVISIBLE);
		 		    // Incrementar puntos.
		 		        MainActivity.puntaje(campo_puntos,1);
		 		        }
		        		 else {
		        			 owner.addView(view);
			 		        view.setVisibility(View.VISIBLE);
		        		 }
		 		        
		         	break;
		         	
		        	case R.id.linear_img_hipopotamo:
		        		 if(R.id.animal_hipopotamo==view.getId())
		 		        {
		 		        Toast.makeText(Ninos.this,"siete" , Toast.LENGTH_SHORT).show();
		 		        container.addView(view);
		 		        akan=findViewById(R.id.btn_img_hipopotamo);
		 		        akan.setVisibility(View.INVISIBLE);
		 		    // Incrementar puntos.
		 		        MainActivity.puntaje(campo_puntos,1);
		 		        }
		        		 else {
		        			 owner.addView(view);
			 		        view.setVisibility(View.VISIBLE);
		        		 }
		 		        
		         	break;
		         	
		        	case R.id.linear_img_jirafa:
		        		 if(R.id.animal_jirafa==view.getId())
		 		        {
		 		        Toast.makeText(Ninos.this,"ocho" , Toast.LENGTH_SHORT).show();
		 		        container.addView(view);
		 		        akan=findViewById(R.id.btn_img_jirafa);
		 		        akan.setVisibility(View.INVISIBLE);
		 		    // Incrementar puntos.
		 		        MainActivity.puntaje(campo_puntos,1);
		 		        }
		        		 else {
		        			 owner.addView(view);
			 		        view.setVisibility(View.VISIBLE);
		        		 }
		 		        
		         	break;
		         	
		        	case R.id.linear_img_perro:
		        		 if(R.id.animal_linear_perro==view.getId())
		 		        {
		 		        Toast.makeText(Ninos.this,"nueve" , Toast.LENGTH_SHORT).show();
		 		        container.addView(view);
		 		        akan=findViewById(R.id.btn_img_perro);
		 		        akan.setVisibility(View.INVISIBLE);
		 		    // Incrementar puntos.
		 		        MainActivity.puntaje(campo_puntos,1);
		 		        }
		        		 else {
		        			 owner.addView(view);
			 		        view.setVisibility(View.VISIBLE);
		        		 }
		 		        
		         	break;
		         	
		        	case R.id.linear_img_raton:
		        		 if(R.id.animal_linear_raton==view.getId())
		 		        {
		 		        Toast.makeText(Ninos.this,"nueve" , Toast.LENGTH_SHORT).show();
		 		        container.addView(view);
		 		        akan=findViewById(R.id.btn_img_raton);
		 		        akan.setVisibility(View.INVISIBLE);
		 		    // Incrementar puntos.
		 		        MainActivity.puntaje(campo_puntos,1);
		 		        }
		        		 else {
		        			 owner.addView(view);
			 		        view.setVisibility(View.VISIBLE);
		        		 }
		 		        
		         	break;
		         	
		        	case R.id.linear_img_tortuga:
		        		 if(R.id.animal_linear_tortuga==view.getId())
		 		        {
		 		        Toast.makeText(Ninos.this,"nueve" , Toast.LENGTH_SHORT).show();
		 		        container.addView(view);
		 		        akan=findViewById(R.id.btn_img_tortuga);
		 		        akan.setVisibility(View.INVISIBLE);
		 		    // Incrementar puntos.
		 		        MainActivity.puntaje(campo_puntos,1);
		 		        }
		        		 else {
		        			 owner.addView(view);
			 		        view.setVisibility(View.VISIBLE);
		        		 }
		 		        
		         	break;
		         	
		         	default:
		         		owner.addView(view);
	 		        	view.setVisibility(View.VISIBLE);
	 		        	Toast.makeText(Ninos.this,"Intenta otra vez" , Toast.LENGTH_SHORT).show();
		         	break;
		        }
		        
		       
		        
		       
		       
		      }
		      return true;  
		    }
		  }
}