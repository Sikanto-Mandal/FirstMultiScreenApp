package com.example.firstmultiscreenapp;

import static android.security.KeyChain.EXTRA_NAME;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_NAME ="com.example.firstmultiscreenapp.extra.NAME";
    EditText name;
    EditText father;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        }
        public void openActivity(View v){
            Toast.makeText(this, "Opening Second Activity", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(this, MainActivity2.class);
            name = findViewById(R.id.Name);
            String nameText= name.getText().toString();
            intent.putExtra(EXTRA_NAME,nameText);
            startActivity(intent );

            father = findViewById(R.id.FatherName);
            String nameText2= father.getText().toString();
            intent.putExtra(EXTRA_NAME,nameText2);
            startActivity(intent);

    }
}