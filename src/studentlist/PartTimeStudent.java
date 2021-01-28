
package studentlist;

/**
 *
 * @author Han Byul Moon
 */
public class PartTimeStudent extends Student{
    
    private int numCourses;
    
    public PartTimeStudent(int numCourses, String name) {
        super(name); 
        this.numCourses = numCourses;
    }
    
    public int getNumCourses(){
       return this.numCourses;
    }
    
    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }
    
}
