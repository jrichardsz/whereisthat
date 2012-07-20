package com.whereisthat.screen.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import com.whereisthat.R;
import com.whereisthat.helper.ConnHelper;
import com.whereisthat.helper.FontHelper;
import com.whereisthat.helper.SoundType;
import com.whereisthat.screen.core.SoundManager;

public class AboutActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE); 
		setContentView(R.layout.about);
		setCustomFont();
		
	}

	@Override
	protected void onStart() {
		super.onStart();
	}

	@Override
	protected void onPause() {
		super.onPause();
		SoundManager.stop(SoundType.menu);
	}
	
	@Override
	protected void onResume() {
		SoundManager.Init(getApplicationContext());
		super.onResume();
		SoundManager.start(SoundType.menu);
	}

	
	private void setCustomFont() {
	
	}	
}
