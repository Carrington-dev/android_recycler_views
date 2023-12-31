package za.co.transcend.myportrait.holders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import za.co.transcend.myportrait.R;

public class EmployeeHolder extends RecyclerView.ViewHolder {
    public TextView nameSurnameView, idView, occupationView, initView;
    public EmployeeHolder(@NonNull View itemView) {
        super(itemView);
        nameSurnameView = itemView.findViewById(R.id.employee_name);
        idView = itemView.findViewById(R.id.employee_id);
        initView = itemView.findViewById(R.id.employee_init);
        occupationView = itemView.findViewById(R.id.employee_occupation);
    }
}
