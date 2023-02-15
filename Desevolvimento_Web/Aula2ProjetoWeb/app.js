var soma = require('./soma.js')
var subtracao = require('./sub.js')
var multi = require('./multi.js')
var div = require('./div.js')


var a = 9
var b = 12

var total = 0

total = a + b

console.log(total)
console.log("PARPARPARPAPRAP")

console.log(`O resultado é ${total}`)



if ( a == 10) {
    console.log ("A variável é igual a 10")
} else if ( a < 10) {
    console.log ("A variável é menor que 10")
} else {
    console.log ("A variável é maior que 10")
}


console.log (" ")
console.log(soma(13,13))
console.log (" ")
console.log(subtracao(13,10))
console.log (" ")
console.log(multi(10,10))
console.log (" ")
console.log(div(10,2))