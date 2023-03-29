import javax.swing.JOptionPane

fun main(args: Array<String>) {
    var numStundents = JOptionPane.showInputDialog("Introduce el numero de alumnos").toInt()
    var array = Array<Alumnos?>(numStundents){null}
    for( i in 0 until numStundents){
        var name = JOptionPane.showInputDialog("Introduce el nombre del alumno/a ${i+1}")
        var classroom = JOptionPane.showInputDialog("Introduce el aula del alumno/a ${i+1}")[0]
        var calificacion = JOptionPane.showInputDialog("Introduce la calificacion del alumno/a ${i+1}").toDouble()
        array[i] = Alumnos(name,classroom)
        array[i]!!.calificacion = calificacion
    }

    var suma = 0.0
    var promedio = 0.0
    var studentsPerClassroom = 0
    var salon = JOptionPane.showInputDialog("Ingresa el salon de los alumnos a promediar")[0]
    for (i in 0 until numStundents){
        if (salon == array[i]!!.classroom){
            suma = suma + array[i]!!.calificacion
            studentsPerClassroom++
        }
    }

    promedio = suma / studentsPerClassroom
    JOptionPane.showMessageDialog(null, "El promedio del salon $salon es $promedio")

}