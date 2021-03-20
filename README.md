# Automação Twitter :computer:



Considerando alguns dos principais serviços mais utilizados dentro da rede social Twitter, eu automatizei três testes que realizam as seguintes validações:



- O primeiro teste realiza a validação da função "Follow" na rede social.  :walking:

- O segundo teste valida a busca de perfis com base em dados fornecidos. :mag:

- O terceiro teste realiza o login na plataforma e validação em seguida. :lock:



Os testes foram criados usando Selenium WebDriver em Java, JUnit e vale destacar que os testes foram criados em Page Object Model, utilizei a extensão EasyTest do JUnit para DDT (Data-Driven Testing) e durante e após a execução do script são geradas evidências em forma de Print screen.



Abaixo algumas instruçoes para que você possa rodar este código:

- Na page **Web** altere o metodo **createChrome** substituindo o caminho **"C:\\\Users\\\User\\\Drivers\\\chromedriver.exe"** para o caminho onde o driver do seu navegador esta localizado.

- Na page **Screenshot** altere o caminho na variavel *screenshotArquivo* **"C:\\\Users\\\User\\\Desktop\\\Selenium\\\Testes\\\PrintScreens\\\Twitter\\\\"** para o caminho da pasta qual você deseja que as evidencias sejam salvas em seu computador.

- No arquivo **TwitterPageObjectTest.csv** é necessário substituir os seguintes campos:

  **validarLogin**

  DigiteUsername1: Insira o login do primeiro usuario

  DigiteSenha1: Insira a senha do primeiro usuario
  @DigiteUsername1:  Insira o @ do primeiro usuario

  **validarBusca**

  DigiteUsername2: Insira o login do segundo usuario

  DigiteSenha2: Insira a senha do segundo usuario

  **validarFollow**

  DigiteUsername1: Insira o login do primeiro usuario

  DigiteSenha1: Insira a senha do primeiro usuario
  


  Indico a utilização de dois usuários distintos para não impactar algum teste. 