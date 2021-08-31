class Book {
    // public title: string;
    // public author: string;
    // public price: number;

    constructor(
        public title: string, 
        public author: string, 
        public price: number) {
        // this.title = title;
        // this.author = author;
        // this.price = price;
    }

    public getInfo() {
        console.log(`Book: Title= ${this.title},Author= ${this.author}, Price= ${this.price}`)
    }
}

let book1 = new Book('The Prince', 'Machiavelli', 12.99);

book1.title = 'The Prince';
book1.title = 'Machiavelli';
book1.price = 12.99;

book1.getInfo();