package codepolitan.android_starterpack.badmintoncounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvScoreTeamA;
    private TextView tvScoreTeamB;

    private Button btnPlusScoreTeamA;
    private Button btnMinusScoreTeamA;
    private Button btnPlusScoreTeamB;
    private Button btnMinusScoreTeamB;
    private Button btnReset;

    private int scoreTeamA = 0;
    private int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvScoreTeamA = findViewById(R.id.tvScoreTeamA);
        tvScoreTeamB = findViewById(R.id.tvScoreTeamB);

        btnPlusScoreTeamA = findViewById(R.id.btnPlusScoreTeamA);
        btnMinusScoreTeamA = findViewById(R.id.btnMinusScoreTeamA);
        btnPlusScoreTeamB = findViewById(R.id.btnPlusScoreTeamB);
        btnMinusScoreTeamB = findViewById(R.id.btnMinusScoreTeamB);

        btnReset = findViewById(R.id.btnReset);


        btnPlusScoreTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA += 1;
                tvScoreTeamA.setText(String.valueOf(scoreTeamA));
            }
        });

        btnMinusScoreTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA -= 1;
                if (scoreTeamA < 0){
                    scoreTeamA = 0;
                }
                tvScoreTeamA.setText(String.valueOf(scoreTeamA));
            }
        });

        btnPlusScoreTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB += 1;
                tvScoreTeamB.setText(String.valueOf(scoreTeamB));
            }
        });

        btnMinusScoreTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB -= 1;
                if (scoreTeamB < 0){
                    scoreTeamB = 0;
                }
                tvScoreTeamB.setText(String.valueOf(scoreTeamB));
            }
        });



    }

    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        tvScoreTeamA.setText(String.valueOf(scoreTeamA));
        tvScoreTeamB.setText(String.valueOf(scoreTeamB));
    }
}