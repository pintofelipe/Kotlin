//Listas
fun main (){
    mutableList()
}

fun inmutables(){
    val readOnly:List<String> = listOf("Lunes","Martes",
                                       "Miercoles","Jueves","Viernes",
                                "Sabado","Domingo")
// println(readOnly.size)
// println(readOnly)
// println(readOnly[0])
// println(readOnly.first())


// //Filtrar
// val example= readOnly.filter{it.contains("a")}
// println(example)

//Iterar
//readOnly.forEach{println(it)}
//readOnly.forEach{weekDay -> println(weekDay)}

}

fun mutableList(){
   val weekDays:MutableList<String> = mutableListOf("Lunes","Martes",
                                       "Miercoles","Jueves","Viernes",
                                "Sabado","Domingo")
    //println(weekDays)
    
    weekDays.add(0,"coco77")
   // println(weekDays)
   // println("#######################################")
    if(weekDays.isNotEmpty()){
       // weekDays.forEach{println(it)}
    }
    
    
   
    /*
    for(item in weekDays){
        println(item)
    }*/
    
    weekDays.forEach{println(it)}
    
}






