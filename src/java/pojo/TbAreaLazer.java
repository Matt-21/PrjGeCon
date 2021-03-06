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
 * TbAreaLazer generated by hbm2java
 */
@Entity
@Table(name="tb_area_lazer"
    ,catalog="db_gecon"
)
public class TbAreaLazer  implements java.io.Serializable {


     private Integer idtAreaLazer;
     private TbCondominio tbCondominio;
     private String dscAreaLazer;
     private int capMaxAreaLazer;
     private Double vlrReservaAreaLazer;
     private Set<TaReserva> taReservas = new HashSet<TaReserva>(0);

    public TbAreaLazer() {
    }

	
    public TbAreaLazer(TbCondominio tbCondominio, String dscAreaLazer, int capMaxAreaLazer) {
        this.tbCondominio = tbCondominio;
        this.dscAreaLazer = dscAreaLazer;
        this.capMaxAreaLazer = capMaxAreaLazer;
    }
    public TbAreaLazer(TbCondominio tbCondominio, String dscAreaLazer, int capMaxAreaLazer, Double vlrReservaAreaLazer, Set<TaReserva> taReservas) {
       this.tbCondominio = tbCondominio;
       this.dscAreaLazer = dscAreaLazer;
       this.capMaxAreaLazer = capMaxAreaLazer;
       this.vlrReservaAreaLazer = vlrReservaAreaLazer;
       this.taReservas = taReservas;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idt_area_lazer", unique=true, nullable=false)
    public Integer getIdtAreaLazer() {
        return this.idtAreaLazer;
    }
    
    public void setIdtAreaLazer(Integer idtAreaLazer) {
        this.idtAreaLazer = idtAreaLazer;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cod_condominio", nullable=false)
    public TbCondominio getTbCondominio() {
        return this.tbCondominio;
    }
    
    public void setTbCondominio(TbCondominio tbCondominio) {
        this.tbCondominio = tbCondominio;
    }

    
    @Column(name="dsc_area_lazer", nullable=false)
    public String getDscAreaLazer() {
        return this.dscAreaLazer;
    }
    
    public void setDscAreaLazer(String dscAreaLazer) {
        this.dscAreaLazer = dscAreaLazer;
    }

    
    @Column(name="cap_max_area_lazer", nullable=false)
    public int getCapMaxAreaLazer() {
        return this.capMaxAreaLazer;
    }
    
    public void setCapMaxAreaLazer(int capMaxAreaLazer) {
        this.capMaxAreaLazer = capMaxAreaLazer;
    }

    
    @Column(name="vlr_reserva_area_lazer", precision=22, scale=0)
    public Double getVlrReservaAreaLazer() {
        return this.vlrReservaAreaLazer;
    }
    
    public void setVlrReservaAreaLazer(Double vlrReservaAreaLazer) {
        this.vlrReservaAreaLazer = vlrReservaAreaLazer;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tbAreaLazer")
    public Set<TaReserva> getTaReservas() {
        return this.taReservas;
    }
    
    public void setTaReservas(Set<TaReserva> taReservas) {
        this.taReservas = taReservas;
    }




}


