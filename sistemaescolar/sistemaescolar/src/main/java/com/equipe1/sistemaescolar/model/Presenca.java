package com.equipe1.sistemaescolar.model;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_presenca")
public class Presenca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "pk_id_presenca")
    private long idPresenca;

    @Column (name = "data_presenca")
    private Date dataPresenca;

    public long getIdPresenca() {
        return idPresenca;
    }

    public void setIdPresenca(long idPresenca) {
        this.idPresenca = idPresenca;
    }

    public Date getDataPresenca() {
        return dataPresenca;
    }

    public void setDataPresenca(Date dataPresenca) {
        this.dataPresenca = dataPresenca;
    }
}
