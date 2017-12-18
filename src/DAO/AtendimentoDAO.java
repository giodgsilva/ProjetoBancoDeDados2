package DAO;

import bean.Atendimento;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AtendimentoDAO extends AbstractDAO<Atendimento> {
    
    @Override
    public ArrayList<Atendimento> listarTodos() {
        return (ArrayList<Atendimento>) entityManager.createQuery("FROM Atendimento").getResultList();
    }
    
    public ArrayList<Atendimento> listarPorUsuario(String nome) {
        return (ArrayList<Atendimento>) entityManager.createQuery(
                "FROM Atendimento as a "
              + "WHERE a.usuario.pessoa.nome LIKE ?1").setParameter(1, nome).getResultList();
    }
    
    public ArrayList<Atendimento> listarPorData(Date data) {
        return (ArrayList<Atendimento>) entityManager.createQuery(
                "FROM Atendimento as a "
              + "WHERE a.data = ?1").setParameter(1, data).getResultList();
    }
    
    public ArrayList<Atendimento> listarPorAssistente(String nome) { //NÃO ESTÁ BUSCANDO PELO NOME DA ASSISTENTE
        return (ArrayList<Atendimento>) entityManager.createQuery(
                "FROM Atendimento as a "
              + "WHERE a.assistente.pessoa.nome LIKE = ?1").setParameter(1, nome).getResultList();
    }

    @Override
    public Atendimento getLong(Long numero) {
        return entityManager.find(Atendimento.class, numero);
    }
    
    public Atendimento getString(String string) {
        return entityManager.find(Atendimento.class, string);
    }

    @Override
    public boolean removerLong(Long numero) {
        
        boolean result = true;
	try {
            Atendimento atend = this.getLong(numero);
            super.remover(atend);
	} catch (Exception ex) {
            ex.printStackTrace();
            result = false;
        }
	return result;
    }
    
    public boolean removerString(String string) {
        
        boolean resultado = true;
	try {
            Atendimento atend = this.getString(string);
            super.remover(atend);
	} catch (Exception ex) {
            ex.printStackTrace();
            resultado = false;
        }
	return resultado;
    }
    
}
