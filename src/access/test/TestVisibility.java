/*
 * Test Visibility in Java
 */
package access.test;

import access.packageone.Alpha;
import access.packageone.Beta;
import access.packageone.Ipsilon;
import access.packagetwo.Delta;
import access.packagetwo.Gamma;

/**
 *
 * @author Turbotwins2018
 */
public class TestVisibility {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("------------alphaObject.VisibilityInClass------------------");
        Alpha alphaObject = new Alpha();
        alphaObject.visibilityInClass();
        
        System.out.println("------------betaObject.VisibilityInSuperClass------------------");
        Beta betaObject = new Beta();
        betaObject.visibilityInSuperClass();
        
        System.out.println("------------gammaObject.VisibilityInSuperClassInOtherPackage------------------");
        Gamma gammaObject = new Gamma();
        gammaObject.visibilityInSuperClassInOtherPackage();
        
        System.out.println("------------deltaObject.VisibilityInSuperClassInOtherPackage------------------");
        Delta deltaObject = new Delta();
        deltaObject.visibilityInSuperClassInOtherPackage();
        
        System.out.println("------------ipsilonObject.VisibilityInClass------------------");
        Ipsilon ipsilonObject = new Ipsilon();
        ipsilonObject.visibilityInClass();
    }
    
}
