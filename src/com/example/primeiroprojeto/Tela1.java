package com.example.primeiroprojeto;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Tela1 extends Activity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);
        
        Button btn = (Button)findViewById(R.id.buttonProximo);
        btn.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.tela1, menu);
        return true;
    }


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		TextView tvResultado = (TextView) findViewById(R.id.textViewResposta);
		EditText txtNome = (EditText) findViewById(R.id.editTextNome);
		  
		String msg = "Nome: " + txtNome.getText().toString();
		  
		tvResultado.setText(msg);
		
		Intent intencao = new Intent(this, Tela2.class);
		startActivity(intencao);
	}
    
}
