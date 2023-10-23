package me.dio.desafioprojetoapirest.domain.repository;

import me.dio.desafioprojetoapirest.domain.model.Orgao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrgaoRepository extends JpaRepository<Orgao, Long> {
}
