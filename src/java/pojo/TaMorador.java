package pojo;
// Generated 05/05/2018 15:34:18 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TaMorador generated by hbm2java
 */
@Entity
@Table(name="ta_morador"
    ,catalog="db_gecon"
)
public class TaMorador  implements java.io.Serializable {


     private Integer idtMorador;
     private TbPessoa tbPessoa;
     private TbResidencia tbResidencia;
     private Set<TbUsuario> tbUsuarios = new HashSet<TbUsuario>(0);
     private Set<TbForum> tbForums = new HashSet<TbForum>(0);
     private Set<TbMensagem> tbMensagems = new HashSet<TbMensagem>(0);
     private Set<TbOcorrencia> tbOcorrencias = new HashSet<TbOcorrencia>(0);

    public TaMorador() {
    }

	
    public TaMorador(TbPessoa tbPessoa, TbResidencia tbResidencia) {
        this.tbPessoa = tbPessoa;
        this.tbResidencia = tbResidencia;
    }
    public TaMorador(TbPessoa tbPessoa, TbResidencia tbResidencia, Set<TbUsuario> tbUsuarios, Set<TbForum> tbForums, Set<TbMensagem> tbMensagems, Set<TbOcorrencia> tbOcorrencias) {
       this.tbPessoa = tbPessoa;
       this.tbResidencia = tbResidencia;
       this.tbUsuarios = tbUsuarios;
       this.tbForums = tbForums;
       this.tbMensagems = tbMensagems;
       this.tbOcorrencias = tbOcorrencias;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idt_morador", unique=true, nullable=false)
    public Integer getIdtMorador() {
        return this.idtMorador;
    }
    
    public void setIdtMorador(Integer idtMorador) {
        this.idtMorador = idtMorador;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cod_pessoa", nullable=false)
    public TbPessoa getTbPessoa() {
        return this.tbPessoa;
    }
    
    public void setTbPessoa(TbPessoa tbPessoa) {
        this.tbPessoa = tbPessoa;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cod_residencia", nullable=false)
    public TbResidencia getTbResidencia() {
        return this.tbResidencia;
    }
    
    public void setTbResidencia(TbResidencia tbResidencia) {
        this.tbResidencia = tbResidencia;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="taMorador")
    public Set<TbUsuario> getTbUsuarios() {
        return this.tbUsuarios;
    }
    
    public void setTbUsuarios(Set<TbUsuario> tbUsuarios) {
        this.tbUsuarios = tbUsuarios;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="taMorador")
    public Set<TbForum> getTbForums() {
        return this.tbForums;
    }
    
    public void setTbForums(Set<TbForum> tbForums) {
        this.tbForums = tbForums;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="taMorador")
    public Set<TbMensagem> getTbMensagems() {
        return this.tbMensagems;
    }
    
    public void setTbMensagems(Set<TbMensagem> tbMensagems) {
        this.tbMensagems = tbMensagems;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="taMorador")
    public Set<TbOcorrencia> getTbOcorrencias() {
        return this.tbOcorrencias;
    }
    
    public void setTbOcorrencias(Set<TbOcorrencia> tbOcorrencias) {
        this.tbOcorrencias = tbOcorrencias;
    }




}


