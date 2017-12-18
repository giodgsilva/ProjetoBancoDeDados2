package bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.FetchType;
import javax.persistence.CascadeType;
import javax.persistence.GenerationType;

@Entity
@Table
public class Usuario {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;
    
    @OneToOne
    @JoinColumn(name = "idPessoa", nullable = false)
    private Pessoa pessoa;
    
    @Column
    private String prontuario;
    
    @Column
    @Temporal(TemporalType.DATE)
    private Date primeiroAtendimento;
    
    @Column
    private String status;
    
    @Column
    private String endereco;
    
    @OneToMany(
	mappedBy = "usuario",
	targetEntity = Atendimento.class,
	fetch = FetchType.LAZY,
	cascade = CascadeType.ALL)
    private List<Atendimento> atendimentos = new ArrayList<Atendimento>();

    public Usuario() {
        //devo inicializar algo no construtor?
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa idPessoa) {
        this.pessoa = idPessoa;
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    public Date getPrimeiroAtendimento() {
        return primeiroAtendimento;
    }

    public void setPrimeiroAtendimento(Date primeiroAtendimento) {
        this.primeiroAtendimento = primeiroAtendimento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getEndereco() {
    	return endereco;
    }
    
    public void setEndereco(String endereco) {
    	this.endereco = endereco;
    }
    
    public List<Atendimento> getAtendimentos() {
    	return atendimentos;
    }
    
    public void adicionarAtendimento(Atendimento atendimento) {
    	this.atendimentos.add(atendimento);
    }
}
