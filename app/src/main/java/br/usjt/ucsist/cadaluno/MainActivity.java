package br.usjt.ucsist.cadaluno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irParaOutraTela(View view) {
        EditText mensagemEditText = findViewById(R.id.mensagemEditText);
        String mensagem = mensagemEditText.getText().toString();
       /* Intent intent = new Intent(this, ExibeMensagemActivity.class);
        intent.putExtra("msg", mensagem);
        startActivity(intent);*/

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.setType("text/plain");

        intent.putExtra(Intent.EXTRA_TEXT, mensagem);

        intent = Intent.createChooser(intent, null);

        startActivity(intent);


    }
    // Toast.makeText(this,mensagem, Toast.LENGTH_SHORT).show();
}