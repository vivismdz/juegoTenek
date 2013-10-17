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

public class Adultos_frases extends Activity{
private TextView campo_puntos;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.adultos_frases);
		
		/*importar de botones con texto*/
		findViewById(R.id.txt_f1).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.txt_f2).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.txt_f3).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.txt_f4).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.txt_f5).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.txt_f6).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.txt_f7).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.txt_f8).setOnTouchListener(new MyTouchListener());
		
		/*Importar layout de boton con texto*/
	    findViewById(R.id.layout_txt_f1).setOnDragListener(new MyDragListener());
	    findViewById(R.id.layout_txt_f2).setOnDragListener(new MyDragListener());
	    findViewById(R.id.layout_txt_f3).setOnDragListener(new MyDragListener());
	    findViewById(R.id.layout_txt_f4).setOnDragListener(new MyDragListener());
	    findViewById(R.id.layout_txt_f5).setOnDragListener(new MyDragListener());
	    findViewById(R.id.layout_txt_f6).setOnDragListener(new MyDragListener());
	    findViewById(R.id.layout_txt_f7).setOnDragListener(new MyDragListener());
	    findViewById(R.id.layout_txt_f8).setOnDragListener(new MyDragListener());
	    /*importar layout de imagenes*/
	    findViewById(R.id.layout_img_f1).setOnDragListener(new MyDragListener());
	    findViewById(R.id.layout_img_f2).setOnDragListener(new MyDragListener());
	    findViewById(R.id.layout_img_f3).setOnDragListener(new MyDragListener());
	    findViewById(R.id.layout_img_f4).setOnDragListener(new MyDragListener());
	    findViewById(R.id.layout_img_f5).setOnDragListener(new MyDragListener());
	    findViewById(R.id.layout_img_f6).setOnDragListener(new MyDragListener());
	    findViewById(R.id.layout_img_f7).setOnDragListener(new MyDragListener());
	    findViewById(R.id.layout_img_f8).setOnDragListener(new MyDragListener());
	    
	    // Establecer puntaje a 0, al momento de lanzar la actividad.
	    /* campo_puntos es la vista encargada de mostrar los puntos en este nivel,
	    *  sera de igual forma para los otros niveles.
	    */
	    MainActivity.PUNTOS = 0;
	    campo_puntos = (TextView) findViewById(R.id.textView2);
	    campo_puntos.setText("0");
	}
	
	 /*Se lanza pantalla previa*/
	 public void lanzarAtras(View view){

	      Intent i = new Intent(this, Jugar.class);

	      startActivity(i);
	      finish();
	 }
	 /*Clase para la funcion on touch*/
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
	 
	 /*Clase receptora de evento on touch*/
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
		        	case R.id.layout_img_f1:
		        		 if(R.id.txt_f1==view.getId())
		 		        {
		 		        Toast.makeText(Adultos_frases.this,"Correcto" , Toast.LENGTH_LONG).show();
		 		        container.addView(view);
		 		        akan=findViewById(R.id.img_f1);
		 		        akan.setVisibility(View.INVISIBLE);
		 		        // Incrementar puntos.
		 		        MainActivity.puntaje(campo_puntos,3);
		 		         }
		        		 else {
		        			 owner.addView(view);
			 		        view.setVisibility(View.VISIBLE);
		        		 }
   	
		         	break;
		         	
		        	case R.id.layout_img_f2:
		        		 if(R.id.txt_f2==view.getId())
		 		        {
		 		        Toast.makeText(Adultos_frases.this,"Correcto" , Toast.LENGTH_LONG).show();
		 		        container.addView(view);
		 		        akan=findViewById(R.id.img_f2);
		 		        akan.setVisibility(View.INVISIBLE);
		 		        // Incrementar puntos.
		 		        MainActivity.puntaje(campo_puntos,3);
		 		         }
		        		 else {
		        			 owner.addView(view);
			 		        view.setVisibility(View.VISIBLE);
		        		 }
  	
		         	break;
		         	
		        	case R.id.layout_img_f3:
		        		 if(R.id.txt_f3==view.getId())
		 		        {
		 		        Toast.makeText(Adultos_frases.this,"Correcto" , Toast.LENGTH_LONG).show();
		 		        container.addView(view);
		 		        akan=findViewById(R.id.img_f3);
		 		        akan.setVisibility(View.INVISIBLE);
		 		        // Incrementar puntos.
		 		        MainActivity.puntaje(campo_puntos,3);
		 		         }
		        		 else {
		        			 owner.addView(view);
			 		        view.setVisibility(View.VISIBLE);
		        		 }
  	
		         	break;
		         	
		        	case R.id.layout_img_f4:
		        		 if(R.id.txt_f4==view.getId())
		 		        {
		 		        Toast.makeText(Adultos_frases.this,"Correcto" , Toast.LENGTH_LONG).show();
		 		        container.addView(view);
		 		        akan=findViewById(R.id.img_f4);
		 		        akan.setVisibility(View.INVISIBLE);
		 		        // Incrementar puntos.
		 		        MainActivity.puntaje(campo_puntos,3);
		 		         }
		        		 else {
		        			 owner.addView(view);
			 		        view.setVisibility(View.VISIBLE);
		        		 }
  	
		         	break;
		         	
		        	case R.id.layout_img_f5:
		        		 if(R.id.txt_f5==view.getId())
		 		        {
		 		        Toast.makeText(Adultos_frases.this,"Correcto" , Toast.LENGTH_LONG).show();
		 		        container.addView(view);
		 		        akan=findViewById(R.id.img_f5);
		 		        akan.setVisibility(View.INVISIBLE);
		 		        // Incrementar puntos.
		 		        MainActivity.puntaje(campo_puntos,3);
		 		         }
		        		 else {
		        			 owner.addView(view);
			 		        view.setVisibility(View.VISIBLE);
		        		 }
  	
		         	break;
		         	
		        	case R.id.layout_img_f6:
		        		 if(R.id.txt_f6==view.getId())
		 		        {
		 		        Toast.makeText(Adultos_frases.this,"Correcto" , Toast.LENGTH_LONG).show();
		 		        container.addView(view);
		 		        akan=findViewById(R.id.img_f6);
		 		        akan.setVisibility(View.INVISIBLE);
		 		        // Incrementar puntos.
		 		        MainActivity.puntaje(campo_puntos,3);
		 		         }
		        		 else {
		        			 owner.addView(view);
			 		        view.setVisibility(View.VISIBLE);
		        		 }
  	
		         	break;
		         	
		        	case R.id.layout_img_f7:
		        		 if(R.id.txt_f7==view.getId())
		 		        {
		 		        Toast.makeText(Adultos_frases.this,"Correcto" , Toast.LENGTH_LONG).show();
		 		        container.addView(view);
		 		        akan=findViewById(R.id.img_f7);
		 		        akan.setVisibility(View.INVISIBLE);
		 		        // Incrementar puntos.
		 		        MainActivity.puntaje(campo_puntos,3);
		 		         }
		        		 else {
		        			 owner.addView(view);
			 		        view.setVisibility(View.VISIBLE);
		        		 }
  	
		         	break;
		         	
		        	case R.id.layout_img_f8:
		        		 if(R.id.txt_f8==view.getId())
		 		        {
		 		        Toast.makeText(Adultos_frases.this,"Correcto" , Toast.LENGTH_LONG).show();
		 		        container.addView(view);
		 		        akan=findViewById(R.id.img_f8);
		 		        akan.setVisibility(View.INVISIBLE);
		 		        // Incrementar puntos.
		 		        MainActivity.puntaje(campo_puntos,3);
		 		         }
		        		 else {
		        			 owner.addView(view);
			 		        view.setVisibility(View.VISIBLE);
		        		 }
  	
		         	break;
		         	
		         	default:
		         		owner.addView(view);
	 		        	view.setVisibility(View.VISIBLE);
	 		        	Toast.makeText(Adultos_frases.this,"Intenta otra vez" , Toast.LENGTH_SHORT).show();
		         	break;
		        }
		        
		       
		        
		       
		       
		      }
		      return true;  
		    }
		  }

}
