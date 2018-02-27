package com.example.sri.riomessenger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class getotp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getotp);
        Button otp_btn=findViewById(R.id.otpbtn);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        otp_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*String otp = edt.getText().toString();
                if (otp.length() == 0)
                    Toast.makeText(getApplicationContext(), "Enter OTP recieved on your phone", Toast.LENGTH_SHORT).show();
                else {*/
                    Intent intent;
                    intent = new Intent(v.getContext(),uname.class);
                    startActivity(intent);

            }
        });


    }
}
