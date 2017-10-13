package com.example.madhan.wicc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class CoGeneralChairActivity extends AppCompatActivity {

    ListView listView;
    Integer[] imgId = {
            R.raw.aja,
            R.raw.gov,
            R.raw.vichu,
            R.raw.nair,
            R.raw.ian
    };
    String[] name = {
            "PROF. DR. PRADEEP K. ATREY",
            "PROF. DR. VISVASURESH (VICTOR) GOVINDASWAMY",
            "PROF. DR.K.VISWANATHANIYER",
            "PROF. PRASHANT R.NAIR",
            "PROF. CHUN-I FAN"
    };
    String[] desc = {
            "Director, \n" + "Department of Computer Science College of Engineering and Applied Sciences \n" + "University at Albany, State University of New York, USA",
            "Director, \n" + "Computer Programs, Concordia University, \n" + "Chicago, USA",
            "Professor,\n" + "Computer Science and Engineering \n" + "National Institute of Technology,Tiruchirapalli, INDIA",
            "Professor, \n" + "Amrita VishwaVidyapeetham (University), \n" + "Tamil Nadu, INDIA",
            "Professor, \n" + "Department of Computer Science and Engineering, \n" + "National Sun Yat-sen University, Kaohsiung, Taiwan"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_co_general_chair);

        listView = (ListView) findViewById(R.id.cogeneralList);
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
