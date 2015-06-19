package com.example.prayas.basic;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;


public class MainActivity extends ActionBarActivity   implements OnClickListener{
    public int sum=0 ;
    public Button add ,sub ;

    public TextView total ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add=(Button)findViewById(R.id.add);
        sub=(Button)findViewById(R.id.sub) ;
        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        total=(TextView)findViewById(R.id.total) ;


    }


    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.add :
                sum++ ;
                total.setText("Total:"+Integer.toString(sum)) ;
                break ;
            case R.id.sub :
                sum-- ;
                total.setText("Total:"+Integer.toString(sum)) ;
                break ;

        }
    }
}
