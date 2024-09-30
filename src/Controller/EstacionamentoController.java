/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.ModelDAO.ClienteDAO;
import Model.ModelDAO.EspacoEstacionamentoDAO;
import Model.Cliente;
import Model.EspacoEstacionamento;

public class EstacionamentoController {
    private ClienteDAO clienteDAO;
    private EspacoEstacionamentoDAO espacoDAO;

    public EstacionamentoController() {
        this.clienteDAO = new ClienteDAO();
        this.espacoDAO = new EspacoEstacionamentoDAO();
    }

    public void cadastrarCliente(Cliente cliente) throws Exception {
        clienteDAO.create(cliente);
    }

    public void cadastrarEspaco(EspacoEstacionamento espaco) throws Exception {
        espacoDAO.create(espaco);
    }

    public void atualizarCliente(Cliente cliente) throws Exception {
        clienteDAO.update(cliente);
    }

    public void atualizarEspaco(EspacoEstacionamento espaco) throws Exception {
        espacoDAO.update(espaco);
    }

    public void deletarCliente(int idCliente) throws Exception {
        clienteDAO.delete(idCliente);
    }

    public void deletarEspaco(String identificador) throws Exception {
        espacoDAO.delete(identificador);
    }

    public Cliente buscarClientePorId(int id) throws Exception {
        return clienteDAO.read(id);
    }

    public EspacoEstacionamento buscarEspacoPorIdentificador(String identificador) throws Exception {
        return espacoDAO.read(identificador);
    }
}
