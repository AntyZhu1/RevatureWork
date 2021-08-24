const employee = {
    firstName: 'John',
    lastName : 'Doe',
    getFullName = function() {
        
            // console.log(this)
            return this.firstName + '' + this.lastname;
        
    }
}


employee.getFullName();