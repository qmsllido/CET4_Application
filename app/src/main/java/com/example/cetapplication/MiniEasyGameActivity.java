package com.example.cetapplication;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class MiniEasyGameActivity extends AppCompatActivity {
    TextView qQuestionView;
    //private ImageView qImageView;
    Button qButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_game);

        qQuestionView = (TextView) findViewById(R.id.questionView);
        //qImageView = (ImageView) findViewById(R.id.ImageView);
        qButton = (Button) findViewById(R.id.nextBtn);

        showRandomQuestion();

        qButton.setOnClickListener(v -> showRandomQuestion());
    }

    public void showRandomQuestion(){
        shuffleQuestions();
        qQuestionView.setText(questionsArray[0].getqQuest());
        //qQuestionView.setImageResource(questionsArray[0].getqQuest());
    }


    Questions q01 = new Questions( "A rectangle has a length of 6 inches and a width of 4 inches. The area is __ inches squared.");
    Questions q02 = new Questions( "The side of a square is 5 meters. The area of the square is __ meter squared.");
    Questions q03 = new Questions("Sinθ, cosθ, tanθ, cotθ are respectively:");
    Questions q04 = new Questions("Convert the ff. measurements into meters: a.280cm b.56100mm c.3.7km");
    Questions q05 = new Questions("A triangle has a perimeter of 50. If 2 of its side are equal and the third side is 5 more than " +
            "the equal sides, what is the length of the third side?");

    Questions[] questionsArray = new Questions[]{
            q01, q02, q03, q04, q05
    };

    public void shuffleQuestions() {
        Collections.shuffle(Arrays.asList(questionsArray));
    }
}

