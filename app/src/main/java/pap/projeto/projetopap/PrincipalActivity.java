package pap.projeto.projetopap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void novaDespesa(MenuItem item) {
        startActivity(new Intent(this, ListaDespesaActivity.class));
    }

    public void novaReceita(MenuItem item) {
        startActivity(new Intent(this, ListaReceitaActivity.class));
    }
}
