fun main() {
    //Переменные для подсчета статистики
    var c0Stat = 0
    var c1Stat = 0
    var c2Stat = 0
    var c3Stat = 0
    //X - состояния Y -
    var x:Int
    var y:Int
    //
    var zOld = (0..3).random()
    var zNew:Int
    //
    val length = (0..15).random()
    val arr = arrayOf(
        arrayOf(1, 1, 3, 3),
        arrayOf(2, 3, 2, 3),
        arrayOf(0, 0, 2, 2),
        arrayOf(0, 1, 0, 1)
    )

    println("Длина входного слова: ${length+1}")
    println("x zOld zNew y")

    for (i in 0..length) {
        when(zOld){
            0 -> c0Stat++
            1 -> c1Stat++
            2 -> c2Stat++
            3 -> c3Stat++
        }
        x = (0..3).random()
        zNew = arr[x][zOld]
        y = when (zOld){
            0 -> 0
            else -> 1
        }
        zOld = zNew
        println("$x   $zOld   $zNew   $y")
    }
    println("Абсолютное выражение: C0: $c0Stat C1: $c1Stat C2: $c2Stat C3: $c3Stat")
    println("Процентное выражение: C0: ${percent(c0Stat, length + 1)}% C1: ${percent(c1Stat, length + 1)}% C2: ${percent(c2Stat, length + 1)}% C3:${percent(c3Stat, length + 1)}%")
}

fun percent(stat:Int, count:Int):Int {
    return (stat/count.toDouble()*100).toInt()
}

/*
    Z1[0, 0] Z2[1, 0] Z3[1, 0] Z4[1, 1]
    X1[1, 0] X2[0, 1] X3[-1, 0] X4[0, -1]
    Y1[0] Y2[1]
 */
