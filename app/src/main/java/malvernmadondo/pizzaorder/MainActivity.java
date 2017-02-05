package malvernmadondo.pizzaorder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //declaring variables
    RadioButton rbSmall, rbMedium, rbLarge;
    CheckBox cbCheese, cbDelivery;
    TextView tvTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize variables
        tvTotal = (TextView) findViewById(R.id.textViewTotal);
        cbCheese = (CheckBox) findViewById(R.id.chkBxCheese);
        cbDelivery = (CheckBox) findViewById(R.id.chkBxDelivery);
    }
    public void onClickButtonCalc(View view) {
      Double totalPrice = 0.00;

        if(rbSmall.isChecked()){
            totalPrice = totalPrice + 7.00;
        }
        else if(rbMedium.isChecked()){
            totalPrice = totalPrice + 9.00;
        }
        else if(rbLarge.isChecked()){
            totalPrice = totalPrice + 13.00;
        }

        //Extras
        if(cbCheese.isChecked()){
            totalPrice = totalPrice + 1.75;
        }
        if(cbDelivery.isChecked()){
            totalPrice = totalPrice + 2.50;
        }
       tvTotal.setText(String.format("Total is $%.2f", totalPrice));
    }

}
