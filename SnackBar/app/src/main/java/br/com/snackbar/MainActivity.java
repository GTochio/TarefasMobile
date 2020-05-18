package br.com.snackbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
  
  private Button botao;
  private Snackbar snackbar;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    
    botao = findViewById(R.id.btnMessage);

    botao.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        snackbar = Snackbar.make(botao, "Ação realizada com sucesso !", Snackbar.LENGTH_LONG);
        snackbar.setAction("Desfazer", new View.OnClickListener() {
          @Override
          public void onClick(View v) {
            Toast.makeText(MainActivity.this, "Operação desfeita", Toast.LENGTH_SHORT).show();
          }
        });
        snackbar.show();
      }
    });
  }
}
