//without arrow function

// function hello(name) {
//     console.log('Hello ' + name)
    
// }

// hello('Paul')


//using arrow
// const result = (name) => 'Hello ' + name;

// console.log(result('John'))

function addNumber(a,b) {
    return a + b
}

const sum = (a,b) => a+b;
console.log(sum(50,60))

const employee = {
    firstName: 'John',
    lastName: 'Doe'
}

const sub = (a,b) => a-b;

const mul =(a,b) => {
    a * b;
}

const sayHello = (name) => 'Hello ' + name;

const sayHello2 = () => '';