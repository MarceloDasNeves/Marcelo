package Controller;
import Model.Funcionario;
import Model.ModelDAO.FuncionarioDAO;
import Veiw.MenuPrincipalFuncio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

public class FuncionarioController {
    private MenuPrincipalFuncio Veiw;
    private FuncionarioDAO Model;

    public FuncionarioController(MenuPrincipalFuncio  view, FuncionarioDAO model) {
        this.Veiw= view;
        this.Model= model;

        this.Veiw.(new GuardarListener());
        this.Veiw.addEditarListener(new EditarListener());
        this.Veiw.addApagarListener(new ApagarListener());
        this.Veiw.addPesquisarListener(new PesquisarListener());

        carregarDadosTabela();
    }

    private void carregarDadosTabela() {
        try {
            List<Funcionario> funcionarios = Model.searchByName("");
            Veiw.limparTabela();
            for (Funcionario f : funcionarios) {
                Veiw.adicionarLinhaTabela(new Object[]{f.getIdFuncionario(), f.getNome(), f.getUsuario(), f.getEmail()});
            }
        } catch (SQLException ex) {
            ErroHandler.mostrarErro("Erro ao carregar dados", ex);
        }
    }

    private class GuardarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Funcionario funcionario = new Funcionario();
            funcionario.setNome(view.getNome());
            funcionario.setUsuario(view.getUsuario());
            funcionario.setEmail(view.getEmail());

            try {
                model.create(funcionario);
                view.mostrarMensagem("Funcionário guardado com sucesso!");
                carregarDadosTabela();
            } catch (SQLException ex) {
                ErroHandler.mostrarErro("Erro ao guardar funcionário", ex);
            }
        }
    }

    private class EditarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int linhaSelecionada = view.getFuncionarioSelecionado();
            if (linhaSelecionada == -1) {
                ErroHandler.mostrarErro("Selecione um funcionário para editar.");
                return;
            }

            int idFuncionario = (int) view.getTabelaFuncionarios().getValueAt(linhaSelecionada, 0);
            Funcionario funcionario = new Funcionario();
            funcionario.setIdFuncionario(idFuncionario);
            funcionario.setNome(view.getNome());
            funcionario.setUsuario(view.getUsuario());
            funcionario.setEmail(view.getEmail());

            try {
                model.update(funcionario);
                view.mostrarMensagem("Funcionário editado com sucesso!");
                carregarDadosTabela();
            } catch (SQLException ex) {
                ErroHandler.mostrarErro("Erro ao editar funcionário", ex);
            }
        }
    }

    private class ApagarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int linhaSelecionada = view.getFuncionarioSelecionado();
            if (linhaSelecionada == -1) {
                ErroHandler.mostrarErro("Selecione um funcionário para apagar.");
                return;
            }

            int idFuncionario = (int) view.getTabelaFuncionarios().getValueAt(linhaSelecionada, 0);

            try {
                model.delete(idFuncionario);
                view.mostrarMensagem("Funcionário apagado com sucesso!");
                carregarDadosTabela();
            } catch (SQLException ex) {
                ErroHandler.mostrarErro("Erro ao apagar funcionário", ex);
            }
        }
    }

    private class PesquisarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nome = view.getNome();
            try {
                List<Funcionario> funcionarios = model.searchByName(nome);
                view.limparTabela();
                for (Funcionario f : funcionarios) {
                    view.adicionarLinhaTabela(new Object[]{f.getIdFuncionario(), f.getNome(), f.getUsuario(), f.getEmail()});
                }
            } catch (SQLException ex) {
                ErroHandler.mostrarErro("Erro ao pesquisar funcionário", ex);
            }
        }
    }
}
