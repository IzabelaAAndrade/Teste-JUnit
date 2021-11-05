# Teste Simples Usando JUnit

O repositório em questão ilustra a execução de uma atividade prática da disciplina de Linguagem de Programação II, do curso técnico em informática, do CEFET-MG.

Os códigos apresentados demonstram de maneira simples e rápida a utilização do framework JUnit para testes unitários. Na pasta com.matematica, tem-se uma classe denominada "calcula_areas.java", a qual possui 3 métodos públicos:
- areaTriangulo
- areaTrapezio
- areaCirculo

Os mesmos retornam apenas o resultado do cálculo. Para efetivar a testagem destes métodos, utiliza-se a classe "calcula_areasTest.java", localizada no pacote com.matematica na pasta "test". 

O objeto "objeto_teste" corresponde a um objeto da classe "calcula_areas.java" usado para permitir a chamada das funções a serem testadas. O objeto em questão é instanciado no método "setUp()" sempre que um teste é executado. Os métodos
- TestareaTriangulo
- TestareaTrapezio
- TestareaCirculo

são usados para realizar a testagem dos métodos mencionados correspondentes. Usa-se do método "assertEquals" para verificar se o primeiro parâmetro corresponde ao resultado devolvido pelo segundo, que no caso, é a chamada dos métodos a serem testados. Para as duas primeiras funções, foram inseridos valores corretos, os quais devem ser aprovados nos testes. Para a última função, no entanto, decidiu-se pela inclusão de um valor incorreto, de modo a verificar que o valor em questão não passaria no teste.

De modo a executar os testes, basta executar o arquivo "calcula_areasTest.java".

# Resultados:

Abaixo são ilustradas capturas de tela com os resultados obtidos.
![image](https://user-images.githubusercontent.com/51242342/140456230-92cde5d2-d2b2-4fdf-9bbf-d5a47f31ae89.png)

