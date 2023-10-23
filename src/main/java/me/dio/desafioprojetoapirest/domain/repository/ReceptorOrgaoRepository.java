package me.dio.desafioprojetoapirest.domain.repository;

import me.dio.desafioprojetoapirest.domain.model.ReceptorOrgao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceptorOrgaoRepository extends JpaRepository<ReceptorOrgao, Long> {
}
