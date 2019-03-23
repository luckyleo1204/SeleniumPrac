package PracticeTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class compEx1 {
	
	public static void main(String[] args)
	{
	ArrayList<student> al=new ArrayList<student>();
	al.add(new student(100,299,"Harshi"));
	al.add(new student(300,699,"Kavitha"));
	al.add(new student(200,899,"Mary"));
	al.add(new student(150,399,"Zeebra"));
	
	System.out.println("List Before Sort");
	
	for(student i:al)
	{
		System.out.println(i.toString());
	}
	System.out.println("=============================");
	System.out.println("List Sort by ID");
	Collections.sort(al, student.sortid);
	
	for(student i:al)
	{
		System.out.println(i.toString());
	}
	
	System.out.println("=============================");
	System.out.println("List Sort by Name");
	Collections.sort(al, student.sortName);
	
	for(student i:al)
	{
		System.out.println(i.toString());
	}
	
	}
	}

class student implements Comparator{
	private int id,marks;
	private String name;
	public student(int id, int marks, String name) {
		super();
		this.id = id;
		this.marks = marks;
		this.name = name;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", marks=" + marks + ", name=" + name + "]";
	}
	public int getId() {
		return id;
	}
	public int getMarks() {
		return marks;
	}
	public String getName() {
		return name;
	}
	
	public static Comparator<student> sortid=new Comparator<student>()
	{
		public int compare(student s1,student s2)
		{
			return s1.getId()-s2.getId();
		}
	
	};
	
	public static Comparator<student> sortName=new Comparator<student>()
	{
		public int compare(student s1,student s2)
		{
			return s1.getName().compareTo(s2.getName());
		}
		
			};
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}