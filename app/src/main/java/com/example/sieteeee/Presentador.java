package com.example.sieteeee;

public class Presentador {
    private Modelo modelo;

    public void evaluarContraseña(String password){
       int nivelFuerza=  modelo.validarClave(password);

       if (nivelFuerza== modelo.DEBIL){

       }else if (nivelFuerza==modelo.MEDIA){

       }else if (nivelFuerza==modelo.FUERTE){

       }else {
           
       }

    }
}
