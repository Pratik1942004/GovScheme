package com.rectyle.govscheme;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {
TextView txt_scheme,txt_description,txt_link;
ImageButton share;
String प्रधानमंत्री_कुसुम_सोलार_योजना="केंद्र सरकारने या वर्षी या पुरवठादारांना जिल्हानिहाय कोट्याचे वितरण केल्यानंतरच योजनेची अपेक्षित अंमलबजावणी सुरू होईल. तोपर्यंत अर्जदाराची प्राथमिक माहिती/मोबाईल नोंदणी केली जात आहे. केंद्र सरकारकडून सौर पंप पुरवठादार आणि दर प्राप्त झाल्यानंतर आणि राज्य सरकारच्या सुकाणू समितीद्वारे जिल्हानिहाय पुरवठादारास वाटप केल्यानंतर, अर्जदारांना प्राधान्याच्या आधारावर एसएमएस पाठविला जाईल. त्यानंतरच अर्जदाराची संपूर्ण माहिती भरणे, कोटेशन देणे, लाभार्थी हिस्सा स्वीकारणे, कंपनीची निवड करणे आणि सोलर पंप बसवणे शक्य होईल.";
String रधानमंत्री_कृषी_सिंचन_योजना="पिकांच्या झाडाच्या मुळाशी लहानशा नळीद्वारे थेंबथेंब पाणी देण्याची आधुनिक पद्धत म्हणजे ठिबक सिंचन. या पद्धतीत, जमिनीत पाणी जिरण्याचा जो वेग असतो, त्यापेक्षा कमी वेगाने पिकास पाणी दिले जाते. मुख्यत्वे करून पाणी थेंबाथेंबाने दिले जाते. ठिबक सिंचनात महाराष्ट्र अग्रेसर असून संपूर्ण भारताच्या ६० टक्के ठिबक सिंचन एकटय़ा महाराष्ट्रात केले जाते.\n" +
        "\n" +
        "तुषार सिंचन (ज्यात पाणी शिंपडणारे म्हणून ओळखले जाते) हे एक असे साधन आहे जे शेती पिके, लॉन्स, भूदृश्य, गोल्फ अभ्यासक्रम आणि इतर भागात सिंचन करण्यासाठी वापरली जाते. ते थंड करण्यासाठी आणि वायूच्या धूळ नियंत्रणासाठी देखील वापरली जाते. तुषार सिंचन ही पावसासारख्याच प्रकारे नियंत्रित पद्धतीने पाण्याचा वापर करण्याचा मार्ग आहे. पाणी एका नेटवर्कद्वारे वितरीत केले जाते ज्यामध्ये पंप, वॉल्व्ह , पाईप्स आणि स्पिंकलर्स असू शकतात. या सिंचनाचा वापर निवासी, औद्योगिक आणि कृषी वापरासाठी केला जाऊ शकतो. जेव्हा पंपच्या मदतीने मुख्य पाईपद्वारे दाबून पाणी वाहू दिले जाते तेव्हा फिरणाऱ्या नोझल मधून बाहेर पडते आणि ते पिकावर शिंपडले जाते";
String कृषी_यांत्रिकीकरण_उप_अभियान="\n" +
        "कृषि यांत्रिकीकरणास प्रोत्साहन देणे व शेती मधील उर्जेच्या वापराचे प्रमाण २ किलोवॅट/ हेक्टर पर्यंत वाढविणे.\n" +
        "\n" +
        "उद्देश :\n" +
        "जेथे शेतीमधील उर्जेचा वापर कमी आहे अशा क्षेत्रामध्ये व अल्प व अत्यल्प भूधारक शेतकऱ्यांपर्यंत कृषि यांत्रिकीकरणाचा लाभ पोहोचविणे.\n" +
        "प्रात्याक्षिके व मनुष्यबळ विकासाद्वारे सहभागीदारमध्ये जागरुकता निर्माण करणे.\n" +
        "अनुदान\n" +
        "या योजनेतून खालील दिलेल्या कृषि यंत्र / अवजारे यांच्या खरेदीसाठी अर्थसहाय्य देण्यात येईल:\n" +
        "\n" +
        "१) ट्रॅक्टर\n" +
        "२) पॉवर टिलर\n" +
        "३) ट्रॅक्टर/ पॉवर टिलर चलित अवजारे\n" +
        "४) बैल चलित यंत्र/अवजारे\n" +
        "५) मनुष्य चलित यंत्र/अवजारे\n" +
        "६) प्रक्रिया संच\n" +
        "७) काढणी पश्च्यात तंत्रज्ञान\n" +
        "८) फलोत्पादन यंत्र/अवजारे\n" +
        "९) वैशिष्ट्यपूर्ण यंत्र अवजारे\n" +
        "१०) स्वयं चलित यंत्रे\n" +
        "\n" +
        "भाडे तत्वावरील सुविधा केंद्र:\n" +
        "\n" +
        "१) कृषि अवजारे बँकेची स्थापना\n" +
        "२) उच्च तंत्रज्ञान , उत्पादन सेवा सुविधा केंद्राची स्थापना\n" +
        "\n" +
        "*लाभाच्या माहितीसाठी कृपया सोबतचे प्रपत्र पाहावे.";
String राष्ट्रीय_अन्न_सुरक्षा_अभियान_अन्नधान्य_तेलबिया_ऊस_व_कापूस="या योजनेंतर्गत शेतकऱ्यांना बियाणे वितरण, एकात्मिक अन्नद्रव्य व्यवस्थापन (सूक्ष्म मूलद्रव्ये), एकात्मिक कीड व्यवस्थापन (पिक संरक्षण औषधे व जैविक घटक, तणनाशाके), वैयक्तिक शेततळे, पंप संच, पाईप, विविध कृषी अवजारे या बाबींना अनुदान देण्यात येईल.\n" +
        " वैयक्तिक शेततळे, पंप संच, पाईप या घटकांचा लाभ पाहण्याकरिता कृपया दस्तऐवज पहा.\n" +
        " विविध कृषी अवजारे या घटकांचा लाभ पाहण्याकरिता कृपया दस्तऐवज पहा.\n" +
        " बियाणे वितरण, एकात्मिक अन्नद्रव्य व्यवस्थापन (सूक्ष्म मूलद्रव्ये), एकात्मिक कीड व्यवस्थापन (पिक संरक्षण औषधे व जैविक घटक, तणनाशाके";
  String  एकात्मिक_फलोत्पादन_विकास_अभियान="1) वैविध्यपूर्ण कृषि हवामान विभागानुसार प्रादेशिक अनुकूलता व गरजा लक्षात घेऊन त्या त्या प्रदेशातील फलोद्यान क्षेत्राचा संशोधन, तंत्रज्ञान, प्रसार, काढणींतौर तंत्रज्ञान, पणन सुविधा यांच्या माध्यमातून समूहू पद्धतीने सर्वांगीन विंकास करणे.\n" +
          "2) शेतक-याना एकत्रित करून शेतक-यांचे गट निर्माण करणे व \n"+" 3) शेतकरी उत्पादक समूहू स्थापीत करणेसाठी प्रवृत्त करून उत्पादकता व उत्पादन वाढवून निव्वळ उत्पादनात वाढ करणे.\n" +
          "3) शेतक-यांचे आर्थिक राहणीमान उंचावणे व आहराविषयी पोषणमुल्य वाढविणे.\n" +
          "4) आस्तित्वात असलेल्या फलोत्पादन विषयक विविध योजनांमध्ये समन्वय साधून एकरूपता आणणे.\n" +
          "5) पारंपरिक उत्पादन पद्धतींची आधुनिक शास्त्रीय ज्ञानाशी सांगड घालून तंत्रज्ञानाचा विकास व प्रसार आणि प्रचार करणे.\n" +
          "6) कुशल आणि अकुशल विषेशतः बेरोजगार तरूणांकरिता रोजगाराच्या संधी उपलब्ध करून देणे";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        txt_scheme=findViewById(R.id.txt_scheme);
        txt_description=findViewById(R.id.txt_description);
        txt_link=findViewById(R.id.txt_link);
        Intent result= getIntent();

        String temp=result.getStringExtra("data").toString();
        txt_scheme.setText(temp);

        switch (temp){

            case "प्रधानमंत्री कुसुम सोलार योजना" : txt_description.setText(प्रधानमंत्री_कुसुम_सोलार_योजना);
                                    txt_link.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mahadbtmahait.gov.in"));
                                            startActivity(intent);
                                        }
                                    });
            break;
            case "प्रधानमंत्री कृषी सिंचन योजना - प्रती थेंब अधिक पिक (सूक्ष्म सिंचन घटक)":txt_description.setText(रधानमंत्री_कृषी_सिंचन_योजना);
                txt_link.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mahadbtmahait.gov.in"));
                        startActivity(intent);
                    }
                });
            break;
            case "बकृषी यांत्रिकीकरण उप-अभियान":txt_description.setText(कृषी_यांत्रिकीकरण_उप_अभियान);
                txt_link.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mahadbtmahait.gov.in"));
                        startActivity(intent);
                    }
                });
            break;
            case "राष्ट्रीय अन्न सुरक्षा अभियान : अन्नधान्य, तेलबिया, ऊस व कापूस":txt_description.setText(राष्ट्रीय_अन्न_सुरक्षा_अभियान_अन्नधान्य_तेलबिया_ऊस_व_कापूस);
                txt_link.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mahadbtmahait.gov.in"));
                        startActivity(intent);
                    }
                });
            break;
            case "एकात्मिक फलोत्पादन विकास अभियान":txt_description.setText(एकात्मिक_फलोत्पादन_विकास_अभियान);
            break;
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
