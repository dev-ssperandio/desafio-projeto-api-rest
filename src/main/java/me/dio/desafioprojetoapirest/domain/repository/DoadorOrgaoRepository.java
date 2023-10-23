package me.dio.desafioprojetoapirest.domain.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import me.dio.desafioprojetoapirest.domain.model.DoadorOrgao;

@Repository
public interface DoadorOrgaoRepository extends JpaRepository<DoadorOrgao, Long> {
}
