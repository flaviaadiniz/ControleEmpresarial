package br.com.ada.controleempresarial.controller;


import br.com.ada.controleempresarial.model.Funcionario;
import br.com.ada.controleempresarial.model.Usuario;
import br.com.ada.controleempresarial.service.FuncionarioService;
import br.com.ada.controleempresarial.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    private final FuncionarioService funcionarioService;

    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @PostMapping()
    public Funcionario salvar(@RequestBody Funcionario funcionario) {
        return funcionarioService.salvar(funcionario);
    }

    @GetMapping()
    public List<Funcionario> listar() {
        return funcionarioService.listar();
    }

    @GetMapping("/{id}")
    public Funcionario buscarPorId(@PathVariable Long id) {
        return funcionarioService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarPorId(@PathVariable Long id) {
        funcionarioService.deletarPorID(id);
    }


}
