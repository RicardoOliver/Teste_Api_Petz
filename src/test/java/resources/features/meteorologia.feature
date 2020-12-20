#language: pt

Funcionalidade: Consultar cardápios e seus produtos relacionados.


  Cenário: Consultar seção de cardápios
    Dado que eu possua o dados metereológicos das cidades
    Quando eu realizar a requisição no endpoint
    Então a api me retorna as seções de dados metereológicos
    E o content-type "application/json"