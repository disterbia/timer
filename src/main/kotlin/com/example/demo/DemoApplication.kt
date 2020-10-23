package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL
import java.time.LocalDate
import java.time.LocalDateTime

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
       var temp = true
       while(temp){
           if(LocalDateTime.now().second == 0){
               println(LocalDateTime.now())
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
       val chatId ="-256666998"
       //val chatId ="994885316"
        try {
           val obj = URL("https://api.telegram.org/bot1294362339:AAG6DDF3sxo7E8DpONjmuPfU8Jib50j1Ba4/sendMessage?chat_id=$chatId&text=쉬세요")
           val conn = obj.openConnection() as HttpURLConnection
           conn.requestMethod = "GET"
            if(LocalDateTime.now().hour == 10 && LocalDateTime.now().minute == 0 && LocalDate.now().dayOfWeek.value <6) {
                InputStreamReader(conn.inputStream)
            }
            if(LocalDateTime.now().hour == 15 && LocalDateTime.now().minute == 0 && LocalDate.now().dayOfWeek.value <5){
                InputStreamReader(conn.inputStream)
            }
            if(LocalDate.now().dayOfWeek.value == 5 && LocalDateTime.now().hour == 15 && LocalDateTime.now().minute == 30){
                val obj2 = URL("https://api.telegram.org/bot1294362339:AAG6DDF3sxo7E8DpONjmuPfU8Jib50j1Ba4/sendMessage?chat_id=$chatId&text=청소시작!")
                val conn2 = obj2.openConnection() as HttpURLConnection
                conn2.requestMethod = "GET"
                InputStreamReader(conn2.inputStream)
            }
                test()
         }catch (e : Exception){
           e.printStackTrace()
         }
       }