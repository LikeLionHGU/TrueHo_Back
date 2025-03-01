package com.example.holiday.user.repository;


import com.example.holiday.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByGoogleUserIdAndGoogleEmailAndGoogleName(String userId, String email, String name);

    List<User> findAllByHansumAndShowing(Long hansum, Long showing);
    
}
