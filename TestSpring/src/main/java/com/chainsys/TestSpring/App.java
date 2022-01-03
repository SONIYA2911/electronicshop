package com.chainsys.TestSpring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//        BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource("Spring.xml"));
//        Employee emp=(Employee) beanFactory.getBean("emp");
//        Employee emp1=(Employee) beanFactory.getBean("emp");
//        emp.getEmpName("soniya");
        //System.out.println(emp==emp1);
       ApplicationContext beanfactory=new ClassPathXmlApplicationContext("Spring.xml");
   Employee emp=(Employee) beanfactory.getBean("emp");
        
        emp.getEmpName("soniya");
    }
}
