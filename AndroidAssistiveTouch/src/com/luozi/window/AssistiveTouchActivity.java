package com.luozi.window;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class AssistiveTouchActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
				LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
		View content = new View(this);
		content.setBackgroundColor(Color.WHITE);
		content.setLayoutParams(params);
		
		setContentView(content);
		startService(new Intent(this, AssistiveTouchService.class));
	}
}