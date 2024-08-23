package abstraction;

import java.util.List;

public class Abstraction {
	
	/*
	 * ------------------ Abstraction -------------------------------
	 *    # process of hiding implementation details in the program.
	 *    # To achieve abstraction :
	 *    
	 *    1> Abstract class :
	 *    	# class which contains abstract(unimplemented) methods and non-abstract methods
	 *        is known as abstract class.
	 *           
	 *             # abstract method :
	 *                -> method which does not have body/implementation.
	 *                e.g
	 *                    abstract void print();
	 *        			  abstract void sum(int x, int y);
	 *        
	 *       # every abstract class must have child class and must implement abstract
	 *         methods.
	 *         
	 *       # we cant create object/instance of abstract class
	 *       # level of abstraction 0-100%.
	 *       
	 *          #syntax :
	 *          
	 *               abstract class class_name{
	 *               
	 *                    //abstract methods
	 *                    
	 *                    //non-abstract methods
	 *               
	 *               }
	 *        
	 *    2> Interface :
	 *       # same as class which contains public abstract methods 
	 *          and public static final variables(constants).
	 *          
	 *       # every interface must have at least one implementation class and impl.class
	 *         must implements abstract methods.
	 *         
	 *       # we cant create object of interface.
	 *       # level of abstraction 100%.
	 *       # multiple inheritance exist in interface but not class.
	 *       
	 *            
	 *            # Syntax :
	 *            
	 *              interface  interface_name{
	 *              
	 *                 //public abstract methods
	 *                 
	 *                 //default methods
	 *                 default void print(){
	 *                 
	 *                 }
	 *                 //static methods 
	 *                  static void add(){
	 *                 
	 *                 }
	 *              }
	 */

}
