package com.siga.constat.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.siga.constat.domain.ChefAgence;

@Repository
public interface Chef_agenceRepository extends JpaRepository<ChefAgence,Long>{


}
