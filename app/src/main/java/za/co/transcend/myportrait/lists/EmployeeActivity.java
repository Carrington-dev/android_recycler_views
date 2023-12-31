package za.co.transcend.myportrait.lists;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

import za.co.transcend.myportrait.R;
import za.co.transcend.myportrait.adapters.ExAdapter;
import za.co.transcend.myportrait.models.Employee;

public class EmployeeActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee);

        recyclerView = findViewById(R.id.contact_recycler_view);


        ArrayList<Employee> employees = new ArrayList<>();

        for (int i = 0; i < 90; i++){
            employees.add(new Employee("67", "Carrington", "Muleya", "Software Developer"));
        }

        ExAdapter employeeAdapter = new ExAdapter(this, employees);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(employeeAdapter);
    }
}