package Model;

public class Funcionario extends Pessoa {
    private static int contador = 1;
    private int idFuncionario;
    private String usuario;
    private String senha;
    private String numeroBI;
    private String NUIT;
    private String email; 

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Funcionario.contador = contador;
    }

    public String getNumeroBI() {
        return numeroBI;
    }

    public void setNumeroBI(String numeroBI) {
        this.numeroBI = numeroBI;
    }

    public String getNUIT() {
        return NUIT;
    }

    public void setNUIT(String NUIT) {
        this.NUIT = NUIT;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    private String departamento;
    private String tipo; 
    private boolean ativo;

    // Construtor
    public Funcionario(String nome, String contacto, String residencia, String usuario, String senha, String numeroBI, String NUIT, String email, String departamento, String tipo) {
        super(nome, contacto, residencia);
        this.idFuncionario = contador++; 
        this.usuario = usuario;
        this.senha = senha;
        this.numeroBI = numeroBI;
        this.NUIT = NUIT;
        this.email = email; 
        this.departamento = departamento;
        this.tipo = tipo;
        this.ativo = true;
    }

    // Getters e setters específicos de Funcionario
    public int getIdFuncionario() {
        return idFuncionario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() { // Getter para email
        return email;
    }

    public void setEmail(String email) { // Setter para email
        this.email = email;
    }

    // Sobrescrita do método exibirDetalhes
    @Override
    public String exibirDetalhes() {
        return String.format(
            "ID Funcionario: %d\nNome: %s\nContacto: %s\nResidência: %s\nUsuário: %s\nDepartamento: %s\nTipo: %s\nAtivo: %s\n",
            idFuncionario, getNome(), getContacto(), getResidencia(), usuario, departamento, tipo, (ativo ? "Sim" : "Não")
        );
    }
}
