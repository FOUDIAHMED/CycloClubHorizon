package ahmed.foudi.config;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class MyWebApplicationInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        ApplicationContext xmlContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AnnotationConfigWebApplicationContext context= new AnnotationConfigWebApplicationContext();
        //context.register(ServiceConfig.class);
        //context.register(MvcConfig.class);
        context.setParent(xmlContext);
        context.setServletContext(servletContext);
        context.refresh();

        DispatcherServlet dispatcherServlet = new DispatcherServlet(context);
        ServletRegistration.Dynamic servletRegistration = servletContext.addServlet("app", dispatcherServlet);
        servletRegistration.setLoadOnStartup(1);
        servletRegistration.addMapping("/*");

    }
}
