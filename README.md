# Stack implementation
## niva
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
Stack size: 3 top: 1 stack: [1, 2]
Stack size: 3 top: 2 stack: [a, b, c]
```