package bibliotecaapp;

public class Usuario {
    private int codigoUsuario;
    private String nome;
    private String cpf;
    private String sexo;
    private String dataNascimento;
    private String endereco;
    private String cidade;
    private String estado;
    private String telefone1;
    private String telefone2;
    private String dataInscricao;
    private String dataUltimoLogin;
    private String usuario;
    private String senha;
    private int tipoUsuario;  
    private int status;

    //Get e Set
    public int getId() {
        return codigoUsuario;
    }
    public void setId(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getTelefone1() {
        return telefone1;
    }
    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }
    public String getTelefone2() {
        return telefone2;
    }
    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }
    public String getDataInscricao() {
        return dataInscricao;
    }
    public void setDataInscricao(String dataInscricao) {
        this.dataInscricao = dataInscricao;
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
    public int getTipoUsuario() {
        return tipoUsuario;
    }
    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public String getDataUltimoLogin() {
        return dataUltimoLogin;
    }
    public void setDataUltimoLogin(String dataUltimoLogin) {
        this.dataUltimoLogin = dataUltimoLogin;
    }
    
    //Valida login
    public void validarUsuario(String usuario, String senha) {
        
    }





    
}
