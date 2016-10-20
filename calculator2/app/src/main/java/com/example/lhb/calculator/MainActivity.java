package com.example.lhb.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.view.View.OnClickListener;
import java.util.Scanner;


public class MainActivity extends AppCompatActivity {

    //获取监听对象
    private TextView res;
    private Button button0;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private Button spot;
    private Button equal;
    private Button clean;
    private Button back;
    private Button tentotwo;
    private Button twototen;
    private Button tentoeig;
    private Button eigtoten;
    String num1 = "";
    String num2 = "";
    double num3 = 0;
    String rezult = "";
    String sign = null;
    int mark = 0;
    boolean flag = true;
    boolean dotmark = true;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //找出对象

        button0 = (Button)findViewById(R.id.button0);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);
        add = (Button)findViewById(R.id.add);
        sub = (Button)findViewById(R.id.sub);
        mul = (Button)findViewById(R.id.mul);
        div = (Button)findViewById(R.id.div);
        spot =(Button)findViewById(R.id.spot);
        equal = (Button)findViewById(R.id.equal);
        clean =(Button)findViewById(R.id.clean);
        back =(Button)findViewById(R.id.back);
        res = (TextView)findViewById(R.id.res);
        tentotwo = (Button)findViewById(R.id.tentotwo);
        twototen = (Button)findViewById(R.id.twototen);
        tentoeig = (Button)findViewById(R.id.tentoeig);
        eigtoten = (Button)findViewById(R.id.eigtoten);

        button0.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                if(mark == 0){
                    num1 = num1 + "0";
                    res.setText(num1);
                }
                else if (mark == 1) {
                    num2 = num2 + "0";
                    res.setText(num1 + sign + num2);
                }
                else {
                    num1 = String.valueOf(num3);
                    num2 = num2 + "0";
                    res.setText(num1 + sign + num2);
                }

            }
        });
        button1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (mark == 0) {
                    num1 = num1 + "1";
                    res.setText(num1);
                } else if (mark == 1) {
                    num2 = num2 + "1";
                    res.setText(num1 + sign + num2);
                } else {
                    num1 = String.valueOf(num3);
                    num2 = num2 + "1";
                    res.setText(num1 + sign + num2);
                }
            }
        });
        button2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (mark == 0) {
                    num1 = num1 + "2";
                    res.setText(num1);
                } else if (mark == 1) {
                    num2 = num2 + "2";
                    res.setText(num1 + sign + num2);
                } else {
                    num1 = String.valueOf(num3);
                    num2 = num2 + "2";
                    res.setText(num1 + sign + num2);
                }
            }
        });
        button3.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (mark == 0) {
                    num1 = num1 + "3";
                    res.setText(num1);
                } else if (mark == 1) {
                    num2 = num2 + "3";
                    res.setText(num1 + sign + num2);
                } else {
                    num1 = String.valueOf(num3);
                    num2 = num2 + "3";
                    res.setText(num1 + sign + num2);
                }
            }
        });
        button4.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (mark == 0) {
                    num1 = num1 + "4";
                    res.setText(num1);
                } else if (mark == 1) {
                    num2 = num2 + "4";
                    res.setText(num1 + sign + num2);
                } else {
                    num1 = String.valueOf(num3);
                    num2 = num2 + "4";
                    res.setText(num1 + sign + num2);
                }
            }
        });
        button5.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (mark == 0) {
                    num1 = num1 + "5";
                    res.setText(num1);
                } else if (mark == 1) {
                    num2 = num2 + "5";
                    res.setText(num1 + sign + num2);
                } else {
                    num1 = String.valueOf(num3);
                    num2 = num2 + "5";
                    res.setText(num1 + sign + num2);
                }
            }
        });
        button6.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (mark == 0) {
                    num1 = num1 + "6";
                    res.setText(num1);
                } else if (mark == 1) {
                    num2 = num2 + "6";
                    res.setText(num1 + sign + num2);
                } else {
                    num1 = String.valueOf(num3);
                    num2 = num2 + "6";
                    res.setText(num1 + sign + num2);
                }
            }
        });
        button7.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (mark == 0) {
                    num1 = num1 + "7";
                    res.setText(num1);
                } else if (mark == 1) {
                    num2 = num2 + "7";
                    res.setText(num1 + sign + num2);
                } else {
                    num1 = String.valueOf(num3);
                    num2 = num2 + "7";
                    res.setText(num1 + sign + num2);
                }
            }
        });
        button8.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (mark == 0) {
                    num1 = num1 + "8";
                    res.setText(num1);
                } else if (mark == 1) {
                    num2 = num2 + "8";
                    res.setText(num1 + sign + num2);
                } else {
                    num1 = String.valueOf(num3);
                    num2 = num2 + "8";
                    res.setText(num1 + sign + num2);
                }
            }
        });
        button9.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (mark == 0) {
                    num1 = num1 + "9";
                    res.setText(num1);
                } else if (mark == 1) {
                    num2 = num2 + "9";
                    res.setText(num1 + sign + num2);
                } else {
                    num1 = String.valueOf(num3);
                    num2 = num2 + "9";
                    res.setText(num1 + sign + num2);
                }
            }
        });

        //加减乘除运算
        add.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (flag) {
                    sign = "+";
                    mark++;
                    flag = false;
                    dotmark = true;
                }
            }
        });
        sub.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (flag) {
                    sign = "-";
                    mark++;
                    flag = false;
                    dotmark = true;
                }
            }
        });
        mul.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (flag) {
                    sign = "*";
                    mark++;
                    flag = false;
                    dotmark = true;
                }
            }
        });
        div.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (flag) {
                    sign = "÷";
                    mark++;
                    flag = false;
                    dotmark = true;
                }
            }
        });

        spot.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (dotmark) {
                    if (mark == 0) {
                        num1 = num1 + ".";
                        res.setText(num1);
                    } else if (mark == 1) {
                        num2 = num2 + ".";
                        res.setText(num1 + sign + num2);
                    } else {
                        num1 = String.valueOf(num3);
                        num2 = num2 + ".";
                        res.setText(num1 + sign + num2);
                    }
                    dotmark = false;
                }
            }
        });


        //等于运算时
        equal.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                flag = true;
                dotmark = true;
                if (sign.equals("+")) {
                    double x = Double.parseDouble(num1);
                    double y = Double.parseDouble(num2);
                    num3 = x + y;
                    rezult = String.valueOf(num3);
                    res.setText(num1 + sign + num2 + "=" + rezult);
                    num2 = "";
                } else if (sign.equals("-")) {
                    double x = Double.parseDouble(num1);
                    double y = Double.parseDouble(num2);
                    num3 = x - y;
                    rezult = String.valueOf(num3);
                    res.setText(num1 + sign + num2 + "=" + rezult);
                    num2 = "";
                } else if (sign.equals("*")) {
                    double x = Double.parseDouble(num1);
                    double y = Double.parseDouble(num2);
                    num3 = x * y;
                    rezult = String.valueOf(num3);
                    res.setText(num1 + sign + num2 + "=" + rezult);
                    num2 = "";
                } else if (sign.equals("÷")) {
                    double x = Double.parseDouble(num1);
                    double y = Double.parseDouble(num2);
                    num3 = x / y;
                    rezult = String.valueOf(num3);
                    res.setText(num1 + sign + num2 + "=" + rezult);
                    num2 = "";
                }
            }
        });

        //清除按钮
        clean.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                num1 = "";
                num2 = "";
                num3 = 0;
                mark = 0;
                sign = "";
                res.setText("0");
                flag = true;
                dotmark = true;
            }
        });


        back.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                String myStr=res.getText().toString();
                try{
                    res.setText(myStr.substring(0,myStr.length()-1));
                }catch(Exception e){
                    res.setText("");
                }
            }
        });
        tentotwo.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                int n=Integer.parseInt(num1);//强制转换
                String a="";
                int i=0;
                int r;
                do{
                    if(n%2==1){
                        r=1;
                    }
                    else {
                        r=0;
                    }
                    a+=r;
                    n=n/2;
                    i++;
                }
                while(n>0);
                String p="";
                for (int j=0;j<a.length();j++) {
                    p+=a.charAt(a.length()-j-1);
                    res.setText(p);
                }
            }
        });

        twototen.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int m=Integer.parseInt(num1);//强制转换
                int i;
                int s=0;
                //String s="";


                for(i=1;m != 0;i*=2) {      //i为2的次幂
                    //if (m % 10 > 9) {
                        //res.setText("输入错误");
                   // } else {
                        s += (m % 10) * i;
                        m = m / 10;
                    //}
                    res.setText(s+"");//将整形数字转换成为字符串输出
                }

                }
        });

        tentoeig.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int n=Integer.parseInt(num1);//强制转换
                int i=0;
                String a="";
                do{
                    a+=n%8;
                    n=n/8;
                    i++;
                } while(n>0);
                String p="";
                for (int j = 0;j<a.length(); j++) {
                    p+=a.charAt(a.length()-j-1);
                }
                res.setText(p);
            }
        });
        eigtoten.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int m=Integer.parseInt(num1);//强制转换
                int i;
                int s=0;
                //String s="";
                for(i=1;m != 0;i*=8) {
                    if (m % 10 > 7) {
                        res.setText("输入错误");
                    } else {
                        s += (m % 10) * i;
                        m = m / 10;
                    }
                    res.setText(s+"");//将整形数字转换成为字符串输出
                }
            }
        });


    }
}
