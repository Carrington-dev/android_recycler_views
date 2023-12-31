package za.co.transcend.myportrait.adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import za.co.transcend.myportrait.R;
import za.co.transcend.myportrait.holders.ContactHolder;
import za.co.transcend.myportrait.models.Contact;

public class ContactAdapter extends RecyclerView.Adapter<ContactHolder> {
    Context mContext;
    ArrayList<Contact> contacts;

    public ContactAdapter(Context mContext, ArrayList<Contact> contacts) {
        this.mContext = mContext;
        this.contacts = contacts;
    }

    @NonNull
    @Override
    public ContactHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContactHolder( LayoutInflater.from(mContext).inflate(R.layout.contact_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContactHolder holder, int position) {
        holder.telDateView.setText(contacts.get(position).getDate());
        holder.telCountryNameVew.setText(contacts.get(position).getCountry());
        holder.telNumberNameView.setText(contacts.get(position).getName());
        holder.telMissedCalled.setImageResource(  contacts.get(position).getCallIcon());
        holder.telInfoView.setImageResource(contacts.get(position).getInfoIcon());
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }
}
