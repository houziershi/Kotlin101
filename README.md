This is a collection of runnable console applications that highlights the features of [Kotlin programming language](http://confluence.jetbrains.net/display/Kotlin/Welcome).

The use of console application enable an easy way to demonstrate features of Kotlin programming language quickly.
All the code here compiles under Kotlin Plugin 1.0.0.

I find it useful when I forgot certain Kotlin construct. Instead of looking up on the documentation, I just quickly checked the snippets in Kotlin101.

###### Kotlin知识点，只为教自己

- data class：创建 DTOs（POJOs/POCOs）
```
data class User(var userName:String, var userNo:Int)
```
- 函数:fun
    * 如果一个默认参数在一个无默认值的参数之前，那么该默认值只能通过使用命名参数调用该函数来使用：
    ```
    fun foo(bar: Int = 0, baz: Int) { … … }
    foo(baz = 1) // 使用默认值 bar = 0
    ``` 
 - 使用区间
    ```
    for (i in 1..100) { …… }  // 闭区间：包含 100
    for (i in 1 until 100) { …… } // 半开区间：不包含 100
    for (x in 2..10 step 2) { …… }
    for (x in 10 downTo 1) { …… }
    if (x in 1..10) { …… }
    ```   
- 延迟属性
    ```
    val p: String by lazy {
        // 计算该字符串
    }
    ```    
- 扩展：扩展函数和扩展属性
    * 扩展是静态解析的：通过定义一个扩展，你并没有在一个类中插入新成员， 仅仅是可以通过该类型的变量用点表达式去调用这个新函数。
- When用途：case语句
- for,in关键字
- kotlin Extension语法 infix,inline
侯国坤测试git revert