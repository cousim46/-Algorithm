package kotlin.year_2023_month_4 // ktlint-disable package-name

class Programmers_문자반복출력하기 {
    fun solution(my_string: String, n: Int): String {
        var answer: String = ""
        val strList: List<String> = my_string.split("")
        for (i in 0 until strList.size) {
            for (j in 0 until n) {
                answer += strList[i]
            }
        }
        return answer
    }
}
