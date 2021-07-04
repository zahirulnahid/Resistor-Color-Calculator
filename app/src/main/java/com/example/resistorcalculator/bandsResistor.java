package com.example.resistorcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class bandsResistor extends AppCompatActivity implements View.OnClickListener {
    private Button blackbtn1, blackbtn2, blackbtn3, blackbtn4, brownbtn1, brownbtn2, brownbtn3, brownbtn4, brownbtn5, brownbtn6, redbtn1, redbtn2, redbtn3, redbtn4, redbtn5, redbtn6, orangebtn1, orangebtn2, orangebtn3, orangebtn4, orangebtn6, yellowbtn1, yellowbtn2, yellowbtn3, yellowbtn4, yellowbtn6, greenbtn1, greenbtn2, greenbtn3, greenbtn4, greenbtn5, bluebtn1, bluebtn2, bluebtn3, bluebtn4, bluebtn5, violetbtn1, violetbtn2, violetbtn3, violetbtn4, violetbtn5, graybtn1, graybtn2, graybtn3, graybtn5, whtiebtn1, whtiebtn2, whtiebtn3, whtiebtn4, whtiebtn5;


    private Button color1, color2, color3, color4, color5, color6, key, toleranceBtn1, toleranceBtn2, toleranceBtn3, toleranceBtn4, toleranceBtn5, toleranceBtn6, toleranceBtn7, toleranceBtn8;
    private Button temperatureCoefficient1, temperatureCoefficient2, temperatureCoefficient3, temperatureCoefficient4, multiply1, multiply2;
    private int colorval1, colorval2, colorval3, colorval4, colorval5;
    private long resistorVal;
    private ImageView resistorImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bands4_resistor);
        color1 = findViewById(R.id.color1);
        color2 = findViewById(R.id.color2);
        color3 = findViewById(R.id.color3);
        color4 = findViewById(R.id.color4);
        color5 = findViewById(R.id.color5);
        color6 = findViewById(R.id.color6);
        colorval1 = 1;
        colorval2 = 0;
        colorval4 = 2;
        colorset(1, 1);
        colorset(2, 0);
        color5.setBackgroundColor(Color.TRANSPARENT);
        color6.setBackgroundColor(Color.TRANSPARENT);
        colorset(4, 2);
        colorSum();
        //Black Button Layout
        blackbtn1 = findViewById(R.id.blackbtn1);
        blackbtn2 = findViewById(R.id.blackbtn2);
        blackbtn3 = findViewById(R.id.blackbtn3);
        blackbtn4 = findViewById(R.id.blackbtn4);

        blackbtn1.setOnClickListener(this);
        blackbtn2.setOnClickListener(this);
        blackbtn3.setOnClickListener(this);
        blackbtn4.setOnClickListener(this);

        //Brown Button Layout
        brownbtn1 = findViewById(R.id.brownbtn1);
        brownbtn2 = findViewById(R.id.brownbtn2);
        brownbtn3 = findViewById(R.id.brownbtn3);
        brownbtn4 = findViewById(R.id.brownbtn4);
        brownbtn5 = findViewById(R.id.brownbtn5);
        brownbtn6 = findViewById(R.id.brownbtn6);
        toleranceBtn3 = brownbtn5;
        temperatureCoefficient1 = brownbtn6;
        brownbtn1.setOnClickListener(this);
        brownbtn2.setOnClickListener(this);
        brownbtn3.setOnClickListener(this);
        brownbtn4.setOnClickListener(this);


        //Red Button Layout
        redbtn1 = findViewById(R.id.redbtn1);
        redbtn2 = findViewById(R.id.redbtn2);
        redbtn3 = findViewById(R.id.redbtn3);
        redbtn4 = findViewById(R.id.redbtn4);
        redbtn5 = findViewById(R.id.redbtn5);
        redbtn6 = findViewById(R.id.redbtn6);
        toleranceBtn4 = redbtn5;
        temperatureCoefficient2 = redbtn6;
        redbtn1.setOnClickListener(this);
        redbtn2.setOnClickListener(this);
        redbtn3.setOnClickListener(this);
        redbtn4.setOnClickListener(this);


        //Orange Button Layout
        orangebtn1 = findViewById(R.id.orangebtn1);
        orangebtn2 = findViewById(R.id.orangebtn2);
        orangebtn3 = findViewById(R.id.orangebtn3);
        orangebtn4 = findViewById(R.id.orangebtn4);
        orangebtn6 = findViewById(R.id.orangebtn6);
        temperatureCoefficient3 = orangebtn6;
        orangebtn1.setOnClickListener(this);
        orangebtn2.setOnClickListener(this);
        orangebtn3.setOnClickListener(this);
        orangebtn4.setOnClickListener(this);

        //Yellow Button Layout
        yellowbtn1 = findViewById(R.id.yellowbtn1);
        yellowbtn2 = findViewById(R.id.yellowbtn2);
        yellowbtn3 = findViewById(R.id.yellowbtn3);
        yellowbtn4 = findViewById(R.id.yellowbtn4);
        yellowbtn6 = findViewById(R.id.yellowbtn6);
        temperatureCoefficient4 = yellowbtn6;
        yellowbtn1.setOnClickListener(this);
        yellowbtn2.setOnClickListener(this);
        yellowbtn3.setOnClickListener(this);
        yellowbtn4.setOnClickListener(this);

        //Green Button Layout
        greenbtn1 = findViewById(R.id.greenbtn1);
        greenbtn2 = findViewById(R.id.greenbtn2);
        greenbtn3 = findViewById(R.id.greenbtn3);
        greenbtn4 = findViewById(R.id.greenbtn4);
        greenbtn5 = findViewById(R.id.greenbtn5);
        toleranceBtn5 = greenbtn5;
        greenbtn1.setOnClickListener(this);
        greenbtn2.setOnClickListener(this);
        greenbtn3.setOnClickListener(this);
        greenbtn4.setOnClickListener(this);

        //blue Button Layout
        bluebtn1 = findViewById(R.id.bluebtn1);
        bluebtn2 = findViewById(R.id.bluebtn2);
        bluebtn3 = findViewById(R.id.bluebtn3);
        bluebtn4 = findViewById(R.id.bluebtn4);
        bluebtn5 = findViewById(R.id.bluebtn5);
        toleranceBtn6 = bluebtn5;
        bluebtn1.setOnClickListener(this);
        bluebtn2.setOnClickListener(this);
        bluebtn3.setOnClickListener(this);
        bluebtn4.setOnClickListener(this);

        //Violet Button Layout
        violetbtn1 = findViewById(R.id.violetbtn1);
        violetbtn2 = findViewById(R.id.violetbtn2);
        violetbtn3 = findViewById(R.id.violetbtn3);
        violetbtn4 = findViewById(R.id.violetbtn4);
        violetbtn5 = findViewById(R.id.violetbtn5);
        toleranceBtn7 = violetbtn5;
        violetbtn1.setOnClickListener(this);
        violetbtn2.setOnClickListener(this);
        violetbtn3.setOnClickListener(this);
        violetbtn4.setOnClickListener(this);

        //Gray Button Layout
        graybtn1 = findViewById(R.id.graybtn1);
        graybtn2 = findViewById(R.id.graybtn2);
        graybtn3 = findViewById(R.id.graybtn3);
        graybtn5 = findViewById(R.id.graybtn5);
        toleranceBtn8 = graybtn5;
        graybtn1.setOnClickListener(this);
        graybtn2.setOnClickListener(this);
        graybtn3.setOnClickListener(this);

        //White Button Layout
        whtiebtn1 = findViewById(R.id.whtiebtn1);
        whtiebtn2 = findViewById(R.id.whtiebtn2);
        whtiebtn3 = findViewById(R.id.whtiebtn3);


        whtiebtn1.setOnClickListener(this);
        whtiebtn2.setOnClickListener(this);
        whtiebtn3.setOnClickListener(this);

        //tolerance
        toleranceBtn1 = findViewById(R.id.tolerance1);
        toleranceBtn2 = findViewById(R.id.tolerance2);

        toleranceBtn1.setOnClickListener(this);
        toleranceBtn2.setOnClickListener(this);
        toleranceBtn3.setOnClickListener(this);
        toleranceBtn4.setOnClickListener(this);
        toleranceBtn5.setOnClickListener(this);
        toleranceBtn6.setOnClickListener(this);
        toleranceBtn7.setOnClickListener(this);
        toleranceBtn7.setOnClickListener(this);
        toleranceBtn8.setOnClickListener(this);

        //temperatureCoefficient

        temperatureCoefficient1.setOnClickListener(this);
        temperatureCoefficient2.setOnClickListener(this);
        temperatureCoefficient3.setOnClickListener(this);
        temperatureCoefficient4.setOnClickListener(this);
        //MultiPly
        multiply1 = findViewById(R.id.multiply1);
        multiply2 = findViewById(R.id.multiply2);
        multiply1.setOnClickListener(this);
        multiply2.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        TextView result = findViewById(R.id.result);
        key = findViewById(v.getId());
        String keyline;
        switch (v.getId()) {
            //First Digit | 10 Value
            case R.id.blackbtn1:
            case R.id.brownbtn1:
            case R.id.redbtn1:
            case R.id.orangebtn1:
            case R.id.yellowbtn1:
            case R.id.greenbtn1:
            case R.id.violetbtn1:
            case R.id.graybtn1:
            case R.id.whtiebtn1:
            case R.id.bluebtn1:
                keyline = key.getText().toString();
                colorval1 = Integer.parseInt(keyline);
                colorset(1, colorval1);
                colorSum();
                if (Percentage != 0) setTolerance(percentString);
                break;
            //Second Digit | 10 Value
            case R.id.blackbtn2:
            case R.id.brownbtn2:
            case R.id.redbtn2:
            case R.id.orangebtn2:
            case R.id.yellowbtn2:
            case R.id.greenbtn2:
            case R.id.violetbtn2:
            case R.id.graybtn2:
            case R.id.whtiebtn2:
            case R.id.bluebtn2:

                keyline = key.getText().toString();
                colorval2 = Integer.parseInt(keyline);
                colorset(2, colorval2);
                colorSum();
                if (Percentage != 0) setTolerance(percentString);
                break;
            //Third Digit | 10 Value
            case R.id.blackbtn3:
            case R.id.brownbtn3:
            case R.id.redbtn3:
            case R.id.orangebtn3:
            case R.id.yellowbtn3:
            case R.id.greenbtn3:
            case R.id.violetbtn3:
            case R.id.graybtn3:
            case R.id.whtiebtn3:
            case R.id.bluebtn3:

                keyline = key.getText().toString();
                colorval3 = Integer.parseInt(keyline);
                colorset(3, colorval3);
                colorSum();
                if (Percentage != 0) setTolerance(percentString);
                break;
            //Multiply | 10
            case R.id.blackbtn4://0
            case R.id.brownbtn4://1
            case R.id.redbtn4://2
            case R.id.orangebtn4://3
            case R.id.yellowbtn4://4
            case R.id.greenbtn4://5
            case R.id.bluebtn4://6
            case R.id.violetbtn4://7
            case R.id.multiply1://-2 Silver
            case R.id.multiply2://-1 Gold
                keyline = key.getText().toString();
                colorval4 = Integer.parseInt(keyline);
                colorset(4, colorval4);
                colorSum();
                break;
            //Tolerance | 8 value
            case R.id.brownbtn5:
            case R.id.redbtn5:
            case R.id.greenbtn5:
            case R.id.bluebtn5:
            case R.id.violetbtn5:
            case R.id.graybtn5:
            case R.id.tolerance1://Silver
            case R.id.tolerance2://Gold
                keyline = key.getText().toString();
                colorset(5, keyline);
                colorSum();
                break;
            //temperatureCoefficient
            case R.id.brownbtn6:
            case R.id.redbtn6:
            case R.id.orangebtn6:
            case R.id.yellowbtn6:
                keyline = key.getText().toString();
                Toast.makeText(this, keyline, Toast.LENGTH_SHORT).show();
                colorset(6, keyline);
                colorSum();
                break;
        }
    }

    private double Percentage;

    void colorSum() {
        TextView result = findViewById(R.id.result);
        String digit;
        digit = "" + colorval1 + colorval2;
        long multiply = Integer.parseInt(digit.trim());
        multiply = (long) (multiply * Math.pow(10, colorval4));
        digit = "" + multiply;

        if (multiply > 0) {
            result.setText(formatValue(multiply) + "Ω");
            TextView result3 = findViewById(R.id.result3);
            result3.setText(digit+"Ω");
            resistorVal = multiply;
        } else result.setText("Doesn't Exist");
    }
    public String percentString;

    void setTolerance(String code) {
        percentString = code;
        TextView result2 = findViewById(R.id.result2);
        Percentage = Float.parseFloat(code.replace("%", ""));
        Percentage = Percentage * 0.01;
        result2.setText("Tolerance: " + code + " Rang:" + (resistorVal - Percentage * resistorVal) + " to " + (resistorVal + Percentage * resistorVal));
    }


    public static String formatValue(double value) {
        int power;
        String suffix = " kmbt";
        String formattedNumber = "";

        NumberFormat formatter = new DecimalFormat("#,###.#");
        power = (int) StrictMath.log10(value);
        value = value / (Math.pow(10, (power / 3) * 3));
        formattedNumber = formatter.format(value);
        formattedNumber = formattedNumber + suffix.charAt(power / 3);
        return formattedNumber.length() > 4 ? formattedNumber.replaceAll("\\.[0-9]+", "") : formattedNumber;
    }

    void colorset(int btn, String code) {

        double Percentage;
        if (btn == 5) {
            switch (code) {
                case "10%":
                    color5.setBackgroundColor(getResources().getColor(R.color.silver));//Silver
                    setTolerance(code);
                    break;
                case "5%":
                    color5.setBackgroundColor(getResources().getColor(R.color.gold));//gold
                    setTolerance(code);
                    break;
                case "1%":
                    color5.setBackgroundColor(getResources().getColor(R.color.brown));
                    setTolerance(code);
                    break;
                case "2%":
                    color5.setBackgroundColor(getResources().getColor(R.color.red));
                    setTolerance(code);
                    break;
                case "0.5%":
                    color5.setBackgroundColor(getResources().getColor(R.color.green));
                    setTolerance(code);
                    break;
                case "0.25%":
                    color5.setBackgroundColor(getResources().getColor(R.color.blue));
                    setTolerance(code);
                    break;
                case "0.1%":
                    color5.setBackgroundColor(getResources().getColor(R.color.violet));
                    setTolerance(code);
                    break;
                case "0.05%":
                    color5.setBackgroundColor(getResources().getColor(R.color.gray));
                    setTolerance(code);
                    break;
            }
        }
        if (btn == 6) {
            switch (code) {
                case "100ppm":
                    color6.setBackgroundColor(getResources().getColor(R.color.brown));//Silver
                    break;
                case "50ppm":
                    color6.setBackgroundColor(getResources().getColor(R.color.red));//gold
                    break;
                case "15ppm":
                    color6.setBackgroundColor(getResources().getColor(R.color.orange));
                    break;
                case "25ppm":
                    color6.setBackgroundColor(getResources().getColor(R.color.yellow));
                    break;
            }
        }
    }

    void colorset(int btn, int code) {
        if (btn == 1) {
            if (code == 0) color1.setBackgroundColor(Color.BLACK);//0
            if (code == 1)
                color1.setBackgroundColor(getResources().getColor(R.color.brown));//brown 1
            if (code == 2) color1.setBackgroundColor(Color.RED);//2
            if (code == 3)
                color1.setBackgroundColor(getResources().getColor(R.color.orange));//Orange 3
            if (code == 4) color1.setBackgroundColor(Color.YELLOW);//4
            if (code == 5) color1.setBackgroundColor(Color.GREEN);//5
            if (code == 6) color1.setBackgroundColor(Color.BLUE);//6
            if (code == 7)
                color1.setBackgroundColor(getResources().getColor(R.color.violet));//Violet 7
            if (code == 8) color1.setBackgroundColor(getResources().getColor(R.color.gray));//Gray 8
            if (code == 9) color1.setBackgroundColor(Color.WHITE);//9
        }
        if (btn == 2) {
            if (code == 0) color2.setBackgroundColor(Color.BLACK);//0
            if (code == 1)
                color2.setBackgroundColor(getResources().getColor(R.color.brown));//brown 1
            if (code == 2) color2.setBackgroundColor(Color.RED);//2
            if (code == 3)
                color2.setBackgroundColor(getResources().getColor(R.color.orange));//Orange 3
            if (code == 4) color2.setBackgroundColor(Color.YELLOW);//4
            if (code == 5) color2.setBackgroundColor(Color.GREEN);//5
            if (code == 6) color2.setBackgroundColor(Color.BLUE);//6
            if (code == 7)
                color2.setBackgroundColor(getResources().getColor(R.color.violet));//Violet 7
            if (code == 8) color2.setBackgroundColor(getResources().getColor(R.color.gray));//Gray 8
            if (code == 9) color2.setBackgroundColor(Color.WHITE);//9
        }
        if (btn == 3) {
            if (code == 0) color3.setBackgroundColor(Color.BLACK);//0
            if (code == 1)
                color3.setBackgroundColor(getResources().getColor(R.color.brown));//brown 1
            if (code == 2) color3.setBackgroundColor(Color.RED);//2
            if (code == 3)
                color3.setBackgroundColor(getResources().getColor(R.color.orange));//Orange 3
            if (code == 4) color3.setBackgroundColor(Color.YELLOW);//4
            if (code == 5) color3.setBackgroundColor(Color.GREEN);//5
            if (code == 6) color3.setBackgroundColor(Color.BLUE);//6
            if (code == 7)
                color3.setBackgroundColor(getResources().getColor(R.color.violet));//Violet 7
            if (code == 8) color3.setBackgroundColor(getResources().getColor(R.color.gray));//Gray 8
            if (code == 9) color3.setBackgroundColor(Color.WHITE);//9
        }
        if (btn == 4) {
            if (code == 0) color4.setBackgroundColor(Color.BLACK);//0
            if (code == 1)
                color4.setBackgroundColor(getResources().getColor(R.color.brown));//brown 1
            if (code == 2) color4.setBackgroundColor(Color.RED);//2
            if (code == 3)
                color4.setBackgroundColor(getResources().getColor(R.color.orange));//Orange 3
            if (code == 4) color4.setBackgroundColor(Color.YELLOW);//4
            if (code == 5) color4.setBackgroundColor(Color.GREEN);//5
            if (code == 6) color4.setBackgroundColor(Color.BLUE);//6
            if (code == 7)
                color4.setBackgroundColor(getResources().getColor(R.color.violet));//Violet 7
            if (code == 8) color4.setBackgroundColor(getResources().getColor(R.color.gray));//Gray 8
            if (code == 9) color4.setBackgroundColor(Color.WHITE);//9
            if (code == -2)
                color4.setBackgroundColor(getResources().getColor(R.color.silver));//Silver -2

            if (code == -1)
                color4.setBackgroundColor(getResources().getColor(R.color.gold));//Gold -1

        }


    }

}