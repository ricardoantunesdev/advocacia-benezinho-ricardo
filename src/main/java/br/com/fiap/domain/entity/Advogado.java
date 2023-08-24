package br.com.fiap.domain.entity;

import jakarta.persistence.*;
import org.checkerframework.checker.units.qual.C;

@Entity
@Table(name = "TB_ADVOGADO", uniqueConstraints = {
        @UniqueConstraint(name="UK_NMR_OAB", columnNames = {
                "NMR_OAB"
        })
})
public class Advogado {

    @Id
    @GeneratedValue(strategy =  GenerationType.SEQUENCE, generator = "SQ_ADOVAGDO")
    @SequenceGenerator(name="SQ_ADVOGADO", sequenceName = "SQ_ADVOGADO")
    @Column(name = "ID_ADVOGADO")
    private Long id;

    @Column(name = "NM_ADVOGADO")
    private String nome;

    @Column(name = "NMR_OAB")
    private String numeroOAB;

    @Column(name = "NM_ESTADO")
    private Estado estado;

    public Advogado() {
    }

    public Advogado(Long id, String nome, String numeroOAB, Estado estado) {
        this.id = id;
        this.nome = nome;
        this.numeroOAB = numeroOAB;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public Advogado setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Advogado setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getNumeroOAB() {
        return numeroOAB;
    }

    public Advogado setNumeroOAB(String numeroOAB) {
        this.numeroOAB = numeroOAB;
        return this;
    }

    public Estado getEstado() {
        return estado;
    }

    public Advogado setEstado(Estado estado) {
        this.estado = estado;
        return this;
    }

    @Override
    public String toString() {
        return "Advogado{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", numeroOAB='" + numeroOAB + '\'' +
                '}';
    }


}
