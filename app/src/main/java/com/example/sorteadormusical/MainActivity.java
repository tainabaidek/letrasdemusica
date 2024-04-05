package com.example.sorteadormusical;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


    }

    public void sortear(View view) {

        int resultado = new Random().nextInt(5);

        TextView textResultado = findViewById(R.id.textResultado);

        if (resultado == 0) {
            textResultado.setText("I had a marvelous time ruinin' everything");
        } else if (resultado == 1){
            textResultado.setText("I feel so much lighter like a feather with you off my mind");
        }
        else if (resultado == 2){
            textResultado.setText("All we hear is radio ga ga");
        }
        else if (resultado == 3){
            textResultado.setText("You're as pure as the driven snow");
        }
        else if (resultado == 4){
            textResultado.setText("My house of stone, your ivy grows\n" +
                    "And now I'm covered in you");
        }

    }
}