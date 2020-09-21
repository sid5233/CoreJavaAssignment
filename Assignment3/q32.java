import java.util.Scanner;
class Student{
	
	private int rollno;
	private String name;
	private static int objCount;
	
	void setData(int rollno, String name){
	this.rollno=rollno;
	this.name=name;
	ObjCounter();
		}

	void ObjCounter(){
	    objCount++;
		}

                    int getObjCounter(){
	  return objCount;
	}
	
	void showData(){
	System.out.println(rollno+" "+name);
	      }

	}	

class q32{
public static void main(String args[]){
                         Student s =new Student();
	       s.setData(20,"Cristiano");
	       s.showData();
	        
                         Student s1=new Student();
	       s1.setData(2,"James");
	       s1.showData();
	      
	       Student s2=new Student();
	       s2.setData(3,"Gareth");
	       s2.showData();

	       System.out.println("object counter: "+s2.getObjCounter());
             
 
	}
}