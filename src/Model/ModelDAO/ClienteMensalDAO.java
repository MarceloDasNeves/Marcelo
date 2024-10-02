package Model.ModelDAO;

import Model.Cliente;
import Model.ClienteMensal;
import Model.Veiculo;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import model.DBConne;

public class ClienteMensalDAO {
    // Método create ajustado
    public void create(ClienteMensal clienteMensal) throws SQLException {
        String sql = "INSERT INTO ClienteMensal (nome, residencia, contacto, matricula, corCarro, valorPorHora, tipoPagamento, prazoSaida) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DBConne.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, clienteMensal.getNome());
            stmt.setString(2, clienteMensal.getResidencia());
            stmt.setString(3, clienteMensal.getContacto());
            stmt.setString(4, clienteMensal.getVeiculo().getMatricula()); // Acessando veículo
            stmt.setString(5, clienteMensal.getVeiculo().getCorCarro());  // Acessando veículo
            stmt.setDouble(6, clienteMensal.getVeiculo().getValorPorHora()); // Acessando veículo
            stmt.setString(7, clienteMensal.getTipoPagamento());
            stmt.setObject(8, clienteMensal.getPrazoSaida());
            stmt.executeUpdate();
        }
    }

    // Método read ajustado
    public ClienteMensal read(int idCliente) throws SQLException {
        String sql = "SELECT * FROM ClienteMensal WHERE idCliente = ?";
        try (Connection conn = DBConne.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idCliente);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new ClienteMensal(
                    rs.getString("nome"),
                    rs.getString("contacto"),
                    rs.getString("residencia"),
                    new Veiculo(rs.getString("matricula"), rs.getString("corCarro"), rs.getDouble("valorPorHora")), // Criando o Veículo
                    rs.getString("tipoPagamento"),
                    rs.getObject("prazoSaida", LocalDateTime.class) // Obtendo LocalDateTime
                );
            }
        }
        return null;
    }

    // Método update ajustado
    public void update(ClienteMensal clienteMensal) throws SQLException {
        String sql = "UPDATE ClienteMensal SET nome = ?, residencia = ?, contacto = ?, matricula = ?, corCarro = ?, valorPorHora = ?, tipoPagamento = ?, prazoSaida = ? WHERE idCliente = ?";
        try (Connection conn = DBConne.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, clienteMensal.getNome());
            stmt.setString(2, clienteMensal.getResidencia());
            stmt.setString(3, clienteMensal.getContacto());
            stmt.setString(4, clienteMensal.getVeiculo().getMatricula()); // Acessando veículo
            stmt.setString(5, clienteMensal.getVeiculo().getCorCarro());  // Acessando veículo
            stmt.setDouble(6, clienteMensal.getVeiculo().getValorPorHora()); // Acessando veículo
            stmt.setString(7, clienteMensal.getTipoPagamento());
            stmt.setObject(8, clienteMensal.getPrazoSaida());
            stmt.setInt(9, clienteMensal.getIdCliente());
            stmt.executeUpdate();
        }
    }

    // Método delete
    public void delete(int idCliente) throws SQLException {
        String sql = "DELETE FROM ClienteMensal WHERE idCliente = ?";
        try (Connection conn = DBConne.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idCliente);
            stmt.executeUpdate();
        }
    }

    // Método searchByMatricula ajustado
    public List<ClienteMensal> searchByMatricula(String matricula) throws SQLException {
        String sql = "SELECT * FROM ClienteMensal WHERE matricula LIKE ?";
        List<ClienteMensal> clienteMensais = new ArrayList<>();
        try (Connection conn = DBConne.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, "%" + matricula + "%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                clienteMensais.add(new ClienteMensal(
                    rs.getString("nome"),
                    rs.getString("residencia"),
                    rs.getString("contacto"),
                    new Veiculo(rs.getString("matricula"), rs.getString("corCarro"), rs.getDouble("valorPorHora")), // Criando o Veículo
                    rs.getString("tipoPagamento"),
                    rs.getObject("prazoSaida", LocalDateTime.class) // Obtendo LocalDateTime
                ));
            }
        }
        return clienteMensais;
    }

    // Método registrarChegada
    public void registrarChegada(Cliente clienteMensal) throws SQLException {
        String sql = "UPDATE ClienteMensal SET estacionado = ?, dataHoraEntrada = ?, espacoEstacionado = ? WHERE matricula = ?";
        try (Connection conn = DBConne.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setBoolean(1, true);
            stmt.setObject(2, LocalDateTime.now());
            stmt.setInt(3, clienteMensal.getEspacoEstacionado());
            stmt.setString(4, clienteMensal.getVeiculo().getMatricula()); // Acessando veículo
            stmt.executeUpdate();
        }
    }
}
