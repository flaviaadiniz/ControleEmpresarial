package br.com.ada.controleempresarial.service;

import br.com.ada.controleempresarial.model.Endereco;
import br.com.ada.controleempresarial.repository.EnderecoRepository;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class EnderecoService {

    private final EnderecoRepository enderecoRepository;

    public EnderecoService(EnderecoRepository enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }

    public Endereco salvar(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    public List<Endereco> listar() {
        return (List<Endereco>) enderecoRepository.findAll();
    }

    public Endereco buscarPorId(Long id) {
        return enderecoRepository.findById(id).orElse(null);
    }

    public void deletarPorId(Long id) {
        enderecoRepository.deleteById(id);
    }

}
