package javaapplicationteste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;


public class PersistPessoaCarro {
    
    public static void main(String[] args) {
           
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JavaApplicationTestePU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            EntidadePessoa pessoa = em.find(EntidadePessoa.class, 151L);
            EntidadeCarro carro = new EntidadeCarro();
            carro.setAno(Integer.parseInt(JOptionPane.showInputDialog("Informe ano")));
            carro.setCor(JOptionPane.showInputDialog("Informe cor"));
            carro.setMarca(JOptionPane.showInputDialog("Informe marca"));
            carro.setModelo(JOptionPane.showInputDialog("Informe modelo"));
            em.persist(carro);
            pessoa.getCarro().add(carro);
            carro.setPessoa(pessoa);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        
        JOptionPane.showMessageDialog(null, "Don't worry, be happy!");
        
    }
    
}