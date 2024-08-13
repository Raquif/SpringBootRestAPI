package com.cricketIpl.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import com.cricketIpl.enetites.CircketIplEntity;
/**
 * @author Raquif Roshan
 *
 */

@RepositoryRestResource(collectionResourceRel = "circketipl",path ="circketipl")
public interface CricketIplRepo extends JpaRepository<CircketIplEntity, Integer>{

}
