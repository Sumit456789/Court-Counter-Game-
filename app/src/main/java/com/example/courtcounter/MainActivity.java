package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Track the score for Team A
    int scoreTeamA=0;

    //Track the score for Team B
    int scoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

// increase the score for Team A by 3 points.
    public void addThreeForTeamA(View v){
             scoreTeamA = scoreTeamA+ 3;
             displayForTeamA(scoreTeamA);

    }

    // increase the score for Team A by 2 points.
    public void addTwoForTeamA (View v) {
        scoreTeamA = scoreTeamA+ 2;
        displayForTeamA(scoreTeamA);

    }

    // increase the score for Team A by 1 points.
    public void addOneForTeamA (View v){
        scoreTeamA = scoreTeamA+ 1;
        displayForTeamA(scoreTeamA);

    }

    // increase the score for Team B by 3 points.
    public void addThreeForTeamB (View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamA(scoreTeamB);
    }

    // increase the score for Team B by 2 points.
    public void addTwoForTeamB (View v) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamA(scoreTeamB);
    }

    // increase the score for Team B by 1 points.
    public void addOneForTeamB (View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamA(scoreTeamB);
    }

       public void resetscore(View v){
             scoreTeamA =0;
             scoreTeamB =0;
             displayForTeamA(scoreTeamA);
             displayForTeamB(scoreTeamB);
       }
        /**
         * Displays the given score for Team A .
         */
    public void displayForTeamA(int score) {

        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}