/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.emprestimo.modelo.ejb;

import br.emprestimo.modelo.Livro;
import javax.ejb.Remote;

/**
 *
 * @author pwcun
 */
@Remote
public interface LivroRemote {

    public Livro salvar(Livro livro) throws Exception;
    public void excluir(Long id);
    public Livro consultarPorId(Long id);

}
