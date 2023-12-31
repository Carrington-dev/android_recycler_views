package za.co.transcend.myportrait.adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import za.co.transcend.myportrait.R;

public class MyViewHolder extends RecyclerView.ViewHolder {
    TextView fullNameView, emailView;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        fullNameView = itemView.findViewById(R.id.full_name);
        emailView = itemView.findViewById(R.id.full_email);


    }

}
