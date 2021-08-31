// code without DI
// class Tyre{

// }

// class Engine{
    
// }

// class Car{
//     engine: Engine = '';
//     tyre: Tyre = '';

//     constructor(){
//         this.engine = new Engine();
//         this.tyre = new Tyre();
//     }

// }



// code with DI
class Tire{
    constructor(tyre: string){

    }
}

class Engine{
    constructor(tyre: string){

    }
}

// let engine = new Engine();
// let tyre = new Tyre();

class Car{
    engine: Engine = '';
    tire: Tire = '';

    constructor(engine: Engine, tire: Tire){
        this.engine = engine;
        this.tire = tire;
    }

}