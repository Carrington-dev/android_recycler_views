package za.co.transcend.myportrait.lists;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import za.co.transcend.myportrait.R;
import za.co.transcend.myportrait.adapters.DogsAdapter;
import za.co.transcend.myportrait.models.Dog;

public class DogsActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dogs);

        recyclerView = findViewById(R.id.dogs_recycler_view);

        ArrayList<Dog> dogs = new ArrayList<>();
        for (int i = 0; i < 45; i++){
            dogs.add(new Dog("Doggy @" + i, ""+i+1*0.5*0.5));
        }

        DogsAdapter dogsAdapter = new DogsAdapter(this, dogs);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(dogsAdapter);



    }
}