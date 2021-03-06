package pojo;
// Generated 06/05/2018 18:32:35 by Hibernate Tools 4.3.1


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
 * TbResidencia generated by hbm2java
 */
@Entity
@Table(name="tb_residencia"
    ,catalog="db_gecon"
)
public class TbResidencia  implements java.io.Serializable {


     private Integer idtResidencia;
     private TbCondominio tbCondominio;
     private String dscBlocoResidencia;
     private String dscResidencia;
     private Set<TbGaragem> tbGaragems = new HashSet<TbGaragem>(0);
     private Set<TaMorador> taMoradors = new HashSet<TaMorador>(0);

    public TbResidencia() {
    }

	
    public TbResidencia(TbCondominio tbCondominio, String dscBlocoResidencia, String dscResidencia) {
        this.tbCondominio = tbCondominio;
        this.dscBlocoResidencia = dscBlocoResidencia;
        this.dscResidencia = dscResidencia;
    }
    public TbResidencia(TbCondominio tbCondominio, String dscBlocoResidencia, String dscResidencia, Set<TbGaragem> tbGaragems, Set<TaMorador> taMoradors) {
       this.tbCondominio = tbCondominio;
       this.dscBlocoResidencia = dscBlocoResidencia;
       this.dscResidencia = dscResidencia;
       this.tbGaragems = tbGaragems;
       this.taMoradors = taMoradors;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idt_residencia", unique=true, nullable=false)
    public Integer getIdtResidencia() {
        return this.idtResidencia;
    }
    
    public void setIdtResidencia(Integer idtResidencia) {
        this.idtResidencia = idtResidencia;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cod_condominio", nullable=false)
    public TbCondominio getTbCondominio() {
        return this.tbCondominio;
    }
    
    public void setTbCondominio(TbCondominio tbCondominio) {
        this.tbCondominio = tbCondominio;
    }

    
    @Column(name="dsc_bloco_residencia", nullable=false)
    public String getDscBlocoResidencia() {
        return this.dscBlocoResidencia;
    }
    
    public void setDscBlocoResidencia(String dscBlocoResidencia) {
        this.dscBlocoResidencia = dscBlocoResidencia;
    }

    
    @Column(name="dsc_residencia", nullable=false)
    public String getDscResidencia() {
        return this.dscResidencia;
    }
    
    public void setDscResidencia(String dscResidencia) {
        this.dscResidencia = dscResidencia;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tbResidencia")
    public Set<TbGaragem> getTbGaragems() {
        return this.tbGaragems;
    }
    
    public void setTbGaragems(Set<TbGaragem> tbGaragems) {
        this.tbGaragems = tbGaragems;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tbResidencia")
    public Set<TaMorador> getTaMoradors() {
        return this.taMoradors;
    }
    
    public void setTaMoradors(Set<TaMorador> taMoradors) {
        this.taMoradors = taMoradors;
    }




}


