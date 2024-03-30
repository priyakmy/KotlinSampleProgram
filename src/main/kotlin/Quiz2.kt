fun main() {
    var sum=0

    while (true) {
        print("Enter a number: ")
       val  number = readLine()!!.toInt()

        if (number == 0)
            break

        sum += number
    }

    print("sum = $sum")

}