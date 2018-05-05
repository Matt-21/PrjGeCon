package pojo;
// Generated 05/05/2018 15:34:18 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TbPessoa generated by hbm2java
 */
@Entity
@Table(name="tb_pessoa"
    ,catalog="db_gecon"
)
public class TbPessoa  implements java.io.Serializable {


     private Integer idtPessoa;
     private String nmePessoa;
     private String cpfPessoa;
     private Date dtaNascPessoa;
     private String telPessoa;
     private String emlPessoa;
     private Set<TaMorador> taMoradors = new HashSet<TaMorador>(0);
     private Set<TaVisita> taVisitas = new HashSet<TaVisita>(0);

    public TbPessoa() {
    }

	
    public TbPessoa(String nmePessoa, String cpfPessoa, Date dtaNascPessoa, String telPessoa, String emlPessoa) {
        this.nmePessoa = nmePessoa;
        this.cpfPessoa = cpfPessoa;
        this.dtaNascPessoa = dtaNascPessoa;
        this.telPessoa = telPessoa;
        this.emlPessoa = emlPessoa;
    }
    public TbPessoa(String nmePessoa, String cpfPessoa, Date dtaNascPessoa, String telPessoa, String emlPessoa, Set<TaMorador> taMoradors, Set<TaVisita> taVisitas) {
       this.nmePessoa = nmePessoa;
       this.cpfPessoa = cpfPessoa;
       this.dtaNascPessoa = dtaNascPessoa;
       this.telPessoa = telPessoa;
       this.emlPessoa = emlPessoa;
       this.taMoradors = taMoradors;
       this.taVisitas = taVisitas;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idt_pessoa", unique=true, nullable=false)
    public Integer getIdtPessoa() {
        return this.idtPessoa;
    }
    
    public void setIdtPessoa(Integer idtPessoa) {
        this.idtPessoa = idtPessoa;
    }

    
    @Column(name="nme_pessoa", nullable=false, length=45)
    public String getNmePessoa() {
        return this.nmePessoa;
    }
    
    public void setNmePessoa(String nmePessoa) {
        this.nmePessoa = nmePessoa;
    }

    
    @Column(name="cpf_pessoa", nullable=false, length=45)
    public String getCpfPessoa() {
        return this.cpfPessoa;
    }
    
    public void setCpfPessoa(String cpfPessoa) {
        this.cpfPessoa = cpfPessoa;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="dta_nasc_pessoa", nullable=false, length=10)
    public Date getDtaNascPessoa() {
        return this.dtaNascPessoa;
    }
    
    public void setDtaNascPessoa(Date dtaNascPessoa) {
        this.dtaNascPessoa = dtaNascPessoa;
    }

    
    @Column(name="tel_pessoa", nullable=false, length=45)
    public String getTelPessoa() {
        return this.telPessoa;
    }
    
    public void setTelPessoa(String telPessoa) {
        this.telPessoa = telPessoa;
    }

    
    @Column(name="eml_pessoa", nullable=false, length=45)
    public String getEmlPessoa() {
        return this.emlPessoa;
    }
    
    public void setEmlPessoa(String emlPessoa) {
        this.emlPessoa = emlPessoa;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tbPessoa")
    public Set<TaMorador> getTaMoradors() {
        return this.taMoradors;
    }
    
    public void setTaMoradors(Set<TaMorador> taMoradors) {
        this.taMoradors = taMoradors;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tbPessoa")
    public Set<TaVisita> getTaVisitas() {
        return this.taVisitas;
    }
    
    public void setTaVisitas(Set<TaVisita> taVisitas) {
        this.taVisitas = taVisitas;
    }




}


