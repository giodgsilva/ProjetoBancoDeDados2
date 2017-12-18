package DAO;

import bean.AssistenteSocial;
import java.util.ArrayList;
import java.util.List;

public class AssistenteSocialDAO extends AbstractDAO<AssistenteSocial> {
    
    @Override
    public ArrayList<AssistenteSocial> listarTodos() {
        return (ArrayList<AssistenteSocial>) entityManager.createQuery("FROM AssistenteSocial").getResultList();
    }
    
    public List<AssistenteSocial> buscarPorNome(String nome) {
        return entityManager.createQuery(
                "FROM AssistenteSocial as s "
              + "WHERE s.pessoa.nome LIKE '" + nome + "'").getResultList();
    }
    
    public List<AssistenteSocial> buscarPorMatricula(String matricula) {
        return entityManager.createQuery(
                "FROM AssistenteSocial as s "
              + "WHERE s.matricula = ?1").setParameter(1, matricula).getResultList();
    }
    
    public List<AssistenteSocial> buscarPorIdPessoa(int id) {
        return entityManager.createQuery(
                "FROM AssistenteSocial as s "
              + "WHERE s.pessoa.idPessoa = ?1").setParameter(1, id).getResultList();
    }

    @Override
    public AssistenteSocial getLong(Long id) {
        return entityManager.find(AssistenteSocial.class, id);
    }
    
    public AssistenteSocial getString(String nome) {
        return entityManager.find(AssistenteSocial.class, nome);
    }

    @Override
    public boolean removerLong(Long id) {
        
        boolean result = true;
	try {
            AssistenteSocial assist = this.getLong(id);
            super.remover(assist);
	} catch (Exception ex) {
            ex.printStackTrace();
            result = false;
        }
	return result;
    }
    
    public boolean removerPorNome(String nome) {
        
        boolean result = true;
	try {
            AssistenteSocial assist = this.buscarPorNome(nome).get(0);
            super.remover(assist);
	} catch (Exception ex) {
            ex.printStackTrace();
            result = false;
        }
	return result;
    }
    
    public boolean removerPorMatricula(String mat) {
        
        boolean result = true;
	try {
            AssistenteSocial assist = this.buscarPorMatricula(mat).get(0);
            super.remover(assist);
	} catch (Exception ex) {
            ex.printStackTrace();
            result = false;
        }
	return result;
    }
    
}
