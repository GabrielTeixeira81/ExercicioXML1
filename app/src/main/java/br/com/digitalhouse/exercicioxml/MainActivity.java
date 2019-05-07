package br.com.digitalhouse.exercicioxml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextNome;
    EditText editTextEmail;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNome = findViewById(R.id.editTextNome);
        editTextEmail = findViewById(R.id.editTextEmail);
        btnLogin = findViewById(R.id.btnLogin);

     btnLogin.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {

             String email = editTextEmail.getText().toString();
             String nome = editTextNome.getText().toString();

            if (nome.equals("")){
                Toast.makeText(MainActivity.this, "Preencha o campo e-mail", Toast.LENGTH_SHORT).show();
            }

             if (email.equals("")){
                 Toast.makeText(MainActivity.this, "Preencha o campo e-mail", Toast.LENGTH_SHORT).show();

         }
     });

    }
}
