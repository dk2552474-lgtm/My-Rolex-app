package com.mycompany.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {
    private EditText scriptInput;
    private Button executeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);

        scriptInput = new EditText(this);
        scriptInput.setHint("Enter script here");
        layout.addView(scriptInput);

        executeButton = new Button(this);
        executeButton.setText("Execute");
        layout.addView(executeButton);

        setContentView(layout);

        executeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String script = scriptInput.getText().toString();
                Toast.makeText(MainActivity.this, "Executing: " + script, Toast.LENGTH_SHORT).show();
            }
        });
    }
  }
