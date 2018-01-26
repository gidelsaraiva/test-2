package javaapplicationteste;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class EntidadeCarro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;
    @Column(unique = true)
    private String marca;
    private String cor;
    private String modelo;
    private int ano;
    
     @OneToMany(mappedBy = "pessoa")
    private List <EntidadeCarro> carro = new ArrayList();
    private EntidadePessoa pessoa;
    

    
    //<editor-fold defaultstate="collapsed" desc="gets e sets">
    public EntidadePessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(EntidadePessoa pessoa) {
        this.pessoa = pessoa;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
     public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="hashcode e equals">
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EntidadeCarro)) {
            return false;
        }
        EntidadeCarro other = (EntidadeCarro) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
//</editor-fold>
   
    @Override
    public String toString() {
        return "javaapplicationteste.EntidadeCarro[ id=" + id + " ]";
    }
    
}
