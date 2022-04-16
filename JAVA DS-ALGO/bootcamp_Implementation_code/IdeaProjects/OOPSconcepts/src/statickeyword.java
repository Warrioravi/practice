public class statickeyword {
    //Java Program to demonstrate the use of a static method.

        int rollno;
        String name;
        static String college = "ITS";
        //static method to change the value of static variable
        static void change(){
            college = "BBDIT";
        }
        //constructor to initialize the variable
        statickeyword(int r, String n){
            rollno = r;
            name = n;
        }
        //method to display values
        void display(){System.out.println(rollno+" "+name+" "+college);}
    }
    //Test class to create and display the values of object
     class TestStaticMethod{
        public static void main(String args[]){
            statickeyword.change();//calling change method
            //creating objects
            statickeyword s1 = new statickeyword(111,"Karan");
            statickeyword s2 = new statickeyword(222,"Aryan");
            statickeyword s3 = new statickeyword(333,"Sonoo");
            //calling display method
            s1.display();
            s2.display();
            s3.display();
        }

}
