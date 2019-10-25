package com.example.mark5;

public class firebase_datos
{
    String nombreUsuario;
    String correoUsuario;
    public firebase_datos(String nombreUsuario, String correoUsuario)
    {
        this.nombreUsuario = nombreUsuario;
        this.correoUsuario = correoUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }
}
