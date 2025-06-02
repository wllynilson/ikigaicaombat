package br.com.ikigaicombat.inscricao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inscricao")
public class IncricaoController {

    private final InscricaoRepository inscricaoRepository;

    public IncricaoController(InscricaoRepository inscricaoRepository) {
        this.inscricaoRepository = inscricaoRepository;
    }

    @GetMapping("/")
    public List<Inscricao> list() {
        return this.inscricaoRepository.findAll();
    }

    @PostMapping("/")
    public Inscricao create(@RequestBody Inscricao inscricao) {
        return this.inscricaoRepository.save(inscricao);
    }
}
