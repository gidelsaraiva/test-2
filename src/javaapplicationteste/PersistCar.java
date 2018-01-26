package javaapplicationteste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

public class PersistCar {
    
    public static void main(String[] args) {
           
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JavaApplicationTestePU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            EntidadePessoa p = new EntidadePessoa();
            
            
            p.setNome(JOptionPane.showInputDialog("informe seu Nome"));
            p.setCpf(Integer.parseInt(JOptionPane.showInputDialog("Informe o ano")));
             em.persist(p);
           // em.getTransaction().commit();
            
            EntidadeCarro carro = new EntidadeCarro();
          
            carro.setMarca(JOptionPane.showInputDialog("Informe marca"));
            carro.setModelo(JOptionPane.showInputDialog("Informe modelo"));
            carro.setCor(JOptionPane.showInputDialog("Informe cor"));
            carro.setAno(Integer.parseInt(JOptionPane.showInputDialog("Informe o ano")));
            em.persist(carro);
            em.getTransaction().commit();
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "ouvir um erro!");
            e.printStackTrace();
            em.getTransaction().rollback();
          
            
            
        } finally {
            em.close();
        }
        
        JOptionPane.showMessageDialog(null, "Foi um Sucesso!");
        
    }
    
}
