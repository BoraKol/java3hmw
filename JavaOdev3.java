
package javaodev3;


 
public class JavaOdev3 {

   
    public static void main(String[] args) {
        
        Student student1=new Student();
        student1.setId(1);
        student1.setFirstName("Bora");
        student1.setLastName("Kol");
        student1.setNationalIdentity("5555555");
        student1.setSchoolName("SDU");
        student1.setSchoolNumber("1111111");
        student1.setDepartment("Computer engineering");
        
        Student student2=new Student();
        student2.setId(2);
        student2.setFirstName("Tolga");
        student2.setLastName("Şener");
        student2.setNationalIdentity("7777777");
        student2.setSchoolName("AU");
        student2.setSchoolNumber("3333333");
        student2.setDepartment("Mechanical engineering");
        
        Instructor instructor = new Instructor();
        instructor.setId(3);
        instructor.setFirstName("Engin");
        instructor.setLastName("Demiroğ");
        instructor.setNationalIdentity("9999999");
        instructor.setBranch("Software Developer");
        instructor.setWorkSpace("Homeoffice");
        
       User[]users={student1,student2,instructor};
        
       UserManager userManager=new UserManager();
       userManager.addMultiple(users);
       System.out.println("-------------");
       userManager.updateMultiple(users);
       System.out.println("-------------");
       userManager.deleteMultiple(users);
       
        
        
        
    }
    
}
