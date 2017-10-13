package com.example.madhan.wicc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class SpeakerActivity extends AppCompatActivity {

    ListView listView;
    Integer[] imgId = {
            R.raw.an,
            R.raw.sa,
            R.raw.a123,
            R.raw.a67,
            R.raw.a45,
            R.raw.perumal,
            R.raw.naresh,
            R.raw.chitti
    };
    String[] name = {
            "Dr. PATRICIA ANTHONY",
            "Dr. RAJESH SIDDAVATAM",
            "Dr. SANJAY MISRA",
            "Dr. SUDIP MISRA",
            "Dr. NILADRI CHATTERJEE",
            "Dr. THINAGARAN PERUMAL",
            "Dr. NARESH KUMAR",
            "Dr. CHITTARANJAN PRADHAN"
    };
    String[] desc = {
            "Senior Lecturer in Software and Information Technology, \n" + "Lincoln University, NEW ZEALAND",
            "Vice Chancellor, Saveetha Amaravati University, \n" + "Vijayawada, Andhra Pradesh, INDIA",
            "Professor of Computer (Software) Engineering, \n" + "Covenant University, OTA, NIGERIA",
            "Department of Computer Science and Engineering, \n" + "Indian Institute of Technology, Kharagpur, INDIA",
            "Department of Mathematics, \n" + "Indian Institute of Technology Delhi, New Delhi, INDIA",
            "Department of Computer Science, \n" +
            "Faculty of Computer Science and Information Technology, \n" + "Universiti Putra, MALAYSIA",
            "Global Entrepreneurship Research and Innovation Centre Universiti, \n" + "Malaysia Kelantan City Campus, MALAYSIA",
            "Department of Mathematics, \n" + "Indian Institute of Technology Delhi, New Delhi, INDIA"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speaker);
        listView = (ListView) findViewById(R.id.speakerList);


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
