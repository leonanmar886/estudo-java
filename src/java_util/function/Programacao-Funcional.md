# Paradigma Funcional em Java
A linguagem de programação Java não é nativamente uma linguagem que segue o paradigma funcional, mas que com o passar do tempo, se adaptou à constante demanda pela praticidade, simplicidade e clareza da programação funcional.

## Definindo o que é o Paradigma/Programação Funcional 

O paradigma funcional compreende um estilo de programação com alto nível de abstração, onde suas funções computam um resultado que depende apenas dos valores das entradas. Os programas são funções que descrevem uma relação explícita e precisa entre entradas e saídas, o que a diferencia da programação funcional, que é afetada por mudanças no estado do programa. <br>
O paradigma funcional não dita diretamente o código e suas responsabilidades. **Divide-se todo o processo de transformação de dados em funções complementares, que fazem, cada uma de uma vez, parte do processamento para resolver o problema.**

## Quais os principais conceitos da programação funcional?
1. ### Composição de Função
   Este é o nome dado ao processo de criação de uma nova função por meio da junção de outras.<br> 
   Exemplo: <br> 
   
   ``` Java
   Int algarismos = [1,2,3,4,5];
   algarismos.stream()
   .filter(n -> n % 2 === 0)
   .map(n -> n * 2)
   ```
   Note que existem vários métodos e funções encadeados, e que interajem entre si para realizarem as suas operações.
2. ### Funções Puras
   São funções que independente de quando ou onde forem chamadas, se receberem os mesmos argumentos, devem sempre retornar o mesmo valor.<br> 
   Exemplo:<br> 
   ``` Java
   Final boolean verifica_se_maior = (val1, val2) -> val1 > val2; 
   ```
   O retorno desse método sempre será igual quando receber os mesmos valores. Se for 1 e 2, o retorno sempre será falso, independente do contexto dentro do código quando ele foi chamado.