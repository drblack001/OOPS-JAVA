class Student{
    int id;
    String name;
    static String college = "ABESEC";
    public Student(int id,String name){
        this.id=id;
        this.name=name;
    }
    void display(){
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
        System.out.println("College : "+college);
    }

}
public class ConstructorDemo {
    public static void main(String[] args) {
        Student s1 = new Student(001,"Rajat");
        s1.display();
        System.out.println();
        
    }    
}