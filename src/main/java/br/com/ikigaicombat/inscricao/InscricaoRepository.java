package br.com.ikigaicombat.inscricao;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface InscricaoRepository extends JpaRepository<Inscricao, UUID> {

}
