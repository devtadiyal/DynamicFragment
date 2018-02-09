package com.example.devendratadiyal.dynamicfragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t,t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         t = (TextView)findViewById(R.id.rr);
        t1 = (TextView)findViewById(R.id.rrr);

        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        LoginFragment lf = new LoginFragment();
        ft.add(R.id.fragment1,lf);
        ft.commit();


        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                SignupFragment lf = new SignupFragment();
                ft.replace(R.id.fragment1,lf);
                ft.addToBackStack(null);
                ft.commit();
            }
        });

      /*  t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                LoginFragment lf = new LoginFragment();
                ft.replace(R.id.fragment1,lf);
                ft.commit();
            }
        });*/
    }
}
