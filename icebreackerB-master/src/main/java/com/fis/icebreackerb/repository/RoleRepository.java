package com.fis.icebreackerb.repository;


import com.fis.icebreackerb.models.ERole;
import com.fis.icebreackerb.models.Role;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
