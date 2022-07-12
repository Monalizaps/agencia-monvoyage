Algoritmo "Registro"
Var
   // Seção de Declarações das variáveis
   nome: vetor [1..2]  de caractere
   idade: vetor [1..2] de inteiro
   destino: vetor [1..3] de caractere
   origem: vetor [1..3] de caractere
   nome_dois: caractere
   sobrenome: caractere
   consultar_destino: inteiro
   d,idade_dois, destino_dois: inteiro
   consulta: inteiro
   dados: inteiro

Inicio
procedimento consultar
inicio
   escreval("Seus dados são: ")
   escolha consulta
   caso 1
      escreval("Faça seu cadastro")
      menu()
   caso 2
      escreval("Digite seu nome: ", nome[1])
      escreval("Digie seu sobrenome: ", nome[2])
      escreval("Digite a sua idade: ", idade[1])
      escolha consultar_destino
      caso 1
         escreval("O seu destino é: ", destino[1])
      caso 2
         escreval("O seu destino é: ", destino[2])
         menu()
      caso 3
         escreval("O seu destino é: ", destino[3])
      fimescolha
   fimescolha
fimprocedimento


procedimento cadastro
inicio
   escreval("Digite seu nome", nome_dois)
   leia(nome_dois)
   nome[1]<-nome_dois
   escreval("digite seu sobrenome", sobrenome)
   leia (sobrenome)
   nome[2]<-sobrenome
   escreval("Digite sua idade", idade_dois)
   leia(idade_dois)
   idade[1]<-idade_dois
   escreval("Digite um Destino")
   escreval("1 - Rio de Janeiro")
   escreval("2 - Fortaleza")
   escreval("3 - Minas Gerais")
   leia(destino_dois)
   escolha destino_dois
   caso 1
      destino[1]<-"Rio de Janeiro"
      consultar_destino<-1
      consulta<-2
      menu()
   caso 2
      destino[2]<-"Fortaleza"
      consulta<-2
      consultar_destino<-2
      menu()
   caso 3
      destino[3]<-"Minas Gerais"
      consulta<-2
      consultar_destino<-3
      menu()
   outrocaso
      escreval("digite uma opção válida")
   fimescolha
fimprocedimento

procedimento menu
inicio
   escreval("escolha uma opção")
   escreval("1 Cadastro")
   escreval("2 Consulta de cadastro")
   leia(dados)
   escolha dados
   caso 1
      cadastro()
   caso 2
      consultar()
   fimescolha
fimprocedimento

menu()


Fimalgoritmo