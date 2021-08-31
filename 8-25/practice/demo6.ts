//Wrong ways to go about it

// const draw = (a,b,c,d,e,f,g,h,i,j) => {

// }

// const draw = (dimen) => {

// }

// draw({
//     a:1,
//     b:2
// })

// draw({
//     name:'a',
//     email: 'b'
// })

//Almost Correct Way
// const draw = (dimensions: {a: number, b: number}) => {

// }

// draw({
//     a: 10,
//     b: 20
// })

//will give errors
// draw({
//     a: 'a',
//     b: true
// })

//With Interface

interface Dimes {
    x: number;
    y: number;
}

class Draw {
    x: number;
    y: number;

    draw(){
        
    }
}

// const draw = (dimes: Dimes) => {

// }

// draw({
//     x: 10,
//     y: 20
// })