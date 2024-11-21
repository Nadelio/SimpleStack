public class SimpleStack<T>{
    private T[] body;
    private int top;
    public final int size;

    @SuppressWarnings("unchecked")
    public SimpleStack(int size){
        this.size = size;
        body = (T[]) new Object[size];
        top = -1;
    }

    public boolean push(T data){
        if(top == size){
            System.out.println("Stack is full");
            return false;
        }
        top++;
        body[top] = data;
        return true;
    }

    public T pop(){
        if(top == -1){
            System.out.println("Stack is empty");
            return null;
        }
        T temp = body[top];
        body[top] = null;
        top--;
        return temp;
    }

    public T peek(){
        if(top == -1){
            System.out.println("Stack is empty");
            return null;
        }
        return body[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == size;
    }

    /**
     * Overrides the element at the given index with the given data
     * @param data
     * @param index
     * @return
     */
    public boolean push(T data, int index){
        if(top == size){
            System.out.println("Stack is full");
            return false;
        }
        body[index] = data;
        return true;
    }

    public T pop(int index){
        if(top == -1){
            System.out.println("Stack is empty");
            return null;
        }
        T temp = body[index];
        for(int i = index; i < top; i++){ body[i] = body[i+1]; }
        top--;
        return temp;
    }

    public T peek(int index){
        if(top == -1){
            System.out.println("Stack is empty");
            return null;
        }
        return body[index];
    }

    /**
     * Inserts the given data at the given index and shifts elements above it up once
     * @param data
     * @param index
     * @return
     */
    public boolean insert(T data, int index){
        if(top == size){
            System.out.println("Stack is full");
            return false;
        }
        for(int i = index + 1; i < top + 1; i++){ body[i] = body[i-1]; }
        body[index] = data;
        top++;
        return true;
    }

    /**
     * Swaps the top element with the given data
     * @param data
     * @return the top element of the stack
     */
    public T swap(T data){
        if(top == -1){
            System.out.println("Stack is empty");
            return null;
        }
        T temp = body[top];
        body[top] = data;
        return temp;
    }

    /**
     * Pops element at index1 and inserts it at index2
     * @param index1
     * @param index2
     * @return true if successful, false otherwise
     */
    public boolean move(int index1, int index2){
        if(index1 < 0 || index1 > this.top || index2 < 0 || index2 > this.top){
            System.out.println("Invalid index");
            return false;
        }
        if(top == -1){
            System.out.println("Stack is empty");
            return false;
        }
        T temp = pop(index1);
        insert(temp, index2);
        return true;
    }

    public boolean toTop(int index){
        if(index < 0 || index > this.top){
            System.out.println("Invalid index");
            return false;
        }
        if(top == -1){
            System.out.println("Stack is empty");
            return false;
        }
        T temp = pop(index);
        push(temp);
        return true;
    }

    public boolean toBottom(int index){
        if(index < 0 || index > this.top){
            System.out.println("Invalid index");
            return false;
        }
        if(top == -1){
            System.out.println("Stack is empty");
            return false;
        }
        T temp = pop(index);
        insert(temp, 0);
        return true;
    }

    public int top(){ return this.top; }
    public T[] body(){ return this.body; }
    public String toString(){ return this.body.toString(); }
    public void printTop(){ System.out.println("Top: " + this.top + " Element: " + this.peek()); }

    /**
     * Resets the stack to its initial empty state
     */
    public void clear(){
        for(int i = 0; i <= top; i++){
            body[i] = null;
        }
        top = -1;
    }

    /**
     * Reverses the stack, but why do you want that?
     */
    @SuppressWarnings("unchecked")
    public void reverse(){
        T[] temp = (T[]) new Object[size];
        for(int i = 0; i <= top; i++){
            temp[i] = body[top - i];
        }
        this.body = temp;
    }

    /**
     * Just... why?
     */
    public void shuffle(){
        for(int i = 0; i <= top; i++){
            int random = (int)(Math.random() * (top + 1));
            T temp = body[i];
            body[i] = body[random];
            body[random] = temp;
        }
    }

    public boolean equals(SimpleStack<T> stack){
        if(this.top != stack.top){ return false; }
        for(int i = 0; i <= top; i++){
            if(this.body[i] != stack.body[i]){ return false; }
        }
        return true;
    }

    /**
     * Resizes the stack to the given size, will delete data if size is smaller
     * @param size
     */
    @SuppressWarnings("unchecked")
    public void resize(int size){
        T[] temp = (T[]) new Object[size];
        for(int i = 0; i <= size; i++){
            temp[i] = body[i];
        }
        this.body = temp;
    }
}