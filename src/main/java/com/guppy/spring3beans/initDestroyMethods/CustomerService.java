
package com.guppy.spring3beans.initDestroyMethods;

/**
 *
 * @author kemalsamikaraca
 */
public class CustomerService {
    
    private String message;

    // Initialize method
    public void initMethod() throws Exception {
        System.out.println("INIT METHOD -> Message :: " + message);
    }

    // Destruction Method
    public void destroyMethod() throws Exception {
        System.out.println("DESTROY METHOD -> Spring Container is destroy! Customer Service clean up");
    }
    
    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    public void printMessage(){
        System.out.println("\nMessage :: " + this.getMessage());
    }
    
}
