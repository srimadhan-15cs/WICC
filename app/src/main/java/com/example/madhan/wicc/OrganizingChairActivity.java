package com.example.madhan.wicc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class OrganizingChairActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organizing_chair);

        ListView listView3;

        Integer[] imgId3 = {
                R.raw.hod
        };
        final String[] name3 = {
                "Dr.K.R.Jothi, M.E., Ph.D"
        };
        String[] desc3 = {
                "Professor & Head \n" + "Department of Computer Science and Engineering, \n" + "Sri Ramakrishna Institute of Technology, Coimbatore, INDIA"
        };
        listView3 = (ListView) findViewById(R.id.organizingchair);
        ListLayoutWithImage adapter3 = new ListLayoutWithImage(this, name3, desc3, imgId3);
        listView3.setAdapter(adapter3);
        listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item= name3[position];
                Toast toast = Toast.makeText(getApplicationContext(), item, Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
