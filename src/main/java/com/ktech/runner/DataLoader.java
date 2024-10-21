package com.ktech.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import com.ktech.entity.CitizenPlan;
import com.ktech.repo.CitizenPlanRepository;

@Component
public class DataLoader implements ApplicationRunner {
	@Autowired
	private CitizenPlanRepository citizenPlanRepository;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		CitizenPlan c1 = new CitizenPlan();
		c1.setCitizenName("Smith");
		c1.setGender("Male");
		c1.setPlanName("Cash");
		c1.setPlanStatus("Denied");
		c1.setDenialReason("Rental Income");

		CitizenPlan c2 = new CitizenPlan();
		c2.setCitizenName("Smith");
		c2.setGender("Male");
		c2.setPlanName("Cash");
		c2.setPlanStatus("Terminated");
		c2.setDenialReason("Rental Income");

		CitizenPlan c3 = new CitizenPlan();
		c3.setCitizenName("Caryy");
		c3.setGender("Fe-Male");
		c3.setPlanName("Cash");
		c3.setPlanStatus("Terminated");
		c3.setPlanStartDate(LocalDate.now().minusMonths(4));
		c3.setPlanEndDate(LocalDate.now().plusMonths(6));
		c3.setBenifitAmount(5000.00);
		c3.setTerminatedDate(LocalDate.now());
		c3.setTerminationReason("Employed");

		CitizenPlan c4 = new CitizenPlan();
		c4.setCitizenName("Marry");
		c4.setGender("Fe-Male");
		c4.setPlanName("Cash");
		c4.setPlanStatus("Terminated");
		c4.setPlanStartDate(LocalDate.now().minusMonths(4));
		c4.setPlanEndDate(LocalDate.now().plusMonths(6));
		c4.setBenifitAmount(3000.00);
		c4.setTerminatedDate(LocalDate.now());
		c4.setTerminationReason("Employed");

		CitizenPlan c5 = new CitizenPlan();
		c5.setCitizenName("John");
		c5.setGender("Male");
		c5.setPlanName("Cash");
		c5.setPlanStatus("Accept");
		c5.setDenialReason("Rental Income");

		CitizenPlan c6 = new CitizenPlan();
		c6.setCitizenName("Smitha");
		c6.setGender("Male");
		c6.setPlanName("Cash");
		c6.setPlanStatus("Terminated");
		c6.setDenialReason("Rental Income");

		CitizenPlan c7 = new CitizenPlan();
		c7.setCitizenName("Reeta");
		c7.setGender("Fe-Male");
		c7.setPlanName("Cash");
		c7.setPlanStatus("Terminated");
		c7.setPlanStartDate(LocalDate.now().minusMonths(4));
		c7.setPlanEndDate(LocalDate.now().plusMonths(6));
		c7.setBenifitAmount(9000.00);
		c7.setTerminatedDate(LocalDate.now());
		c7.setTerminationReason("Employed");

		List<CitizenPlan> asList = Arrays.asList(c1, c2, c3, c4, c5, c6, c7);
		citizenPlanRepository.saveAll(asList);

	}
}
