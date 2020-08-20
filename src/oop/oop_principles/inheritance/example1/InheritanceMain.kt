package oop.oop_principles.inheritance.example1

fun main(args: Array<String>) {
    var  male = Male()
    male.think()
}

// base class
open class Human {
    // #1
    /*fun think() { // can not be overriden
        print("Hey!! I am a \"Human\" and I can think.")
    }*/

    // #2
    open fun think() {  // can be overriden
        println("Hey!! I am a \"Human\" and I can think.")
    }
}

// child class
class Male: Human() { // inheritence happend using default constructor
    override fun think() {
        super.think()
        print("Hey!! I am a \"Male\" and I can think too.")
    }
}

