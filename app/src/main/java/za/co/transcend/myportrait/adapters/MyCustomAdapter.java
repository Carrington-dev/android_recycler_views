package za.co.transcend.myportrait.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import za.co.transcend.myportrait.R;
import za.co.transcend.myportrait.models.Person;

public class MyCustomAdapter extends RecyclerView.Adapter<MyViewHolder> {
    Context context;
    ArrayList<Person> personList;

    public MyCustomAdapter(Context context, ArrayList<Person> personList) {
        this.context = context;
        this.personList = personList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.contact_detail, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.emailView.setText(personList.get(position).email);
        holder.fullNameView.setText(personList.get(position).name);
    }

    @Override
    public int getItemCount() {
        return personList.size();
    }
}
