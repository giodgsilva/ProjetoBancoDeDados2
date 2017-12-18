package controller;

import DAO.AdministrativoDAO;
import DAO.AssistenteSocialDAO;
import bean.Administrativo;
import bean.AssistenteSocial;
import bean.Pessoa;
import java.util.ArrayList;
import java.util.List;

public class AssistenteController {
    
    private AssistenteSocial assistente;
    private AssistenteSocialDAO DAO = new AssistenteSocialDAO();
    
    /*
     * CONSTRUTORES
     */
    public AssistenteController(Pessoa pessoa, String matricula) {
        this.assistente = new AssistenteSocial();
        this.assistente.setPessoa(pessoa);
        this.assistente.setMatricula(matricula);
    }
    
    public AssistenteController() {
        //sem parâmetros, apenas para a view poder acessar
    }
    
    /*
     * MÉTODOS DE SALVAR
     */
    public void salvar() {
        DAO.salvar(assistente);
    }
    
    /*
     * MÉTODOS DE EDIÇÃO
     */
    public void editar(AssistenteSocial assistente) {
        DAO.merge(assistente);
    }
    
    /*
     * MÉTODOS DE REMOÇÃO
     */
    public void removerPorMatricula(AssistenteSocial assist) {
        DAO.removerPorMatricula(assist.getMatricula());
    }
    
    public void removerPorNome(AssistenteSocial assist) {
        DAO.removerPorNome(assist.getPessoa().getNome());
    }
    
    /*
     * MÉTODOS DE BUSCA
     */
    public ArrayList<AssistenteSocial> buscarTodos() {
        return DAO.listarTodos();
    }
    
    public AssistenteSocial buscarPorIdPessoa(int id) {
        return DAO.buscarPorIdPessoa(id).get(0);
    }
    
    public List<AssistenteSocial> buscarPorNome(String nome) {
        return DAO.buscarPorNome(nome);
    }
    
    public AssistenteSocial buscarPorNomeUnico(String nome) {
        return DAO.buscarPorNome(nome).get(0);
    }
    
    public AssistenteSocial buscarPorMatricula(String matricula) {
        return DAO.buscarPorMatricula(matricula).get(0);
    }
    
}
