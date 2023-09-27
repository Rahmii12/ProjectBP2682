package com.example.projectbp2682

class LoginModel {
    //variabel
    var username = ""
    var password = ""
    //method/func
    fun loginCek():Boolean{
        if(username.equals("rahmi") && password.equals("aku2323")){
            return true
        }else{
            return false
        }
    }
}