package com.sbn;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class SBNActivity extends ListActivity {
	
	
   /** Called when the activity is first created. */
   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       
       //setContentView(R.layout.main);
       
       String[] countries = getResources().getStringArray(R.array.countries_array);
       setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item, countries));
       
       ListView lv = getListView();
       lv.setTextFilterEnabled(true);

       lv.setOnItemClickListener(new OnItemClickListener() 
       {
         public void onItemClick(AdapterView<?> parent, View view, int position, long id) 
         {
           Toast.makeText(getApplicationContext(), ((TextView) view).getText(),
               Toast.LENGTH_SHORT).show();
         }
       });

   }
}