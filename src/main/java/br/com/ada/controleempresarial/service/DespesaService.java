package br.com.ada.controleempresarial.service;

import br.com.ada.controleempresarial.model.Despesa;
import br.com.ada.controleempresarial.repository.DespesaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DespesaService {

    private final DespesaRepository despesaRepository;

    public DespesaService(DespesaRepository despesaRepository) {
        this.despesaRepository = despesaRepository;
    }

    public Despesa salvar(Despesa despesa) {
        return despesaRepository.save(despesa);
    }

    public List<Despesa> listar() {
        return (List<Despesa>) despesaRepository.findAll();
    }

    public Despesa buscarPorId(Long id) {
        return despesaRepository.findById(id).orElse(null);
    }

    public void deletarPorID(Long id) {
        despesaRepository.deleteById(id);
    }

}
