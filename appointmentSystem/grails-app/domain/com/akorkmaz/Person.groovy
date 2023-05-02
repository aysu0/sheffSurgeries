package com.akorkmaz

class Person
{
    String name
    String phone

    String toString()
    {
        return name
    }

    static constraints =
    {
        name()
        phone()
    }
}
