package congntph34559.fpoly.lab2ph34559application


fun case(month: Any) {
    when (month) {
        1, 2, 3 -> println("Tháng $month thuộc quý 1")
        4, 5, 6 -> println("Tháng $month thuộc quý 2")
        7, 8, 9 -> println("Tháng $month thuộc quý 3")
        10, 11, 12 -> println("Tháng $month thuộc quý 4")
        else -> println("Tháng $month không hợp lệ")

    }
}

fun main() {

    var month = 0;
    while (true) {

        try {
            print("Mời nhập tháng từ 1-12 chọn 0 để thoát chương trình: ")
            var s: String? = readLine();
            if (s != null) month = s.toInt();

            if (month == 0) {
                println("Exit successfully")
                break
            } else {
                case(month)
            }
        } catch (e: NumberFormatException) {
            println("Mời nhập số")
        }


    }

}