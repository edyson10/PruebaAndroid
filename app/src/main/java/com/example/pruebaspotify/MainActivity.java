package com.example.pruebaspotify;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.pruebaspotify.Adapter.Adapter_categoria;
import com.example.pruebaspotify.Pojo.CategoriaVO;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<CategoriaVO> listCategoria;
    Adapter_categoria adapter_categoria;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressDialog = new ProgressDialog(MainActivity.this);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_categoria);
        listCategoria = new ArrayList<>();
        llenarRecyclerCategoria();
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        adapter_categoria = new Adapter_categoria(listCategoria, getApplicationContext());
        adapter_categoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Titulo: ", Toast.LENGTH_SHORT);
                //listPersonal.get(recyclerView.getChildAdapterPosition(view)).getCedula()
            }
        });
        recyclerView.setAdapter(adapter_categoria);
    }

    public void llenarRecyclerCategoria() {
        /*
        ConnectivityManager con = (ConnectivityManager) getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = con.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected() && (networkInfo.getType() == ConnectivityManager.TYPE_MOBILE || networkInfo.getType() == ConnectivityManager.TYPE_WIFI)) {
            progressDialog.setMessage("Cargando... Por favor espere!");
            progressDialog.show();
        }*/
        listCategoria.add(new CategoriaVO("La quinta batalla", "10 aniversario", "La difunta", "25.0000" , ""));
        listCategoria.add(new CategoriaVO("La sexta batalla", "11 aniversario", "La muerta", "26.0000" , ""));
        listCategoria.add(new CategoriaVO("La septima batalla", "12 aniversario", "Holis", "27.0000" , ""));
        listCategoria.add(new CategoriaVO("La octava batalla", "13 aniversario", "La dif", "28.0000" , ""));
        listCategoria.add(new CategoriaVO("La novena batalla", "14 aniversario", "asd", "29.0000" , ""));
    }
}
