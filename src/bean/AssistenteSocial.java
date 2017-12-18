package bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.FetchType;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.GenerationType;



@Entity
@Table
public class AssistenteSocial {
	
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAssistenteSocial;
    
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name = "idPessoa", nullable = false)
    private Pessoa pessoa;
    
    @OneToMany(
	mappedBy = "assistenteSocial",
	targetEntity = Atendimento.class,
	fetch = FetchType.LAZY,
	cascade = CascadeType.ALL)
    private List<Atendimento> atendimentos = new ArrayList<Atendimento>();
    
    @Column
    private String matricula;

    public AssistenteSocial() {
        //devo inicializar algo no construtor?
    }

    public Integer getIdAssistenteSocial() {
        return idAssistenteSocial;
    }

    public void setIdAssistenteSocial(Integer idAssistenteSocial) {
        this.idAssistenteSocial = idAssistenteSocial;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<Atendimento> getAtendimentos() {
    	return atendimentos;
    }
    
    public void adicionarAtendimento(Atendimento atendimento) {
    	this.atendimentos.add(atendimento);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
