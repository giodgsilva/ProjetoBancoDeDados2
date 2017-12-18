package controller;

import DAO.UsuarioDAO;
import bean.Pessoa;
import bean.Usuario;
import java.util.ArrayList;
import java.util.Date;

public class UsuarioController {
    
    private Usuario usuario = new Usuario();
    private UsuarioDAO DAO = new UsuarioDAO();
    
    /*
     * CONSTRUTORES
     */
    public UsuarioController(Pessoa pessoa, String pront, Date primAtend, String end, String status) {
        //this.usuario = new Usuario();
        this.usuario.setPessoa(pessoa);
        this.usuario.setProntuario(pront);
        this.usuario.setPrimeiroAtendimento(primAtend);
        //this.usuario.setEndereco(end);
        this.usuario.setStatus(status);
    }

    public UsuarioController() {
        //sem parâmetros, apenas para a view poder acessar
    }
    
    /*
     * MÉTODOS DE SALVAR
     */
    public boolean salvar() {
        if(this.DAO.salvar(usuario)) {
            System.out.println("Usuário salvo com sucesso.");
            return true;
        }
        return false;
    }
    
    /*
     * MÉTODOS DE EDIÇÃO
     */
    public boolean editar(Usuario usuario) {
        if(this.DAO.merge(usuario)) {
            System.out.println("Usuário alterado com sucesso.");
            return true;
        }
        return false;
    }
    
    /*
     * MÉTODOS DE REMOÇÃO
     */
    public boolean removerPorProntuario(Usuario user) {
        if(this.DAO.removerPorProntuario(user.getProntuario())) {
            System.out.println("Usuário removido com sucesso.");
            return true;
        }
        return false;
    }
    
    public boolean removerPorNome(Usuario user) {
        if(this.DAO.removerPorNome(user.getPessoa().getNome())) {
            System.out.println("Usuário removido com sucesso.");
            return true;
        }
        return false;
    }
    
    /*
     * MÉTODOS DE BUSCA
     */
    public Usuario buscarPorIdPessoa(int id) {
        return DAO.buscarPorIdPessoa(id);
    }
    
    public ArrayList<Usuario> buscarTodos() {
        return DAO.listarTodos();
    }
    
    public ArrayList<Usuario> buscarPorListaNome(String nome) {
        return DAO.buscarListaPorNome(nome);
    }
    
    public Usuario buscarPorNome(String nome) {
        return DAO.buscarPorNome(nome).get(0);
    }
    
    public Usuario buscarPorProntuario(String pront) {
        return DAO.buscarPorProntuario(pront).get(0);
    }
    
}
