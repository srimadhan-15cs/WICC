package com.example.madhan.wicc;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class PartnerActivity extends AppCompatActivity {

    ListView listView;
    Integer[] imgId = {
            R.raw.ccis,
            R.raw.csi,
            R.raw.ict,
            R.raw.springer,
            R.raw.web
    };
    String[] name = {
            "Partner",
            "Technical Partner",
            "Technical Partner",
            "Publication Partner",
            "Web Partner"
    };

    String[] urls = {
            "http://www.snrsonscharitabletrust.org/",
            "http://srit.org/",
            "http://srit.org/department-of-computer-science-Engineering.html",
            "http://wicc.xyz/wicc/coimbatore.html"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partner);


        listView = (ListView) findViewById(R.id.partnersList);

        ListLayoutWithImageAndName adapter = new ListLayoutWithImageAndName(this, name, imgId);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                /*String url = urls[position];
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);*/

                String item= name[position];
                Toast toast = Toast.makeText(getApplicationContext(), item, Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
