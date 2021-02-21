package com.dsubires.pocs.apm.repository;

import com.dsubires.pocs.apm.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
