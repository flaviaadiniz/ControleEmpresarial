package br.com.ada.controleempresarial.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Despesa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fornecedor;
    private String categoria;
    @Column(unique = true)
    private String numeroNotaFiscal;
    private double valorNotaFiscal;
    private LocalDate dataDeVencimento;
    private boolean pago;

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNumeroNotaFiscal() {
        return numeroNotaFiscal;
    }

    public void setNumeroNotaFiscal(String numeroNotaFiscal) {
        this.numeroNotaFiscal = numeroNotaFiscal;
    }

    public double getValorNotaFiscal() {
        return valorNotaFiscal;
    }

    public void setValorNotaFiscal(double valorNotaFiscal) {
        this.valorNotaFiscal = valorNotaFiscal;
    }

    public LocalDate getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(LocalDate dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    public Long getId() {
        return id;
    }
}
