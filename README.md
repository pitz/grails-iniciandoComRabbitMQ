### O básico para utilizar o RabbitMQ no seu projeto Grails (Groovy)

Antes de começar, você precisar possuir o RabbitMQ instalado no seu computador ou em algum container. Siga as instruções do próprio site do RabbitMQ clicando [aqui](https://www.rabbitmq.com/download.html)

Eu estou utilizando a versão `3.3.10` do Grails para a criação deste projeto e eu não sei te dizer qual a versão mínima suportada pelo RabbitMQ.

### Dependência
É necessário que você configure o seu arquivo `build.gradle` para importar a dependência do client do RabbitMQ para o Java. Com isso, importe a seguinte dependência:

![carbon](https://user-images.githubusercontent.com/42384045/73700773-38e19c00-46c6-11ea-93bb-c0f542cc523d.png)

### Publisher
O exemplo atual conta apenas com o método responsável por publicar uma mensagem. O intuito deste projeto é evoluir e disponibilizar um <em>boiler plate</em> para a utilização de uma API Grails com RabbitMQ.

A figura demonstra sua implementação de forma básica:

![carbon (2)](https://user-images.githubusercontent.com/42384045/73700866-7b0add80-46c6-11ea-8bfb-cf7e32bbace3.png)


### Consumer
O exemplo conta com o método responsável por consumir uma mensagem.

![carbon (6)](https://user-images.githubusercontent.com/42384045/73858346-03989380-4817-11ea-9b6c-727a1a9a5efa.png)

Note que aqui conseguimos utilizar a classe `com.rabbitmq.client.GetResponse`. Essa classe possui um jeito bem simplificado para consumir uma mensagem no Grails. Basta utilizar o método `basicGet()` com os parâmetros corretos.

### Como executar
Com o Grails instalado, e o servidor do RabbitMQ sendo executado, execute o servidor do grails com o seguinte comando:

![carbon (7)](https://user-images.githubusercontent.com/42384045/73858330-fc718580-4816-11ea-9d48-19ee1f230687.png)

Vale ressaltar que este projeto não depende de um banco de dados. 
