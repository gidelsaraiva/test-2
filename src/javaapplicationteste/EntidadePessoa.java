package javaapplicationteste;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class EntidadePessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    
    private Long id;
    private String nome;
    private int cpf;
    

    @OneToMany(mappedBy = "pessoa")
    private List <EntidadeCarro> carro = new ArrayList();
        
//<editor-fold defaultstate="collapsed" desc="gets e sets">
    public List<EntidadeCarro> getCarro() {
        return carro;
    }
    
    public void setCarro(List<EntidadeCarro> carro) {
        this.carro = carro;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
   
    
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="metodos primitivos">
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EntidadePessoa)) {
            return false;
        }
        EntidadePessoa other = (EntidadePessoa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplicationteste.EntidadePessoa[ id=" + id + " ]";
    }
    
//</editor-fold>

  
     
}