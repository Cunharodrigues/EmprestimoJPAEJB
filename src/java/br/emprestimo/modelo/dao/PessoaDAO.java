/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.emprestimo.modelo.dao;

import br.emprestimo.modelo.Pessoa;
import javax.persistence.EntityManager;

/**
 * Classe utilizada para realizar as operações com o bando de dados.
 */
public class PessoaDAO {
  private final EntityManager entityManager;

  /**
   * Construtor da classe DAO que chama os métodos do EntityManager.
   * @param entityManager
   */
  public PessoaDAO(EntityManager entityManager) {
    this.entityManager = entityManager;
  }

  /**
   * Método para salvar ou atualizar a pessoa.
   * @param pessoa
   * @return
   * @throws java.lang.Exception
   */
  public Pessoa salvar(Pessoa pessoa) throws Exception{
    System.out.println("Salvando o pessoa: " + pessoa.getNome());
    /* Verifica se a pessoa ainda não está salva no banco de dados. */
    if(pessoa.getId() == null) {
      /* Salva a pessoa no banco de dados. */
      this.entityManager.persist(pessoa);
    } else {
      /* Verifica se a pessoa não está no estado managed. */
      if(!this.entityManager.contains(pessoa)) {
        /* Se a pessoa não está no estado managed verifica se ele existe na base. */
        if (entityManager.find(Pessoa.class, pessoa.getId()) == null) {
          throw new Exception("Livro não existe!");
        }
      }
      /* Faz uma atualização da pessoa que estava gravado na base de dados. */
      return entityManager.merge(pessoa);
    }
    /* Retorna a pessoa que foi salva, este retorno ocorre para modemos ter o id que foi salvo. */
    return pessoa;
  }

  /**
   * Método que exclui a pessoa do banco de dados.
   * @param id
   */
  public void excluir(Long id) {
    /* Consulta a pessoa na base de dados através de seu ID. */
    Pessoa pessoa = entityManager.find(Pessoa.class, id);
    System.out.println("Excluindo a pessoa: " + pessoa.getNome());
    /* Remove a pessoa da base de dados. */
    entityManager.remove(pessoa);
  }

  /**
   * Consulta a pessoa por ID.
   * @param id
   * @return
   */
  public Pessoa consultarPorId(Long id) {
    return entityManager.find(Pessoa.class, id);
  }
}
