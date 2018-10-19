package professorangoti.com.listadeanimais;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends ListActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_principal);
        preparaListaDeAnimais();
        //preparaListaDePaises();
    }

    private void preparaListaDeAnimais() {
        List<Animal> animais = new ArrayList<Animal>();
        animais.add(new Animal("bufalo", 0));
        animais.add(new Animal("leao", 1));
        animais.add(new Animal("raposa", 2));
        animais.add(new Animal("tigre", 3));
        animais.add(new Animal("vaca", 4));
        animais.add(new Animal("zebra", 5));
        setListAdapter(new AnimalAdapter(this, animais));
        getListView().setOnItemClickListener(this);
    }

    private void preparaListaDePaises() {
        List<Pais> paises = new ArrayList<Pais>();
        paises.add(new Pais("China", 1, 1354040000, 0));
        paises.add(new Pais("India", 2, 1210193422, 1));
        paises.add(new Pais("United Estates", 3, 315761000, 2));
        paises.add(new Pais("Indonesia", 4, 237641000, 3));
        paises.add(new Pais("Brasil", 5, 193946886, 4));
        setListAdapter(new PaisAdapter(this, paises));
        getListView().setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, ((TextView) view.findViewById(R.id.texto)).getText().toString(), Toast.LENGTH_SHORT).show();
    }


}
