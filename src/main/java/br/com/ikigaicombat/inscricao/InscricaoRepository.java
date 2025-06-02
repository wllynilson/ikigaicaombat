package br.com.ikigaicombat.inscricao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface InscricaoRepository extends JpaRepository<Inscricao, UUID> {

}
