package tarc.lab21loancalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editPrice, editDownPayment, editInterestRate, editRepayment, editSalary;

    public static final String LOAN_STATUS = "status";
    public static final String LOAN_REPAYMENT = "repayment";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPrice = (EditText)findViewById(R.id.editPrice);
        editDownPayment = (EditText)findViewById(R.id.editDownPayment);
        editInterestRate = (EditText)findViewById(R.id.editInterestRate);
        editRepayment= (EditText)findViewById(R.id.editRepayment);
        editSalary = (EditText)findViewById(R.id.editSalary);
    }

    public void calculateRepayment(View view){
        Intent intent = new Intent(this, Result.class);

        double repayment = 0;
        double price, downpayment, interestRate, totalinterest;
        String status;

        //TODO :calculate repayment amount
        totalinterest = (price - downpayment)

        //Passing data with intent using putExtra method
        //putExtra had two para (Tag, Value)
        intent.putExtra(LOAN_STATUS, "Approve");
        intent.putExtra(LOAN_REPAYMENT, repayment);
        startActivity(intent);
    }
}
