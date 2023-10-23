package me.dio.desafioprojetoapirest.domain.repository;

import me.dio.desafioprojetoapirest.domain.model.DoacaoOrgao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoacaoOrgaoRepository extends JpaRepository<DoacaoOrgao, Long> {
}
