package com.example.firebase5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.firebase5.model.Produto;
import com.example.firebase5.model.Usuario;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference ref = FirebaseDatabase.getInstance().getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        FirebaseApp.initializeApp(this);
        DatabaseReference usuarios = ref.child("USUARIOS");
        DatabaseReference produtos = ref.child("PRODUTOS");
//        Usuario usuario = new Usuario("Naizinho", 01, "01/10/1991");
//
//        Produto produto = new Produto(01, "Livro",10.99);
//
//        usuarios.setValue(usuario);
//        produtos.setValue(produto);

        usuarios.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnap) {
                Log.i("Firebase", String.format("KEY= %s VALUE = %s", dataSnap.getKey(), dataSnap.getValue()));
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}
