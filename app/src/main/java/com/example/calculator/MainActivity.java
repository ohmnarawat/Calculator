package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {

    private EditText mEdtFirst;
    private EditText mEdtSecond;
    private TextView mTxvResult;
    private Button mBtnCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initInstance();
    }

    private void initInstance() {
        mEdtFirst = findViewById(R.id.edt_first);
        mEdtSecond = findViewById(R.id.edt_second);
        mTxvResult = findViewById(R.id.txv_result);

        mBtnCalculate = findViewById(R.id.btn_calculate);
        mBtnCalculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_calculate:
                doCalculate();
                break;
            default:
                break;
        }
    }

    private void doCalculate() {
        Calculator calculator = new Calculator();
        int first = Integer.parseInt(mEdtFirst.getText().toString());
        int second = Integer.parseInt(mEdtSecond.getText().toString());
        int result = calculator.plus(first, second);
        mTxvResult.setText(String.valueOf(result));
    }

}
