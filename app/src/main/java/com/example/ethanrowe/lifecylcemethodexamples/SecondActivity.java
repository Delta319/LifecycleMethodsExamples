package com.example.ethanrowe.lifecylcemethodexamples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private Button finishButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Links variable reference to UI element for this activity by ID
        finishButton = findViewById(R.id.finish_button);

        //Method to set listener
        setListener();


    }

    //Starts onClickListener for button
    private void setListener() {

        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            //This will close this activity and take us back to the MainActivity.
                finish();
            }
        });
    }
}
