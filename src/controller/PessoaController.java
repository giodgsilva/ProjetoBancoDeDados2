package controller;

import DAO.PessoaDAO;
import bean.Pessoa;
import java.util.ArrayList;
import java.util.Date;

public class PessoaController {
    
    private Pessoa pessoa = new Pessoa();
    private PessoaDAO DAO = new PessoaDAO();
    public AdministrativoController ac = new AdministrativoController();
    public AssistenteController asc = new AssistenteController();
    public UsuarioController uc = new UsuarioController();
    
    /*
     * CONSTRUTORES
     */
    
    //criação de pessoa + controller administrativo
    public PessoaController(String nome, Date nasc, String funcao, String matricula) {
        this.pessoa.setNome(nome);
        this.pessoa.setNascimento(nasc);
        ac = new AdministrativoController(this.pessoa, funcao, matricula);
    }

    //criação de pessoa + controller assistente social
    public PessoaController(String nome, Date nasc, String matricula) {
        this.pessoa = new Pessoa();
        this.pessoa.setNome(nome);
        this.pessoa.setNascimento(nasc);
        asc = new AssistenteController(this.pessoa, matricula);
    }
    
    //criação de pessoa + controller usuário
    public PessoaController(String nome, Date nasc, String pront, Date primAtend, String end, String status) {
        this.pessoa = new Pessoa();
        this.pessoa.setNome(nome);
        this.pessoa.setNascimento(nasc);
        uc = new UsuarioController(this.pessoa, pront, primAtend, end, status);
    }
    
    public PessoaController() {
        //sem parâmetros, apenas para a view poder acessar
    }
    
    /*
     * MÉTODOS DE SALVAR
     */
    public boolean salvar() {
        if(this.DAO.salvar(pessoa)) {
            System.out.println("Pessoa salva no Banco de Dados com sucesso.");
            return true;
        }
        return false;
    }
    
    /*
     * MÉTODOS DE EDIÇÃO
     */
    public boolean editar(Pessoa pessoa) {
        if(this.DAO.salvar(pessoa)) {
            System.out.println("Pessoa salva no Banco de Dados com sucesso.");
            return true;
        }
        return false;
    }
    
    /*
     * MÉTODOS DE REMOÇÃO
     */
    public boolean removerPorNome() {
        if(this.DAO.removerString(this.pessoa.getNome())) {
            System.out.println("Pessoa removida do Banco de Dados com sucesso.");
            return true;
        }
        return false;
    }
    
    /*
     * MÉTODOS DE BUSCA
     */
    public Pessoa buscarPorNomeUnico(String nome) {
        return this.DAO.buscarPorNome(nome).get(0);
    }
    
    public ArrayList<Pessoa> buscarPorNome(String nome) {
        return this.DAO.buscarPorNome(nome);
    }
    
}
