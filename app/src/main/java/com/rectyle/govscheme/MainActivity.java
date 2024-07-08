package com.rectyle.govscheme;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
 TextView farmers,women,workers,startups,students,notification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        farmers=findViewById(R.id.btn_farmer);
        workers=findViewById(R.id.btn_labours);
        women=findViewById(R.id.btn_women);
        students=findViewById(R.id.btn_student);
        startups=findViewById(R.id.btn_startup);
        notification=findViewById(R.id.txt_notification);

        farmers.setOnClickListener(this);
        workers.setOnClickListener(this);
        women.setOnClickListener(this);
        students.setOnClickListener(this);
        startups.setOnClickListener(this);

        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }



    @Override
    public void onClick(View view) {

        TextView t= (TextView) view;
        String choice=t.getText().toString();
        switch(choice){
            case "Farmers" :
                Intent tempIntent1= new Intent(getApplicationContext(),Farmers.class);
                tempIntent1.putExtra("choice","Farmers");
                startActivity(tempIntent1);
                break;
            case "Women" :
                Intent tempIntent2= new Intent(getApplicationContext(),Farmers.class);
                tempIntent2.putExtra("choice","Women");
                startActivity(tempIntent2);
                break;
            case "Labours" :
                Intent tempIntent3= new Intent(getApplicationContext(),Farmers.class);
                tempIntent3.putExtra("choice","Labours");
                startActivity(tempIntent3);
                break;
            case "Startups" :
                Intent tempIntent4= new Intent(getApplicationContext(),Farmers.class);
                tempIntent4.putExtra("choice","Startups");
                startActivity(tempIntent4);
                break;
            case "Students" :
                Intent tempIntent5= new Intent(getApplicationContext(),Farmers.class);
                tempIntent5.putExtra("choice","Students");
                startActivity(tempIntent5);
                break;
            default:
                Toast.makeText(getApplicationContext(), "Select Option", Toast.LENGTH_SHORT).show();
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