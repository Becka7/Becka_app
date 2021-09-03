package com.moringaschool.beccafirst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    public static final String TAG = MainActivity.class.getSimpleName();

    @BindView(R.id.findRestaurantsButton) Button mFindRestaurantsButton;
    @BindView(R.id.locationEditText) EditText mLocationEditText;
    @BindView(R.id.restaurantTextview) TextView mRestaurantTextview;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        mFindRestaurantsButton.setOnClickListener(this);

    }
            @Override
            public void onClick(View view) {
                String location = mLocationEditText.getText().toString();
                Log.d(TAG, location);
                Intent intent = new Intent(MainActivity.this, RestaurantActivity.class);
                intent.putExtra("location", location);
                startActivity(intent);






    }



//
//        mFindRestaurantsButton = (Button) findViewById(R.id.findRestaurantsButton);
//        mOderFoodButton = (Button) findViewById(R.id.orderFoodButton);
//        mCheckoutRestaurantButton = (Button) findViewById(R.id.checkoutRestaurantButton);
//
//        mFindRestaurantsButton.setOnClickListener(this);
//        mOderFoodButton.setOnClickListener(this);
//        mCheckoutRestaurantButton.setOnClickListener(this);
//    }
//
//        @Override
//        public void onClick(View view) {
//            switch(view.getId()){
//                case R.id.findRestaurantsButton:
//                    Toast.makeText(this,"clickme",Toast.LENGTH_SHORT).show();
//                    break;
//                case R.id.orderFoodButton:
//                    Toast.makeText(this,"me clicked",Toast.LENGTH_SHORT).show();
//                    break;
//
//        }

















}
