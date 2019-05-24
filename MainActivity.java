package com.android.assignment2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends Activity {


	private ImageView myImg;
	private Button myButton;
	
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		myButton = (Button) findViewById(R.id.switchTeamsBtn);
		myImg = (ImageView) findViewById(R.id.switchTeamsImageView);
		myImg.bringToFront();
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	public void flipIt(View v)
	{
		if ( (myButton.getText().toString()).equals(getString(R.string.show_gator)))
		{
			myImg.setImageDrawable(getResources().getDrawable(R.drawable.koolgator));
			myButton.setText(getString(R.string.show_nole));
		} else
		{
			myImg.setImageDrawable(getResources().getDrawable(R.drawable.nole));
			myButton.setText(getString(R.string.show_gator));
		}

	}

}
