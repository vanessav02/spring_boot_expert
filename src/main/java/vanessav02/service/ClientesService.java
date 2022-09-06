package vanessav02.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vanessav02.domain.repositorio.ClientesRepository;

@Service
public class ClientesService {

    private ClientesRepository clientesRepository;

    @Autowired
    public ClientesService(ClientesRepository clientesRepository) {
        this.clientesRepository = clientesRepository;
    }
/*
    public void salvarCliente(Cliente cliente) {
        validarCliente(cliente);
        this.clientesRepository.persistir(cliente);
    }

    public void validarCliente (Cliente cliente) {
        //aplica validações
    }*/
}
