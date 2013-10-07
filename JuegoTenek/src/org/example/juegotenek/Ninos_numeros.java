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
import android.widget.LinearLayout;
import android.widget.Toast;

public class Ninos_numeros  extends Activity {
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ninos_numeros);
		
		findViewById(R.id.btn_txt_cero).setOnTouchListener(new MyTouchListener());//boton 
		findViewById(R.id.btn_txt_uno).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.btn_txt_dos).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.btn_txt_tres).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.btn_txt_cuatro).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.btn_txt_cinco).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.btn_txt_seis).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.btn_txt_seite).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.btn_txt_ocho).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.btn_txt_nueve).setOnTouchListener(new MyTouchListener());

		
	    findViewById(R.id.img_cero).setOnDragListener(new MyDragListener());//imagen
	    findViewById(R.id.img_uno).setOnDragListener(new MyDragListener());
	    findViewById(R.id.img_dos).setOnDragListener(new MyDragListener());
	    findViewById(R.id.img_tres).setOnDragListener(new MyDragListener());
	    findViewById(R.id.img_cuatro).setOnDragListener(new MyDragListener());
	    findViewById(R.id.img_cinco).setOnDragListener(new MyDragListener());
	    findViewById(R.id.img_seis).setOnDragListener(new MyDragListener());
	    findViewById(R.id.img_siete).setOnDragListener(new MyDragListener());
	    findViewById(R.id.img_ocho).setOnDragListener(new MyDragListener());
	    findViewById(R.id.img_nueve).setOnDragListener(new MyDragListener());
	    
	    
	    findViewById(R.id.layout_img_cero).setOnDragListener(new MyDragListener());//layout imagen
	    findViewById(R.id.layout_img_dos).setOnDragListener(new MyDragListener());
	    findViewById(R.id.layout_img_tres).setOnDragListener(new MyDragListener());
	    findViewById(R.id.layout_img_uno).setOnDragListener(new MyDragListener());
	    findViewById(R.id.layout_img_cuatro).setOnDragListener(new MyDragListener());
	    findViewById(R.id.layout_img_cinco).setOnDragListener(new MyDragListener());
	    findViewById(R.id.layout_img_seis).setOnDragListener(new MyDragListener());
	    findViewById(R.id.layout_img_siete).setOnDragListener(new MyDragListener());
	    findViewById(R.id.layout_img_ocho).setOnDragListener(new MyDragListener());
	    findViewById(R.id.layout_img_nueve).setOnDragListener(new MyDragListener());
	    
	    
	   // findViewById(R.id.bottomleft).setOnDragListener(new MyDragListener());
	    //findViewById(R.id.bottomright).setOnDragListener(new MyDragListener());
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
		        	case R.id.img_cero:
		        		 if(R.id.btn_txt_cero==view.getId())
		 		        {
		 		        Toast.makeText(Ninos_numeros.this,"uno" , Toast.LENGTH_SHORT).show();
		 		        container.addView(view);
		 		        akan=findViewById(R.id.layout_btn_txt_cero);
		 		        akan.setVisibility(View.INVISIBLE);
		 		         }
		        		 else {
		        			 owner.addView(view);
			 		        view.setVisibility(View.VISIBLE);
		        		 }
		 		        	
		 		        	
		         	break;
		         	/*img_num*/
		        	case R.id.img_uno:
		        				/*boton con txt*/
		        		 if(R.id.btn_txt_uno==view.getId())
		 		        {
		 		        Toast.makeText(Ninos_numeros.this,"dos" , Toast.LENGTH_SHORT).show();
		 		        container.addView(view);
		 		        			/*layout de txt*/
		 		        akan=findViewById(R.id.layout_btn_txt_uno);
		 		        akan.setVisibility(View.INVISIBLE);
		 		        }
		        		 else {
		        			 owner.addView(view);
			 		        view.setVisibility(View.VISIBLE);
		        		 }
		 		        
		         	break;
		        	case R.id.img_dos:
		        		 if(R.id.btn_txt_dos==view.getId())
		 		        {
		 		        Toast.makeText(Ninos_numeros.this,"dos" , Toast.LENGTH_SHORT).show();
		 		        container.addView(view);
		 		        akan=findViewById(R.id.layout_btn_txt_dos);
		 		        akan.setVisibility(View.INVISIBLE);
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

