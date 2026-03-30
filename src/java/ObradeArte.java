
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author adavi
 */
@Entity
@Table(name = "Obra")
public class ObradeArte {

    @Id
    Long id;

    @Column(
            name = "NM_Musica",
            length = 100,
            unique = true,
            nullable = false,
            columnDefinition = "VARCHAR(45)",
            insertable = true,
            updatable = true,
            scale = 2,
            table = "outra_tabela"
    )
    private String nome;
    private String titulo;
    private String autor;
    private String técnica;
    private String tipo;
    private String procedencia;
    private String dimensoes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTécnica() {
        return técnica;
    }

    public void setTécnica(String técnica) {
        this.técnica = técnica;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getDimensoes() {
        return dimensoes;
    }

    public void setDimensoes(String dimensoes) {
        this.dimensoes = dimensoes;
    }
    
    
    
    
}
