package pap.projeto.projetopap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void entrar(View view) {
        EditText usuario = findViewById(R.id.usuario);
        EditText senha = findViewById(R.id.senha);

        if("admin".equals(usuario.getText().toString()) && "123".equals(senha.getText().toString())) {
            startActivity(new Intent(this, PrincipalActivity.class));
        } else {
            Toast.makeText(this, "Login ou senha invalida!", Toast.LENGTH_SHORT).show();
        }
    }

    public void cadastrar(View view) {
        startActivity(new Intent(this, CadastroActivity.class));
    }
}
