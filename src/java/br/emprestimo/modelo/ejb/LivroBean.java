/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.emprestimo.modelo.ejb;

import br.emprestimo.modelo.Livro;
import br.emprestimo.modelo.dao.LivroDAO;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author pwcun
 */
@Stateless
public class LivroBean implements LivroRemote {

    @PersistenceContext(unitName = "EmprestimoPU")
    private EntityManager em;
    
    private Long id;
    private Livro livro;

    @Override
    public Livro salvar(Livro arg0) throws Exception {
        LivroDAO dao = new LivroDAO(em);
        return dao.salvar(livro);
    }

    @Override
    public void excluir(Long arg0) {
        LivroDAO dao = new LivroDAO(em);
        dao.excluir(id);
    }

    @Override
    public Livro consultarPorId(Long arg0) {
        LivroDAO dao = new LivroDAO(em);
        return dao.consultarPorId(id);
    }

}
