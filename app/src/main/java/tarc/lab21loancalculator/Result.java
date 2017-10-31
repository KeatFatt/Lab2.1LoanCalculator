package tarc.lab21loancalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    private TextView viewmonthlyRepayment,viewStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        String status = intent.getStringExtra(MainActivity);
        double payment = intent.getDoubleExtra(MainActivity , defaultvalue);

        viewmonthlyRepayment.setText(getString(R.string.repayment)+ " "+payment);
    }


}
