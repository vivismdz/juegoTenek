package org.example.juegotenek;


import android.app.Activity;
import android.os.Bundle;
import android.content.ClipData;
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
		
		findViewById(R.id.ardilla).setOnTouchListener(new MyTouchListener());
		findViewById(R.id.coyote).setOnTouchListener(new MyTouchListener());
		 
	    findViewById(R.id.dardilla).setOnDragListener(new MyDragListener());
	    findViewById(R.id.dcoyote).setOnDragListener(new MyDragListener());
	    findViewById(R.id.lardilla).setOnDragListener(new MyDragListener());
	    findViewById(R.id.lcoyote).setOnDragListener(new MyDragListener());
	   // findViewById(R.id.bottomleft).setOnDragListener(new MyDragListener());
	    //findViewById(R.id.bottomright).setOnDragListener(new MyDragListener());
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
		        if(R.id.dardilla==container.getId()&&R.id.ardilla==view.getId())
		        {
		        Toast.makeText(Ninos.this,"Ardilla=Ot’el" , Toast.LENGTH_SHORT).show();
		        container.addView(view);
		        akan=findViewById(R.id.bardilla);
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
