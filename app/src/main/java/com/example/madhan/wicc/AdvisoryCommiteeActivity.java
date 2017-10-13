package com.example.madhan.wicc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class AdvisoryCommiteeActivity extends AppCompatActivity {

    private String[] name = {
            "Prof. Vincenzo Piuri",
            "Prof. Andrea Asperti",
            "Prof. Arun Somani",
            "Prof. Wan Khairunizam Wan Ahmad",
            "Prof. Vijay K. Vaishnavi",
            "Prof. Ramachandran (Venky) Venkatesan",
            "Prof. Cristian Rodriguez Rivero",
            "Prof. Sartaj Sahni",
            "Prof. Hussein Abbass",
            "Prof. Jerry Luftman",
            "Prof. Rajendra Prasath",
            "Prof. Dr. Ganesan",
            "Prof. Dr. B V Babu",
            "Prof. Dr. Prashant R.Nair",
            "Prof. Dr. Anirban Basu",
            "Prof. Pabitra Pal Choudhury",
            "Prof. Niladri Chatterjee",
            "Prof. BhabatoshChanda",
            "Prof. Dr.Venkatadri M",
            "Prof. Dr. Jimson Mathew",
            "Prof. Dr. C Rama Krishna",
            "Prof. Dr.S.Arumugam",
            "Prof. N.Nagarajan",
            "Prof. Dr. S. Karthik",
            "Prof. Dr.S.J.K.Jagadeesh Kumar",
            "Prof. Dr. Umapada Pal",
            "Prof. A. H. Mir",
            "Prof. Dr.AkhileshSwarup",
            "Prof. G. Hemantha Kumar",
            "Prof. Dr. UjjwalMaulik",
            "Prof. Dr.K. ViswanathanIyer",
            "Prof. Dr.T G Basavaraju",
            "Prof. Dr. A. K. Misra, Professor",
            "Prof. Timothy A. Gonsalves",
            "Prof. Prasad Reddy P.V.G.D"
    };

    private String[] desc = {
            "Professor, University of Milan, ITALY",
            "Professor, Dipartimento di Informatica - Scienza e Ingegneria, Bologna, ITALY",
            "Distinguished Professor, College of Engineering, Lowa State University, USA",
            "Associate Professor, School of Mechatronics, University of Malaysia Perlis, MALAYSIA",
            "Professor Emeritus, Department of Computer Information Systems, Georgia State Universit, USA",
            "Professor, Faculty of Engineering and Applied Science, Memorial University of Newfoundland, CANADA",
            "Professor, University of California, USA",
            "Distinguished Professor, University of Florida, USA",
            "Professor, University of New South Wales, Sydney, AUSTRALIA",
            "Professor, Founder, & Managing Director Global Institute for IT Management, USA",
            "National University of Ireland, University College Cork, Cork, IRELAND",
            "Professor Oakland University, Rochester, USA",
            "Former Vice Chancellor-Graphic Era University & Galgotias University, INDIA",
            "Professor, Amrita Vishwa Vidyapeetham (University), Tamil Nadu, INDIA",
            "Professor, APS College of Engineering, Bangalore, INDIA",
            "Professor, Indian Statistical Institute, Kolkata, INDIA",
            "Professor, Indian Institute of Technology, New Delhi, INDIA",
            "Indian Statistical Institute, Kolkata, INDIA",
            "Professor, University of Petroleum and Energy Studies, Dehradun, INDIA",
            "Associate Professor, IIT Patna, INDIA",
            "Professor, NITTTR (Ministry of HRD, Govt. of India), Chandigarh, INDIA",
            "Professor and Chief Executive Officer, Nandha Engineering College, Tamil Nadu, INDIA.",
            "Principal, Coimbatore Institute of Engineering and Technology, Coimbatore, Tamil Nadu, INDIA.",
            "Professor & Dean, SNS College of Technology, Tamil Nadu, INDIA",
            "Dean Academics & Research, Sri Krishna College of Technology, Coimbatore, Tamil Nadu, INDIA",
            "Professor, Indian Statistical Institute, Kolkata, INDIA",
            "Dean, National Institute of Technology, Kashmir, INDIA",
            "National Institute of Technology, Haryana, INDIA",
            "Chairman, University of Mysore, Mysore, INDIA",
            "Professor and Head, Jadavpur University, Kolkata, INDIA",
            "Professor, National Institute of Technology-Tiruchirapalli, INDIA",
            "Professor and Head, Government SKSJ Technological Institute, Karnataka, INDIA",
            "MNNIT Allahabad, INDIA",
            "Director, Indian Institute of Technology Mandi, Himachal Pradesh, INDIA",
            "Professor, Department of Computer Science & Systems Engineering, College Of Engineering Andhra University, Visakhapatnam, INDIA"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advisory_commitee);

        ListView listView = (ListView) findViewById(R.id.advisoryCommitee);


        ListLayoutWithoutImage adapter = new ListLayoutWithoutImage(this, name, desc);
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
