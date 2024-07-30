public class assign7 {
    
    public void cal() {

        System.out.println("This is Assignment QUestion 7");
        int totalStudents = 90;
        int boys = 45;
        int boysWithGradeA = 20;
        
       
        double percentageWithGradeA = 50.0;
        
        
        int totalWithGradeA = (int) ((percentageWithGradeA / 100) * totalStudents);
        
        int girls = totalStudents - boys;
        
       
        int girlsWithGradeA = totalWithGradeA - boysWithGradeA;
      
        System.out.println("Total number of girls who secured grade 'A': " + girlsWithGradeA);
    
    
    }
    
    public static void main(String[] args) 
    {

        assign7 a1 = new assign7();
        a1.cal();
    }
}
