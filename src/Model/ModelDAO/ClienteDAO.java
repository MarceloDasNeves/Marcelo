package Model.ModelDAO;

import Model.*;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import model.DBConnect;

public class ClienteDAO {
    public void create(Cliente cliente) throws SQLException {
        String sql = "INSERT INTO Cliente (nome, residencia, contacto, matricula, corCarro, valorPorHora, tipoPagamento, estacionado, dataHoraEntrada, espacoEstacionado) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn= DBConnect.getConnection();    
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getResidencia());
            stmt.setString(3, cliente.getContacto());
            stmt.setString(4, cliente.getMatricula());
            stmt.setString(5, cliente.getCorCarro());
            stmt.setDouble(6, cliente.getValorPorHora());
            stmt.setString(7, cliente.getTipoPagamento());
            stmt.setBoolean(8, cliente.isEstacionado());
            stmt.setObject(9, cliente.getDataHoraEntrada());
            stmt.setInt(10, cliente.getEspacoEstacionado());
            stmt.executeUpdate();
        }
    }

    public Cliente read(int idCliente) throws SQLException {
        String sql = "SELECT * FROM Cliente WHERE idCliente = ?";
        try (Connection conn = DBConnect.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idCliente);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Cliente(
                    rs.getString("nome"),
                    rs.getString("contacto"),
                    rs.getString("residencia"),
                    rs.getString("matricula"),
                    rs.getString("corCarro"),
                    rs.getDouble("valorPorHora"),
                    rs.getString("tipoPagamento"),
                    rs.getBoolean("estacionado"),
                    rs.getObject("dataHoraEntrada", LocalDateTime.class),
                    rs.getInt("espacoEstacionado")
                );
            }
        }
        return null;
    }

    public void update(Cliente cliente) throws SQLException {
        String sql = "UPDATE Cliente SET nome = ?, residencia = ?, contacto = ?, matricula = ?, corCarro = ?, valorPorHora = ?, tipoPagamento = ?, estacionado = ?, dataHoraEntrada = ?, espacoEstacionado = ? WHERE idCliente = ?";
        try (Connection conn = DBConnect.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getResidencia());
            stmt.setString(3, cliente.getContacto());
            stmt.setString(4, cliente.getMatricula());
            stmt.setString(5, cliente.getCorCarro());
            stmt.setDouble(6, cliente.getValorPorHora());
            stmt.setString(7, cliente.getTipoPagamento());
            stmt.setBoolean(8, cliente.isEstacionado());
            stmt.setObject(9, cliente.getDataHoraEntrada());
            stmt.setInt(10, cliente.getEspacoEstacionado());
            stmt.setInt(11, cliente.getIdCliente());
            stmt.executeUpdate();
        }
    }

    public void delete(int idCliente) throws SQLException {
        String sql = "DELETE FROM Cliente WHERE idCliente = ?";
        try (Connection conn = DBConnect.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idCliente);
            stmt.executeUpdate();
        }
    }

    public List<Cliente> searchByMatricula(String matricula) throws SQLException {
        String sql = "SELECT * FROM Cliente WHERE matricula LIKE ?";
        List<Cliente> clientes = new ArrayList<>();
        try (Connection conn = DBConnect.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, "%" + matricula + "%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                clientes.add(new Cliente(
                    rs.getString("nome"),
                    rs.getString("contacto"),
                    rs.getString("residencia"),
                    rs.getString("matricula"),
                    rs.getString("corCarro"),
                    rs.getDouble("valorPorHora"),
                    rs.getString("tipoPagamento"),
                    rs.getBoolean("estacionado"),
                    rs.getObject("dataHoraEntrada", LocalDateTime.class),
                    rs.getInt("espacoEstacionado")
                ));
            }
        }
        return clientes;
    }
    
    public void converterParaClienteMensal(Cliente clienteTemporario, LocalDateTime prazoSaida) throws SQLException {
    String sql = "INSERT INTO ClienteMensal (nome, residencia, contacto, matricula, corCarro, valorPorHora, tipoPagamento, prazoSaida) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    try (Connection conn = DBConnect.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setString(1, clienteTemporario.getNome());
        stmt.setString(2, clienteTemporario.getResidencia());
        stmt.setString(3, clienteTemporario.getContacto());
        stmt.setString(4, clienteTemporario.getMatricula());
        stmt.setString(5, clienteTemporario.getCorCarro());
        stmt.setDouble(6, clienteTemporario.getValorPorHora());
        stmt.setString(7, clienteTemporario.getTipoPagamento());
        stmt.setObject(8, prazoSaida); // Adiciona o prazo de saída
        stmt.executeUpdate();
        
        // Opcional: Você pode excluir o cliente temporário se não for mais necessário
        delete(clienteTemporario.getIdCliente()); // Chame o método de exclusão para o cliente temporário
    }
}

}
