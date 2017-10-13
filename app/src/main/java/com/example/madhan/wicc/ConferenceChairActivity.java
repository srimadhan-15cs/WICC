package com.example.madhan.wicc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class ConferenceChairActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conference_chair);

        ListView listView2;
        Integer[] imgId2 = {
                R.raw.prin
        };
        final String[] name2 = {
                "Dr.M.Paulraj, M.E., Ph.D."
        };
        String[] desc2 = {
                "Principal \n" + "Sri Ramakrishna Institute of Technology, \n" + "Coimbatore, INDIA"
        };
        listView2 = (ListView) findViewById(R.id.conferencechair);
        ListLayoutWithImage adapter2 = new ListLayoutWithImage(this, name2, desc2, imgId2);
        listView2.setAdapter(adapter2);
        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item= name2[position];
                Toast toast = Toast.makeText(getApplicationContext(), item, Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
