var User = /** @class */ (function () {
    function User(firstName, lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    User.prototype.getFullName = function () {
        console.log(this.firstName + " " + this.lastName);
    };
    return User;
}());
var userObject = new User('John', 'Doe');
userObject.getFullName();
