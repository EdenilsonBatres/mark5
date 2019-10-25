package com.example.mark5;//inicio de la activity

//librerias de android que hacen posible la ejecucion del codigo
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;

//inicio de la clase global que inicial el ciclo de vida de la activity
public class login extends AppCompatActivity
{
    //encapsulacion de los objetos como variables para su uso
    private LoginButton loginButton;
    private CallbackManager callbackManager;
    private EditText correo_txt,contraseña_txt;
    private ProgressDialog progressDialog;
    private FirebaseAuth firebaseAuth;

//inicio de metodo onCreate que se ejecuta al iniciarse la parte grafica del activity
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        correo_txt = (EditText) findViewById(R.id.texto_correo);//coneccion de la parte grafica al codigo mediante el id del componete
        contraseña_txt = (EditText) findViewById(R.id.texto_contraseña);//coneccion de la parte grafica al codigo mediante el id del componete
        progressDialog = new ProgressDialog(this);//coneccion de la parte grafica al codigo mediante el id del componete
        firebaseAuth = FirebaseAuth.getInstance();//coneccion de la parte grafica al codigo mediante el id del componete

        loginButton = (LoginButton) findViewById(R.id.login_button);//coneccion de la parte grafica al codigo mediante el id del componete
        callbackManager = CallbackManager.Factory.create();//metodo que inicia las conexiones al server de facebook

        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>()//metodo que inicia el proceso de registro con facebook
        {
            @Override
            public void onSuccess(LoginResult loginResult)
            {
                goMenu();
            }//si el inicio de sesion con faceboook es exitoso, automaticamente llama al objeto goMenu

            @Override
            public void onCancel()
            {
                Toast.makeText(getApplicationContext(), "Se Cancelo el registro", Toast.LENGTH_SHORT).show();
            }//si el inicio de sesion con faceboook es Cancelado, automaticamente muestra un mensaje

            @Override
            public void onError(FacebookException error)
            {
                Toast.makeText(getApplicationContext(), "Al parecer hubo un error", Toast.LENGTH_SHORT).show();
            }//si el inicio de sesion con faceboook es fallido, automaticamente muestra un mensaje
        });
    }

    private void goMenu()//metodo que abre una nueva activity llamada menu
    {
        Intent intent = new Intent(this, menusito.class);//inicio del metodo Intent que genera el evento de abrir una nueva activity
        startActivity(intent);//inicializa la activity
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);//bloquea la accion de volver al login
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)//funcion que muestra el resultado del inicio de sesion con facebook
    {
        super.onActivityResult(requestCode, resultCode, data);
        callbackManager.onActivityResult(requestCode, resultCode, data);
    }

    public void a_registro(View view)//funcion que inicia la activity de registro
    {
        Intent intent = new Intent(this, registro.class);
        startActivity(intent);//inicia la activity de registro
    }

    public  void al_menu(View view)//funcion que inicia la activity de menu
    {
        Intent intent = new Intent(login.this, menusito.class);
        startActivity(intent);//inicia la activity menu
        finish();//finaliza la activity de login
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);//desabilita la accion de regresar
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);//desabilita la accion de regresar

    }
    public void entrar(View view)
    {
        loguearUsiario();
    }//funcion que invoca al metodo loguearUsuario

    private void loguearUsiario()//funcion permite iniciar sesion con correo y contraseña desde firebase
    {
        String email = correo_txt.getText().toString().trim();//transforma las palabras introducidas a una cadena de caracteres
        String pass = contraseña_txt.getText().toString().trim();//transforma las palabras introducidas a una cadena de caracteres

        if (TextUtils.isEmpty(email))//condicion que indica si el campo de correo esta vacio
        {
            Toast.makeText(this, "debes igresar un email", Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(pass))//condicion que indica si el campo de contraseña esta vacio
        {
            Toast.makeText(this, "Debes ingresar una contraseña ", Toast.LENGTH_SHORT).show();
            return;
        }
        progressDialog.setMessage("se esta comprovando tu inicio de secion ");//barra de proceso que compara el correo y la contraseña con la base de datos
        progressDialog.show();

        //creando la autenticacion

        firebaseAuth.signInWithEmailAndPassword(email, pass)//funcion propia de firebase
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>()//inicia el metodo para la verificacion de credenciales (correo contraseña)
                {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task)//si el inicio de sesion es correcto
                    {
                        if (task.isSuccessful())
                        {
                            Toast.makeText(login.this, "bienvenido a tu cuenta", Toast.LENGTH_SHORT).show();//muestra un mensaje emergente
                            Intent intent = new Intent(getApplication(), menusito.class);//inicializa una nueva actividad
                            startActivity(intent);//ejecuta la actividad de menu
                            finish();//finaliza la actividad de login
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);//desactiva la accion de volver a login
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);//desactiva la accion de volver a login

                        }
                        else//si el inicio de sesion genera algun error
                        {
                            Toast.makeText(login.this, "pasa algo con tu  cuenta, " +
                             "el correo o la contraseña anda mal", Toast.LENGTH_SHORT).show();//genera un mensaje con el posible error

                        }
                        progressDialog.dismiss();//barra de progreso
                    }
                });
    }
}




