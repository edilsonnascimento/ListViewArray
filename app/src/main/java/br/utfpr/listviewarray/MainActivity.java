package br.utfpr.listviewarray;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Pessoa pessoa;
    private ListView listViewPessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewPessoa = findViewById(R.id.listViewPessoa);

        popularLista();
    }

    private void popularLista() {

        String[] nomes = getResources().getStringArray(R.array.nomes);
        int[] idades = getResources().getIntArray(R.array.idades);

        List<Pessoa> pessoas = new ArrayList<>();

        for(int i = 0; i < nomes.length; i++) pessoas.add(new Pessoa(nomes[i], idades[i]));

        ArrayAdapter<Pessoa> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, pessoas);

        listViewPessoa.setAdapter(adapter);
    }

}