package com.example.sieteeee;

public class Modelo {

    public static final int DEBIL=0;
    public static final int MEDIA=1;
    public static final int FUERTE=2;

    public int validarClave(String password) {
        if (password.length() < 5) {

            return DEBIL;

        } else if (password.equals(password.toLowerCase())) {

            return FUERTE;

        } else {

            return MEDIA;

        }
    }
}

