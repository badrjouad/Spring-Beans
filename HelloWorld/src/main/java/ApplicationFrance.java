import com.albert.springfacture.FacturationService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationFrance {
    public static void main(String[] args) {
        // Application pour calculer la facturation de france
        ApplicationContext contextFrance =
                new ClassPathXmlApplicationContext("BeansAppFrance.xml");

        FacturationService facturationServiceFrance=
                (FacturationService)contextFrance.getBean("facturation");
        System.out.println(facturationServiceFrance.cacluleMontantTTC(100));
    }
}
