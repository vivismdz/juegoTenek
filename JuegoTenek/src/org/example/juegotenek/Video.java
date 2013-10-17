package org.example.juegotenek;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.video);
		
		/*indicar id del video*/
		final VideoView video = (VideoView) findViewById(R.id.videoView1);
		/*ruta del video*/
		video.setVideoPath("/mnt/sdcard/Pruebas/Porfiria.3gp");
		
		video.setMediaController(new MediaController(this));
		video.start();
				
		
	
		
	}
	/*Funcion lanzar pantalla previa*/
	 public void lanzarAtras(View view){

	      Intent i = new Intent(this, MainActivity.class);

	      startActivity(i);
	      finish();
	 }
}
