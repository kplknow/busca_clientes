package br.com.kpl.kplknow;

import br.com.kpl.kplknow.entidade.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ClientesBean {

    private Cliente cliente = new Cliente();
    private List<Cliente> clientes = new ArrayList<>();
    
    public void adicionar(){
        clientes.add(cliente);
        cliente = new Cliente();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
}
