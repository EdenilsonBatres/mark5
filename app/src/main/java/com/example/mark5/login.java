package com.example.mark5;

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

public class login extends AppCompatActivity
{
    private LoginButton loginButton;
    private CallbackManager callbackManager;
    private EditText correo_txt,contraseña_txt;
    private ProgressDialog progressDialog;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        correo_txt = (EditText) findViewById(R.id.texto_correo);
        contraseña_txt = (EditText) findViewById(R.id.texto_contraseña);
        progressDialog = new ProgressDialog(this);
        firebaseAuth = FirebaseAuth.getInstance();

        loginButton = (LoginButton) findViewById(R.id.login_button);
        callbackManager = CallbackManager.Factory.create();

        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>()
        {
            @Override
            public void onSuccess(LoginResult loginResult)
            {
                goMenu();
            }

            @Override
            public void onCancel()
            {
                Toast.makeText(getApplicationContext(), "Se Cancelo el registro", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onError(FacebookException error)
            {
                Toast.makeText(getApplicationContext(), "Al parecer hubo un error", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void goMenu()
    {
        Intent intent = new Intent(this, menu.class);
        startActivity(intent);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        callbackManager.onActivityResult(requestCode, resultCode, data);
    }

    public void a_registro(View view)
    {
        Intent intent = new Intent(this, registro.class);
        startActivity(intent);
    }

    public  void al_menu(View view)
    {
        Intent intent = new Intent(login.this, menu.class);
        startActivity(intent);
        finish();
       //intent.addFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS | Intent.FLAG_ACTIVITY_NO_HISTORY| Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS | Intent.FLAG_ACTIVITY_NO_HISTORY);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

    }
    public void entrar(View view)
    {
        loguearUsiario();
    }

    private void loguearUsiario()
    {
        String email = correo_txt.getText().toString().trim();
        String pass = contraseña_txt.getText().toString().trim();

        if (TextUtils.isEmpty(email))
        {
            Toast.makeText(this, "debes igresar un email", Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(pass))
        {
            Toast.makeText(this, "Debes ingresar una contraseña puñetas", Toast.LENGTH_SHORT).show();
            return;
        }
        progressDialog.setMessage("se esta comprovando tu inicio de secion puñetas");
        progressDialog.show();

        //creando la autenticacion

        firebaseAuth.signInWithEmailAndPassword(email, pass)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>()
                {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task)
                    {
                        if (task.isSuccessful())
                        {
                            Toast.makeText(login.this, "bienvenido a tu asquerosa cuenta", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getApplication(), menu.class);
                            startActivity(intent);
                            //intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            finish();
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                        }
                        else
                        {
                            if (task.getException() instanceof FirebaseAuthUserCollisionException)
                            {
                                Toast.makeText(login.this, "ya existe tu cuenta asquerosa", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                Toast.makeText(login.this, "pasa algo con tu asquerosa cuenta, " +
                                        "el correo o la contraseña anda mal", Toast.LENGTH_SHORT).show();
                            }
                        }
                        progressDialog.dismiss();
                    }
                });
    }
}
