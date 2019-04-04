package cakrait.com.trainingindocyberandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button btn_login;
    EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);

        btn_login = (Button) findViewById(R.id.login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("") && password.getText().toString().equals("")) {
                    Toast.makeText(LoginActivity.this, "Harap isi username dan password", Toast.LENGTH_SHORT).show();
                } else {
                    startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
                    finish();
                    Toast.makeText(LoginActivity.this, "Selamat Anda berhasil Login", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
