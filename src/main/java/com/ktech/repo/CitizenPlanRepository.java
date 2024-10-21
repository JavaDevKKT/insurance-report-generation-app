package com.ktech.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ktech.entity.CitizenPlan;

public interface CitizenPlanRepository extends JpaRepository<CitizenPlan, Integer> {

}
