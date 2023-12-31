package za.co.transcend.myportrait.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import za.co.transcend.myportrait.R;
import za.co.transcend.myportrait.holders.EmployeeHolder;
import za.co.transcend.myportrait.models.Employee;

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeHolder> {
    Context mContext;
    ArrayList<Employee> employees;

    public EmployeeAdapter(Context mContext, ArrayList<Employee> employees) {
        this.mContext = mContext;
        this.employees = employees;
    }

    @NonNull
    @Override
    public EmployeeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new EmployeeHolder( LayoutInflater.from(mContext).inflate(R.layout.employee_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull EmployeeHolder holder, int position) {
        holder.nameSurnameView.setText(employees.get(position).getName() + " " + employees.get(position).getSurname());
        holder.idView.setText(employees.get(position).getId() );
        holder.occupationView.setText(employees.get(position).getOccupation() );
        holder.initView.setText("CM/23" );
    }

    @Override
    public int getItemCount() {
        return employees.size();
    }
}
