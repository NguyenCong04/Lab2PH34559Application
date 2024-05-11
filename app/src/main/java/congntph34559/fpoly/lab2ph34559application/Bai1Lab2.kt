package congntph34559.fpoly.lab2ph34559application

fun main() {

    var a = 0.0
    var b = 0.0


//    print("Mời nhập số a: ")
//    var s = readLine()
//    if (s != null && s.toDoubleOrNull() != null) a = s.toDouble()
//
//    print("Mời nhập số b: ")
//    s = readLine()
//    if (s != null && s.toDoubleOrNull() != null) b = s.toDouble()
//
//    if (a == 0.0 && b == 0.0) {
//        println("Phương trình vô số nghiệm")
//    }else if (a == 0.0 && b != 0.0){
//        println("Phường trình vô nghiệm")
//    }else{
//        val x = -b/a;
//        println("Giá trị x = $x")
//    }

    do {
        while (true) {
            print("Mời nhập số a: ")
            var s = readLine();
            if (s != null && s.toDoubleOrNull() != null ) {
                a = s.toDouble();
                break
            } else {
                println("Số a không hợp lệ mời nhập lại!!")
            }

        }
        while (true) {
            print("Mời nhập số b: ")
            var s = readLine();
            if (s != null && s.toDoubleOrNull() != null) {
                b = s.toDouble();
                break
            } else {
                println("Số b không hợp lệ mời nhập lại!!")
            }

        }

        if (a == 0.0 && b == 0.0) {
            println("Phương trình vô số nghiệm")
        } else if (a == 0.0 && b != 0.0) {
            println("Phường trình vô nghiệm")
        } else {
            val x = -b / a;
            println("Giá trị x = $x")
        }
        print("Bạn có muốn tiếp tục không (c/k): ")
        var  s2 = readLine()
        if (s2 == "k") break
    }while (true)




}