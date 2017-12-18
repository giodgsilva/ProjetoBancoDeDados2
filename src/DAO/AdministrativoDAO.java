package DAO;

import bean.Administrativo;
import java.util.ArrayList;
import java.util.List;

public class AdministrativoDAO extends AbstractDAO<Administrativo>{
    
    @Override
    public ArrayList<Administrativo> listarTodos() {
        return (ArrayList<Administrativo>) entityManager.createQuery("FROM Administrativo").getResultList();
    }
    
    public List<Administrativo> buscarPorNome(String nome) {
        return entityManager.createQuery(
                "FROM Administrativo as a "
              + "WHERE a.pessoa.nome LIKE '" + nome + "'").getResultList();
    }
    
    public List<Administrativo> buscarPorMatricula(String mat) {
        return entityManager.createQuery(
                "FROM Administrativo as a "
              + "WHERE a.matricula LIKE ?1").setParameter(1, mat).getResultList();
    }
    
    public Administrativo buscarPorIdPessoa(int id) {
        return (Administrativo) entityManager.createQuery(
                "FROM Administrativo as a "
              + "WHERE a.pessoa.idPessoa = ?1").setParameter(1, id).getSingleResult();
    }
    
    @Override
    public Administrativo getLong(Long numero) {
        return entityManager.find(Administrativo.class, numero);
    }
    
    public Administrativo getInt(int numero) {
        return entityManager.find(Administrativo.class, numero);
    }
    
    public Administrativo getString(String string) {
        return entityManager.find(Administrativo.class, string);
    }

    @Override
    public boolean removerLong(Long numero) {
        
        boolean result = true;
	try {
            Administrativo admin = this.getLong(numero);
            super.remover(admin);
	} catch (Exception ex) {
            ex.printStackTrace();
            result = false;
        }
	return result;
    }
    
    public boolean removerPorNome(String nome) {
        
        boolean resultado = true;
	try {
            Administrativo admin = this.buscarPorNome(nome).get(0);
            super.remover(admin);
	} catch (Exception ex) {
            ex.printStackTrace();
            resultado = false;
        }
	return resultado;
    }
    
    public boolean removerPorMatricula(String nome) {
        
        boolean resultado = true;
	try {
            Administrativo admin = this.buscarPorNome(nome).get(0);
            super.remover(admin);
	} catch (Exception ex) {
            ex.printStackTrace();
            resultado = false;
        }
	return resultado;
    }
    
}
