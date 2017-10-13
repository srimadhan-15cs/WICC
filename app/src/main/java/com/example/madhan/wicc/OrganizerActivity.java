package com.example.madhan.wicc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class OrganizerActivity extends AppCompatActivity {

    ListView listView;
    Integer[] imgId = {
            R.raw.vij,
            R.raw.lak,
            R.raw.naren,
            R.raw.sun,
            R.raw.snrcoo,
            R.raw.snrcbo
    };
    String[] name = {
            "Shri. R.Vijayakumhar",
            "Shri. D. Lakshminarayanaswamy",
            "Thiru. S. Narendran",
            "Thiru. R.Sundar",
            "SHRI. V. RAMAKRISHNA",
            "MS. SWATHI ROHIT"
    };
    String[] desc = {
            "Managing Trustee \n" + "SNR Sons Charitable Trust, Coimbatore, INDIA",
            "Joint-Managing Trustee\n" + "SNR Sons Charitable Trust, Coimbatore, INDIA",
            "Trustee SNR Sons Charitable Trust, Coimbatore, INDIA",
            "Trustee SNR Sons Charitable Trust, Coimbatore, INDIA",
            "Chief Operating Officer\n" + "SNR Sons Charitable Trust, Coimbatore, INDIA",
            "Chief Business Officer\n" + "SNR Sons Charitable Trust, Coimbatore, INDIA"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organizer);

        listView = (ListView) findViewById(R.id.organizerList);
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
