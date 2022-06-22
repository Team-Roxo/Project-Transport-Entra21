# Transportation Management System


## Team Roxo:  

- Kalil J. Fakhouri - Git

<a href="https://www.linkedin.com/in/kalil-j-fakhouri-1744b321" target="_blank"><img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>  <a href = "mailto:kjfakhouri@gmail.com"><img src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white" target="_blank"></a>
  
- Cristian Daniel Baade Schauffert - Main
  
<a href="https://www.linkedin.com/in/cristian-schauffert-a818ba238/" target="_blank"><img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>  <a href = "mailto:schauffertcristian@gmail.com"><img src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white" target="_blank"></a>
 


- Mateus Felipe - (CR)UD

<a href="https://www.linkedin.com/in/mateusgoettems/" target="_blank"><img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>   <a href = "mailto:mateusgoettems@gmail.com"><img src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white" target="_blank"></a>



- Bruno Roberto Pereira da Silva - CR(UD)

<a href="https://www.linkedin.com/in/bruno-roberto-49941a186/" target="_blank"><img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>  <a href = "mailto:brunorobertopds@gmail.com"><img src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white" target="_blank"></a>

 



### Objetivo do projeto:

Desenvolver um sistema TMS (Transportation Management System), que é um software para gerenciamento de transporte e logística nas empresas. Com ele, é possível centralizar as informações e visualizar todas as operações logísticas, facilitando o controle e a tomada de decisão.

### Diagrama e sobre o projeto:

![Diagrama em branco (1)](https://user-images.githubusercontent.com/26698699/174519655-1e4a7729-dac5-4416-98a1-1fb4f0801dcc.png)

--------

### Checklist das tecnicas de programação utilizadas

<details>	
  
  <summary><b>&nbsp; Metodologias ágeis </b></summary>
 
 - [X] - Metodologias ágeis 
 
 - [X] - Kanban 
 
 - [X] - Trello 
 
 - [X] - Brainstorming
 </details>
 
 <details>
   
   <summary><b>&nbsp; Versionamento & estruturação </b></summary>
   
 - [X] - Diagrama de Classe 
  
 - [X] - Fluxograma
  
 - [X] - Git
   
 - [X] - Github
 </details>
 
  <details>
   
   <summary><b>&nbsp; Lógica de programação </b></summary>
 
 
 - [X] - Variáveis, constantes, comentários e entrada de dados
 
 - [X] - Operadores Aritméticos, Incremento/Decremento, Igualdade, Relacionais  , Lógicos

 - [X] - Condicionais If, Ternário e Switch
 
 - [X] - Função
 
 - [X] - Repetição For e Do/While
 
 - [X] - Vetor e Matrizes
 </details>

  <details>

   <summary><b>&nbsp; Orientação a Objetos </b></summary>
 
 
 - [X] - Class
 
 - [X] - Poliformismo
 
 - [X] - Herança
 
 - [X] - Interface
 </details>
 
<details>

   <summary><b>&nbsp; Java avançado </b></summary>
 
 - [X] - Classe Wrapper
 
 - [X] - Enum
 
 - [X] - Data e Hora
 
 - [X] - Anotações
 
 - [X] - ArrayList
 
 - [ ] - LinkedList
 
 - [X] - HashSet
 
 - [X] - HashMap
 
 - [X] - Try/Catch
 
 - [ ] - Expressões Lambda
 
 </details>

</br>
 
------

### Descrição narrativa do código


<details>	
  <summary><b>&nbsp; Main</b></summary>


O Main foi usado só para exibir o Menu principal,Contendo apenas uma validação de login
Os dados que ele recebia sempre eram de outras classes,exceto a variavel para receber a opção escolhida.Foi feito os construtores das classes que seriam os tres principais pilares do nosso sistema(Login,Pedidos e Transporte), que por sua vez,ele capturava dados e chamava funções dos quais eram feitos validações, entradas, leituras, atualizações e exclusão de dados.

A validação foi feito utilizando dados da classe login e operadores logicos para definir qual menu seria utilizado,dependendo do tipo de cliente que estariamos lidando.
</details>

<details>	
  <summary><b>&nbsp; Login</b></summary>


A classe de login teve um caso especial,no caso como o main chamava os construtores dessa classe e essa classe tinha herança do banco de dados que armazena os valores de login,tivemos que cirar um menu dentro de login para usuarios que ainda nao foram logados, deixando as ações para uma classe secundaria(RunLogin).Então basicamente o Login foi um intermediador das ações enquanto os outros dois pilares(Pedidos e Transporte) tiveram suas ações próprias sem necessitar intermediar/Chamar outras funções de outras classes.
</details>

<details>	
  <summary><b>&nbsp; RunLogin</b></summary>

Classe simples com todas as funções que um sistema de login utilizaria, no caso login,cadastro e atualização de dados contando tambem com funções para o tratamento dos dados(Exemplo: Tratamento de CPF,nome, usuario e de estado).
</details>

 <details>	
  <summary><b>&nbsp; Tratamento de Cpf</b></summary>

Verifica a validade do CPF(Não oficialmente,apenas pelo tamanho de caracteres) verifica se não há caracteres invalidos e guarda o valor somente o numero sem pontos nem traços,para facilitar a exibição do dado.
  
![unknown](https://user-images.githubusercontent.com/53912803/174920672-2d20a8a0-3410-40ed-b45d-0560f3c4527d.png)

</details>

 <details>	
  <summary><b>&nbsp; Tratamento de nome </b></summary>

Não há uma validação para o nome pois pode ser qualquer um,apenas é capturado o valor transformado todas as letras em minusculas e depois é destrinchado em um vetor com o tamanho da String inserida sendo realocado os valores dentro do vetor modificando apenas a primeira letra de cada nome, que é verificado após um espaço. 
  
![nome](https://user-images.githubusercontent.com/53912803/174920824-328ba4d4-6d2c-406a-ad1f-b5909f6c586c.png)

</details>

 <details>	
  <summary><b>&nbsp; Tratamento de usuário</b></summary>

A unica validação para o usuario é a duplicidade dele no sistema,o programa verifica se há um usuario igual e se houver pede para o cliente digitar o usuario novamente,caso contrario o usuario será cadastrado substituindo qualquer espaço por 'underline' e deixando toda a variavel em minuscula.
  
![user](https://user-images.githubusercontent.com/53912803/174920834-f865b6ad-d87c-42d8-a945-1bdbead8d80e.png)

</details>

 <details>	
  <summary><b>&nbsp; Tratamento de estado</b></summary>

É capturado o estado digitado pelo usuario e com isso ele roda todo o Enum Brasil(Que contem todos os estados) e verifica o nome digitado tanto por nome completo com acento quanto sem acento e suas respectivas siglas, retornando um byte que irá localizar o Estado desejado pela posição.
  
  ![estado](https://user-images.githubusercontent.com/53912803/174920854-f7368ca4-9046-41f8-8c63-1daadc6bb52a.png)

</details>

<details>	
  <summary><b>&nbsp; Pedidos</b></summary>
  
A classe pedidos teve a função tanto de listar os pacotes quanto de cadastrar os mesmos.Na questão de cadastrar o pacote ele pode ser feito tanto por usuario logado quanto não logado,no caso de não logado ele faz um breve cadastro utilizando as mesmas validações que a classe login utiliza para cadastrar normalmente o usuario.
O desafio dos pedidos foi ter que capturar todos os dados do programa para criar o pacote e ler sem erros,Impossibilitando a alteração ou a exclusão do pacote.
  </details>



<details>	
  <summary><b>&nbsp; Logistica</b></summary
  
  Logistica é uma serie de calculos matematicos tanto complexos quanto simples(função Haversine e Calculo de volume e peso cubico do pacote respectivamente) dos quais é explicado no proprio codigo.A classe logistica ele reune todos esse dados que esta incluido tanto nos dados de usuario,transporte e Enum Brasil para setar um valor mais aproximado do frete real
  </details>
  
  <details>	
  <summary><b>&nbsp; Banco de Dados</b></summary
  
  Foi utilizado a tecnica da herança com as variaveis em privado utilizando encapsulamento original e uns outros modificados que consiste em receber Byte para encontrar um indice no ArrayList e retornar uma String ao inves de toda a ArrayList facilitando Manuseio dos objetos no codigo.
  </details>
  
  <details>	
  <summary><b>&nbsp; Transporte</b></summary>

A classe transporte não foi utilizada para outros fins senão para nos dar acesso ao banco de dados do programa.
</details>

  <details>	
  <summary><b>&nbsp; Brasil</b></summary
  
  A classe que possui o metodo Enum com os estados e suas respectivas siglas e latitudes e longitudes,alem de Gets que retornam tais variaveis.
  </details>
  

### Outros

- StartupScript
- Annotations
- Crud
