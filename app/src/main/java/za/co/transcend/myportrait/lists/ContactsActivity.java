package za.co.transcend.myportrait.lists;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

import za.co.transcend.myportrait.R;
import za.co.transcend.myportrait.adapters.ContactAdapter;
import za.co.transcend.myportrait.models.Contact;

public class ContactsActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        recyclerView = findViewById(R.id.contact_recycler_view);

        ArrayList<Contact> contactArrayList = new ArrayList<>();
        for (int i = 0; i < 67; i++)
        {
            contactArrayList.add(new Contact("+27 67 735 2242", "South Africa", "12/30", R.drawable.ic_phone_callback_24, R.drawable.baseline_123_24));
        }

        ContactAdapter contactAdapter = new ContactAdapter(this, contactArrayList);
        recyclerView.setAdapter(contactAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}