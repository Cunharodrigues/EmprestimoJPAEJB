/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.emprestimo.modelo.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import br.emprestimo.modelo.Emprestimo;
import br.emprestimo.modelo.dao.EmprestimoDAO;

/**
 *
 * @author pwcun
 */
@Stateless
public class EmprestimoBean implements EmprestimoRemote {

    @PersistenceContext(unitName = "EmprestimoPU")
    private EntityManager em;

    @Override
    public Emprestimo salvar(Emprestimo emprestimo) throws Exception {
        EmprestimoDAO dao = new EmprestimoDAO(em);
        return dao.salvar(emprestimo);
    }
    
    @Override
    public void excluir(Long id) {
        EmprestimoDAO dao = new EmprestimoDAO(em);
        dao.excluir(id);
    }
    
    @Override
    public Emprestimo consultaPorId(Long id) {
        EmprestimoDAO dao = new EmprestimoDAO(em);
        return dao.consultaPorId(id);
    }
}
