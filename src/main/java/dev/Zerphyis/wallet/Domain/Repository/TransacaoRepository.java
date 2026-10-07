package dev.Zerphyis.wallet.Domain.Repository;

import dev.Zerphyis.wallet.Domain.Entitys.Transacao;

import java.util.List;

public interface TransacaoRepository {
    public Transacao salvarTransacao(Transacao transacao);
    List buscarPorCliente(String idCliente);
}
