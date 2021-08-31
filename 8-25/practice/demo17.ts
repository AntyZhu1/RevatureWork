export default class User {
    constructor(
    public firstName: string,
    public lastName: string
    ){}

    getFullName(){
        console.log(`${this.firstName} ${this.lastName}`)
    }

}

let userObject = new User('John', 'Doe')
userObject.getFullName()