class Student{
int id;
String name;

public static void main(String args[]){
Student s1=new Student();
s1.id=1;
s1.name="a";
Student s2=new Student();
s2.id=2;
s2.name="b";
System.out.println(s1.name);
System.out.println(s1.id);
System.out.println(s2.name);
System.out.println(s2.id);
}
}