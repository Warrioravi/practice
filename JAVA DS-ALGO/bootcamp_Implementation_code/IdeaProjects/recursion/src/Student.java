public class Student {
    private String name;

    public String getname() {
        return this.name;
    }

    public void setname(String name) throws Exception {
        if (name.equals("") || name == null) {
            throw new Exception("Names can't be null or empty");
        }
        this.name=name;

    }
    public final int rollno;




    public int getRollno() {
        return rollno;
    }
    public static int  numberofstudents=0;
    public int getNumberofstudents(){
        return  Student.numberofstudents;
    }
    private static String Uniform="White";
    public static String getUniform(){
        String uniform = Uniform;
        return uniform;
    }

    Student(int rollno,String name){
        this.rollno=rollno;
        this.name=name;

    }


}