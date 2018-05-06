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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TdPerfil generated by hbm2java
 */
@Entity
@Table(name="td_perfil"
    ,catalog="db_gecon"
)
public class TdPerfil  implements java.io.Serializable {


     private Integer idtPerfil;
     private String nmePerfil;
     private Set<TbUsuario> tbUsuarios = new HashSet<TbUsuario>(0);

    public TdPerfil() {
    }

	
    public TdPerfil(String nmePerfil) {
        this.nmePerfil = nmePerfil;
    }
    public TdPerfil(String nmePerfil, Set<TbUsuario> tbUsuarios) {
       this.nmePerfil = nmePerfil;
       this.tbUsuarios = tbUsuarios;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idt_perfil", unique=true, nullable=false)
    public Integer getIdtPerfil() {
        return this.idtPerfil;
    }
    
    public void setIdtPerfil(Integer idtPerfil) {
        this.idtPerfil = idtPerfil;
    }

    
    @Column(name="nme_perfil", nullable=false, length=45)
    public String getNmePerfil() {
        return this.nmePerfil;
    }
    
    public void setNmePerfil(String nmePerfil) {
        this.nmePerfil = nmePerfil;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tdPerfil")
    public Set<TbUsuario> getTbUsuarios() {
        return this.tbUsuarios;
    }
    
    public void setTbUsuarios(Set<TbUsuario> tbUsuarios) {
        this.tbUsuarios = tbUsuarios;
    }




}


