package apex.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Student st1= new Student();
        st1.setAge(10);
        st1.setName("ABC");
        System.out.println(st1);
        
        ApplicationContext ctx= new FileSystemXmlApplicationContext("beans.xml");
       Student st2= ctx.getBean("id1",Student.class);
       System.out.println(st2);
      (( FileSystemXmlApplicationContext) ctx).close();
      
      ApplicationContext ctx2= new ClassPathXmlApplicationContext("beans2.xml");
      Student st3= ctx2.getBean("id1",Student.class);
      System.out.println(st3);
     (( ClassPathXmlApplicationContext) ctx2).close();
       
    }
}
