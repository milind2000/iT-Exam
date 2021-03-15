package com.example.itcell;

import java.util.ArrayList;
import com.example.itcell.*;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class QuestionActivity extends Activity {
	ArrayList newQList,newAList;
	int i=0;
	CoreJava coreJava=new CoreJava();
	Android  androids=new Android();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_question);
		Spinner topic = (Spinner)findViewById(R.id.spinner1);
		String topics[]= {"Choose any topic","CORE JAVA","ANDROID","PYTHON"};
		ArrayAdapter<String> data = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,topics);
		topic.setAdapter(data);
		newQList=new ArrayList(); 
		newAList=new ArrayList();
		
		final TextView ques = (TextView)findViewById(R.id.textView1);
		final TextView ans = (TextView)findViewById(R.id.textView2);
		Button prev = (Button)findViewById(R.id.prevbtn);
		Button answer = (Button)findViewById(R.id.ansbtn);
		Button next = (Button)findViewById(R.id.nextbtn);
		
		topic.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				String name = (String)arg0.getItemAtPosition(arg2);
				/*if(name.equalsIgnoreCase("Choose any topic")){
					Toast.makeText(this,"Select a valid option", Toast.LENGTH_SHORT).show();
				}*/
				if(name.equalsIgnoreCase("core java"))
				{
					ans.setText("");
						newQList.removeAll(newQList);
						newAList.removeAll(newQList);
					newQList= coreJava.getCoreQ();
					newAList= coreJava.getCoreA();						
						ques.setText(""+newQList.get(0));
						i=0;
						
				}
				else if(name.equalsIgnoreCase("android"))
				{
						ans.setText("");
						newQList.removeAll(newQList);
						newAList.removeAll(newQList);
					newQList= androids.getAndQ();
					newAList= androids.getAndA();						
						ques.setText(""+newQList.get(0));
						i=0;
				}
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		next.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) 
			{
						ans.setText("");
						++i;
					if(i<newQList.size())
					{
						ques.setText(""+newQList.get(i));
					}
					else
					{
						i=0;
						ques.setText(""+newQList.get(i));
					}
				
				
			}
		});
		
		answer.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				ans.setText(""+newAList.get(i));
			}
		});

		prev.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				ans.setText("");
				--i;	
				if(i>=0)		
				{
					ques.setText(""+newQList.get(i));
				}
				else
				{
					i=newQList.size()-1;
					ques.setText(""+newQList.get(i));
				}
				
			}
		});
	}
}
