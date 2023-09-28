Conta Bancária em Java:

Este é um exemplo simples de um programa Java que simula uma conta bancária. Ele foi criado como parte de um projeto educacional para entender os conceitos básicos de programação orientada a objetos em Java.

Descrição:

O código consiste em duas classes principais:

App.java: Este é o programa principal que demonstra o funcionamento de uma conta bancária. Ele cria duas contas de exemplo, deposita dinheiro nelas, faz saques, paga mensalidades e exibe o estado atual das contas.

ContaBanco.java: Esta é a classe que representa uma conta bancária. Ela possui atributos como número da conta, tipo de conta, saldo, status e métodos para abrir, fechar, depositar, sacar e pagar mensalidades.

Funcionalidades:
Abertura de contas corrente e poupança.
Depositar dinheiro em uma conta.
Sacar dinheiro de uma conta.
Pagar mensalidade da conta.
Fechar uma conta bancária.

Uso:
Para usar este código:

Clone este repositório para sua máquina local.

Abra o projeto em sua IDE Java preferida.

Execute o arquivo App.java para ver as operações de conta bancária em ação.

Exemplo
Aqui está um exemplo de como usar o código para criar uma conta bancária e realizar operações:

java

ContaBanco p1 = new ContaBanco();
p1.setNumConta(1111);
p1.setDono("Matheus");
p1.abrirConta("cc");

ContaBanco p2 = new ContaBanco();
p2.setNumConta(2104);
p2.setDono("Rayssa");
p2.abrirConta("cp");

p1.depositar(300);
p2.depositar(500);

p2.sacar(100);

p1.pagarMensalidade();
p2.pagarMensalidade();

p1.estadoAtual();
p2.estadoAtual();

Contribuição:
Sinta-se à vontade para contribuir com melhorias ou correções neste código. Basta criar um fork deste repositório, fazer suas alterações e enviar um pull request.