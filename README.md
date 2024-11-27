# Stack implementation

## Java
```java
import Java.SimpleStack.Stack;

public class Main {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<Integer>(3, Integer.class);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        System.out.println(stack.toString());
    }
}
```
Output:
```
> 1 2 
> 
```
- Important thing to note, `Arrays.sort(stack.body());` does not work due to the Arrays class not being able to sort Objects
## Niva
```Scala
stack = Stack::Int ofSize: 3
stack push: 1
stack push: 2
stack push: 3
stack pop
stack echo

stack2 = Stack::String ofSize: 3
stack2 push: "a"
stack2 push: "b"
stack2 push: "c"
stack2 echo
```
Output: 
```
> Stack size: 3 top: 1 stack: [1, 2]
> Stack size: 3 top: 2 stack: [a, b, c]
> 
```
