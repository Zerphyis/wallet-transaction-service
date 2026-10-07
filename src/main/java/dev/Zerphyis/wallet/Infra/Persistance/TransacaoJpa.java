package dev.Zerphyis.wallet.Infra.Persistance;

import dev.Zerphyis.wallet.Domain.Entitys.TipoTransacao;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_transacao")
public class TransacaoJpa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cliente_id", nullable = false)
    private String clienteId;

    @Column(nullable = false)
    private BigDecimal valor;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoTransacao tipo;

    @Column(nullable = false)
    private LocalDateTime data;

    public TransacaoJpa(Long id, String clienteId, BigDecimal valor, TipoTransacao tipo, LocalDateTime data) {
        this.id = id;
        this.clienteId = clienteId;
        this.valor = valor;
        this.tipo = tipo;
        this.data = data;
    }

    public TransacaoJpa() {
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
