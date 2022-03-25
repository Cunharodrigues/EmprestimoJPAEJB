/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.emprestimo.modelo.ejb;

import br.emprestimo.modelo.Pessoa;

/**
 *
 * @author pwcun
 */
public interface PessoaRemote {
    public Pessoa salvar(Pessoa pessoa) throws Exception;
    public void excluir(Long id);
    public Pessoa consultarPorId(Long id);

}
