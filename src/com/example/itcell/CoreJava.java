package com.example.itcell;

import java.util.ArrayList;

public class CoreJava {
	public ArrayList getCoreQ(){
		ArrayList questions=new ArrayList();
		questions.add("1. What is Java ");
		questions.add("2. What is JRE ");
		questions.add("3. What is Assertion ");
		questions.add("4. What is Garbage Collector ");
		return questions;
	}
	public ArrayList getCoreA(){
		ArrayList answers=new ArrayList();
		answers.add("1.Java is a high level language");
		answers.add("2. JRE is a source to run java app ");
		answers.add("3. Assertion is a technique to test java app");
		answers.add("4. A source to free allocated memory");
		return answers;		
	}
}
