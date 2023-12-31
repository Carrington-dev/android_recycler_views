package za.co.transcend.myportrait;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import za.co.transcend.myportrait.adapters.MyCustomAdapter;
import za.co.transcend.myportrait.models.Person;


public class AdapterViewActivity extends AppCompatActivity {

    ArrayList<Person> names;
    RecyclerView personsRecycler;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter_view);

        names = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            names.add(new Person("Carrington Muleya @" + i , "crn96m" + i + "@gmail.com"));
        }

        System.out.println("names: " + names);

        personsRecycler = findViewById(R.id.persons_recycler);

        personsRecycler.setLayoutManager(new LinearLayoutManager(this));
        MyCustomAdapter myCustomAdapter = new MyCustomAdapter(this, names);
        personsRecycler.setAdapter(myCustomAdapter);
    }
}