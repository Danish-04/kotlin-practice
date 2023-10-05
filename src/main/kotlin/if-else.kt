fun main() {

    println("Enter username : ")
    val username = readLine()
    println("Enter password : ")
    val password = readLine()

    if (username == "Danish" && password == "Danish123"){
        println("Login Successfull")
    }
    else{
        println("login fail")
    }
}