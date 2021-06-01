package com.blogspot.psbapplications.block1;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setVisibility(View.INVISIBLE);
            }
        });
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "to do to do to do...", Toast.LENGTH_SHORT).show();
            }
        });
        Button button3 = new Button(getApplicationContext());
        button3.setTextColor(Color.BLACK);
        button3.setBackgroundColor(Color.parseColor(("#FD9BF3")));
        button3.setText(R.string.prashant_do_to_list);
        // set the size and position of the button:
        // width: as large as the screen
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);

        // position: below the button2
        layoutParams.addRule(RelativeLayout.BELOW, button2.getId());

        // Setting the margins of the button3
        layoutParams.setMargins(18,18,18,18);

        // add the button to the relative layout defined in activity_main.xml
        RelativeLayout relativeLayout_mainScreen = (RelativeLayout) findViewById(R.id.rootRelativeLayout);
        relativeLayout_mainScreen.addView(button3, layoutParams);

        // attach the current activity as a click listener for both button
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Prashant Singh to do to do...", Toast.LENGTH_SHORT).show();
            }
        });
    }
}