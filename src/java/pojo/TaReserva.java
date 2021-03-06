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
 * TaReserva generated by hbm2java
 */
@Entity
@Table(name="ta_reserva"
    ,catalog="db_gecon"
)
public class TaReserva  implements java.io.Serializable {


     private Integer idtReserva;
     private TaMorador taMorador;
     private TbAreaLazer tbAreaLazer;
     private Date dtaInicioReserva;
     private Date dtaFimReserva;
     private Date dtaCadastroReserva;
     private char stsConfirmadoReserva;

    public TaReserva() {
    }

    public TaReserva(TaMorador taMorador, TbAreaLazer tbAreaLazer, Date dtaInicioReserva, Date dtaFimReserva, Date dtaCadastroReserva, char stsConfirmadoReserva) {
       this.taMorador = taMorador;
       this.tbAreaLazer = tbAreaLazer;
       this.dtaInicioReserva = dtaInicioReserva;
       this.dtaFimReserva = dtaFimReserva;
       this.dtaCadastroReserva = dtaCadastroReserva;
       this.stsConfirmadoReserva = stsConfirmadoReserva;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idt_reserva", unique=true, nullable=false)
    public Integer getIdtReserva() {
        return this.idtReserva;
    }
    
    public void setIdtReserva(Integer idtReserva) {
        this.idtReserva = idtReserva;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cod_morador", nullable=false)
    public TaMorador getTaMorador() {
        return this.taMorador;
    }
    
    public void setTaMorador(TaMorador taMorador) {
        this.taMorador = taMorador;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cod_area_lazer", nullable=false)
    public TbAreaLazer getTbAreaLazer() {
        return this.tbAreaLazer;
    }
    
    public void setTbAreaLazer(TbAreaLazer tbAreaLazer) {
        this.tbAreaLazer = tbAreaLazer;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="dta_inicio_reserva", nullable=false, length=19)
    public Date getDtaInicioReserva() {
        return this.dtaInicioReserva;
    }
    
    public void setDtaInicioReserva(Date dtaInicioReserva) {
        this.dtaInicioReserva = dtaInicioReserva;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="dta_fim_reserva", nullable=false, length=19)
    public Date getDtaFimReserva() {
        return this.dtaFimReserva;
    }
    
    public void setDtaFimReserva(Date dtaFimReserva) {
        this.dtaFimReserva = dtaFimReserva;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="dta_cadastro_reserva", nullable=false, length=19)
    public Date getDtaCadastroReserva() {
        return this.dtaCadastroReserva;
    }
    
    public void setDtaCadastroReserva(Date dtaCadastroReserva) {
        this.dtaCadastroReserva = dtaCadastroReserva;
    }

    
    @Column(name="sts_confirmado_reserva", nullable=false, length=1)
    public char getStsConfirmadoReserva() {
        return this.stsConfirmadoReserva;
    }
    
    public void setStsConfirmadoReserva(char stsConfirmadoReserva) {
        this.stsConfirmadoReserva = stsConfirmadoReserva;
    }




}


