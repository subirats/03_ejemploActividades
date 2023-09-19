package lluis.subirats.a03_ejemploactividades;

import static lluis.subirats.a03_ejemploactividades.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnPasar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main); //esto no se puede quitar y hay que escribir siempre después.

        Log.e("ESTADOS", "1-En el método onCreate");
        btnPasar = findViewById(R.id.btnPasarMain);
        btnPasar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //LANZAR LA NUEVA ACTIVIDAD
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("ESTADOS", "2- En el método onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("ESTADOS", "3- En el método onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("ESTADOS", "4- En el método onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("ESTADOS", "5- En el método onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("ESTADOS", "6- En el método onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("ESTADOS", "7- En el método onDestroy");
    }
}