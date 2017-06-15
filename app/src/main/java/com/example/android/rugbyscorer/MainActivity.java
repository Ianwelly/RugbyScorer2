package com.example.android.rugbyscorer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   private int scoreTeamA = 0;
    private int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void scoreATryForTeamA(View v) {
        scoreTeamA += 5;
        displayForTeamA(scoreTeamA);
    }

    public void scoreAConversionForTeamA(View v) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void scoreAPenaltyForTeamA(View v) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void scoreADropGoalForTeamA(View v) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Team B button assignments
     */

    public void scoreATryForTeamB(View view) {
        scoreTeamB += 5;
        displayForTeamB(scoreTeamB);
    }

    public void scoreAConversionTeamB(View v) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void scoreAPenaltyForTeamB(View v) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void scoreADropGoalForTeamB(View v) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team B.
     */

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScores(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
