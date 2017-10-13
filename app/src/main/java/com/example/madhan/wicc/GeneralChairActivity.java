package com.example.madhan.wicc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class GeneralChairActivity extends AppCompatActivity {
    ListView listView;
    Integer[] imgId = {
            R.raw.vp,
            R.raw.sahni3,
            R.raw.saa,
            R.raw.tim,
            R.raw.ajay
    };
    String[] name = {
            "PROF. VINCENZO PIURI",
            "PROF. SARTAJ SAHNI",
            "PROF. DR. ENG. SATTAR B. SADKHAN AL MALIKY",
            "PROF. TIMOTHY A. GONSALVES",
            "PROF. AJAY GUPTA"
    };
    String[] desc = {
            "Professor,\n" + "Dipartimento di Informatica \n" + "University of Milan, ITALY",
            "Distinguished Professor, \n" + "Department of Computer & Information Science & Engineering \n" + "University of Florida, USA",
            "Professor,\n" + "Digital Wireless Communication and Information security \n" + "IT College- University of Babylon- IRAQ",
            "Director, \n" + "Indian Institute of Technology Mandi, \n" + "Himachal Pradesh, INDIA",
            "Professor of Computer Science and Graduate Program Director \n" + "Wireless Sensornets Laboratory Western \n" + "Michigan University, USA"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_chair);

        listView = (ListView) findViewById(R.id.generalList);
        ListLayoutWithImage adapter = new ListLayoutWithImage(this, name, desc, imgId);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item= name[position];
                Toast toast = Toast.makeText(getApplicationContext(), item, Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
