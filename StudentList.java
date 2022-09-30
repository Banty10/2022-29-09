package com.arraylist2.demo;

import java.util.List;

	public class StudentList {

	public static void main(String[] args) {
		StudentList students = new StudentList();{
		  
		  //adding values in the list
		  students.add(new Students("AF0216223",	"Aryan Raj",	    Age-21, 	"Andhra Pradesh"));
		  students.add(new Students("AF0216224",	"Bivor Kumar",  	Age-22, 	"Andhra Pradesh"));
		  students.add(new Students("AF0216227",	"SUSHMITA KUMARI",	Age-23,     "Madhya Pradesh"));
		  students.add(new Students("AF0216231",	"Ragiv Zafar",	    Age-24,	    "Maharashtra"));
		  students.add(new Students("AF0216232",	"RAHUL MAHTO",  	Age-25,  	"Orissa"));
		  students.add(new Students("AF0216234",	"Nainsi Kumari",	Age-19,     "Gujarath"));
		  students.add(new Students("AF0216236",	"MD ALI",	        Age-26,	    "Madhya Pradesh"));
		  students.add(new Students("AF0216238",	"ABHISHEK KUMAR",	Age-22,  	"Andhra Pradesh"));
		  students.add(new Students("AF0216240",	"AFROZ ANSARI", 	Age-21,     "Maharashtra"));
		  students.add(new Students("AF0216259",	"RITIK RAJ",	    Age-20, 	"Orissa"));
		  students.add(new Students("AF0216263",	"Anant Kumar",	    Age-25,	    "Andhra Pradesh"));
		  students.add(new Students("AF0216305",	"BABU KUMAR",	    Age-24, 	"Gujarath"));
		  students.add(new Students("AF0216307",	"NIKITA KUMARI",	Age-23,	    "Madhya Pradesh"));
		  students.add(new Students("AF0216353",	"PRANAV PANDEY",	Age-22,	    "Orissa"));
		  students.add(new Students("AF0216964",	"Radheshyam Kumar",	Age-21, 	"Maharashtra"));
		  students.add(new Students("AF0216973",	"Ankur Utpal",  	Age-19,	    "Gujarath"));
		  students.add(new Students("AF0217607",	"Banty Mishra",	    Age-18,  	"Madhya Pradesh"));
		  students.add(new Students("AF0217615",	"RIYA KUMARI",  	Age-20,	    "Madhya Pradesh"));
		  students.add(new Students("AF0217791",	"Priyadarshani Kumari", Age-21,	"Maharashtra"));
		  students.add(new Students("AF0223373",	"Chanchal Thakur",	Age-22,	    "Orissa"));
		  students.add(new Students("AF0221549",	"SATENDRA KUMAR",	Age-23,	    "Maharashtra"));
		  students.add(new Students("AF0216212",	"Pappi Verma",	    Age-24,     "Maharashtra"	));
		  students.add(new Students("AF0216244",	"Ramkrishna Kushwah", Age-25,	"Andhra Pradesh"));
		  students.add(new Students("AF0216245",	"Yogita Tamoliya",	Age-26,	    "Orissa"));
		  
		//age more than 20
			System.out.println("Students with age greater than 20 years..");
				for(Students student: students) {
					if(student.getAge()>20)
					System.out.println(student);
				}
		}
			
			
			  
			  
				
			 /*
			//students from Andhra Pradesh
			System.out.println("Students from Andhra Pradesh...");
				for(Students student : students)
				{
					if(student.getState().equals("Andhra Pradesh"))
						System.out.println(student);
				}
			*/	
			
			  
			  
			/*
			 //Sorting according to age
			 System.out.println("sorting by age...");  
			  
			 Collections.sort(students,new AgeComparator());  
			 for(Students student : students) {
				 System.out.println(student);
			 }
				
		
		

	}

}
