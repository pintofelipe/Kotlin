//Array in Kotlin

fun main(){
    var name:String = "felipe"
    var name1:String = "pinto"
    var name2:String = "uribe"
    
    
    val coco = arrayOf("felipe","pinto","uribe","coco77")

    //println(coco[3])
   // println(coco.size)
    
    
    //Modificar Valores
   coco[0] = "77"   
   //println(coco[0])

	//Bucles para Array
    
    for(position in coco.indices){
        //println(coco[position])
    }
    
    for((position, value) in coco.withIndex()){
       // println("la posición $position, contiene $value")
    }
    
    for(name in coco){
        println("su nombre es: $name")
    }
    
}