package core;

class StudentBean
{
    private int studentId;
    private String studentName;
    
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
public class EncapsulationExample 
{
    
    public static void main(String args[])
    {
        StudentBean sb = new StudentBean();
        
        //Setting values
        sb.setStudentId(99);
        sb.setStudentName("JIP");
        
        //Retrieving the values
        System.out.println("Student Id : "+sb.getStudentId());
        System.out.println("Student Name : "+sb.getStudentName());
    }
}

//Through encapsulation we can make the class as read only or write only or both
//Encapsulation increases the maintianability of the code without any break
//Provides you the better control over the data