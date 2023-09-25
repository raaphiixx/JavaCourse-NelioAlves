# Exercícios em Java
<hr>
Este repositório será dedicado para registrar minha evolução como desenvolvedor Java, levando as soluções dos exercicios do curso que estou fazendo. Não será compartilhado anotações por se tratar de um curso pago, reservo o direito das informações ao seu criador.

## Progresso
Em cada tópico será compartilhado meus conhecimentos referentes a cada sessão, algumas sessões mais básicas serão unidas, no final de cada tópico haverá um link com os exercicios, caso haja.

### Seção 1 - 3
Partindo dos príncipios básicos da linguagem e instalação das ferramentas.

### Seção 4 - 6
Nestas sessões foram abordados alguns temas como tipos primitivos e String, ordem de precedência para realização de calculos, estruturas de comparação tais como "maior ou igual a", "maior que", "menor ou igual a", "menor que" e "igual a", também explicado conceitos de escopo e inicialização de variáveis. O modo debug é apresentado, com objetivo de entender de forma mais detalhada os processos em que o código se desenvolve, por fim introduzido os laços de repitição FOR, WHILE e DO-WHILE, sendo este ultimo menos utilizado.

**Exercicios:**
* <a href="Exercices.java">Exercicios</a>

### Seção 7
Chegando nos tópicos mais intermediários da linguagem, apresentando as conveções coletivas, que são "regras" utilizadas por desenvolvedores por todo mundo, não são obrigatórias, mas tornam o código mais legivel, no caso do Java o mais utilizado é camelCase, que consiste na primeira letra ser minuscula e a cada troca de palavra iniciar com letra maiuscula, por exemplo **desenharQuadrado**, os metodos são mais compreensiveis quando são verbos como por exemplo **escreva()**.

String são apresentados com mais foco, onde é explicado que não se trata de um tipo primitivo, as transformações UpperCase, lowerCase e Split são apresentadas e por fim as function e methods são iniciados, funcões que não retornam nada ao usuário são chamadas de ``void`` e as que retornam precisam ter um tipo do tipo ``int, double, String, boolean`` entre outros.

## Seção 8
Programação Orientada a Objeto é o ponto mais importante desta seção, OOP é o principio básico do Java, a partir daqui as aplicações são divididas em duas ou mais classes, onde cada uma faz aquilo que é destinada a fazer, é o conceito conhecido como delegação de responsabilidades, também serão criados os primeiros objetos e realizada as primeiras operações. Ainda dentro das classes OOP, o método ```toString()``` é apresentado, metodo este responsável por formatar a saída do objeto para o usuário. Por fim, o Static method é introduzido, utilizado para quando não é necessário criar um objeto para utiliza-lo, funcionando como constantes ou simplesmente para auxiliar a classe principal.

**Exercicios:**
* <a href="exercicesClass69/">Aula 69</a>
* <a href="exercicesClass72/">Aula 72</a>

## Seção 9
Esta sessão é uma continuação da sessão anterior, adentrando mais sobre os conceitos relacionados ao OOP, primeiramente inserindo os construtores, que são formas que criar um objeto, solicitando ou não parâmetros, ainda dentro deste tema é possível  determinar o tipo de acesso a cada parâmetro e função sendo eles o **private**, **public** e **protected**.

| MODIFICADOR 	| CLASS 	| PACKAGE 	| SUBCLASS 	| DIFFERENT CLASS 	|
|-------------	|-------	|---------	|----------	|-----------------	|
| PUBLIC      	| SIM   	| SIM     	| SIM      	| SIM             	|
| PROTECTED   	| SIM   	| SIM     	| SIM      	| NÃO             	|
| PRIVATE     	| SIM   	| NÃO     	| NÃO      	| NÃO             	|

**Exercicios:**
* <a href="exercicesClass81/">Aula 81</a>

## Seção 10
Nesta seção são apresentados os conceitos **Array**, **Lists**, **For Each**, **Wrapper Classes** e **Matriz**, conceitos esses muito utilizados no desenvolvimento **Back-End**.

Os Array são conjuntos de listas com limites, ou seja, é necessário determinar seu tipo e tamanho logo no início, limitando sua usabilidade. Sintax: `dataType [] variableName = new dataType[limit];`

Lists são introduzidas para tirar essa limitação dos Arrays, mas a classe principal não pode ser instanciada, por este motivo são utilizadas suas sub-classes tais como **ArrayList**, **LinkedList** entre outras. Sintax: `List <Class> variableName = new ArrayList<>();`

ForEach um novo laço de repetição, com uma sintax super simples, na qual é possível percorrer um Array ou uma List.

Exemplo:
```
import java.util.ArrayList;
import java.util.List;

public class ForEachExample {

  public static void main (String args []){
    List <String> list = new ArrayList<>();
    list.add("Maria");
    list.add("Paula");
    list.add("Brenda");
    list.add("Lorena");
    
    for (String x: list) {
      System.out.println(x);
    }
  }
}
```
**Output:**
```
Maria
Paula
Brenda
Lorena
```

Wrapper Classes são formas de usar tipos primitivos (double, int, boolean etc) como objetos, a vantagem de usar essas classes é poder utilizar as funções do tipo primitivo com as funções de um objeto. Por este motivo as Strings tem bastante funções, não são tipos primitivos, sendo assim sua classe pode ter métodos que facilitam a vida do programador.

| Primite Data Type 	| Wrapper Class 	|
|-------------------	|---------------	|
| byte              	| Byte          	|
| short             	| Short         	|
| int               	| Integer       	|
| long              	| Long          	|
| float             	| Float         	|
| double            	| Double        	|
| boolean           	| Boolean       	|
| char              	| Character     	|


Matrix, por fim, mas não menos importante o conceito de Matrix é introduzido, sendo este um **Array bi-dimensional**, ou seja, com colunas e linhas. Sintax: `variableType [][] variableName = new variableType [][]`

**Exercicios:**
* <a href="exercicesClass90/">Aula 90</a>
* <a href="exercicesClass99/">Aula 99</a>
* <a href="exercicesClass102/">Aula 102</a>
* <a href="exercicesClass103/">Aula 103</a>

## Informações Gerais
- Curso:
  - <a href="https://www.udemy.com/course/java-curso-completo/">Java COMPLETO 2023 Programação Orientada a Objetos +Projetos</a>
- Professor:
  - <a href="https://www.linkedin.com/in/nelio-alves/">Nelio Alves</a>
- Progresso:
  - Aula atual: 103
  - Total de Aulas: 398
- OBSERVAÇÕES:
  - Todas as pastas de exercícios tem um arquivo nomeado "Questions", onde encontram-se as perguntas dos exercicios.