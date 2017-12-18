package controller;

import DAO.AdministrativoDAO;
import bean.Administrativo;
import bean.Pessoa;
import java.util.List;

public class AdministrativoController {
    
    private Administrativo administrativo;
    private AdministrativoDAO DAO = new AdministrativoDAO();
    
    /*
     * CONSTRUTORES
     */
    public AdministrativoController(Pessoa pessoa, String funcao, String matricula) {
        this.administrativo = new Administrativo();
        this.administrativo.setPessoa(pessoa);
        this.administrativo.setFuncao(funcao);
        this.administrativo.setMatricula(matricula);
    }
    
    public AdministrativoController() {
        //sem parâmetros, apenas para a view poder acessar
    }
    
    /*
     * MÉTODOS DE SALVAR
     */
    public boolean salvar() {
        return DAO.salvar(this.administrativo);
    }
    
    /*
     * MÉTODOS DE EDIÇÃO
     */
    public void editar(Administrativo administrativo) {
        DAO.salvar(administrativo);
    }
    
    /*
     * MÉTODOS DE REMOÇÃO
     */
    public void removerPorMatricula(Administrativo admin) {
        DAO.removerPorMatricula(admin.getMatricula());
    }
    
    public void removerPorNome(Administrativo admin) {
        DAO.removerPorNome(admin.getPessoa().getNome());
    }
    
    /*
     * MÉTODOS DE BUSCA
     */
    public List<Administrativo> buscarTodos() {
        return DAO.listarTodos();
    }
    
    public Administrativo buscarPorIdPessoa(int id) {
        return DAO.buscarPorIdPessoa(id);
    }
    
    public List<Administrativo> buscarPorNome(String nome) {
        return DAO.buscarPorNome(nome);
    }
    
    public Administrativo buscarPorMatricula(String mat) {
        return DAO.buscarPorMatricula(mat).get(0);
    }
    
}
