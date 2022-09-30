import kotlin.math.abs

//FUNCIÓN QUE RECIBE HORAS Y MINUTOS, LUEGO CALCULA EL ÁNGULO DE INCLINACIÓN BASANDOSE EN UN RELOG ANALÓGICO

class HelloKotlin {
}

fun canculateAngle(pHour:Int, pMinute:Int){

    val hourAngle = 360 / 12 //30
    val minuteAngle = 360 / 60 //6

    if(pHour<1 || pHour>24 || pMinute<1 || pMinute>59){
        println("Por favor ingrese valores válidos")
    }else{
        var _hour = pHour
        if(_hour>12) {
            _hour = pHour-12
        }
        var hoursAngle = angles(_hour,hourAngle)
        var minutesAngle = angles(pMinute,minuteAngle)
        println("El angulo de la hora es $hoursAngle y minuto es $minutesAngle" )

        //Encuentra la diferencia entre los dos anglos en positivo
        var result: Int = abs(hoursAngle - minutesAngle)

        //El ángulo menor de los dos ángulos
        result = (360 - result).coerceAtMost(result)

        println("EL resultado final es $result grados")
    }
}

fun angles(time:Int, angle:Int):Int{
    return 360-(time*angle)
}

fun main(){
    println("Ejercicio quema cocos")
    canculateAngle(2, 15)
}