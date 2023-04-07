package com.akorkmaz

class Worker extends Person
{
    String email

    static constraints =
    {
        email()
    }

    static hasOne = [surgery: Surgery]
}
