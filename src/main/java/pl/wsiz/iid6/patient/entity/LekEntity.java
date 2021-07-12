package pl.wsiz.iid6.patient.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "lek")
public class LekEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nazwa;
    private Integer cena;
    private String producent;

    public LekEntity() {
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public Integer getCena() {
        return cena;
    }

    public void setCena(Integer cena) {
        this.cena = cena;
    }

    public LekEntity(String nazwa, Integer cena, String producent) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.producent = producent;
    }

    public LekEntity(Long id, String nazwa, Integer cena, String producent) {
        this.id = id;
        this.nazwa = nazwa;
        this.cena = cena;
        this.producent = producent;
    }

    @Override
    public String toString(){
        return String.format( "Lek[id='%d', name='%s', producent='%s', cena='%d']", id, nazwa, producent, cena);
    }
}
