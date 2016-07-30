package com.example.mrbom.studentmanager;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Qk Lahpita on 7/30/2016.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {
    ArrayList<PersonInfo> list;

    public RecyclerAdapter(ArrayList<PersonInfo> list) {
        this.list = list;
    }

    @Override
    public RecyclerAdapter.RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_list, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.RecyclerViewHolder holder, int position) {
        PersonInfo personInfo = list.get(position);
        holder.tvStudentName.setText(personInfo.getName());
        holder.tvStudentPhoneNumber.setText(personInfo.getPhone());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView tvStudentName, tvStudentPhoneNumber;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
            tvStudentName = (TextView) itemView.findViewById(R.id.tv_student_name);
            tvStudentPhoneNumber = (TextView) itemView.findViewById(R.id.tv_student_phone_number);
        }
    }
}
