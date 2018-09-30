/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package istemperaturepositive;

/**
 *
 * @author Oktawian
 */
public class IsTemperaturePositive {

    /**
     * @param args the command line arguments
     */
    
    static boolean isTemperaturePositive(int temperature){
        if(temperature > 0)
            return true;
        else
            return false;
    }
    
    public static void main(String[] args) {
        
        boolean isTemperaturePositive = isTemperaturePositive(-4);
        if(isTemperaturePositive == true)
            System.out.println("Temperature is positive!\n");
        else
            System.out.println("Temperature is not positive!\n");
    }
    
}
