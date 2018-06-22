package ir.faranesh.mehdiandroid;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class calc extends Activity implements View.OnClickListener {

    EditText num1,num2;
    Button sum,sub,Mul,Div;
    TextView result;

    double firstNum,secondNum,Sum=0;

;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calc);

        init();
        sum.setOnClickListener(this);
        sub.setOnClickListener(this);
        Mul.setOnClickListener(this);
        Div.setOnClickListener(this);

    }

     public void init(){
        num1 =(EditText) findViewById(R.id.Edfirsnum);
        num2 =(EditText) findViewById(R.id.EdSecondnum);
        sum =(Button)findViewById(R.id.bsum);
        sub =(Button)findViewById(R.id.bsub);
        Mul =(Button)findViewById(R.id.bMul);
        Div =(Button)findViewById(R.id.bDiv);
        result =(TextView) findViewById(R.id.tvResult);


     }

    @Override
    public void onClick(View v) {

        switch (v.getId()){


            case R.id.bsum:
                String Snum1 = num1.getText().toString();

                firstNum=Double.parseDouble(Snum1);

                String Snum2 = num2.getText().toString();

                secondNum=Double.parseDouble(Snum2);

                Sum = firstNum + secondNum;

                result.setText(String.valueOf(Sum));
                break;

            case R.id.bsub:

                 Snum1 = num1.getText().toString();

                firstNum=Double.parseDouble(Snum1);

                 Snum2 = num2.getText().toString();

                secondNum=Double.parseDouble(Snum2);

                Sum = firstNum - secondNum;

                result.setText(String.valueOf(Sum));
                break;

            case R.id.bMul:
                 Snum1 = num1.getText().toString();

                firstNum=Double.parseDouble(Snum1);

                 Snum2 = num2.getText().toString();

                secondNum=Double.parseDouble(Snum2);

                Sum = firstNum * secondNum;

                result.setText(String.valueOf(Sum));
                break;

            case  R.id.bDiv:
                 Snum1 = num1.getText().toString();

                firstNum=Double.parseDouble(Snum1);

                 Snum2 = num2.getText().toString();

                secondNum=Double.parseDouble(Snum2);

                Sum = firstNum / secondNum;

                result.setText(String.valueOf(Sum));
                break;
        }

    }
}
