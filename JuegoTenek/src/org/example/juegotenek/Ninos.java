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

public class Ninos  extends Activity {
	
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
	   // findViewById(R.id.bottomleft).setOnDragListener(new MyDragListener());
	    //findViewById(R.id.bottomright).setOnDragListener(new MyDragListener());
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
	 
	 
	 class MyDragListener implements OnDragListener {
		   
		    
			@Override
		    public boolean onDrag(View v, DragEvent event) {
		     View akan;
				
		      switch (event.getAction()) {
		      case DragEvent.ACTION_DRAG_STARTED:
		        // Do nothing
		        break;
		      case DragEvent.ACTION_DRAG_ENTERED:
		       
		        break;
		      case DragEvent.ACTION_DRAG_EXITED:
		        
		        break;
		      case DragEvent.ACTION_DROP:
		        // Dropped, reassign View to ViewGroup
		        View view = (View) event.getLocalState();
		        ViewGroup owner = (ViewGroup) view.getParent();
		        owner.removeView(view);
		        LinearLayout container = (LinearLayout) v;
		        		/*linear de img*/					 /* id de btn con txt*/ 
		        if(R.id.linear_img_burro==container.getId()&&R.id.animal_burro==view.getId())
		        {
		        Toast.makeText(Ninos.this,"Ardilla=Ot’el" , Toast.LENGTH_SHORT).show();
		        container.addView(view);
		        akan=findViewById(R.id.btn_img_burro);/*btn img*/
		        akan.setVisibility(View.INVISIBLE);
		        }
		        else 
		        	{
		        	owner.addView(view);
		        	view.setVisibility(View.VISIBLE);
		        	  Toast.makeText(Ninos.this,"Intenta otra vez" , Toast.LENGTH_SHORT).show();
		        	}
		        if(R.id.linear_img_camello==container.getId()&&R.id.animal_camello==view.getId())
		        {
		        Toast.makeText(Ninos.this,"Ardilla=Ot’el" , Toast.LENGTH_SHORT).show();
		        container.addView(view);
		        akan=findViewById(R.id.btn_img_camello);/*btn img*/
		        akan.setVisibility(View.INVISIBLE);
		        }
		        else 
		        	{
		        	owner.addView(view);
		        	view.setVisibility(View.VISIBLE);
		        	  Toast.makeText(Ninos.this,"Intenta otra vez" , Toast.LENGTH_SHORT).show();
		        	}
		        
		        if(R.id.linear_img_chango==container.getId()&&R.id.animal_chango==view.getId())
		        {
		        Toast.makeText(Ninos.this,"Ardilla=Ot’el" , Toast.LENGTH_SHORT).show();
		        container.addView(view);
		        akan=findViewById(R.id.btn_img_chango);/*btn img*/
		        akan.setVisibility(View.INVISIBLE);
		        }
		        else 
		        	{
		        	owner.addView(view);
		        	view.setVisibility(View.VISIBLE);
		        	  Toast.makeText(Ninos.this,"Intenta otra vez" , Toast.LENGTH_SHORT).show();
		        	}
		        
		        if(R.id.linear_img_cocodrilo==container.getId()&&R.id.animal_cocodrilo==view.getId())
		        {
		        Toast.makeText(Ninos.this,"Ardilla=Ot’el" , Toast.LENGTH_SHORT).show();
		        container.addView(view);
		        akan=findViewById(R.id.btn_img_cocodrilo);/*btn img*/
		        akan.setVisibility(View.INVISIBLE);
		        }
		        else 
		        	{
		        	owner.addView(view);
		        	view.setVisibility(View.VISIBLE);
		        	  Toast.makeText(Ninos.this,"Intenta otra vez" , Toast.LENGTH_SHORT).show();
		        	}
		        
		        if(R.id.linear_img_conejo==container.getId()&&R.id.animal_conejo==view.getId())
		        {
		        Toast.makeText(Ninos.this,"Ardilla=Ot’el" , Toast.LENGTH_SHORT).show();
		        container.addView(view);
		        akan=findViewById(R.id.btn_img_conejo);/*btn img*/
		        akan.setVisibility(View.INVISIBLE);
		        }
		        else 
		        	{
		        	owner.addView(view);
		        	view.setVisibility(View.VISIBLE);
		        	  Toast.makeText(Ninos.this,"Intenta otra vez" , Toast.LENGTH_SHORT).show();
		        	}
		        
		        if(R.id.linear_img_gato==container.getId()&&R.id.animal_gato==view.getId())
		        {
		        Toast.makeText(Ninos.this,"Ardilla=Ot’el" , Toast.LENGTH_SHORT).show();
		        container.addView(view);
		        akan=findViewById(R.id.btn_img_gato);/*btn img*/
		        akan.setVisibility(View.INVISIBLE);
		        }
		        else 
		        	{
		        	owner.addView(view);
		        	view.setVisibility(View.VISIBLE);
		        	  Toast.makeText(Ninos.this,"Intenta otra vez" , Toast.LENGTH_SHORT).show();
		        	}
		        
		        if(R.id.linear_img_hipopotamo==container.getId()&&R.id.animal_hipopotamo==view.getId())
		        {
		        Toast.makeText(Ninos.this,"Ardilla=Ot’el" , Toast.LENGTH_SHORT).show();
		        container.addView(view);
		        akan=findViewById(R.id.btn_img_hipopotamo);/*btn img*/
		        akan.setVisibility(View.INVISIBLE);
		        }
		        else 
		        	{
		        	owner.addView(view);
		        	view.setVisibility(View.VISIBLE);
		        	  Toast.makeText(Ninos.this,"Intenta otra vez" , Toast.LENGTH_SHORT).show();
		        	}
		        
		        if(R.id.linear_img_jirafa==container.getId()&&R.id.animal_jirafa==view.getId())
		        {
		        Toast.makeText(Ninos.this,"Ardilla=Ot’el" , Toast.LENGTH_SHORT).show();
		        container.addView(view);
		        akan=findViewById(R.id.btn_img_jirafa);/*btn img*/
		        akan.setVisibility(View.INVISIBLE);
		        }
		        else 
		        	{
		        	owner.addView(view);
		        	view.setVisibility(View.VISIBLE);
		        	  Toast.makeText(Ninos.this,"Intenta otra vez" , Toast.LENGTH_SHORT).show();
		        	}
		        
		        if(R.id.linear_img_perro==container.getId()&&R.id.animal_perro==view.getId())
		        {
		        Toast.makeText(Ninos.this,"Ardilla=Ot’el" , Toast.LENGTH_SHORT).show();
		        container.addView(view);
		        akan=findViewById(R.id.btn_img_perro);/*btn img*/
		        akan.setVisibility(View.INVISIBLE);
		        }
		        else 
		        	{
		        	owner.addView(view);
		        	view.setVisibility(View.VISIBLE);
		        	  Toast.makeText(Ninos.this,"Intenta otra vez" , Toast.LENGTH_SHORT).show();
		        	}
		        
		        if(R.id.linear_img_raton==container.getId()&&R.id.animal_raton==view.getId())
		        {
		        Toast.makeText(Ninos.this,"Ardilla=Ot’el" , Toast.LENGTH_SHORT).show();
		        container.addView(view);
		        akan=findViewById(R.id.btn_img_raton);/*btn img*/
		        akan.setVisibility(View.INVISIBLE);
		        }
		        else 
		        	{
		        	owner.addView(view);
		        	view.setVisibility(View.VISIBLE);
		        	  Toast.makeText(Ninos.this,"Intenta otra vez" , Toast.LENGTH_SHORT).show();
		        	}
		        
		        if(R.id.linear_img_tortuga==container.getId()&&R.id.animal_tortuga==view.getId())
		        {
		        Toast.makeText(Ninos.this,"Ardilla=Ot’el" , Toast.LENGTH_SHORT).show();
		        container.addView(view);
		        akan=findViewById(R.id.btn_img_tortuga);/*btn img*/
		        akan.setVisibility(View.INVISIBLE);
		        }
		        else 
		        	{
		        	owner.addView(view);
		        	view.setVisibility(View.VISIBLE);
		        	  Toast.makeText(Ninos.this,"Intenta otra vez" , Toast.LENGTH_SHORT).show();
		        	}
		        
		        if(R.id.linear_img_vaca==container.getId()&&R.id.animal_vaca==view.getId())
		        {
		        Toast.makeText(Ninos.this,"Ardilla=Ot’el" , Toast.LENGTH_SHORT).show();
		        container.addView(view);
		        akan=findViewById(R.id.btn_img_vaca);/*btn img*/
		        akan.setVisibility(View.INVISIBLE);
		        }
		        else 
		        	{
		        	owner.addView(view);
		        	view.setVisibility(View.VISIBLE);
		        	  Toast.makeText(Ninos.this,"Intenta otra vez" , Toast.LENGTH_SHORT).show();
		        	}
		       
		        break;
		        
		      case DragEvent.ACTION_DRAG_ENDED:
		       
		      default:
		        break;
		      }
		      return true;  
		    }
		  }
}