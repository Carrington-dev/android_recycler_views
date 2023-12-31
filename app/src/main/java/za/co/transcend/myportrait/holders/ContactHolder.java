package za.co.transcend.myportrait.holders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import za.co.transcend.myportrait.R;

public class ContactHolder extends RecyclerView.ViewHolder {
    public TextView telNumberNameView, telCountryNameVew, telDateView;
    public ImageView telInfoView, telMissedCalled;

    public ContactHolder(@NonNull View itemView) {
        super(itemView);

        telDateView = itemView.findViewById(R.id.tel_date);
        telCountryNameVew = itemView.findViewById(R.id.tel_country);
        telNumberNameView = itemView.findViewById(R.id.tel_name_number);
        telInfoView = itemView.findViewById(R.id.tel_info);
        telMissedCalled = itemView.findViewById(R.id.call_icon);
    }
}
