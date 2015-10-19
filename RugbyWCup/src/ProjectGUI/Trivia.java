/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectGUI;

/**
 *
 * @author x13332576
 */
public class Trivia {
    private String name;
    private double correctA;
    

    public Trivia(){
        name = new String();
        correctA=0.0;

    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    public void setCorrectA(double correctA){
        this.correctA = correctA;
    }
    
    public double getCorrectA(){
        return correctA;
    }
         

}