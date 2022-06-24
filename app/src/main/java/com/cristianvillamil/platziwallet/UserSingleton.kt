package com.cristianvillamil.platziwallet

object UserSingleton {
    var username = "Liliana"
}


/**
 * SINGLETON IN JAVA
 *
 * class UserSingleton {
    var username = "Liliana"

    companion object {
        private var instance : UserSingleton? = null

        fun getInstance() : UserSingleton {
            if (instance == null) {
                instance = UserSingleton()
            }
            return instance as UserSingleton
        }
    }
}*/