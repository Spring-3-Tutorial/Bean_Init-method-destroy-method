
package com.guppy.spring3beans.initDestroyMethods;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author kemalsamikaraca
 */
public class SpringApp {
    
    public static void main(String[] args){
        
        System.out.println("--- --- --- Spring 3 Bean Tutorial--- --- ---");
               
        ApplicationContext context = 
                new ClassPathXmlApplicationContext(new String[]{"Beans.xml"});
        
        // --- Bean Configuration File init-method Example --- 
        CustomerService customerBean = (CustomerService)context.getBean("initDestroyMethodBean");
        customerBean.printMessage();
        
        // --- Bean Configuration File destroy-method Example --- 
        //context.close();
    }
    
}



