class Employee {
    id;
    firstName;
    lastName;
    email;
    phone;
    salary;

    getFullName() {
        console.log(`${this.firstName} ${this.lastName}`);
    }



}

class PartTimer extends Employee {
    salary;
}

class FullTimer extends Employee {
    salary;
}

let fte = new FullTimer();
fte.id = 1;
fte.firstName = 'John';
fte.lastName = 'Doe';
fte.email = 'jd@mail.usa';
fte.phone = '2223334444';
fte.salary = '150000';

fte.getFullName();