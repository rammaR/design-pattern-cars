# Explorando Padrões de Projetos na Prática com Java

Aqui vemos a aplicação do padrão de projeto Factory e Template Method.
  Dependendo do sufixo da url passada, uma fábrica diferente será instanciada. Mas o método
  de construção de um carro é compartilhado pela interface CarFactory.
  Depois da fábrica criada, um carro deve ser produzido, salvo no banco e retornado para o usuário.
  Como as duas fábricas possuem isso em comum, essa parte do algorítimo é abstraída pela Template Method.
 
 @Author RammaR
