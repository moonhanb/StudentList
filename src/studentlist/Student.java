/*
 * Han Byul Moon
 * 
 */
package studentlist;


public class Student {
    
    //----- Data Fields -----
    private String name; 
    
    //----- Constructors -----
    public Student(String name) {
        this.name = name; 
    }
    
    //----- Get Methods -----
    public String getName() {
        return this.name; 
    }
    
    //----- Set Methods -----
    public void setName(String name) {
        this.name = name; 
    }
    
}
