package dev.Zerphyis.wallet.Domain.Entitys;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transacao {
    private Long id;
    private String clienteId;
    private BigDecimal valor;
    private TipoTransacao tipo;
    private LocalDateTime data;

    public Transacao(Long id, String clienteId, BigDecimal valor, TipoTransacao tipo, LocalDateTime data) {
        this.id = id;
        this.clienteId = clienteId;
        this.valor = valor;
        this.tipo = tipo;
        this.data = data;
    }

    public Transacao() {
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public TipoTransacao getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransacao tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getClienteId() {
        return clienteId;
    }

    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
