class Student {
    private id: number;
    private name: string;
    private passMark = 40;

    get Id() {
        return this.id;
    }

    set Id(value) {
        this.id = value;
    }
}