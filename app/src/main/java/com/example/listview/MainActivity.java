package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView List=findViewById(R.id.list);
        List.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {

                if(i ==0)
                {
                    String Message="Author Name: Goldin \n" + "Title: The race between education and technology \n" + "City of Publication: Belknap Press of Harvard University Press \n" + "Publication: USA \n" + "Publication Date: 2010 \n";
                    Toast.makeText(MainActivity.this, Message, Toast.LENGTH_SHORT).show();
                }
                else if (i ==1)
                {

                    String Message="Author Name: Matthews \n" + "Title: Disaster management in archives \n" + "City of Publication: libraries and museums \n" + "Publication: Ashgate \n" + "Publication Date: 2009 \n";
                    Toast.makeText(MainActivity.this, Message, Toast.LENGTH_SHORT).show();
                }
                else if (i ==2)
                {

                    String Message="Author Name: Auster \n" + "Title: The Brooklyn dollies \n" + "City of Publication: Universal press \n" + "Publication: Canada \n" + "Publication Date: 2015 \n";
                    Toast.makeText(MainActivity.this, Message, Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}