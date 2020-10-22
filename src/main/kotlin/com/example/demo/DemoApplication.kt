package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL
import java.time.LocalDateTime

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
   println(LocalDateTime.now().second)
       var temp = true
       while(temp){
           if(LocalDateTime.now().second == 0){
               println(LocalDateTime.now().second)
               timer()
               temp=false
           }
       }

   }

   fun test(){
       try {
           Thread.sleep(60000)
           timer()
       }catch (e : Exception){
           e.printStackTrace()
       }
   }

   fun timer(){
        try {
           val obj = URL("https://api.telegram.org/bot1156519657:AAGus38QJO63iYvUJJw4kIIJeKELQ3t7B88/sendMessage?chat_id=994885316&text=쉬세요")
           val conn = obj.openConnection() as HttpURLConnection
           conn.requestMethod = "GET"
            if(LocalDateTime.now().hour == 10 && LocalDateTime.now().minute == 0) InputStreamReader(conn.inputStream)
            if(LocalDateTime.now().hour == 15 && LocalDateTime.now().minute == 0) InputStreamReader(conn.inputStream)
                test()
         }catch (e : Exception){
           e.printStackTrace()
         }

       }