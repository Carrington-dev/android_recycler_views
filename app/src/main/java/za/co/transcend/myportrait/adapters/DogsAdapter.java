package za.co.transcend.myportrait.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import za.co.transcend.myportrait.R;
import za.co.transcend.myportrait.holders.DogHolder;
import za.co.transcend.myportrait.models.Dog;

public class DogsAdapter extends RecyclerView.Adapter<DogHolder> {
    Context mContext;
    ArrayList<Dog> dogs;

    public DogsAdapter(Context mContext, ArrayList<Dog> dogs) {
        this.mContext = mContext;
        this.dogs = dogs;
    }

    @NonNull
    @Override
    public DogHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DogHolder( LayoutInflater.from(mContext).inflate(R.layout.dog_detail, parent, false));
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull DogHolder holder, int position) {
        holder.nameView.setText(dogs.get(position).getName());
        holder.ageView.setText((dogs.get(position).getAge()) + " years old");
    }

    @Override
    public int getItemCount() {
        return dogs.size();
    }
}
