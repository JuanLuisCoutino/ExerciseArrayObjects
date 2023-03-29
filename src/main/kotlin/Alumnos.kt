class Alumnos(var student : String, var classroom : Char) {

    var calificacion : Double = 0.0
        set(calificacion){
            if (calificacion>10){
                field = 10.0
            }else if(calificacion<0){
                field = 0.0
            }else{
                field = calificacion
            }
        }
}