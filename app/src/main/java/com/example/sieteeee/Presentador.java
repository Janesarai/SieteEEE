package com.example.sieteeee;

public class Presentador {
    private Modelo modelo;
    private IVistaPresentador vistaPresentador;

    public Presentador(IVistaPresentador vistaPresentador) {
        this.vistaPresentador = vistaPresentador;

        modelo= new Modelo();
    }

    public void evaluarContraseña(String password){
       int nivelFuerza=  modelo.validarClave(password);

       if (nivelFuerza== modelo.DEBIL){
           this.vistaPresentador.mostrarDebil();

       }else if (nivelFuerza==modelo.MEDIA){
           this.vistaPresentador.mostrarMedia();

       }else if (nivelFuerza==modelo.FUERTE){
           this.vistaPresentador.mostrarFuerte();

       }else {
           this.vistaPresentador.mostrarError();

       }

    }
}
