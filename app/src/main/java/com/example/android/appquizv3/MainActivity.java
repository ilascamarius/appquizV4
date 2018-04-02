package com.example.android.appquizv3;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import junit.framework.Test;

public class MainActivity extends AppCompatActivity {

    Button submit;
    int okAnswer=0;
    TextView textIncorrect;
    int ansQuestion5Correct=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit=(Button) findViewById(R.id.submit);
       submit.setOnClickListener(submitButtonOnClickListener);
    }


    private void ansQ1(){
        CheckBox ansQ1_1990=(CheckBox) findViewById(R.id.q1Ans1990);
        CheckBox ansQ1_1991=(CheckBox) findViewById(R.id.q1Ans1991);
        CheckBox ansQ1_1992=(CheckBox) findViewById(R.id.q1Ans1992);

        boolean isAnsQ1_1990=ansQ1_1990.isChecked();
        boolean isAnsQ1_1991=ansQ1_1991.isChecked();
        boolean isAnsQ1_1992=ansQ1_1992.isChecked();

        if (isAnsQ1_1990 && isAnsQ1_1991 && isAnsQ1_1992){
            okAnswer +=1;
        }
    }

    private void ansQ2(){
        RadioButton ansQ2DonaldTrump=(RadioButton) findViewById(R.id.q1ansDonaldTrump);

        boolean isAnsQ2DonaldTrump=ansQ2DonaldTrump.isChecked();

        if (isAnsQ2DonaldTrump){
            okAnswer +=1;
        }
    }

    private void ansQ3(){
        RadioButton ansQ3TheBeatles=(RadioButton) findViewById(R.id.q3AnsTheBeatles);

        boolean isAnsQ3TheBeatles=ansQ3TheBeatles.isChecked();

        if (isAnsQ3TheBeatles) {
            okAnswer +=1;
        }
    }

    private void ansQ4() {
        RadioButton ansQ4ResurrOfJesus=(RadioButton) findViewById(R.id.q4AnsResJesus);

        boolean isAnsQ4ResurrOfJesus=ansQ4ResurrOfJesus.isChecked();

        if (isAnsQ4ResurrOfJesus) {
            okAnswer +=1;
        }
    }

    private String answerQ5() {
        EditText ansQ5_two = (EditText) findViewById(R.id.ansq5);

       //if (ansQ5_two.getText().equals(null) || ansQ5_two.getText().toString().equals("")) {
          // Toast.makeText(this, "please enter something in text box", Toast.LENGTH_LONG).show();
        //}

        String ansQuestionfive_two = ansQ5_two.getText().toString().trim();

        if (TextUtils.isEmpty(ansQuestionfive_two))
            Toast.makeText(MainActivity.this, "Please enter a number in the Text Box", Toast.LENGTH_SHORT).show();
    //else if (ansQuestionfive_two.equalsIgnoreCase(getResources().getInteger(R.integer.{ansQuestion5Correct})))
      //
        //{okAnswer+=1};


    //  if (!TextUtils.isEmpty(ansQuestionfive_two) && ansQuestionfive_two.equalsIgnoreCase(ansQuestionfive_two)){
      //    Toast.makeText(this, "please enter something in text box", Toast.LENGTH_LONG).show();
      //}
        //{

        //}
        //else if () {
          //  Toast.makeText(this, "please enter something in text box", Toast.LENGTH_LONG).show();
        //}
        //int numberAnsQ5_two = Integer.parseInt(ansQuestionfive_two);
       return ansQuestionfive_two;

    }


        //private void emptyTextinput () {
            //EditText ansQ5Empty = (EditText) findViewById(R.id.ansq5);
            //if (ansQ5Empty.getText().toString().equals(null) || ansQ5Empty.getText().toString().equals(""))
            //{
            //    Toast.makeText(this, "please enter something in the text!", Toast.LENGTH_SHORT).show();
          //  }
       // }


    private void finalAnswerQ5() {
        int numberAnsQ5_two= Integer.parseInt(answerQ5());
       // try {
         //   Integer.parseInt(answerQ5().toString());
        //} catch (InterruptedException e){
          //  this.textIncorrect.setText("Error!");
            //this.usableInt=false;
        //}

        if (numberAnsQ5_two == 2) {
            okAnswer += 1;


        }
        //if ()

      // if (answerQ5()==null) {
        // Toast.makeText(this, "please enter something in text box", Toast.LENGTH_LONG).show();
        //}
   }

    private void ansQ6() {
        RadioButton ansQ62Spet45=(RadioButton) findViewById(R.id.q6ans2Sept45);
        boolean isAnsQ62Sept42=ansQ62Spet45.isChecked();

        if (isAnsQ62Sept42){
            okAnswer+=1;
        }
    }

    private void ansQ7() {
        RadioButton ansQ7Paris=(RadioButton) findViewById(R.id.q7AnsParis);
        boolean isAnsQ7OParis=ansQ7Paris.isChecked();

        if (isAnsQ7OParis){
            okAnswer+=1;
        }
    }

    private void ansQ8(){
        RadioButton ansQ821196km=(RadioButton) findViewById(R.id.q8ans21196km);
        boolean isAnsQ821196km=ansQ821196km.isChecked();

        if(isAnsQ821196km){
            okAnswer+=1;
        }
    }

    private void ansQ9(){
        RadioButton ansQ9Seven=(RadioButton) findViewById(R.id.q97);
        boolean isAnsQ9Seven=ansQ9Seven.isChecked();

        if (isAnsQ9Seven){
            okAnswer +=1;
        }
    }

    private void ansQ10(){
        RadioButton ansQ10PhilipineSea=(RadioButton) findViewById(R.id.q10AnsPhilipineSea);
        boolean isAnsQ10PhilipineSea=ansQ10PhilipineSea.isChecked();

        if (isAnsQ10PhilipineSea){
            okAnswer+=1;
        }
    }

    private void allQuestions(){
        ansQ1();
        ansQ2();
        ansQ3();
        ansQ4();
        ansQ6();
        finalAnswerQ5();
        ansQ7();
        ansQ8();
        ansQ9();
        ansQ10();
    }

    private void resetCounterOKanswers() {okAnswer=0;}

    final View.OnClickListener submitButtonOnClickListener=new View.OnClickListener() {
        @Override
        public void onClick(final View v) {
            allQuestions();
            Toast.makeText(MainActivity.this,"Correct Answers:" + okAnswer + "/10", Toast.LENGTH_LONG).show();
            resetCounterOKanswers();

         //   if (!TextUtils.isEmpty(answerQ5()) && answerQ5().equalsIgnoreCase(answerQ5())){
           //     Toast.makeText(MainActivity.this, "please enter something in text box", Toast.LENGTH_LONG).show();
            //}


            //final String ansQuestionfive_two= answerQ5().getBytes().toString();
            //final int a=Integer.parseInt(ansQuestionfive_two);

            //if (answerQ5().equals(null) || answerQ5().toString().equals(""))
            //{
               // Toast.makeText(MainActivity.this, "please enter something in the text!", Toast.LENGTH_SHORT).show();
             //}

        }

    };

}
