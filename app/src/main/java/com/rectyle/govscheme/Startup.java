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

public class Startup extends AppCompatActivity {
    TextView txt_scheme,txt_discription,txt_link;
    String Startup_India_Seed_Fund_Scheme_2022="In order to build a robust startup ecosystem, the Government of India has launched Startup India Seed Fund Scheme on 16th January 2016 so that opportunities will be provided to entrepreneurs to grow their enterprise. The announcement to launch this scheme was made by our honorable Prime Minister Mr. Narendra Modi. Through this scheme financial assistance up to Rs, 50 lakh will provide to the startups at the early stage through incubators. The government has allocated a budget of Rs 945 crore for this scheme. This fund will use for proof of concept, prototype development, product trial, Market entry, and commercialization. Under this scheme, the Government is going to provide funds to incubators. The incubator will be responsible to further provide these funds to the startups. 3600 entrepreneurs through 300 incubators will benefit from the startup India seed fund scheme in the next 4 years.\n" +
            "\bEligibility Criteria Of Startup India Seed Fund Scheme\b\n" +
            "For Startups:\n" +
            "The startup should be recognized by DPIIT\n" +
            "At the time of application, the startup should be incorporated not more than two years ago\n" +
            "The started must have business ideas to develop a product or service which will be fit for the market, has the scope of scaling, and viable commercialization\n" +
            "At the time of application to the incubator for the scheme, the shareholding by the Indian promoter in the startup should be at least 51% or more according to the companies act 2013 and SEBI regulation 2018\n" +
            "The startup should have not received any support of rupees 10 lakh or more under any Central or government scheme\n" +
            "Those startups who are creating an innovative solution in water management, waste management, education, agriculture food processing, etc will be given preference\n" +
            "The startup should be using technology in its core product or service in order to solve the problem which is targeted";
String Pradhan_Mantri_Mudra_Yojana="The Pradhan Mantri Mudra Yojana or MUDRA scheme is a unique credit scheme that offers low-interest business loans to MSMEs and startups in the non-corporate and non-farming sectors.\n" +
        "\n" +
        "Under this scheme, you can avail of three types of loan products:\n" +
        "\n" +
        "Shishu category – A loan of up to Rs. 50,000 is available for startups and small businesses in their initial stages under this category.\n" +
        "Kishor category – Mid-aged businesses looking to expand operations can avail up to Rs. 5,00,000 under this category.\n" +
        "Tarun category – Under this category, experienced businesses can avail up to Rs. 10,00,000.";
String Financial_Support_to_MSMEs_in_ZED_Certification_Scheme="ZED Certification scheme that supports Micro, Small, and Medium Enterprises (MSMEs) to achieve Zero Defect and Zero Effect (ZED) manufacturing. It also provides ZED Assessment for certification which promotes manufacturing of world-class quality products. This scheme supports the ‘Make in India’ campaign. It is financed by the Government of India and falls under the Ministry of Micro, Small, and Medium Enterprises.\n" +
        "\n" +
        "ZED Certification Eligibility Criteria\n" +
        "All Micro, Small, and Medium Enterprises that are registered with the Ministry of MSME, DIC (EM-II), or other government agencies or industry associations are eligible to apply for this scheme.";

String Credit_Linked_Capital_Subsidy_Scheme="The objective of the Scheme is to facilitate technology up-gradation in MSEs by providing an upfront capital subsidy of 15 per cent (on institutional finance of upto Rs 1 crore availed by them) for induction of well-established and improved technology in the specified 51 sub-sectors/products approved. In other words the major objective is to upgrade their plant & machinery with state-of-the-art technology, with or without expansion and also for new MSEs which have set up their facilities with appropriate eligible and proven technology duly approved under scheme guidelines. List of Technologies is available at www.dcmsme.gov.in\n" +
        "\n" +
        "How to apply:\n" +
        "Online Application and Tracking System has been introduced w.e.f. 01.10.2013. To claim subsidy under CLCSS, eligible MSEs are required to apply online through Primary Lending Institutions (PLIs), from where the MSEs avail term loan. The completed application is being uploaded by the PLI through Online Application and Tracking System to the attached Nodal Agency which, in turn, recommends the application online to Office of DC (MSME) for release of subsidy. After processing of application and subject to availability of funds, due approval is accorded from the Competent Authority with concurrence of Internal Finance Wing, after which funds are released to Nodal Agencies. Funds are then transferred by the Nodal Agencies to the PLIs where the account of the MSE is operated.\n";
String Design_Clinic_Ministry_of_Micro_Small_Medium_Enterprises="o bring the MSME sector and design expertise on a common platform and to provide expert advice and solutions on design problems, resulting in continuous improvement and value addition for existing products. It also aims at value added cost effective solutions.\n" +
        "\n" +
        "Who can apply?\tAll MSMEs with EM registration.";
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

        switch(temp){
            case "Startup India Seed Fund Scheme 2022":txt_discription.setText(Startup_India_Seed_Fund_Scheme_2022);
                   txt_link.setText("https://seedfund.startupindia.gov.in");
                txt_link.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://seedfund.startupindia.gov.in"));
                        startActivity(intent);
                    }
                });
                break;

            case "Pradhan Mantri Mudra Yojana": txt_discription.setText(Pradhan_Mantri_Mudra_Yojana);
                txt_link.setText("https://web.umang.gov.in/landing/department/pradhan-mantri-mudra-yojna-pmmy.html");
                txt_link.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://web.umang.gov.in/landing/department/pradhan-mantri-mudra-yojna-pmmy.html"));
                        startActivity(intent);
                    }
                });
                break;

            case "Financial Support to MSMEs in ZED Certification Scheme":txt_discription.setText(Financial_Support_to_MSMEs_in_ZED_Certification_Scheme);
                txt_link.setText("https://www.bankbazaar.com/saving-schemes/zed-certification.html");
                txt_link.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bankbazaar.com/saving-schemes/zed-certification.html"));
                        startActivity(intent);
                    }
                });
                break;
            case "Credit Linked Capital Subsidy Scheme":txt_discription.setText(Credit_Linked_Capital_Subsidy_Scheme);
                txt_link.setText("https://clcss.dcmsme.gov.in");
                txt_link.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://clcss.dcmsme.gov.in"));
                        startActivity(intent);
                    }
                });
                break;

            case "Design Clinic Ministry of Micro, Small & Medium Enterprises":txt_discription.setText(Design_Clinic_Ministry_of_Micro_Small_Medium_Enterprises);
                txt_link.setText("https://msme.gov.in/design-clinic");
                txt_link.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://msme.gov.in/design-clinic"));
                        startActivity(intent);
                    }
                });

            default:
                Toast.makeText(this, "Select any option", Toast.LENGTH_SHORT).show();

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
