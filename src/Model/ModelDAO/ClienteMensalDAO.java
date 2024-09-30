package Model.ModelDAO;

import Model.Cliente;
import Model.ClienteMensal;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import model.DBConnect;

public class ClienteMensalDAO {
    public void create(ClienteMensal clienteMensal) throws SQLException {
        String sql = "INSERT INTO ClienteMensal (nome, residencia, contacto, matricula, corCarro, valorPorHora, tipoPagamento, prazoSaida) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DBConnect.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, clienteMensal.getNome());
            stmt.setString(2, clienteMensal.getResidencia());
            stmt.setString(3, clienteMensal.getContacto());
            stmt.setString(4, clienteMensal.getMatricula());
            stmt.setString(5, clienteMensal.getCorCarro());
            stmt.setDouble(6, clienteMensal.getValorPorHora());
            stmt.setString(7, clienteMensal.getTipoPagamento());
            stmt.setObject(8, clienteMensal.getPrazoSaida());
            stmt.executeUpdate();
        }
    }

    public ClienteMensal read(int idCliente) throws SQLException {
        String sql = "SELECT * FROM ClienteMensal WHERE idCliente = ?";
        try (Connection conn = DBConnect.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idCliente);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new ClienteMensal(
                    rs.getString("nome"),
                    rs.getString("residencia"),
                    rs.getString("contacto"),
                    rs.getString("matricula"),
                    rs.getString("corCarro"),
                    rs.getDouble("valorPorHora"),
                    rs.getString("tipoPagamento"),
                    rs.getObject("prazoSaida", LocalDateTime.class) // Obtendo LocalDateTime
                );
            }
        }
        return null;
    }

    public void update(ClienteMensal clienteMensal) throws SQLException {
        String sql = "UPDATE ClienteMensal SET nome = ?, residencia = ?, contacto = ?, matricula = ?, corCarro = ?, valorPorHora = ?, tipoPagamento = ?, prazoSaida = ? WHERE idCliente = ?";
        try (Connection conn = DBConnect.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, clienteMensal.getNome());
            stmt.setString(2, clienteMensal.getResidencia());
            stmt.setString(3, clienteMensal.getContacto());
            stmt.setString(4, clienteMensal.getMatricula());
            stmt.setString(5, clienteMensal.getCorCarro());
            stmt.setDouble(6, clienteMensal.getValorPorHora());
            stmt.setString(7, clienteMensal.getTipoPagamento());
            stmt.setObject(8, clienteMensal.getPrazoSaida());
            stmt.setInt(9, clienteMensal.getIdCliente());
            stmt.executeUpdate();
        }
    }

    public void delete(int idCliente) throws SQLException {
        String sql = "DELETE FROM ClienteMensal WHERE idCliente = ?";
        try (Connection conn = DBConnect.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idCliente);
            stmt.executeUpdate();
        }
    }

    public List<ClienteMensal> searchByMatricula(String matricula) throws SQLException {
        String sql = "SELECT * FROM ClienteMensal WHERE matricula LIKE ?";
        List<ClienteMensal> clienteMensais = new ArrayList<>();
        try (Connection conn = DBConnect.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, "%" + matricula + "%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                clienteMensais.add(new ClienteMensal(
                    rs.getString("nome"),
                    rs.getString("residencia"),
                    rs.getString("contacto"),
                    rs.getString("matricula"),
                    rs.getString("corCarro"),
                    rs.getDouble("valorPorHora"),
                    rs.getString("tipoPagamento"),
                    rs.getObject("prazoSaida", LocalDateTime.class) // Obtendo LocalDateTime
                ));
            }
        }
        return clienteMensais;
    }

    public void registrarChegada(Cliente clienteTemporario) throws SQLException {
    String sql = "UPDATE ClienteVeiculo SET estacionado = ?, dataHoraEntrada = ?, espacoEstacionado = ? WHERE matricula = ?";
    try (Connection conn = DBConnect.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setBoolean(1, true); 
        stmt.setObject(2, LocalDateTime.now()); 
        stmt.setInt(3, clienteTemporario.getEspacoEstacionado()); 
        stmt.setString(4, clienteTemporario.getMatricula());
        stmt.executeUpdate();
    }
}
}
