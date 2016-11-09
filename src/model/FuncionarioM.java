package model;

public class FuncionarioM {
    private String nome;
    private String endereco;
    private String cidadeestado;
    private String residencial;
    private String telcomercial1;
    private String telcomercial2;
    private String celular1;
    private String celular2;
    private String celular3;
    private String email;
    private String setor;
    private String dia;
    private String horario;
    private String observacao;
    private int docente;
    private int inativo;
    private int id_setor;

    public FuncionarioM(String nome, String endereco, String cidadeestado, String residencial, String telcomercial1, String telcomercial2, String celular1, String celular2, String celular3, String email, String setor, String dia, String horario, String observacao, int docente, int inativo, int id_setor) {
        this.nome = nome;
        this.endereco = endereco;
        this.cidadeestado = cidadeestado;
        this.residencial = residencial;
        this.telcomercial1 = telcomercial1;
        this.telcomercial2 = telcomercial2;
        this.celular1 = celular1;
        this.celular2 = celular2;
        this.celular3 = celular3;
        this.email = email;
        this.setor = setor;
        this.dia = dia;
        this.horario = horario;
        this.observacao = observacao;
        this.docente = docente;
        this.inativo = inativo;
        this.id_setor = id_setor;
    }

    public FuncionarioM() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidadeestado() {
        return cidadeestado;
    }

    public void setCidadeestado(String cidadeestado) {
        this.cidadeestado = cidadeestado;
    }

    public String getResidencial() {
        return residencial;
    }

    public void setResidencial(String residencial) {
        this.residencial = residencial;
    }

    public String getTelcomercial1() {
        return telcomercial1;
    }

    public void setTelcomercial1(String telcomercial1) {
        this.telcomercial1 = telcomercial1;
    }

    public String getTelcomercial2() {
        return telcomercial2;
    }

    public void setTelcomercial2(String telcomercial2) {
        this.telcomercial2 = telcomercial2;
    }

    public String getCelular1() {
        return celular1;
    }

    public void setCelular1(String celular1) {
        this.celular1 = celular1;
    }

    public String getCelular2() {
        return celular2;
    }

    public void setCelular2(String celular2) {
        this.celular2 = celular2;
    }

    public String getCelular3() {
        return celular3;
    }

    public void setCelular3(String celular3) {
        this.celular3 = celular3;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public int getDocente() {
        return docente;
    }

    public void setDocente(int docente) {
        this.docente = docente;
    }

    public int getInativo() {
        return inativo;
    }

    public void setInativo(int inativo) {
        this.inativo = inativo;
    }

    public int getId_setor() {
        return id_setor;
    }

    public void setId_setor(int id_setor) {
        this.id_setor = id_setor;
    }
    

    
}
