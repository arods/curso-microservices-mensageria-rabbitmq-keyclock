package io.github.cursodsousa.msavaliadorcredito.application;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import io.github.cursodsousa.msavaliadorcredito.domain.model.DadosCliente;
import io.github.cursodsousa.msavaliadorcredito.domain.model.SituacaoCliente;
import io.github.cursodsousa.msavaliadorcredito.infra.clients.ClienteResourceClient;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AvaliadorCreditoService {

    private final ClienteResourceClient clientesClient;
    
    public SituacaoCliente obterSituacaoCliente(String cpf){
        ResponseEntity<DadosCliente> dadosClienteResponse = clientesClient.dadosCliente(cpf);

        return SituacaoCliente
                .builder()
                .cliente(dadosClienteResponse.getBody())
                .build();
    }
}
