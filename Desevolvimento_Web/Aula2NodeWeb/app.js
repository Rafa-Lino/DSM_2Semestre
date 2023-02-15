var http = require('http')

http.createServer(function(req, res){ //req é para pedir uma requisição, res é para enviar uma resposta. 
    res.end("Mensagem direcionada")
}).listen(8081)

console.log("Servidor ativo!")
