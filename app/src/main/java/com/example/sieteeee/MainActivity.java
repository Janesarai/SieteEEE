package com.example.sieteeee;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Toast;

import com.example.sieteeee.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements IVistaPresentador{
//primero hacer modelo,

    private Presentador presentando;
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        presentando = new Presentador(this);

        binding.tvPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                presentando.evaluarContraseña(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    @Override
    public void mostrarDebil() {
        binding.tvResultado.setBackgroundColor(Color.RED);
        Toast.makeText(this,"DEBIL",Toast.LENGTH_SHORT).show();

    }

    @Override
    public void mostrarMedia() {
        binding.tvResultado.setBackgroundColor(Color.YELLOW);
        Toast.makeText(this,"MEDIO",Toast.LENGTH_SHORT).show();

    }

    @Override
    public void mostrarFuerte() {
        binding.tvResultado.setBackgroundColor(Color.GREEN);
        Toast.makeText(this,"FUERTE",Toast.LENGTH_SHORT).show();

    }

    @Override
    public void mostrarError() {
        binding.tvResultado.setBackgroundColor(Color.BLACK);
        Toast.makeText(this,"ERROR",Toast.LENGTH_SHORT).show();

    }
}