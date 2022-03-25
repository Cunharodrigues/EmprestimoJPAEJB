/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.emprestimo.modelo.ejb;

import br.emprestimo.modelo.Pessoa;
import br.emprestimo.modelo.dao.PessoaDAO;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author pwcun
 */
@Stateless
public class PessoaBean implements PessoaRemote {
  @PersistenceContext(unitName = "EmprestimoPU")
  private EntityManager em;

  @Override
  public Pessoa salvar(Pessoa pessoa) throws Exception {
    PessoaDAO dao = new PessoaDAO(em);
    return dao.salvar(pessoa);
  }

  @Override
  public void excluir(Long id) {
    PessoaDAO dao = new PessoaDAO(em);
    dao.excluir(id);
  }

  @Override
  public Pessoa consultarPorId(Long id) {
    PessoaDAO dao = new PessoaDAO(em);
    return dao.consultarPorId(id);
  }
}
