package OOPS;

public class Oops {
    public static void main(String args[]){
        Student s1 = new Student();
       

        s1.name = "harsh";
        s1.marks[0] = 90;
        s1.marks[1] = 100;
        s1.marks[2] = 80;
        Student s2 = new Student(s1);
        s1.marks[0] = 90;
        s1.marks[1] = 100;
        s1.marks[2] = 100;
        for(int i =0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
        
    }

    
}
class Student{
    String name;
    int roll;
    int marks[] = new int[3] ;

    //shallow copy constructor

    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.marks = s1.marks;
    // }
//deep copy constructor
Student(Student s1){
    marks = new int[3];
    this.name = s1.name;
    for(int i =0;i<marks.length;i++){
        this.marks[i] = s1.marks[i];
    }
// this.marks = s1.marks;

}

    Student(){
        System.out.println("Constructor is called");
    }
    Student(String name){
       
        this.name = name;
        
    }

    Student(int roll){
        this.roll = roll;
    }
    
}
