package com.example.helloworld;
import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.*;
public class MainActivity extends Activity {
 @Override public void onCreate(Bundle state) {
  super.onCreate(state);
  LinearLayout layout=new LinearLayout(this);
  layout.setOrientation(LinearLayout.VERTICAL);
  layout.setGravity(Gravity.CENTER);
  Button button=new Button(this);
  button.setText("Kliknij mnie");
  TextView text=new TextView(this);
  text.setTextSize(28);
  layout.addView(button);
  layout.addView(text);
  button.setOnClickListener(v -> text.setText("Hello World"));
  setContentView(layout);
 }
}
