package com.aurionpro.project.repositories;


import org.hibernate.query.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.aurionpro.project.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
//	 PageResponse<User> findAll(Pageable pageable);

}
