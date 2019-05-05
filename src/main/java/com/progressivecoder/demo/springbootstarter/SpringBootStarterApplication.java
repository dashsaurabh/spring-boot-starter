package com.progressivecoder.demo.springbootstarter;

import com.progressivecoder.demo.springbootstarter.entities.Role;
import com.progressivecoder.demo.springbootstarter.entities.User;
import com.progressivecoder.demo.springbootstarter.entities.Vehicle;
import com.progressivecoder.demo.springbootstarter.repositories.UserRepository;
import com.progressivecoder.demo.springbootstarter.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.UUID;

@SpringBootApplication
public class SpringBootStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStarterApplication.class, args);
	}

}

@Component
class DemoCommandLineRunner implements CommandLineRunner{

	@Autowired
	private VehicleRepository vehicleRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public void run(String... args) throws Exception {

		Vehicle audi = new Vehicle();
		audi.setId(UUID.randomUUID());
		audi.setVehicleIdentityNumber("Reg#1234");
		audi.setMake("Audi");
		audi.setModel("Q5");

		vehicleRepository.save(audi);

		Vehicle tesla = new Vehicle();
		tesla.setId(UUID.randomUUID());
		tesla.setVehicleIdentityNumber("Reg#6789");
		tesla.setMake("Tesla");
		tesla.setModel("Model S");

		vehicleRepository.save(tesla);

		User user = new User();
		user.setUsername("application-user");
		user.setPassword(passwordEncoder.encode("password"));
		user.grantAuthority(Role.ROLE_ADMIN);

		userRepository.save(user);
	}
}

