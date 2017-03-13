package com.dallasdollies.Repositories;

import com.dallasdollies.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by darionmoore on 3/13/17.
 */
public interface ClientRepo extends JpaRepository<Client, Integer> {
}
