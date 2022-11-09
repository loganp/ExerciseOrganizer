package com.example.exerciseorganizer;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.exerciseorganizer.Adapter.WorkoutAdapter;
import com.example.exerciseorganizer.Model.WorkoutModel;

import java.util.ArrayList;
import java.util.List;

public class WorkoutsActivity extends AppCompatActivity {

    private RecyclerView rvWorkouts;
    private WorkoutAdapter workoutAdapter;

    private List<WorkoutModel> workoutList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        workoutList = new ArrayList<>();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workouts);
        getSupportActionBar().hide();

        rvWorkouts = findViewById(R.id.rvWorkouts);
        rvWorkouts.setLayoutManager(new LinearLayoutManager(this));
        workoutAdapter = new WorkoutAdapter(this);
        rvWorkouts.setAdapter(workoutAdapter);

        WorkoutModel workout = new WorkoutModel();
        workout.setWorkout("Test Workout");
        workout.setId(1);

        workoutList.add(workout);
        workoutList.add(workout);
        workoutList.add(workout);
        workoutList.add(workout);

        workoutAdapter.setWorkouts(workoutList);
    }
}