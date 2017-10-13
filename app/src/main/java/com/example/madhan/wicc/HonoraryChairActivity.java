package com.example.madhan.wicc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class HonoraryChairActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ListView listView1;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_honorary_chair);

        Integer[] imgId1 = {
                R.raw.eben
        };
        final String[] name1 = {
                "DR.A. EBENEZER JEYAKUMAR, M.E., Ph.D."
        };
        String[] desc1 = {
                "Professor & Director- Academics, \n" + "SNR Sons Charitable Trust, \n" + "Coimbatore, INDIA"
        };
        listView1 = (ListView) findViewById(R.id.honorarychair);
        ListLayoutWithImage adapter1 = new ListLayoutWithImage(this, name1, desc1, imgId1);
        listView1.setAdapter(adapter1);
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item= name1[position];
                Toast toast = Toast.makeText(getApplicationContext(), item, Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
