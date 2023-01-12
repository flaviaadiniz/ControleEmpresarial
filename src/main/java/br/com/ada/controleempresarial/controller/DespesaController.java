package br.com.ada.controleempresarial.controller;

import br.com.ada.controleempresarial.model.Despesa;
import br.com.ada.controleempresarial.service.DespesaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/despesas")
public class DespesaController {

    private final DespesaService despesaService;

    public DespesaController(DespesaService despesaService) {
        this.despesaService = despesaService;
    }

    @PostMapping()
    public Despesa salvar(@RequestBody Despesa despesa) {
        return despesaService.salvar(despesa);
    }

    @GetMapping()
    public List<Despesa> listar() {
        return despesaService.listar();
    }

    @GetMapping("/{id}")
    public Despesa buscarPorId(@PathVariable Long id) {
        return despesaService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarPorId(@PathVariable Long id) {
        despesaService.deletarPorID(id);
    }

}
