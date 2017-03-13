package com.dallasdollies.Repositories;

import com.dallasdollies.Entities.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by darionmoore on 3/13/17.
 */
public interface AdminRepo extends JpaRepository<Administrator, Integer> {
}
