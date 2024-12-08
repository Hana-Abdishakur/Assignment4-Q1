public class Student {
    int StudentID ;
    String StudentName;
    {
        StudentID = 240;
        StudentName = "Ayan";
        System.out.println("StudentID from IIB" +" "+ StudentID);
        System.out.println("StudentName  from IIB" +" "+ StudentName);
    }
    public Student(int SID , String SN) {
        this.StudentID =SID;
        this.StudentName =SN;

        System.out.println("Student ID from Constructor" +" "+StudentID);
        System.out.println("Student Name from Constructor" +" "+StudentName);

    }
    public int getStudentID() {
        return StudentID;
    }

    public String getStudentName() {
        return StudentName;
    }
}
