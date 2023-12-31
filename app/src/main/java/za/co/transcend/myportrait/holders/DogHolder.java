package za.co.transcend.myportrait.holders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import za.co.transcend.myportrait.R;

public class DogHolder extends RecyclerView.ViewHolder {
    public TextView nameView, ageView;
    public DogHolder(@NonNull View itemView) {
        super(itemView);

        nameView = itemView.findViewById(R.id.dog_name);
        ageView = itemView.findViewById(R.id.dog_age);
    }
}
