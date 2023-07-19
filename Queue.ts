
class Queue<T> {


    public constructor(

        private elements: Record<number, T> = {},

        private front: number = 0,

        private rear: number = 0

    ) { }

 

    public enqueue(element: T): T {

        this.elements[this.rear] = element;

        this.rear++;
	return element;
    }

 

    public dequeue(): T {

        const item = this.elements[this.front];

        delete this.elements[this.front];

        this.front++;

        return item;

    }

    public get size(): number {

        return this.rear - this.front;

    }

    public get isEmpty(): boolean {

        return this.size === 0;

    }

}

const queue = new Queue<number>();

console.log(queue.enqueue(1)+" is inserted");
console.log(queue.enqueue(7)+" is inserted");
console.log(queue.enqueue(8)+" is inserted");
console.log(queue.enqueue(9)+" is inserted");
console.log(queue.enqueue(2)+" is inserted");




console.log("size of the queue :" +queue.size);

console.log("deleted element is "+queue.dequeue());
