package controller;

import DAO.AdministrativoDAO;
import DAO.AssistenteSocialDAO;
import DAO.AtendimentoDAO;
import DAO.UsuarioDAO;
import bean.AssistenteSocial;
import bean.Atendimento;
import bean.Usuario;
import java.text.ParseException;
import java.util.ArrayList;

import java.util.Date;
import java.util.List;

public class AtendimentoController {
    
    private Atendimento atendimento = new Atendimento();;
    public AssistenteSocial assistente;
    public Usuario usuario;
    private AtendimentoDAO DAO = new AtendimentoDAO();
    private AssistenteSocialDAO asDAO = new AssistenteSocialDAO();
    private UsuarioDAO uDAO = new UsuarioDAO();
    
    /*
     * CONSTRUTORES
     */
    public AtendimentoController(Date data, AssistenteSocial assistente, Usuario usuario) {
        this.assistente = assistente;
        this.usuario = usuario;
        this.atendimento.setData(data);
        this.atendimento.setAssistenteSocial(assistente);
        this.atendimento.setUsuario(usuario);
        this.assistente.adicionarAtendimento(this.atendimento);
        this.usuario.adicionarAtendimento(this.atendimento);
    }

    public AtendimentoController() {
        //sem parâmetros, apenas para a view poder acessar
    }
    
    /*
     * MÉTODOS DE SALVAR
     */
    public boolean salvar() {
        return DAO.salvar(this.atendimento);
    }
    
    /*
     * MÉTODOS DE EDIÇÃO
     */
    /*public boolean salvarEdicao() {
        if(this.DAO.merge(atendimento)) {
            System.out.println("Atendimento alterado com sucesso.");
            return true;
        }
        return false;
    }*/
    
    public void editar() {
        DAO.merge(this.atendimento);
    }
    
    /*
     * MÉTODOS DE REMOÇÃO
     */
    public void removerPorId(Long id) {
        DAO.removerLong(id);
    }
    
    public void removerPorString(String nome) {
        DAO.removerString(nome);
    }
    
    /*
     * MÉTODOS DE BUSCA
     */
    public ArrayList<Atendimento> buscarTodos() {
        return DAO.listarTodos();
    }
    
    public ArrayList<Atendimento> buscarPorUsuario(String nome) {
        return DAO.listarPorUsuario(nome);
    }
    
    public ArrayList<Atendimento> buscarPorAssistente(String nome) {
        return DAO.listarPorAssistente(nome);
    }
    
    public ArrayList<Atendimento> buscarPorData(String data) throws ParseException {
        FormatarData dataNova = new FormatarData(data);
        return DAO.listarPorData(dataNova.getData());
    }
    
}
