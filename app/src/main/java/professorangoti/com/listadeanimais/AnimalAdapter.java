package professorangoti.com.listadeanimais;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AnimalAdapter extends BaseAdapter {

    Context contexto;
    List<Animal> lista;

    public AnimalAdapter(Context contexto, List<Animal> lista) {
        this.contexto = contexto;
        this.lista = lista;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View linha = LayoutInflater.from(contexto).inflate(R.layout.linha,null);
        Animal animal = lista.get(position);

        TextView nome = (TextView) linha.findViewById(R.id.texto);
        nome.setText(animal.getNome());

        ImageView img = (ImageView) linha.findViewById(R.id.imagem);
        TypedArray fotos = contexto.getResources().obtainTypedArray(R.array.imagens);
        img.setImageDrawable(fotos.getDrawable(animal.getFotoID()));
        return linha;
    }
}
