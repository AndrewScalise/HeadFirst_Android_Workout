package com.skuhleesi.workout;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_WORKOUT_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Get a reference to the fragment
        WorkoutDetailFragment workoutDetailFragment = (WorkoutDetailFragment)
                getSupportFragmentManager().findFragmentById(R.id.detail_frag);

        //Get the ID of the workout the user clicked on from the intent
        int workoutId = (int) getIntent().getExtras().get(EXTRA_WORKOUT_ID);
        //Pass the workout ID to the fragment
        workoutDetailFragment.setWorkout(workoutId);
    }


}
