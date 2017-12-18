package DAO;

import bean.Pessoa;
import java.util.List;

import bean.Pessoa;
import java.util.ArrayList;

public class PessoaDAO extends AbstractDAO<Pessoa> {
    
    @Override
    public ArrayList<Pessoa> listarTodos() {
        return (ArrayList<Pessoa>) entityManager.createQuery("FROM Pessoa").getResultList();
    }
    
    public ArrayList<Pessoa> buscarPorNome(String nome) {
        return (ArrayList<Pessoa>) entityManager.createQuery(
                "FROM Pessoa as p "
              + "WHERE p.nome LIKE ?1").setParameter(1, nome).getResultList();
    }
    
    public ArrayList<Pessoa> buscarPorNomeUnico(String nome) {
        return (ArrayList<Pessoa>) entityManager.createQuery(
                "FROM Pessoa as p "
              + "WHERE p.nome = ?1").setParameter(1, nome).getResultList();
    }

    @Override
    public Pessoa getLong(Long numero) {
        return entityManager.find(Pessoa.class, numero);
    }
    
    public Pessoa getInt(int numero) {
        return entityManager.find(Pessoa.class, numero);
    }
    
    public Pessoa getString(String string) {
        return entityManager.find(Pessoa.class, string);
    }

    @Override
    public boolean removerLong(Long numero) {
        
        boolean result = true;
	try {
            Pessoa pessoa = this.getLong(numero);
            super.remover(pessoa);
	} catch (Exception ex) {
            ex.printStackTrace();
            result = false;
        }
	return result;
    }
    
    public boolean removerString(String string) {
        
        boolean resultado = true;
	try {
            Pessoa pessoa = this.getString(string);
            super.remover(pessoa);
	} catch (Exception ex) {
            ex.printStackTrace();
            resultado = false;
        }
	return resultado;
    }
    
}
