package pojo;
// Generated 06/05/2018 18:32:35 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TbOcorrencia generated by hbm2java
 */
@Entity
@Table(name="tb_ocorrencia"
    ,catalog="db_gecon"
)
public class TbOcorrencia  implements java.io.Serializable {


     private Integer idtOcorrencia;
     private TaMorador taMorador;
     private Date dtaOcorrencia;
     private String dscOcorrencia;

    public TbOcorrencia() {
    }

    public TbOcorrencia(TaMorador taMorador, Date dtaOcorrencia, String dscOcorrencia) {
       this.taMorador = taMorador;
       this.dtaOcorrencia = dtaOcorrencia;
       this.dscOcorrencia = dscOcorrencia;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idt_ocorrencia", unique=true, nullable=false)
    public Integer getIdtOcorrencia() {
        return this.idtOcorrencia;
    }
    
    public void setIdtOcorrencia(Integer idtOcorrencia) {
        this.idtOcorrencia = idtOcorrencia;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cod_morador", nullable=false)
    public TaMorador getTaMorador() {
        return this.taMorador;
    }
    
    public void setTaMorador(TaMorador taMorador) {
        this.taMorador = taMorador;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="dta_ocorrencia", nullable=false, length=19)
    public Date getDtaOcorrencia() {
        return this.dtaOcorrencia;
    }
    
    public void setDtaOcorrencia(Date dtaOcorrencia) {
        this.dtaOcorrencia = dtaOcorrencia;
    }

    
    @Column(name="dsc_ocorrencia", nullable=false, length=65535)
    public String getDscOcorrencia() {
        return this.dscOcorrencia;
    }
    
    public void setDscOcorrencia(String dscOcorrencia) {
        this.dscOcorrencia = dscOcorrencia;
    }




}


