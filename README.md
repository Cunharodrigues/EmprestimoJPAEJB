# Aplicação com EJB + JPA

# Beans com Estado de Sessão (Stateful Session Beans).
    Um bean com estado de sessão (stateful session bean) tem como característica manter o estado conversacional para um cliente 
    específico.  O estado é armazenado nos valores das variáveis de instância do bean e nos interceptadores associados.
    Podemos definir um simples bean com estado de sessão usando a anotação @Stateful.
    
# Stateless Session Beans.
    Um bean sem estado de sessão não contém qualquer estado conversacional para um cliente específico.
    Todas as instâncias de um bean sem estado de sessão são equivalentes, portanto o container pode escolher delegar um método
    invocado por um cliente para qualquer instância disponível no pool do container. Visto que os beans sem estado de sessão não
    possuem qualquer estado, eles não precisam ser passivados.
    Podemos definir um simples bean sem estado de sessão utilizando a anotação @Stateless.
    
# Singleton Session Beans.
    Um bean de sessão Singleton é um componente que é instanciado uma única vez por aplicação e fornece um acesso bastante facilitado
    ao estado compartilhado. Se o container for distribuído em múltiplas JVM, cada aplicação terá uma instância do Singleton para cada
    JVM. Um bean de sessão Singleton é explicitamente projetado para ser compartilhado e suportar concorrência.
    Podemos definir um simples bean de sessão Singleton usando a anotação @Singleton.

# Criado as classes de negocio
![Emprestimo](https://user-images.githubusercontent.com/30321724/160194182-ab412df2-78ed-49f6-a462-88d9c9d53774.PNG)

<br>
<p>Até o momento criamos a seguinte estrutura, note que as interfaces e classes são bem coesas, ou seja, todas elas tem um propósito especifico, na camada de EJB temos     apenas lógica de negocio, na camada de persistência temos apenas classes que fazem o trabalho com o banco de dados.</p>

# A seguir temos as classes e interfaces criadas até o momento:
![Iterfaces](https://user-images.githubusercontent.com/30321724/160194619-5d5080cf-823c-4365-adb9-12a2fe1629ec.PNG)

# Scrip Banco de Dados:
![BD_Script](https://user-images.githubusercontent.com/30321724/160196380-78c1bba9-6aee-42d2-a4ef-731f33722bd4.PNG)

# Descrição:
    ° Apache Netbeans IDE 11.3
    ° Glassfish 5.0
    ° JDK 6.0
    ° BD Mysql
  
