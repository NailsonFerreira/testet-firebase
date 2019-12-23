package com.example.firebase5;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.firebase5.model.Produto;
import com.example.firebase5.model.Usuario;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AdditionalUserInfo;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

//    private DatabaseReference ref = FirebaseDatabase.getInstance().getReference();
//    private FirebaseAuth auth = FirebaseAuth.getInstance();

    private ImageView foto;
    private Button enviar;
    private TextView txtNome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         txtNome = findViewById(R.id.text_nome);

//        DatabaseReference usuarios = ref.child("USUARIOS");
//        DatabaseReference usuariosPesquisa = usuarios.child("-LwjSEdAaNaWww-sUB8t");
//        DatabaseReference produtos = ref.child("PRODUTOS");
//
//        Usuario usuario = new Usuario("Naizinho", 28, "01/10/1991");
//        Usuario kttunstall = new Usuario("KT Tunstall", 37, "23/06/1991");
//        Usuario joao = new Usuario("Sia", 43, "02/08/1985");
//        Usuario jose = new Usuario("Jack Johnson", 45, "13/11/1981");
//        Usuario carla = new Usuario("Feist", 37, "28/01/1979");
//
//        Produto produto = new Produto(01, "Livro",10.99);


//        Query pesquisaPorNome = usuarios.orderByChild("nome").equalTo("Jack Johnson");
//        Query pesquisaPorKEY = usuarios.orderByKey().limitToFirst(4);
//        Query pesquisaPorKEY = usuarios.orderByChild("idade").startAt(40);
//        Query pesquisaPorKEY = usuarios.orderByChild("idade").endAt(25);
//        Query pesquisaPorKEY = usuarios.orderByChild("nome")
//                .startAt("M")
//                .endAt("O"+"\uf8ff");
//        usuarios.push().setValue(usuario);
//        usuarios.push().setValue(kttunstall);
//        usuarios.push().setValue(joao);
//        usuarios.push().setValue(jose);
//        usuarios.push().setValue(carla);
//        produtos.push().setValue(produto);


        //Deslogar
//        auth.signOut();

        //LOGAR
//        auth.signInWithEmailAndPassword("noslianFsantos@gmail.com", "Carried")
//                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        String mensagem = task.isSuccessful() ? "Sucesso" : "Falha";
//                        AuthResult result = task.getResult();
//                        Log.e("Firebase", String.format("%s ao logar", mensagem));
//                    }
//                });
//        FirebaseUser currentUser = auth.getCurrentUser();
//        String email = currentUser != null ? currentUser.getEmail() : "OFFLINE";
//        String senha = currentUser != null ? currentUser.getUid() : "OFFLINE";
//        Log.e("FIREBASE", String.format("Cadastro: Email-%s UID %s", email.toUpperCase(), senha));

        //CADASTRAR
//        auth.createUserWithEmailAndPassword("noslianFsantos@gmail.com", "Carried")
//                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        String mensagem = task.isSuccessful()? "Sucesso": "Falha";
//                        AuthResult result = task.getResult();
//                        AdditionalUserInfo additionalUserInfo = result.getAdditionalUserInfo();
//                        Log.i("Firebase", String.format("%s no Cadastro", mensagem));
//
//                    }
//                });


//        usuariosPesquisa.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnap) {
//                Log.e("Firebase", String.format("KEY= %s VALUE = %s", dataSnap.getKey(), dataSnap.getValue()));
//                Usuario pesquisa = dataSnap.getValue(Usuario.class);
//                    txtNome.setText(pesquisa.getNome());
////
////                Log.e("Firebase", String.format("Usuario: %s", pesquisa.toString()));
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });
    }
}
