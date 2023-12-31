package za.co.transcend.myportrait;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import za.co.transcend.myportrait.lists.DogsActivity;

public class MainActivity extends AppCompatActivity {
    Button addToDbButton, goToListButton, goToDogsRecyclerView, getGoToDefaultList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goToListButton = findViewById(R.id.go_to_list_view);
        goToDogsRecyclerView = findViewById(R.id.go_to_adapter_view);
        addToDbButton = findViewById(R.id.add_to_db);

        goToListButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, AdapterViewActivity.class);
            startActivity(intent);
        });

        goToDogsRecyclerView.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, DogsActivity.class);
            startActivity(intent);
        });


    }
}