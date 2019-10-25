package com.example.mark5;//inicio de la activity

//librerias de android para el funcionamiento de los elementos graficos
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

//clase publica de eventos de la activity
public class registro extends AppCompatActivity
{
    //encapsulacion de los objetos como variables para su uso
    private EditText textemail, textcontraseña,textConfContraseña;
    private Button btn_registrar;
    private ProgressDialog progressDialog;
    private FirebaseAuth firebaseAuth;

    //inicio de metodo onCreate que se ejecuta al iniciarse la parte grafica del activity
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        firebaseAuth = FirebaseAuth.getInstance();//iniciacion de los metodos de firebase
        textemail = (EditText) findViewById(R.id.texto_correo);//coneccion de la parte grafica al codigo mediante el id del componete
        textcontraseña = (EditText) findViewById(R.id.texto_contraseña);//coneccion de la parte grafica al codigo mediante el id del componete
        textConfContraseña = (EditText) findViewById(R.id.texto_conf_contraseña);//coneccion de la parte grafica al codigo mediante el id del componete
        btn_registrar = (Button) findViewById(R.id.registro_boton_registrar);//coneccion de la parte grafica al codigo mediante el id del componete
        progressDialog = new ProgressDialog(this);//iniciacion de a barra de progreso
    }

    //funcion de firebase para registrar un nuevo usuario en la base de datos
    private void registrarUsuario()
    {
        String email = textemail.getText().toString().trim();//transforma las palabras introducidas a una cadena de caracteres
        String pass = textcontraseña.getText().toString().trim();//transforma las palabras introducidas a una cadena de caracteres
        String conf_pass = textConfContraseña.getText().toString().trim();//transforma las palabras introducidas a una cadena de caracteres

        if (TextUtils.isEmpty(email))
        {
            Toast.makeText(this, "Introduce un correo", Toast.LENGTH_SHORT).show();//condicion que indica si el campo de correo esta vacio
            return;
        }
        if (TextUtils.isEmpty(pass))
        {
            Toast.makeText(this, "Escribe una contraseña", Toast.LENGTH_SHORT).show();//condicion que indica si el campo de contraseña esta vacio
            return;
        }

        if (pass.equals(conf_pass))
        {
            progressDialog.setMessage("Se esta realizando el registro ");//barra de progeso que guarda el correo y la contraseña en la base de datos
            progressDialog.show();


            firebaseAuth.createUserWithEmailAndPassword(email, pass)//funcion que crea un nuevo usuario en la base de datos firebase
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>()
                    {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task)
                        {
                            if (task.isSuccessful())//si el correo y la contraseña se han guardado correctamente
                            {
                                Toast.makeText(registro.this, "Se a creado tu cuenta", Toast.LENGTH_SHORT).show();//muestra un mensaje emergente
                                Intent intent = new Intent(getApplication(), menusito.class);//inicia una nueva actividad
                                startActivity(intent);//ejecuta la actividad de menu
                                finish();//finaliza la activity de registro
                                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);//desactiva la accion de volver a la activity de registro
                                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                                //crear el meto que te lleva al menu
                                //sin retroceso y el boton de cerrar sesion

                            }
                            else//si el inicio de sesion genera algun error
                            {
                                if (task.getException() instanceof FirebaseAuthUserCollisionException)//si hay alguna colision muestra el siguiente mensaje
                                {
                                    Toast.makeText(registro.this, "ya existe esta cuenta, intenta con otra", Toast.LENGTH_SHORT).show();
                                }
                                else//si se produce un error desconocido , muestra el siguiente mensaje
                                {
                                    Toast.makeText(registro.this, "No se pudo crear tu  cuenta", Toast.LENGTH_SHORT).show();
                                }
                            }
                            progressDialog.dismiss();//barra de progreso
                        }

                    });
        }
        else
        {
            Toast.makeText(registro.this, "Las contraseñas no coinciden",Toast.LENGTH_SHORT).show();
        }


    }

    public void registrarUsuario(View view)
    {
        registrarUsuario();
    }//metodo de registrar un nuevo usuario que se ejecuta al dar click en el boton de registrar

}
