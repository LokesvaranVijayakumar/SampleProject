package com.backendapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backendapi.entity.CanBasicDet;
import com.backendapi.entity.CanUserDet;

@Repository
public interface CanBasicDetRepository extends JpaRepository<CanBasicDet, Integer>{

	void save(CanUserDet canUserDet);

}
