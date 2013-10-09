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

public class Ninos_numeros  extends Activity {
	
	private TextView campo_puntos;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ninos_numeros);
		
		/*importar de botones con texto*/
		findViewById(R.id.btn_txt_cero).setOnTouchListener(new MyTouchListener());//boton 
		findViewById(R.id.btn_txt_uno).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.btn_txt_dos).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.btn_txt_tres).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.btn_txt_cuatro).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.btn_txt_cinco).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.btn_txt_seis).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.btn_txt_siete).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.btn_txt_ocho).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.btn_txt_nueve).setOnTouchListener(new MyTouchListener());

		/*Importar layout de boton con texto*/
	    findViewById(R.id.layout_btn_txt_cero).setOnDragListener(new MyDragListener());//
	    findViewById(R.id.layout_btn_txt_uno).setOnDragListener(new MyDragListener());
	    findViewById(R.id.layout_btn_txt_dos).setOnDragListener(new MyDragListener());
	    findViewById(R.id.layout_btn_txt_tres).setOnDragListener(new MyDragListener());
	    findViewById(R.id.layout_btn_txt_cuatro).setOnDragListener(new MyDragListener());
	    findViewById(R.id.layout_btn_txt_cinco).setOnDragListener(new MyDragListener());
	    findViewById(R.id.layout_btn_txt_seis).setOnDragListener(new MyDragListener());
	    findViewById(R.id.layout_btn_txt_seite).setOnDragListener(new MyDragListener());
	    findViewById(R.id.layout_btn_txt_ocho).setOnDragListener(new MyDragListener());
	    findViewById(R.id.layout_btn_txt_nueve).setOnDragListener(new MyDragListener());
		        
	    /*importar layout de imagenes*/
	    findViewById(R.id.layout_img_cero).setOnDragListener(new MyDragListener());//
	    findViewById(R.id.layout_img_uno).setOnDragListener(new MyDragListener());
	    findViewById(R.id.layout_img_dos).setOnDragListener(new MyDragListener());
	    findViewById(R.id.layout_img_tres).setOnDragListener(new MyDragListener());
	    findViewById(R.id.layout_img_cuatro).setOnDragListener(new MyDragListener());
	    findViewById(R.id.layout_img_cinco).setOnDragListener(new MyDragListener());
	    findViewById(R.id.layout_img_seis).setOnDragListener(new MyDragListener());
	    findViewById(R.id.layout_img_siete).setOnDragListener(new MyDragListener());
	    findViewById(R.id.layout_img_ocho).setOnDragListener(new MyDragListener());
	    findViewById(R.id.layout_img_nueve).setOnDragListener(new MyDragListener());
	    
	    
	   // findViewById(R.id.bottomleft).setOnDragListener(new MyDragListener());
	    //findViewById(R.id.bottomright).setOnDragListener(new MyDragListener());
	    
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
		        	case R.id.layout_img_cero:
		        		 if(R.id.btn_txt_cero==view.getId())
		 		        {
		 		        Toast.makeText(Ninos_numeros.this,"cero" , Toast.LENGTH_SHORT).show();
		 		        container.addView(view);
		 		        akan=findViewById(R.id.img_cero);
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
		        	case R.id.layout_img_uno:
		        				/*boton con txt*/
		        		 if(R.id.btn_txt_uno==view.getId())
		 		        {
		 		        Toast.makeText(Ninos_numeros.this,"uno=JUN" , Toast.LENGTH_SHORT).show();
		 		        container.addView(view);
		 		        			
		 		        akan=findViewById(R.id.img_uno);
		 		        akan.setVisibility(View.INVISIBLE);
		 		        // Incrementar puntos.
		 		        MainActivity.puntaje(campo_puntos,1);
		 		        }
		        		 else {
		        			 owner.addView(view);
			 		        view.setVisibility(View.VISIBLE);
		        		 }
		 		        
		         	break;
		        	case R.id.layout_img_dos:
		        		 if(R.id.btn_txt_dos==view.getId())
		 		        {
		 		        Toast.makeText(Ninos_numeros.this,"dos=TSAB" , Toast.LENGTH_SHORT).show();
		 		        container.addView(view);
		 		        akan=findViewById(R.id.img_dos);
		 		        akan.setVisibility(View.INVISIBLE);
		 		        // Incrementar puntos.
		 		        MainActivity.puntaje(campo_puntos,1);
		 		        }
		        		 else {
		        			 owner.addView(view);
			 		        view.setVisibility(View.VISIBLE);
		        		 }
		 		        
		         	break;
		         	
		        	case R.id.layout_img_tres:
		        		 if(R.id.btn_txt_tres==view.getId())
		 		        {
		 		        Toast.makeText(Ninos_numeros.this,"tres= OSH" , Toast.LENGTH_SHORT).show();
		 		        container.addView(view);
		 		        akan=findViewById(R.id.img_tres);
		 		        akan.setVisibility(View.INVISIBLE);
		 		    // Incrementar puntos.
		 		        MainActivity.puntaje(campo_puntos,1);
		 		        }
		        		 else {
		        			 owner.addView(view);
			 		        view.setVisibility(View.VISIBLE);
		        		 }
		 		        
		         	break;
		         	
		        	case R.id.layout_img_cuatro:
		        		 if(R.id.btn_txt_cuatro==view.getId())
		 		        {
		 		        Toast.makeText(Ninos_numeros.this,"cuatro= TSE’" , Toast.LENGTH_SHORT).show();
		 		        container.addView(view);
		 		        akan=findViewById(R.id.img_cuatro);
		 		        akan.setVisibility(View.INVISIBLE);
		 		    // Incrementar puntos.
		 		        MainActivity.puntaje(campo_puntos,1);
		 		        }
		        		 else {
		        			 owner.addView(view);
			 		        view.setVisibility(View.VISIBLE);
		        		 }
		 		        
		         	break;
		         	
		        	case R.id.layout_img_cinco:
		        		 if(R.id.btn_txt_cinco==view.getId())
		 		        {
		 		        Toast.makeText(Ninos_numeros.this,"cinco=BO’" , Toast.LENGTH_SHORT).show();
		 		        container.addView(view);
		 		        akan=findViewById(R.id.img_cinco);
		 		        akan.setVisibility(View.INVISIBLE);
		 		    // Incrementar puntos.
		 		        MainActivity.puntaje(campo_puntos,1);
		 		        }
		        		 else {
		        			 owner.addView(view);
			 		        view.setVisibility(View.VISIBLE);
		        		 }
		 		        
		         	break;
		         	
		        	case R.id.layout_img_seis:
		        		 if(R.id.btn_txt_seis==view.getId())
		 		        {
		 		        Toast.makeText(Ninos_numeros.this,"seis= AKAK" , Toast.LENGTH_SHORT).show();
		 		        container.addView(view);
		 		        akan=findViewById(R.id.img_seis);
		 		        akan.setVisibility(View.INVISIBLE);
		 		    // Incrementar puntos.
		 		        MainActivity.puntaje(campo_puntos,1);
		 		        }
		        		 else {
		        			 owner.addView(view);
			 		        view.setVisibility(View.VISIBLE);
		        		 }
		 		        
		         	break;
		         	
		        	case R.id.layout_img_siete:
		        		 if(R.id.btn_txt_siete==view.getId())
		 		        {
		 		        Toast.makeText(Ninos_numeros.this,"siete=BUK" , Toast.LENGTH_SHORT).show();
		 		        container.addView(view);
		 		        akan=findViewById(R.id.img_siete);
		 		        akan.setVisibility(View.INVISIBLE);
		 		    // Incrementar puntos.
		 		        MainActivity.puntaje(campo_puntos,1);
		 		        }
		        		 else {
		        			 owner.addView(view);
			 		        view.setVisibility(View.VISIBLE);
		        		 }
		 		        
		         	break;
		         	
		        	case R.id.layout_img_ocho:
		        		 if(R.id.btn_txt_ocho==view.getId())
		 		        {
		 		        Toast.makeText(Ninos_numeros.this,"ocho = WASHIK" , Toast.LENGTH_SHORT).show();
		 		        container.addView(view);
		 		        akan=findViewById(R.id.img_ocho);
		 		        akan.setVisibility(View.INVISIBLE);
		 		    // Incrementar puntos.
		 		        MainActivity.puntaje(campo_puntos,1);
		 		        }
		        		 else {
		        			 owner.addView(view);
			 		        view.setVisibility(View.VISIBLE);
		        		 }
		 		        
		         	break;
		         	
		        	case R.id.layout_img_nueve:
		        		 if(R.id.btn_txt_nueve==view.getId())
		 		        {
		 		        Toast.makeText(Ninos_numeros.this,"nueve = BELEU" , Toast.LENGTH_SHORT).show();
		 		        container.addView(view);
		 		        akan=findViewById(R.id.img_nueve);
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
	 		        	Toast.makeText(Ninos_numeros.this,"Intenta otra vez" , Toast.LENGTH_SHORT).show();
		         	break;
		        }
		        
		       
		        
		       
		       
		      }
		      return true;  
		    }
		  }
}

