package bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.FetchType;
import javax.persistence.CascadeType;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;

@Entity
@Table
public class Atendimento {
	
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAtendimento;
    
    @Column
    @Temporal(TemporalType.DATE)
    private Date data;
    
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @PrimaryKeyJoinColumn(name = "idAssistenteSocial")
    private AssistenteSocial assistenteSocial;
    
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @PrimaryKeyJoinColumn(name = "idUsuario")
    private Usuario usuario;
    
    /*@OneToMany(
	mappedBy = "atendimento",
	targetEntity = CestaBasica.class,
	fetch = FetchType.LAZY,
	cascade = CascadeType.ALL)
    private List<CestaBasica> cestaBasica = new ArrayList<CestaBasica>();*/

    public Integer getIdAtendimento() {
        return idAtendimento;
    }

    public void setIdAtendimento(Integer idAtendimento) {
        this.idAtendimento = idAtendimento;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public AssistenteSocial getAssistenteSocial() {
        return assistenteSocial;
    }

    public void setAssistenteSocial(AssistenteSocial idAssistenteSocial) {
        this.assistenteSocial = idAssistenteSocial;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario idUsuario) {
        this.usuario = idUsuario;
    }

    /*public List<CestaBasica> getCestaBasica() {
        return cestaBasica;
    }

    public void adicionarCestaBasica(CestaBasica cestaBasica) {
        this.cestaBasica.add(cestaBasica);
    }*/
}
