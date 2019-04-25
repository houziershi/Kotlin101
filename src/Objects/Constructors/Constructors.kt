package Objects.Constructors

class Primary(initialName : String, age : Int = 30) {
    var firstName = initialName
    val age = age

    init {
        //this is an anonymous constructor
        //there is no other type of constructor
        firstName += ".jr"
    }

    public fun sayName() {
        println("My name is $firstName and I am $age years old.")
    }
}

class InitOrder(initOne : String = "hgk", initTwo: Int = 20 ) {
    var initOneParameter = initOne
    var initTwoParameter = initTwo


    init {
        initOneParameter += "hgc"
    }
    init {
        initTwoParameter += 10
    }

    fun sayInfo() {
        println("My name is $initOneParameter and I am $initTwoParameter years old.")
    }
}

fun main(args : Array<String>) {
    var p = Primary("John Adams", 56)
    p.sayName()

    var n = Primary("Bon Jovi")
    n.sayName()

    var my=MyPrimary("guokun", 21)
    my.myInfo()

    var myInfo = InitOrder()
    myInfo.sayInfo()
}

class MyPrimary(myName:String, myAge: Int = 20) {
    var name = myName
    var age = myAge+1
    init {
        age += 1
    }

    fun myInfo() {
        println("My name is $name and I am $age years old.")
    }
}
