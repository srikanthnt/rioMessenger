package com.example.sri.riomessenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginActivity extends AppCompatActivity {

    EditText txt;
    Boolean valid_num;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txt = (EditText)findViewById(R.id.your_Phone_number);
        Button btn = (Button)findViewById(R.id.otpbtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String my_num;
                my_num =txt.getText().toString();
                valid_num=isValidPhone(my_num);
                if(valid_num)
                {
                    Intent intent;
                    intent = new Intent(v.getContext(),getotp.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(), "enter valid phone",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private Boolean isValidPhone(CharSequence phone) {
        if (TextUtils.isEmpty(phone))
            return false;
        else if (phone.length()!=10)
                        return false;
                    /*else if(phone.charAt(1)!='9'||phone.charAt(1)!='7'||phone.charAt(1)!='8')
                        return false;*/
                    else
                         return true;
    }
}
