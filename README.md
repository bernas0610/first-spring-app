🚀 Minha Primeira API REST

Este é o meu primeiro projeto criando uma API REST!
A ideia aqui foi aprender o básico de como funciona uma API e como receber dados enviados por um formulário.

📌 Sobre o projeto

Essa API é bem simples e tem como principal função:

Receber dados de um formulário
Utilizar o método POST
Retornar uma resposta confirmando que os dados foram recebidos

Tudo foi feito com foco em aprendizado, então o projeto é básico, mas já mostra como funciona a comunicação entre cliente e servidor.

⚙️ Tecnologias utilizadas
Java
Spring Boot
REST API
📥 Como funciona

A API possui um endpoint que recebe requisições do tipo POST.

Exemplo de uso:

O usuário preenche um formulário
Os dados são enviados para a API
A API recebe esses dados e retorna uma mensagem de sucesso
🔗 Endpoint
POST /reservas

📦 Exemplo de requisição

{
  "nome": "João",

  
  "email": "joao@email.com"
}


✅ Resposta
Reserva recebida com sucesso!
Nome: João
🎯 Objetivo

Esse projeto foi criado para:

Entender o funcionamento básico de APIs REST
Praticar o uso de requisições HTTP
Aprender a trabalhar com o Spring Boot
📚 Próximos passos

Pretendo evoluir esse projeto adicionando:

Validação de dados
Integração com banco de dados
Métodos GET, PUT e DELETE
Melhor organização do código
