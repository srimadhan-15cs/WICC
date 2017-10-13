package com.example.madhan.wicc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class AuthorGuidelineActivity extends AppCompatActivity {

    private String[] name = {
            "Paper Submission",
            "Submission information",
            "Policy on Plagiarism",
            "Proceedings",
            "Publication in Journal"
    };
    private String[] desc = {
            "Prospective authors are invited to contribute to the conference by electronically submitting full papers in English (8-10) pages including illustrations, tables and references. Papers have to be formatted following Springer CCIS style guidelines. Papers will be evaluated based on their originality, quality and significance of theoretical and/or practical contribution to Innovation and Computing. At least one author of each accepted paper must register at the conference. Papers will be selected for oral presentations or poster presentations. Only papers presented at the conference will be included in the proceedings.",
            "All submissions will be peer reviewed for originality, technical content and relevance to the theme of this conference by at least three members of the Technical Program Committee (TPC). The final acceptance will be based upon double blind peer review of the full-length paper. The conference management is done through easychair.",
            "1.\tAuthors are required to adhere to the Policy and Procedures on Plagiarism.\n" +
                    "2.\tAuthors are requested to kindly restrict from plagiarism in any form. Authors should submit their original and unpublished research work not under consideration for publication elsewhere.\n" +
                    "3.\tPapers found to be plagiarised during any stage of review shall be rejected and the report will be send to the institution.\n" +
                    "4.\tAs per copyright transfer agreement, Authors are deemed to be individually and collectively responsible for the content of manuscripts published by them \n" +
                    "5.\tHence, it is the responsibility of each author to strive for the highest ethical standards with respect to plagiarism ",
            "All orally presented papers will be submitted to Springer’s Communications in Computer and Information Science (CCIS). Springer CCIS Series is a satellite version of LNCS, which is indexed with world’s leading Abstracting & Indexing (A&I) databases including DBLP, Google Scholar, EI-Compendex, Mathematical Reviews, SCImago and Scopus. CCIS series H-Index is 19. \n" +
                    "During the conference, digital versions of each paper (pdf) will be available in a conference pen drive. The proceedings will be available after the meeting to check paper presentation. Springer will take two months two publish the proceedings after the conference. Only papers presented in the conference will be included in the CCIS volume. The papers should be prepared following the instructions from Springer CCIS series.",
            "Extended version of selected papers will be published in:\n" +
                    "\"Cluster Computing\", Indexed in Web of Science (SCIE - Science Citation Index Expanded) with impact factor 2.040, Scopus and UGC Listed and Anna University (Annexure 1) listed. [Approval Pending] \n" +
                    "\"Intelligent Decision Technologies\" International Journal Indexed in Thomson Reuters ESCI (Emerging Sources Citation Index) and UGC Listed."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_author_guideline);

        ListView listView = (ListView) findViewById(R.id.authorGuideline);


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
