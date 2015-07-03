package mx.platzi.recyclerviewsample;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializing Movies
        List<Movie> items = new ArrayList<>();

        items.add(new Movie(R.drawable.vita_bella, "Life is Beautiful", 777));
        items.add(new Movie(R.drawable.edge, "Edge of Tomorrow", 635));
        items.add(new Movie(R.drawable.ratatouille, "Ratatouille", 456));
        items.add(new Movie(R.drawable.avengers, "Avengers", 322));
        items.add(new Movie(R.drawable.super_metroid, "Super Metroid", 123));
        items.add(new Movie(R.drawable.vita_bella, "Life is Beautiful", 777));

        // Obtener el Recycler
        recycler = (RecyclerView) findViewById(R.id.reciclador);
        recycler.setHasFixedSize(true);

        // Usar un administrador para LinearLayout
        linearLayoutManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(linearLayoutManager);

        // Crear un nuevo adaptador
        adapter = new MovieAdapter(items);
        recycler.setAdapter(adapter);
    }
}
