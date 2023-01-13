package com.criaco.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.criaco.demo.model.Pessoas;
@Repository
public interface PessoasRepository extends JpaRepository<Pessoas,Long>{

}
