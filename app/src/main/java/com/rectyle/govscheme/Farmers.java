package com.rectyle.govscheme;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class Farmers extends AppCompatActivity {
    ListView lst_view;
    String[] Farmers_schemes={"प्रधानमंत्री कुसुम सोलार योजना","प्रधानमंत्री कृषी सिंचन योजना - प्रती थेंब अधिक पिक (सूक्ष्म सिंचन घटक)","बकृषी यांत्रिकीकरण उप-अभियान","राष्ट्रीय अन्न सुरक्षा अभियान : अन्नधान्य, तेलबिया, ऊस व कापूस","एकात्मिक फलोत्पादन विकास अभियान"};
    String[] Women_schemes={"बलात्कार पिडीत, लैंगिक शोषण पिडीत बालक आणि हल्ला पिडीतांकरिता मनोधैर्य योजना (महिला आणि बालक)","माझी कन्या भाग्यश्री योजना","बेटी बचाओ बेटी पढ़ाओ योजना","शुभ मंगल सामूहिक विवाह योजना","भारतीय महिला बँक व्यावसायिक कर्ज योजना","महिला उद्योग निधी योजना"};
    String[] Labour_schemes={"महाराष्ट्र शासनअटल बांधकाम कामगार योजना","शिव रोजगार योजना","कामगार स्मार्ट कार्ड"};
    String[] Startup_schemes={"Startup India Seed Fund Scheme 2022","Pradhan Mantri Mudra Yojana","Financial Support to MSMEs in ZED Certification Scheme","Credit Linked Capital Subsidy Scheme","Design Clinic Ministry of Micro, Small & Medium Enterprises"};
    String[] Student_schemes={"गुणवान विद्यार्थांना आर्थिक सहाय्य - कनिष्ठ पातळी","गुणवान विद्यार्थांना आर्थिक सहाय्य - वरिष्ठ पातळी","गणित व भौतिकशास्त्र विषयातील प्रज्ञावान विद्यार्थांना देण्यात येणारी शिष्यवृत्ती","वैद्यकीय व दंत महाविद्यालयातील एसईबीसी आणि ईडब्ल्युएस आरक्षणामुळे बाधित खुल्या प्रवर्गातील विद्यार्थ्यांची शिक्षण शुल्काची प्रतिपुर्ती","राज्य शासनाची खुली गुणवत्ता शिष्यवृत्ती"};
    String flag="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmers);
        lst_view=findViewById(R.id.lst_view);

        Intent tempIntent= getIntent();
        String ch=tempIntent.getStringExtra("choice").toString();

        ArrayAdapter adapterf = new ArrayAdapter(getApplicationContext(), R.layout.adapter_layout,Farmers_schemes);
        ArrayAdapter adapterw = new ArrayAdapter(getApplicationContext(), R.layout.adapter_layout,Women_schemes);
        ArrayAdapter adapterl = new ArrayAdapter(getApplicationContext(), R.layout.adapter_layout,Labour_schemes);
        ArrayAdapter adapters = new ArrayAdapter(getApplicationContext(), R.layout.adapter_layout,Startup_schemes);
        ArrayAdapter adaptersd = new ArrayAdapter(getApplicationContext(), R.layout.adapter_layout,Student_schemes);



        switch(ch){
            case "Farmers":
                flag="Farmers";
            lst_view.setAdapter(adapterf);
            break;
            case "Women":
                flag="Women";
                lst_view.setAdapter(adapterw);
                break;

            case "Labours":
                flag="Labours";
                lst_view.setAdapter(adapterl);
                break;

            case "Students":
                flag="Students";
                lst_view.setAdapter(adaptersd);
                break;

            case "Startups":
                flag="Startups";
                lst_view.setAdapter(adapters);
                break;


            default:
                System.out.println("Error occurred");
        }


        lst_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String data="";
                if (flag=="Farmers")
                {
                    data=Farmers_schemes[i];
                    Intent result=new Intent(getApplicationContext(),ResultActivity.class);
                    result.putExtra("data",data);
                    startActivity(result);

                }
                else if (flag=="Women")
                {
                    data=Women_schemes[i];
                    Intent result=new Intent(getApplicationContext(),Women.class);
                    result.putExtra("data",data);
                    startActivity(result);
                }
                else if (flag=="Labours")
                {
                    data=Labour_schemes[i];
                    Intent result=new Intent(getApplicationContext(),Labour.class);
                    result.putExtra("data",data);
                    startActivity(result);
                }
                else if (flag=="Students")
                {
                    data=Student_schemes[i];
                    Intent intent=new Intent(getApplicationContext(),Student.class);
                    intent.putExtra("data",data);
                    startActivity(intent);
                }
                else if (flag=="Startups")
                {
                    data=Startup_schemes[i];
                    Intent intent=new Intent(getApplicationContext(),Startup.class);
                    intent.putExtra("data",data);
                    startActivity(intent);

                }


//                Intent result=new Intent(getApplicationContext(),ResultActivity.class);
//                result.putExtra("data",data);
//                startActivity(result);


            }
        });


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