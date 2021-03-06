package com.luseen.myapplication;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.luseen.luseenbottomnavigation.BottomNavigation.BottomNavigationItem;
import com.luseen.luseenbottomnavigation.BottomNavigation.BottomNavigationView;
import com.luseen.luseenbottomnavigation.BottomNavigation.OnBottomNavigationItemClickListener;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = (TextView) findViewById(R.id.textView);
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigation);
        if (bottomNavigationView != null){
            bottomNavigationView.isWithText(true);
            bottomNavigationView.activateTabletMode();
            bottomNavigationView.disableViewPagerSlide();
            bottomNavigationView.isColoredBackground(false);
            bottomNavigationView.setItemActiveColorWithoutColoredBackground(getResources().getColor(R.color.fourthColor));
        }
        BottomNavigationItem bottomNavigationItem = new BottomNavigationItem
                ("Record", ContextCompat.getColor(this,R.color.firstColor), R.drawable.ic_mic_black_24dp);
        BottomNavigationItem bottomNavigationItem1 = new BottomNavigationItem
                ("Like",  ContextCompat.getColor(this,R.color.secondColor), R.drawable.ic_favorite_black_24dp);
        BottomNavigationItem bottomNavigationItem2 = new BottomNavigationItem
                ("Books",  ContextCompat.getColor(this,R.color.thirdColor), R.drawable.ic_book_black_24dp);
        BottomNavigationItem bottomNavigationItem3 = new BottomNavigationItem
                ("Github",  ContextCompat.getColor(this,R.color.fourthColor),R.drawable.github_circle);


        bottomNavigationView.addTab(bottomNavigationItem);
        bottomNavigationView.addTab(bottomNavigationItem1);
        bottomNavigationView.addTab(bottomNavigationItem2);
        bottomNavigationView.addTab(bottomNavigationItem3);

        bottomNavigationView.setOnBottomNavigationItemClickListener(new OnBottomNavigationItemClickListener() {
            @Override
            public void onNavigationItemClick(int index) {
                switch (index) {
                    case 0:
                        t.setText("Record");
                        break;
                    case 1:
                        t.setText("Like");
                        break;
                    case 2:
                        t.setText("Books");
                        break;
                    case 3:
                        t.setText("Github");
                        break;
                }
            }
        });
    }
}

