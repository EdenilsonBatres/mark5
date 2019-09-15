package com.example.mark5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;

public class registro extends AppCompatActivity
{
    private EditText textemail, textcontraseña,textConfContraseña;
    private Button btn_registrar;
    private ProgressDialog progressDialog;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        firebaseAuth = FirebaseAuth.getInstance();
        textemail = (EditText) findViewById(R.id.texto_correo);
        textcontraseña = (EditText) findViewById(R.id.texto_contraseña);
        textConfContraseña = (EditText) findViewById(R.id.texto_conf_contraseña);
        btn_registrar = (Button) findViewById(R.id.registro_boton_registrar);
        progressDialog = new ProgressDialog(this);
    }

    //comprovando las contraeñas
      /*  if (pass == conf_pass)
        {

        }
        else
        {
            Toast.makeText(this, "Al parecer las contraseñas estan incorrectas", Toast.LENGTH_SHORT).show();
        }
*/
    private void registrarUsuario()
    {
        String email = textemail.getText().toString().trim();
        String pass = textcontraseña.getText().toString().trim();
        String conf_pass = textConfContraseña.getText().toString().trim();

        if (TextUtils.isEmpty(email))
        {
            Toast.makeText(this, "Introduce un correo bb", Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(pass))
        {
            Toast.makeText(this, "Escribe una contraseña bb", Toast.LENGTH_SHORT).show();
            return;
        }

        progressDialog.setMessage("Se esta realizando el registro en linea corazon");
        progressDialog.show();


        firebaseAuth.createUserWithEmailAndPassword(email, pass)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>()
                {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task)
                    {
                        if (task.isSuccessful())
                        {
                            Toast.makeText(registro.this, "Se a creado tu asquerosa cuenta", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getApplication(), menu.class);
                            startActivity(intent);
                            //intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP| Intent.FLAG_ACTIVITY_NEW_TASK| Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            finish();
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                                //crear el meto que te lleva al menu
                                //sin retroceso y el boton de cerrar sesion

                        }
                        else
                        {
                            if (task.getException() instanceof FirebaseAuthUserCollisionException)
                            {
                                Toast.makeText(registro.this, "ya existe tu cuenta asquerosa", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                Toast.makeText(registro.this, "No se pudo crear tu asquerosa cuenta", Toast.LENGTH_SHORT).show();
                            }
                        }
                        progressDialog.dismiss();
                    }

                });
    }

    public void registrarUsuario(View view)
    {
        registrarUsuario();
    }

}
