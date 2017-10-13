package com.example.madhan.wicc;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class OrganisationActivity extends AppCompatActivity {

    ListView listView;
    Integer[] imgId = {
            R.raw.service_1,
            R.raw.service_2,
            R.raw.service_3,
            R.raw.service_4
    };
    String[] name = {
            "SNR Sons Charitable Trust",
            "Sri Ramakrishna Institute of Technology",
            "Department of Computer Science and Engineering",
            "Coimbatore"
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
        setContentView(R.layout.activity_organisation);


        listView = (ListView) findViewById(R.id.organisationList);

        ListLayoutWithImageAndName adapter = new ListLayoutWithImageAndName(this, name, imgId);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String url = urls[position];
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}
