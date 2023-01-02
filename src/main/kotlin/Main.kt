fun main(args: Array<String>) {
    print(solution(3, 3))
}

fun solution(n: Int, m: Int): Int {
    return n + m + gcd(n, m) - 2
}


fun gcd(input1: Int, input2: Int): Int {
    var gcd = 0
    var i = 1
    while (i <= input1 && i <= input2) {
        if (input1 % i == 0 && input2 % i == 0)
            gcd = i
        ++i
    }
    return gcd
}