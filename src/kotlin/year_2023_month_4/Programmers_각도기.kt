package kotlin.year_2023_month_4 // ktlint-disable package-name

class Programmers_각도기 {

    /**
     *  예각일 때 1, 직각일 때 2, 둔각일 때 3, 평각일 때 4를 return하도록 solution 함수를 완성해주세요.
     *
     * 예각 : 0 < angle < 90
     * 직각 : angle = 90
     * 둔각 : 90 < angle < 180
     * 평각 : angle = 180
     *
     * */
    fun solution(angle: Int): Int =
        if (angle > 0 && angle < 90) {
            1
        } else if (angle == 90) {
            2
        } else if (angle > 90 && angle < 180) {
            3
        } else {
            4
        }
}
