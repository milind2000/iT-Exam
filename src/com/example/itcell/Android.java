package com.example.itcell;

import java.util.ArrayList;

public class Android {
	public ArrayList getAndQ(){
		ArrayList questions=new ArrayList();
		questions.add("1. What is Android ");//0
		questions.add("2. What is the fullform of DDMS ");
		questions.add("3. Package for SQLiteDatabase ");
		questions.add("4.  Package for Bundle");
		return questions;
	}
	public ArrayList getAndA(){
		ArrayList answers=new ArrayList();
		answers.add("1. Open source platform to create apps");
		answers.add("2. Dalvik Debug Monitor Server ");
		answers.add("3. android.database.sqlite.SQLiteDatabase");
		answers.add("4. android.os.Bundle");
		return answers;		
	}
}
