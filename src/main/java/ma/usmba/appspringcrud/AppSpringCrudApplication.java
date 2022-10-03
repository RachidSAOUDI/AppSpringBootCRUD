package ma.usmba.appspringcrud;

import ma.usmba.appspringcrud.models.Employee;
import ma.usmba.appspringcrud.repositories.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppSpringCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppSpringCrudApplication.class, args);
    }

    CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository){
        return args -> {
            employeeRepository.save(new Employee(null, "kamali", "ahmed", "rachid@maroc.ma"));
            employeeRepository.save(new Employee(null, "kamali", "ahmed", "rachid@maroc.ma"));
            employeeRepository.save(new Employee(null, "kamali", "ahmed", "rachid@maroc.ma"));
            employeeRepository.save(new Employee(null, "kamali", "ahmed", "rachid@maroc.ma"));
            employeeRepository.findAll().forEach(e->{
                System.out.println(e.getFirstName());
            });
        };
    }
}
