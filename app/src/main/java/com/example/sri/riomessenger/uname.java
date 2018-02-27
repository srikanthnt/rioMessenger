package com.example.sri.riomessenger;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class uname extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
        setContentView(R.layout.activity_uname);
        Button cont=findViewById(R.id.continue_btn);
        EditText ed=findViewById(R.id.username);
        String name=ed.getText().toString();
        if(name.isEmpty())
            Toast.makeText(getApplicationContext(), "Enter valid user name",Toast.LENGTH_SHORT).show();
        cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent=new Intent(v.getContext(),DashMainActivity.class);
                startActivity(intent);
            }
        });
    }
}
