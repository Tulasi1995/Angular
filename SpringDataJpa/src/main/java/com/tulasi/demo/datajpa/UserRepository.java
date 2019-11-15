package com.tulasi.demo.datajpa;

import org.springframework.data.repository.CrudRepository;  
public interface UserRepository extends CrudRepository<UserRecord, String> {  
} 
