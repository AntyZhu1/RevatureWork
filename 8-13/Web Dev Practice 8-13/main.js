// function test() {
//     console.log('nodejs working');
// }
// test();

class Book {
    title;
    author;
    price;

    getBookInFo() {
        console.log('Book: Title: ' + this.title + ' Author: ' + this.author + ' Price: ' + this.price);
    }

}

const book1 = new Book();

book1.title = 'Title';
book1.author = 'Author';
book1.price = 100;

book1.getBookInFo();