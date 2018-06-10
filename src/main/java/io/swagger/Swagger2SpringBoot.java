package io.swagger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.threeten.bp.OffsetDateTime;

import io.swagger.model.Exam;
import io.swagger.model.User;
import io.swagger.repository.ExamRepository;
import io.swagger.repository.UserRepository;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = { "io.swagger", "io.swagger.api" })
public class Swagger2SpringBoot implements CommandLineRunner {
	
	private static final Logger log = LoggerFactory.getLogger(Swagger2SpringBoot.class);

    @Override
    public void run(String... arg0) throws Exception {
        if (arg0.length > 0 && arg0[0].equals("exitcode")) {
            throw new ExitException();
        }
    }

    public static void main(String[] args) throws Exception {
        new SpringApplication(Swagger2SpringBoot.class).run(args);
    }

    class ExitException extends RuntimeException implements ExitCodeGenerator {
        private static final long serialVersionUID = 1L;

        @Override
        public int getExitCode() {
            return 10;
        }

    }
    @Bean
	public CommandLineRunner demo(UserRepository userRepo, ExamRepository examRepo) {
		return (args) -> {
			// save a couple of customers
			userRepo.save(new User("Wolfgang", "Heindl", "Wolfi", "1234", "K0123456", false, true));
			userRepo.save(new User("Lisa", "Grurl", "Liesl", "1234", "K6543210", true, true));
			userRepo.save(new User("Stefan", "Mayr", "Steve", "1234", "PROFESSOR", false, false));

			// fetch all customers
			log.info("Users found with findAll():");
			log.info("-------------------------------");
			for (User user : userRepo.findAll()) {
				log.info(user.toString());
			}
			log.info("");

			// fetch customers by last name
			log.info("Customer found with findByLastName('Heindl'):");
			log.info("--------------------------------------------");
			User testUser = userRepo.findByUserName("Wolfi");
			log.info(testUser.toString());
			log.info("");
			
			
			
			examRepo.save(new Exam("259028", "Service Engineering", "Vorlesung", "VL", "SS 2018", 35, 8, 
					"Die Studierenden verstehen die organisatorischen Modelle und Prozesse elektronischer und webbasierter Dienste (Services) im betrieblichen Umfeld.", 
					OffsetDateTime.now(), OffsetDateTime.now(), OffsetDateTime.now(), OffsetDateTime.now(), OffsetDateTime.now()));
			examRepo.save(new Exam("258450", "Semantische Technologien", "Vorlesung", "VL", "SS 2018", 40, 3, 
					"Die Lehrinhalte werden in Form einer klassischen Vorlesung, die durch eine Übungsveranstaltung begleitet und ergänzt wird, vermittelt..", 
					OffsetDateTime.now(), OffsetDateTime.now(), OffsetDateTime.now(), OffsetDateTime.now(), OffsetDateTime.now()));
			examRepo.save(new Exam("258200", "Data & Knowledge Engineering", "Seminar", "SE", "SS 2018", 20, 5, 
					"Die Studierenden können das in den Basis-, Kern- und Spezialkompetenz vermittelnden Studienfächern erworbene Wissen und die entwickelten Fähigkeiten zur Lösung von praktischen oder wissenschaftlichen Problemstellungen der Wirtschaftsinformatik anwenden. ", 
					OffsetDateTime.now(), OffsetDateTime.now(), OffsetDateTime.now(), OffsetDateTime.now(), OffsetDateTime.now()));
			
			
			
			// fetch exams by last examId
			log.info("Find Test Exams by ExamId:");
			log.info("--------------------------------------------");
			Exam testExam = examRepo.findByExamId("259028");
			log.info(testExam.toString());
			testExam = examRepo.findByExamId("258450");
			log.info(testExam.toString());
			testExam = examRepo.findByExamId("258200");
			log.info("");
			
			
			
		};
	}
}
