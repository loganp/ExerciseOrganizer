package com.example.exerciseorganizer.Adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.exerciseorganizer.Model.WorkoutModel;
import com.example.exerciseorganizer.R;
import com.example.exerciseorganizer.WorkoutsActivity;

import java.util.List;

public class WorkoutAdapter extends RecyclerView.Adapter<WorkoutAdapter.ViewHolder> {

    private List<WorkoutModel> workoutList;
    private Activity activity;

    public WorkoutAdapter (WorkoutsActivity activity){
        this.activity = activity;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_activity, parent, false);
        return new ViewHolder(itemView);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        WorkoutModel item = workoutList.get(position);
    }

    @Override
    public int getItemCount() {
        return workoutList.size();
    }

    public void setWorkouts(List<WorkoutModel> workoutList) {
        this.workoutList = workoutList;
        notifyDataSetChanged();
    }
}
