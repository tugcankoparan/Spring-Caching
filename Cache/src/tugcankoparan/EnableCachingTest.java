package tugcankoparan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class EnableCachingTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
 
		ctx.register(EnableCachingConfig.class);
		ctx.refresh();

		Employee employee = ctx.getBean(Employee.class);
		
		System.out.println(employee.getEmployee(1));

		System.out.println(employee.getEmployee(1));

		System.out.println(employee.getEmployee(2));
	}
}
