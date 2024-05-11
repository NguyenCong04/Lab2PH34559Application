package congntph34559.fpoly.lab2ph34559application

fun main() {

    var year = 0
    var s: String?

    println("Chương trình kiểm tra năm nhuận")

    do {

        print("Mời nhập năm: ")
        s = readLine()

//        while (s == null || s.toInt() < 0) {
//            println("Năm không hợp lệ mời nhập lại: ")
//            s = readLine();
//        }
        while (true) {
            if (s != null && s.toIntOrNull() != null && s.toInt() > 0) {
                year = s.toInt();
                break
            } else {
                print("Năm không hợp lệ mời nhập lại: ")
                s = readLine();
            }

        }


        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            println("Năm $year là năm nhuận")
        } else {
            println("Năm $year không là năm nhuận")
        }

        println("Bạn có muốn tiếp tục không (c/k): ")
        s = readLine()

        if (s == "k") break


    } while (true)


}