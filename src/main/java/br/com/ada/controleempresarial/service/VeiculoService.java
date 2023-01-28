package br.com.ada.controleempresarial.service;

import br.com.ada.controleempresarial.model.Veiculo;
import br.com.ada.controleempresarial.repository.VeiculoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VeiculoService {

    private final VeiculoRepository veiculoRepository;

    public VeiculoService(VeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }

    public Veiculo salvar(Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

    public List<Veiculo> listar() {
        return (List<Veiculo>) veiculoRepository.findAll();
    }

    public Veiculo buscarPorId(Long id) {
        return veiculoRepository.findById(id).orElse(null);
    }

    public List<Veiculo> buscarPorAno(String ano) {
        List<Veiculo> allVehicles = (List<Veiculo>) veiculoRepository.findAll();
        List<Veiculo> result = new ArrayList<>();
        for (Veiculo v : allVehicles) {
            if (v.getAnoModelo().equals(ano)) {
                result.add(v);
            }
        }
        return result;
    }

    public void deletarPorId(Long id) {
        veiculoRepository.deleteById(id);
    }

}
