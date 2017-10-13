package com.example.madhan.wicc;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class EventActivity extends AppCompatActivity {

    ListView listView;

    String[] name = {
            "Inovation in Cluster Computing",
            "Inovation in Machine Learning",
            "Innovation in Social Mobility Analytics and Cloud",
            "Innovation in Internet of Things",
            "Innovation in Artificial Intelligence",
            "Innovation in Cyber Security",
            "Innovation in Web standards",
            "Innovation in Ubiquitous computing",
            "Innovation in ICT for Education"
    };

    String[] info = {
            "Novel innovative algorithms on clusters\n\n" +
                    "Innovative application studies on large-scale clusters\n\n" +
                    "Hybrid programming techniques\n\n" +
                    "Innovative Energy-efficient cluster architectures\n\n" +
                    "Performance evaluation tools\n\n" +
                    "Architecture for converged HPC/Big Data clusters\n\n" +
                    "Programming models for converged HPC/Big Data systems\n\n" +
                    "Fault tolerance and high-availability\n\n" +
                    "Visualization clusters and tiled displays\n\n" +
                    "Cluster architectures for Big Data storage and processing\n\n" +
                    "File systems and I/O libraries\n\n" +
                    "Cluster security\n\n" +
                    "Cluster system-level protocols and APIs\n\n" +
                    "Cluster system software/operating systems\n\n" +
                    "Accelerators/ManyCore and heterogeneous clusters",

            "Innovative reasoning, learning and association rules\n\n" +
                    "Connectional learning and clustering\n\n" +
                    "Goodness measures and evaluation\n\n" +
                    "Inductive learning including decision tree and rule induction learning\n\n" +
                    "Organizational learning and evolutional learning\n\n" +
                    "Probabilistic information retrieval\n\n" +
                    "Classification and Model Estimation\n\n" +
                    "Automatic Semantic Annotation of Media Content\n\n" +
                    "Feature Grouping, Discretization, Selection and Transformation\n\n" +
                    "Learning/adaption of recognition and perception\n\n" +
                    "Learning of Visual Ontologies\n\n" +
                    "Nonlinear Function Learning and Neural Net Based Learning\n\n" +
                    "Statistical and Evolutionary Learning\n\n" +
                    "Support Vector Machines\n\n" +
                    "Speech Analysis\n\n" +
                    "Learning for modern robots",

            "Big data and Social Media Analytics\n\n" +
                    "Big Data Cloud Analytics?\n\n" +
                    "Business Analytics and Big Data\n\n" +
                    "Customer Experience Management\n\n" +
                    "Online Listening\n\n" +
                    "Sentiment analysis\n\n" +
                    "Social Marketing\n\n" +
                    "Social Media Analytics\n\n" +
                    "Security and privacy applications\n\n" +
                    "Real-life case studies of value creation through advanced data analytic\n\n" +
                    "Data and Knowledge Management\n\n" +
                    "Context-awareness and Location-awareness\n\n" +
                    "Performance Evaluation and Modeling\n\n" +
                    "Next Generation Networks\n\n" +
                    "Traffic Theory, Modeling and Simulation\n\n" +
                    "User Evaluations and Case Studies\n\n" +
                    "Wireless Systems and Applications\n\n" +
                    "e-Government, e-Commerce, e-Science and Creative Technologies",

            "Intelligent Systems for IoT and Services Computing\n\n" +
                    "Energy Efficiency\n\n" +
                    "Future of IoT\n\n" +
                    "Technological focus for Smart Environments\n\n" +
                    "Next Generation Networks\n\n" +
                    "Smart City Examples and Case Studies\n\n" +
                    "Data Analysis and Visualization for Smart City, Green Systems and Transport Systems\n\n" +
                    "Architecture for secure and interactive IoT\n\n" +
                    "Intelligent Infrastructure and Guidance Systems\n\n" +
                    "Pattern Recognition and Behavioral Investigations for Vehicles, Green Systems and Smart City\n\n" +
                    "Health Informatics\n\n" +
                    "Software Engineering Approaches, including Formal Methods, Agile Methods and Theoretical Algorithms for IoT\n\n" +
                    "System Design and Architecture\n\n" +
                    "Mobile APIs, Apps, Systems and Prototype\n\n" +
                    "Energy-saving and Green IT Systems or Applications",

            "Smart Approaches in Automation and Robotics\n\n" +
                    "Remote and Telerobotics\n\n" +
                    "Prototypical Applications\n\n" +
                    "Humanoid Robots: New Developments\n\n" +
                    "Affective computing\n\n" +
                    "Robot Manipulators: Trends and Development\n\n" +
                    "Computational Intelligence and Soft Computing\n\n" +
                    "Machine learning and statistical methods for data mining\n\n" +
                    "Neural Networks\n\n" +
                    "Deep Belief Network\n\n" +
                    "Fuzzy Logic\n\n" +
                    "Evolutionary Algorithms (EA)\n\n" +
                    "Genetic Algorithms (GA)\n\n" +
                    "Artificial Immune Systems And Support Vector Machines\n\n" +
                    "Decision/Utiliity Theory and Decision Optimization\n\n" +
                    "Description Logic and Ontologies\n\n" +
                    "Distributed Intelligence\n\n" +
                    "Smart Applications of AI",

            "Information Security\n\n" +
                    "Computer Network Security\n\n" +
                    "Web Services Security\n\n" +
                    "Mobile Security\n\n" +
                    "Cyber Forensics\n\n" +
                    "Security in Middleware, Interface and Interaction\n\n" +
                    "Digital Trust and Reputation\n\n" +
                    "Policy, Legal, Legislation & Compliance\n\n" +
                    "Big data architectures for network security\n\n" +
                    "Detecting security threats in social networks\n\n" +
                    "Advanced Networking, Cloud Computing and Cyber Physical Systems\n\n" +
                    "Challenges, Opportunities, and Dimensions of Cyber-Physical Systems\n\n" +
                    "Cyber Intelligence and Information Integration\n\n" +
                    "Industrial Cloud-Based Cyber-Physical Systems\n\n" +
                    "Modeling and Analysis of Safety-Critical Cyber Physical Systems\n\n" +
                    "Vehicular Cyber-Physical Systems and Cloud Computing",

            "Intelligent web computing and applications\n\n" +
                    "Data semantics and web-centric systems\n\n" +
                    "Ontologies and conceptual data modeling\n\n" +
                    "Knowledge representation and reasoning\n\n" +
                    "Web information retrieval\n\n" +
                    "Software architecture and middleware\n\n" +
                    "Semantic and intelligent services\n\n" +
                    "Service implementation and deployment\n\n" +
                    "Web services for Internet of Things\n\n" +
                    "Mobile Web services\n\n" +
                    "Grid and utility services\n\n" +
                    "Embedded services\n\n" +
                    "Internet-based Services\n\n" +
                    "Web 2.0 and Web X.0 in Web services\n\n" +
                    "XaaS (everything as a service)\n\n" +
                    "RESTful Web services",

            "Autonomic Computing\n\n" +
                    "Utility Computing\n\n" +
                    "Grid and Peer-to-Peer Computing\n\n" +
                    "Energy-Efficient Ubiquitous Computing\n\n" +
                    "Wearable Computers\n\n" +
                    "Parallel and Distributed Computing\n\n" +
                    "Modelling and Analysis of Ubiquitous Computing Systems\n\n" +
                    "Middleware and Agent Technologies\n\n" +
                    "Reliable and Trusted Computing\n\n" +
                    "Numerical Algorithms and Analysis\n\n" +
                    "Computational Simulation and Analysis\n\n" +
                    "Pervasive Health\n\n" +
                    "Ubiquitous Platforms\n\n" +
                    "Quality-of-Service\n\n" +
                    "Information Security and Privacy\n\n" +
                    "Ubiquitous Media Infrastructure\n\n" +
                    "Ubiquitous Sensor Networks / RFID",

            "Innovation in ICT for effective Teaching and Learning\n\n" +
                    "Disruptive Learning Technologies\n\n" +
                    "Social Media for Innovative Classes\n\n" +
                    "Methodology and Didactics of Teaching and Using ICT\n\n" +
                    "Advances in and Tools for Technology Enhanced Learning\n\n" +
                    "Balance between Theory and Practice in Curriculum Design\n\n" +
                    "ICT Competence Design and Development\n\n" +
                    "Quality Assurance of ICT Education\n\n" +
                    "Professional Retraining and Life-Long Learning using ICT\n\n" +
                    "Infrastructures and Framework Conditions for ICT Education\n\n" +
                    "Modeling Systems in Education\n\n" +
                    "Preparing teachers for effective learning\n\n" +
                    "Engaging students in classroom interaction\n\n" +
                    "Social and cultural values in teacher education\n\n" +
                    "Digital Technologies for Collaborative Learning\n\n" +
                    "Contemporary issues in pedagogy"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        listView = (ListView) findViewById(R.id.eventList);
        SimpleListLayout adapter = new SimpleListLayout(this, name);
        listView.setAdapter(adapter);
        final Activity content = this;
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(content, IntentDisplayerActivity.class);
                intent.putExtra("value", info[position]);
                intent.putExtra("name", name[position]);
                startActivity(intent);
            }
        });
    }


}
