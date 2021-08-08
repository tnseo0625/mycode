package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    boolean isFirstInput = true;
    double shownumber = 0;
    String save = "+";
    ActivityMainBinding activitymainbinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activitymainbinding = activitymainbinding.inflate(getLayoutInflater());
        setContentView(activitymainbinding.getRoot());
    }
    public void num0Click (View view){
        if(isFirstInput)
        {
            activitymainbinding.inputValue.setText("0");
            activitymainbinding.showValue.setText("0");
            isFirstInput = false;
        }
        else
        {
            activitymainbinding.inputValue.append("0");
            activitymainbinding.showValue.append("0");
        }
    }
    public void num1Click (View view){
        if(isFirstInput)
        {
            activitymainbinding.inputValue.setText("1");
            activitymainbinding.showValue.setText("1");
            isFirstInput = false;
        }
        else
        {
            activitymainbinding.inputValue.append("1");
            activitymainbinding.showValue.append("1");
        }
    }
    public void num2Click (View view){
        if(isFirstInput)
        {
            activitymainbinding.inputValue.setText("2");
            activitymainbinding.showValue.setText("2");
            isFirstInput = false;
        }
        else
        {
            activitymainbinding.inputValue.append("2");
            activitymainbinding.showValue.append("2");
        }
    }
    public void num3Click (View view){
        if(isFirstInput)
        {
            activitymainbinding.inputValue.setText("3");
            activitymainbinding.showValue.setText("3");
            isFirstInput = false;
        }
        else
        {
            activitymainbinding.inputValue.append("3");
            activitymainbinding.showValue.append("3");
        }
    }
    public void num4Click (View view){
        if(isFirstInput)
        {
            activitymainbinding.inputValue.setText("4");
            activitymainbinding.showValue.setText("4");
            isFirstInput = false;
        }
        else
        {
            activitymainbinding.inputValue.append("4");
            activitymainbinding.showValue.append("4");
        }
    }
    public void num5Click (View view){
        if(isFirstInput)
        {
            activitymainbinding.inputValue.setText("5");
            activitymainbinding.showValue.setText("5");
            isFirstInput = false;
        }
        else
        {
            activitymainbinding.inputValue.append("5");
            activitymainbinding.showValue.append("5");
        }
    }
    public void num6Click (View view){
        if(isFirstInput)
        {
            activitymainbinding.inputValue.setText("6");
            activitymainbinding.showValue.setText("6");
            isFirstInput = false;
        }
        else
        {
            activitymainbinding.inputValue.append("6");
            activitymainbinding.showValue.append("6");
        }
    }
    public void num7Click (View view){
        if(isFirstInput)
        {
            activitymainbinding.inputValue.setText("7");
            activitymainbinding.showValue.setText("7");
            isFirstInput = false;
        }
        else
        {
            activitymainbinding.inputValue.append("7");
            activitymainbinding.showValue.append("7");
        }
    }
    public void num8Click (View view){
        if(isFirstInput)
        {
            activitymainbinding.inputValue.setText("8");
            activitymainbinding.showValue.setText("8");
            isFirstInput = false;
        }
        else
        {
            activitymainbinding.inputValue.append("8");
            activitymainbinding.showValue.append("8");
        }
    }
    public void num9Click (View view){
        if(isFirstInput)
        {
            activitymainbinding.inputValue.setText("9");
            activitymainbinding.showValue.setText("9");
            isFirstInput = false;
        }
        else
        {
            activitymainbinding.inputValue.append("9");
            activitymainbinding.showValue.append("9");
        }
    }

    public void saveClick (View view){
        double inputnumber = Double.parseDouble(activitymainbinding.showValue.getText().toString());
        if(save.equals("+")){
            shownumber = shownumber + inputnumber;
        }
        else if(save.equals("-")){
            shownumber = shownumber - inputnumber;
        }
        else if(save.equals("×")){
            shownumber = shownumber * inputnumber;
        }
        else if(save.equals("÷")){
            shownumber = shownumber / inputnumber;
        }

        activitymainbinding.showValue.setText(String.valueOf(shownumber));
        isFirstInput = true;
        save = view.getTag().toString();
    }

    public void clearClick (View view){
        activitymainbinding.inputValue.setText("0");
        activitymainbinding.showValue.setText("0");
        shownumber = 0;
        save = "+";
        isFirstInput = true;
    }

    public void equalsbottonClick (View view){
        double inputnumber = Double.parseDouble(activitymainbinding.showValue.getText().toString());
        if(save.equals("+")){
            shownumber = shownumber + inputnumber;
        }
        else if(save.equals("-")){
            shownumber = shownumber - inputnumber;
        }
        else if(save.equals("×")){
            shownumber = shownumber * inputnumber;
        }
        else if(save.equals("÷")){
            shownumber = shownumber / inputnumber;
        }

        activitymainbinding.showValue.setText(String.valueOf(shownumber));
        isFirstInput = true;
        save = view.getTag().toString();
    }
}