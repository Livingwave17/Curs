/*
 * Java Program to test generics
 */
package generics;

/**
 *
 * @author Turbotwins2018
 */
public class TestGenerics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a box for Integers with the "GenericBox<Integer>" data type
        GenericBox<Integer> boxForInteger = new GenericBox<>();
        Integer value = 5;
        boxForInteger.setContent(value);
        System.out.println("Box of Integer contains: " + boxForInteger.getContent().toString());
        
        //create a box for String
        GenericBox<String> boxForString = new GenericBox<String>();
        String message = "Hello Java 9 colleagues";
        boxForString.setContent(message);
        System.out.println("Box of String contains: " + boxForString.getContent());

        
        //create a box for Viezure
        GenericBox<Viezure> boxForViezure = new GenericBox<Viezure>();
        Viezure viezurelePrim = new Viezure();
        boxForViezure.setContent(viezurelePrim);
        System.out.println("Box of Viezure contains: " + boxForViezure.getContent().getNumarPicioareViezure());

    }
    
}
