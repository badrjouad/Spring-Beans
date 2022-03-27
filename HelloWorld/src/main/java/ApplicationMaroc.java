import com.albert.springfacture.FacturationService;
import com.albert.springtva.TVA;
import com.albert.springtva.TVAFrance;
import com.albert.springtva.TVAMaroc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationMaroc {

    public static void main(String[] args) {

        // Application pour calculer la facturation du maroc
        ApplicationContext contextMaroc =
                new ClassPathXmlApplicationContext("BeansAppMaroc.xml");

        FacturationService facturationService=
                (FacturationService)contextMaroc.getBean("facturation");
        System.out.println(facturationService.cacluleMontantTTC(100));








    }
}
