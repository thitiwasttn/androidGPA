package com.example.pee.fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().hide();
//        button = (Button)findViewById(R.id.button);
//        button1();

        setF3();
    }
//    private void button1()
//    {
//        setF3();
//        button.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View view)
//            {
//
//                if(count==1)
//                {
//                    setF1();
//                    count = 2;
//                }else if(count==2)
//                {
//                    setF2();
//                    count = 3;
//                }else if(count==3)
//                {
//                    setF3();
//                    count=1;
//                }
//
//            }
//        });
//    }
    private void setF3()
    {
        BlankFragment4 blankFragment4 =  new BlankFragment4();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.liner1,blankFragment4);
        fragmentTransaction.commit();
    }

}
