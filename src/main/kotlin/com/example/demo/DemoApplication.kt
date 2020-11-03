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
         println(LocalDateTime.now().second)
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
           timer()
           e.printStackTrace()
       }
   }

   fun timer(){
        try {
            if(LocalDateTime.now().hour == 10 && LocalDateTime.now().minute == 0 && LocalDate.now().dayOfWeek.value <6) {
                val obj = URL("https://api.telegram.org/bot1294362339:AAG6DDF3sxo7E8DpONjmuPfU8Jib50j1Ba4/sendMessage?chat_id=-256666998&text=쉬세요")
                val conn = obj.openConnection() as HttpURLConnection
                conn.requestMethod = "GET"
                InputStreamReader(conn.inputStream)
            }
            if(LocalDateTime.now().hour == 10 && LocalDateTime.now().minute == 18 && LocalDate.now().dayOfWeek.value <6 && LocalDate.now().dayOfWeek.value != 3) {
                val obj3 = URL("https://api.telegram.org/bot1294362339:AAG6DDF3sxo7E8DpONjmuPfU8Jib50j1Ba4/sendMessage?chat_id=-256666998&text=오늘 점심 뭐드실까요?")
                val conn3 = obj3.openConnection() as HttpURLConnection
                conn3.requestMethod = "GET"
                InputStreamReader(conn3.inputStream)
            }
            if(LocalDateTime.now().hour == 15 && LocalDateTime.now().minute == 0 && LocalDate.now().dayOfWeek.value <5){
                val obj = URL("https://api.telegram.org/bot1294362339:AAG6DDF3sxo7E8DpONjmuPfU8Jib50j1Ba4/sendMessage?chat_id=-256666998&text=쉬세요")
                val conn = obj.openConnection() as HttpURLConnection
                conn.requestMethod = "GET"
                InputStreamReader(conn.inputStream)
            }
            if(LocalDate.now().dayOfWeek.value == 5 && LocalDateTime.now().hour == 15 && LocalDateTime.now().minute == 30){
                val obj2 = URL("https://api.telegram.org/bot1294362339:AAG6DDF3sxo7E8DpONjmuPfU8Jib50j1Ba4/sendMessage?chat_id=-256666998&text=청소시작!")
                val conn2 = obj2.openConnection() as HttpURLConnection
                conn2.requestMethod = "GET"
                InputStreamReader(conn2.inputStream)
            }
            if(LocalDateTime.now().hour == 18 && LocalDateTime.now().minute == 0 && LocalDate.now().dayOfWeek.value <5){
                val obj4 = URL("https://api.telegram.org/bot1294362339:AAG6DDF3sxo7E8DpONjmuPfU8Jib50j1Ba4/sendMessage?chat_id=-256666998&text=퇴근하세요")
                val conn4 = obj4.openConnection() as HttpURLConnection
                InputStreamReader(conn4.inputStream)
            }
            test()
         }catch (e : Exception){
            test()
           e.printStackTrace()
         }
       }