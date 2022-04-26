package com.example.web;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import de.hdodenhof.circleimageview.CircleImageView;

public class icon extends AppCompatActivity {

    private CircleImageView redbuss_btn,mytrip_btn,yatra_btn,goibibo_btn;
    String Intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icon);
        binding();

        redbuss_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(icon.this,web.class);
                Intent intent1 = intent.putExtra("link","https://m-redbus-in.cdn.ampproject.org/v/s/m.redbus.in/amp/bus-tickets?amp_gsa=1&amp_js_v=a9&usqp=mq331AQKKAFQArABIIACAw%3D%3D#amp_tf=From%20%251%24s&aoh=16492132409159&referrer=https%3A%2F%2Fwww.google.com&ampshare=https%3A%2F%2Fwww.redbus.in%2Fbus-tickets");
                startActivity(intent);
            }
        });

        mytrip_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(icon.this,web.class);
                Intent intent1 = intent.putExtra("link","https://www.makemytrip.com/flights/?cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Variants|Brand-Variants-Exact|RSA|Regular|V2|274470846615&s_kwcid=AL!1631!3!274470846615!e!!g!!make%20my%20trip-&ef_id=Cj0KCQjwl7qSBhD-ARIsACvV1X0KT6b_J9NSodC_Kyj60HnotQCtSrDSwdQVmDf1wztQeQIiWkOs7ggaAoPQEALw_wcB:G:s&gclid=Cj0KCQjwl7qSBhD-ARIsACvV1X0KT6b_J9NSodC_Kyj60HnotQCtSrDSwdQVmDf1wztQeQIiWkOs7ggaAoPQEALw_wcB ");
                startActivity(intent);
            }
        });

        yatra_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(icon.this,web.class);
                Intent intent1 = intent.putExtra("link","https://www.yatra.com/bus-booking ");
                startActivity(intent);
            }
        });

        goibibo_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(icon.this,web.class);
                Intent intent1 = intent.putExtra("link","https://www.goibibo.com/");
                startActivity(intent);
            }
        });


    }
     void binding()
     {
         redbuss_btn = findViewById(R.id.redbuss_btn);
         mytrip_btn = findViewById(R.id.mytrip_btn);
         yatra_btn = findViewById(R.id.yatra_btn);
         goibibo_btn = findViewById(R.id.goibibo_btn);
     }

    @Override
    public void onBackPressed() {


    }


}