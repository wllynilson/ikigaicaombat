package br.com.ikigaicombat.inscricao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inscricao")
//@CrossOrigin(origins = "http://localhost:63342")
public class IncricaoController {

    @Autowired(required = true)
    private InscricaoRepository inscricaoRepository;

    @GetMapping("/")
    public List<Inscricao> list() {
        return this.inscricaoRepository.findAll();
    }

    @PostMapping("/")
    public Inscricao create(@RequestBody Inscricao inscricao) {
        return this.inscricaoRepository.save(inscricao);
    }
}
