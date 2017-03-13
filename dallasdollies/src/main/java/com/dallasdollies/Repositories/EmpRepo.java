package com.dallasdollies.Repositories;

import com.dallasdollies.Entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by darionmoore on 3/13/17.
 */
public interface EmpRepo extends JpaRepository<Employee, Integer> {
}
