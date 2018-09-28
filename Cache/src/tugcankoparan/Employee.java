package tugcankoparan;
import org.springframework.cache.annotation.Cacheable;
public class Employee {
    @Cacheable(value = { "test" })
	public String getEmployee(int empId) {
		System.out.println("Executed method..");
		if (empId == 1) {
			return "Tugcan";
		} else {
			return "Koparan";
		}
	}
}