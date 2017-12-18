package DAO;

import bean.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO extends AbstractDAO<Usuario>{

    @Override
    public ArrayList<Usuario> listarTodos() {
        return (ArrayList<Usuario>) entityManager.createQuery("FROM Usuario").getResultList();
    }
    
    public ArrayList<Usuario> buscarListaPorNome(String nome) {
        return (ArrayList<Usuario>) entityManager.createQuery(
                "FROM Usuario as u "
              + "WHERE u.pessoa.nome LIKE ?1").setParameter(1, nome).getResultList();
    }
    
    public List<Usuario> buscarPorNome(String nome) {
        return (ArrayList<Usuario>) entityManager.createQuery(
                "FROM Usuario as u "
              + "WHERE u.pessoa.nome LIKE ?1").setParameter(1, nome).getResultList();
    }
    
    public List<Usuario> buscarPorProntuario(String prontuario) {
        return entityManager.createQuery(
                "FROM Usuario as u "
              + "WHERE u.prontuario = ?1").setParameter(1, prontuario).getResultList();
    }
    
    public Usuario buscarPorIdPessoa(int id) {
        return (Usuario) entityManager.createQuery(
                "FROM Usuario as u "
              + "WHERE u.pessoa.idpessoa = ?1").setParameter(1, id).getSingleResult();
    }

    @Override
    public Usuario getLong(Long numero) {
        return entityManager.find(Usuario.class, numero);
    }
    
    public Usuario getString(String string) {
        return entityManager.find(Usuario.class, string);
    }
    
    @Override
    public boolean removerLong(Long numero) {
        
        boolean resultado = true;
	try {
            Usuario user = this.getLong(numero);
            super.remover(user);
	} catch (Exception ex) {
            ex.printStackTrace();
            resultado = false;
        }
	return resultado;
    }
    
    public boolean removerPorNome(String nome) {
        
        boolean resultado = true;
	try {
            Usuario user = this.buscarPorNome(nome).get(0);
            super.remover(user);
	} catch (Exception ex) {
            ex.printStackTrace();
            resultado = false;
        }
	return resultado;
    }
    
    public boolean removerPorProntuario(String pront) {
        
        boolean resultado = true;
	try {
            Usuario user = this.buscarPorProntuario(pront).get(0);
            super.remover(user);
	} catch (Exception ex) {
            ex.printStackTrace();
            resultado = false;
        }
	return resultado;
    }
    
}
