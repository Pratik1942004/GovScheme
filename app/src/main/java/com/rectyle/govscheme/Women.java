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
import androidx.appcompat.app.AppCompatActivity;

public class Women extends AppCompatActivity {
    TextView txt_scheme,txt_discription,txt_link;
    String बलात्कार_पिडीत="\n" +
            "बलात्कार आणि ऍसिड हल्ल्यातील  पीडित महिला व बालके  यांच्या पुनर्वसनसाठी  आर्थिक सहाय्य पुरविणे या साठी  महाराष्ट्र शासन  कडून  मनोधैर्य  योजना  राबविण्यात  येत आहे \n" +
            "बलात्कार आणि हल्ला पिडीतांना  (महिला आणि बालक) झालेल्या मानसिक आघातातून सावरणे सर्वात महत्वाचे असते. त्याच बरोबरीने त्यांना निवारा, आर्थिक मदत, वैद्यकीय आणि कायदेशीर मदत तसेच समुपदेशन सेवा उपलब्ध करून देणेही महत्वाचे असते.\n" +
            "हे लक्षात घेऊनच राज्यातील महिला आणि बाल विकास विभाग मनोधैर्य योजनेची अमंलबजावणी करीत आहे. याद्वारे पिडीतांना 1 लाख रुपयांची आणि विशेष प्रकरणांमध्ये 10 लाख रुपयांची आर्थिक मदत देण्यात येते. पिडीतांचे आणि त्यांच्यावर अवलंबून असणाऱ्यांचे पुनर्वसन करण्यासाठी आवश्यक असा निवारा, समुपमदेशन, वैद्यकीय आणि कायदेशीर मदत, शिक्षण आणि व्यावसायिक प्रशिक्षण दिले जाते.\n" +
            "माननीय उच्च न्यायालय निर्देशानुसार योजनेच्या  आर्थिक निकषामध्ये बदल करून सुधारित मनोधैर्य योजना लागू करण्यात  आली आहे \n" +
            "सिंगल विंडो सिस्टिम : या योजनेंतर्गत  अर्ज स्वीकारण्यापासून ते आर्थिक सहाय्य   पुरविणे  याबाबतची  सर्व प्रक्रिया राज्य/ जिल्हा विधिक सेवा प्राधिकरण याना हस्तांतरण  करण्यात आली आहे \n" +
            "ITPA अधिनियम अंतर्गत मुलींचा समावेश -सुधारित योजनामध्ये ITPA अधिनियमांतर्गत  सुटका करण्यात आलेल्या मुलींनाही  सहाय्य करण्यात येते";

   String माझी_कन्या_भाग्यश्री_योजना="1 ऑगस्ट 2017 पासून महिला आणि बाल विकास, महाराष्ट्र शासनातर्फे सर्वप्रथम 'माझी कन्या भाग्यश्री' योजनेची अंमलबजावणी सुरू झाली आहे.\n" +
           "या योजने अंतर्गत, शासन खालील प्रमाणे आर्थिक सहाय्य प्रदान करेल\n" +
           "या योजनेची काही प्रमुख वैशिष्ट्ये पुढीलप्रमाणे आहेत:\n" +
           "एक मुलगी: 18 वर्षे कालावधीसाठी रु. 50,000\n" +
           "दोन मुली: प्रत्येक मुलीचे नावे 25 हजार रुपये\n" +
           "7.5 लाख रुपयांपर्यंत मासिक उत्पन्न असलेल्या कुटुंबांना आणि फक्त कौटुंबिक नियोजन प्रमाणपत्र सादर केल्यानंतर लाभ\n" +
           "प्रत्येक सहा वर्षांनंतर कुटुंब जमा व्याज काढून घेऊ शकते\n" +
           "मुदत ठेवींच्या निर्मिती साठी रु. 20 कोटी (आर्थिक वर्ष 2017-18) आणि रु. 14 कोटी रुपये (वित्तीय वर्ष 2018-19) वितरित करण्यात आले आहेत";
   String बेटी_बचाओ_बेटी_पढ़ाओ_योजना="ज्यातील  बालक लिंग गुणोत्तर वृध्दीगंत करण्याच्या प्रमुख उद्देशाने राज्याच्या महिला आणि बालकं विकास विभागाने केंद्र शासनाची बेटी बचाओ बेटी पढाओ योजना बीड, जळगाव, अहमदनगर, बुलढाणा, औरंगाबाद, वाशिम, कोल्हापूर, उस्मानाबाद, सांगली आणि जालना या दहा जिल्ह्यांमध्ये कार्यान्वित केली आहे.\n" +
           "बेटी बचाओ बेटी पढाओ या योजनेची अतिमहत्वाकांक्षी उद्दिष्टे पुढीलप्रमाणे आहेत:\n" +
           "पूर्वग्रहदूषित दृष्टीकोनामुळे होणाऱ्या लिंग निवडीला प्रतिबंध करणे. (स्त्रीभृण हत्यांना प्रतिबंध करणे)\n" +
           "मुलींच्या जिवीताची आणि संरक्षणाची खातरजमा करणे\n" +
           "मुलींच्या शिक्षणाची आणि सामाजिक सहभागाची खातरजमा करणे\n" +
           "दि.१५ जून २०१६ पासून हिंगोली,सोलापूर, पुणे , परभणी , नाशिक, लातूर या अतिरिक्त जिल्हयांचा समावेश सदर योजनेत करण्यात आला आहे\n" +
           "शासन निर्णय दि. ६ ऑगस्ट ,२०१८ नुसार उर्वरित १९ जिल्हयात  सदर योजना  करण्यात आली आहे\n" +
           "देशात महाराष्ट्र हे असे राज्य आहे कि , त्यामधील जळगाव आणि उस्मानाबाद जिल्हयांना प्रभावी समुदाय प्रतिबद्धता ,प्रसूती पूर्व  लिंग निदान परिरक्षण ,पूर्वसंकल्पनेची अंमलबजावणी ,तसेच मुलींना बाळ शिक्षणात सक्षम बनविणे  या क्षेत्रात उल्लेखनीय कार्यबद्दल  विशेष पुरस्काराने माननीय मंत्री महिला व  बाळ विकास मंत्रालय  (भारत सरकार)  यांच्या  हस्ते दि. २४ जानेवारी ,२०१७ रोजी ,राष्ट्रीय बालिका दिवशी सन्मानित करण्यात आले आहे\n";
   String शुभ_मंगल_सामूहिक_विवाह_योजना="निराश्रित आणि विधवांच्या मुलींच्या विवाहाकरिता प्रत्येक  विवाहबध्द होणाऱ्या जोडप्याला विवाह पूर्व अनुदान देण्यात येते.\n" +
           "या योजनेचा लाभ वयाची १८ वर्षे पूर्ण केलेल्या निराश्रित महिला आणि विधवांच्या मुलींना घेता येतो\n" +
           "अन्य कोणत्याही स्त्रोतातून अनुदान घेणाऱ्या मुलीला या अनुदानाचा लाभ घेता येणार नाही.";
   String भारतीय_महिला_बँक_व्यावसायिक_कर्ज_योजना="\n" +
           "भारतीय महिला बँकेचे व्यावसायिक कर्ज हे नवोदित व्यावसायिक महिलांसाठी आहे. ज्यांना रिअल इस्टेटमध्ये नवीन व्यवसाय सुरू करायचा आहे किंवा किरकोळ क्षेत्रात लघु आणि मध्यम उद्योग (SME) आहे. महिला उद्योजकांना 20 कोटी रु. पर्यंत कर्ज दिले जाते. या व्यवसाय कर्ज योजनेवर 0.25 टक्के सवलत देखील मिळू शकते. या कर्जाच्या रकमेवरील व्याज दर सामान्यतः 10.15 टक्के किंवा त्याहून अधिक असतो.";
   String महिला_उद्योग_निधी_योजना="स्मॉल इंडस्ट्रियल डेव्हलपमेंट बँक ऑफ इंडिया (Sidbie) मार्फत सरकारने महिला उद्योजकांना गुंतवून ठेवण्यासाठी आणि त्यांचा व्यवसाय चालू ठेवण्यासाठी त्यांना रोख प्रवाह देण्यासाठी ही योजना सुरू केली. या योजनेअंतर्गत दिलेली रोख रक्कम सेवा, उत्पादन आणि उत्पादन क्षेत्रात वापरली जाऊ शकते. या योजनेअंतर्गत व्यावसायिक महिलांना 10,00,000 रु. पर्यंतचे क्रेडिट मिळू शकते. लहान व्यवसाय सुरू करण्यासाठी या योजनेअंतर्गत देण्यात येणारी आर्थिक मदत व्यवसायाचा विस्तार करण्यासाठी देखील वापरली जाऊ शकते. कर्जाची परतफेड दहा वर्षांत करावी लागेल आणि त्यासाठी पाच वर्षांचा स्थगिती कालावधी आहे.";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        txt_scheme=findViewById(R.id.txt_scheme);
        txt_discription=findViewById(R.id.txt_description);
        txt_link=findViewById(R.id.txt_link);
        Intent result =getIntent();
        String temp=result.getStringExtra("data");
        txt_scheme.setText(temp);

        switch (temp){

            case "बलात्कार पिडीत, लैंगिक शोषण पिडीत बालक आणि हल्ला पिडीतांकरिता मनोधैर्य योजना (महिला आणि बालक)":txt_discription.setText(बलात्कार_पिडीत);
                txt_link.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mahadbtmahait.gov.in"));
                        startActivity(intent);
                    }
                });
             break;
            case "माझी कन्या भाग्यश्री योजना":txt_discription.setText(माझी_कन्या_भाग्यश्री_योजना);
                txt_link.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mahadbtmahait.gov.in"));
                        startActivity(intent);
                    }
                });
             break;
            case "बेटी बचाओ बेटी पढ़ाओ योजना":txt_discription.setText(बेटी_बचाओ_बेटी_पढ़ाओ_योजना);
                txt_link.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mahadbtmahait.gov.in"));
                        startActivity(intent);
                    }
                });
             break;
            case "शुभ मंगल सामूहिक विवाह योजना":txt_discription.setText(शुभ_मंगल_सामूहिक_विवाह_योजना);
                txt_link.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mahadbtmahait.gov.in"));
                        startActivity(intent);
                    }
                });
             break;
            case "भारतीय महिला बँक व्यावसायिक कर्ज योजना":txt_discription.setText(भारतीय_महिला_बँक_व्यावसायिक_कर्ज_योजना);
                txt_link.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mahadbtmahait.gov.in"));
                        startActivity(intent);
                    }
                });
             break;
            case "महिला उद्योग निधी योजना":txt_discription.setText(महिला_उद्योग_निधी_योजना);
                txt_link.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mahadbtmahait.gov.in"));
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
