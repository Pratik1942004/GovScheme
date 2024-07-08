package com.rectyle.govscheme;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Labour extends AppCompatActivity {
    TextView txt_scheme,txt_discription,txt_link;
    String महाराष्ट्र_शासनअटल_बांधकाम_कामगार_योजना="महाराष्ट्र अटल बांधकाम कामगार आवास योजना (ग्रामीण) 2022 अर्ज PDF ऑनलाईन mahabocw.in वर डाउनलोड करा, अटल बंदकाम कामगार योजना, शासनासाठी अर्ज करा. रु. प्रदान करण्यासाठी PMAY G चा एक भाग म्हणून पक्की घरे बांधण्यासाठी किंवा घरांच्या पुनर्बांधणीसाठी मजुरांना ग्रामीण गृहनिर्माण योजनेतील घरांसाठी 1.5 लाखांची मदत\n" +
            " \n" +
            "Eligibility:-सर्व बांधकाम कामगारांनी महाराष्ट्र इमारत आणि इतर बांधकाम कामगार कल्याण मंडळाकडे (MBOCWWB) नोंदणी केलेली असणे आवश्यक आहे.\n" +
            "कामगार 18 ते 60 वर्षांच्या दरम्यान असावा.\n" +
            "गेल्या 12 महिन्यांत कामगाराने 90 दिवसांपेक्षा जास्त काळ काम केले पाहिजे.\n" +
            "MBOCWWB सह बांधकाम कामगारांची नोंदणी 1 वर्षापेक्षा जास्त कालावधीसाठी असणे आवश्यक आहे.\n" +
            "सर्व बांधकाम मजुरांकडे आधीच पक्की घरे नसावीत.\n" +
            "प्रधानमंत्री आवास योजनेतील पात्रतेबाबत सक्षम अधिकाऱ्याचे पत्र/प्रमाणित यादी.\n"+"डॉक्युमेंट:-\n  1)adhar card\n" +
            "      2)pan card\n" +
            "      3)bank passbook";

    String शिव_रोजगार_योजना="महाराष्ट्र शासन महास्वयम् रोजगार नोंदणीसाठी एक एकीकृत वेब पोर्टल सुरू केले आहे. जे लोक महाराष्ट्रात नोकरी शोधत आहेत ते महास्वयं पोर्टलवर ऑनलाइन नोंदणी करू शकतात. त्यानुसार, रोजगार महास्वयंम नोंदणी विविध नियोक्त्यांद्वारे निर्दिष्ट केल्यानुसार नोकरी शोधणाऱ्यांना नोकऱ्यांचा सुलभ प्रवेश प्रदान करेल. इच्छुक उमेदवार अधिकृत वेबसाइट mahaswayam.gov.in (पूर्वी mahaswayam.in) द्वारे महास्वयम नोंदणी करू शकतात किंवा rojgar.mahaswayam.gov.in वर थेट लॉग इन करू शकतात.\n" +
            "\n" +
            "महाराष्ट्र शासन महास्वयम् युनिफाइड वेब पोर्टल सुरू केले आहे ज्यामध्ये 3 भाग आहेत – पहिला युवकांसाठी रोजगार (महारोजगार), दुसरा कौशल्य विकास (MSSDS) आणि तिसरा स्वयंरोजगार (महास्वयं रोजगार).\n\n" +
            "डॉक्युमेंट:-  1)adhar card\n" +
            "      2)pan card\n" +
            "      3)bank passbook";
    String कामगार_स्मार्ट_कार्ड="महाराष्ट्र बांधकाम कामगार नोंदणी फॉर्म: महाराष्ट्र सरकारने mahabocw.in वर बांधकाम कामगारांसाठी नोंदणी / ऑनलाइन नूतनीकरण / दावा फॉर्म प्रक्रिया सुरू केली आहे. त्यानुसार आता सर्व बांधकाम मजुरांना विविध योजनांचा लाभ मिळण्यासाठी महाराष्ट्र इमारत व इतर बांधकाम कामगार कल्याणकारी मंडळाकडे नोंदणी करता येणार आहे. महाराष्ट्र बांधकाम कामगार ऑनलाइन नोंदणी / नूतनीकरण / दावा फॉर्म mahabocw.in वर ऑनलाइन उपलब्ध आहे. अनेक बांधकाम मजूर योजनांअंतर्गत mahabocw विभागामध्ये नोंदणीकृत कामगारांना थेट लाभ हस्तांतरण (DBT) मोडद्वारे म्हणजेच थेट त्यांच्या बँक खात्यात पैसे दिले जातील.\n\n" +
            "डॉक्युमेंट :-\n1) adhar card\n" +
            "2)bank passbook";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setContentView(R.layout.activity_result);
        super.onCreate(savedInstanceState);
        txt_scheme=findViewById(R.id.txt_scheme);
        txt_discription=findViewById(R.id.txt_description);
        txt_link=findViewById(R.id.txt_link);
        Intent result=getIntent();
        String temp=result.getStringExtra("data");
        txt_scheme.setText(temp);

        switch (temp){
            case "महाराष्ट्र शासनअटल बांधकाम कामगार योजना":txt_discription.setText(महाराष्ट्र_शासनअटल_बांधकाम_कामगार_योजना);
                txt_link.setText("https://mahabocw.in/welfare-schemes");
                txt_link.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mahabocw.in/welfare-schemes/"));
                        startActivity(intent);
                    }
                });
                break;

            case "शिव रोजगार योजना":txt_discription.setText(शिव_रोजगार_योजना);
                txt_link.setText("https://mahajobs.maharashtra.gov.in");
                txt_link.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mahajobs.maharashtra.gov.in"));
                        startActivity(intent);
                    }
                });
                break;

            case "कामगार स्मार्ट कार्ड":txt_discription.setText(कामगार_स्मार्ट_कार्ड);
                txt_link.setText("https://eshram.gov.in");
                txt_link.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://eshram.gov.in"));
                        startActivity(intent);
                    }
                });
                break;

            default:
                Toast.makeText(this, "select any option", Toast.LENGTH_SHORT).show();

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.menu_home){
            Intent home = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(home);
        }
        if (id==R.id.menu_notification){
            Intent notify=new Intent(getApplicationContext(),GetNotification.class);
            startActivity(notify);
        }
        if (id==R.id.menu_farmer){
            Intent tempIntent1= new Intent(getApplicationContext(),Farmers.class);
            tempIntent1.putExtra("choice","Farmers");
            startActivity(tempIntent1);
        }
        if(id==R.id.menu_women){
            Intent tempIntent2= new Intent(getApplicationContext(),Farmers.class);
            tempIntent2.putExtra("choice","Women");
            startActivity(tempIntent2);
        }
        if (id==R.id.menu_labour){
            Intent tempIntent3= new Intent(getApplicationContext(),Farmers.class);
            tempIntent3.putExtra("choice","Labours");
            startActivity(tempIntent3);
        }

        if (id==R.id.menu_startup){
            Intent tempIntent4= new Intent(getApplicationContext(),Farmers.class);
            tempIntent4.putExtra("choice","Startups");
            startActivity(tempIntent4);

        }
        if(id==R.id.menu_student){
            Intent tempIntent5= new Intent(getApplicationContext(),Farmers.class);
            tempIntent5.putExtra("choice","Students");
            startActivity(tempIntent5);
        }
        if(id==R.id.share){
            try {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT,"share app");
                String putMessage="https://www.govscheme.com  "+BuildConfig.APPLICATION_ID+"\n\n";
                intent.putExtra(Intent.EXTRA_TEXT,putMessage);
                startActivity(Intent.createChooser(intent,"share by"));
            }catch (Exception e){
                Toast.makeText(this,"Error occurred",Toast.LENGTH_SHORT).show();
            }
        }
        return super.onOptionsItemSelected(item);
    }
}
