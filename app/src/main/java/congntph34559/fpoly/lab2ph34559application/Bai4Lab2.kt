package congntph34559.fpoly.lab2ph34559application

var listSv = mutableListOf<SinhVienDTO>()

fun menu() {
    println("________________Menu__________________")
    println("-- 1.Xem danh sách sinh viên        --")
    println("-- 2.Thêm sinh viên                 --")
    println("-- 3.Xóa sinh viên                  --")
    println("-- 4.Thoát                          --")
    println("________________Menu__________________")


}

fun themSinhVien() {

    var tenSv: String = ""
    var maSv: String = ""
    var diemTb: Float = 0f
    var daTn: Boolean? = null
    var tuoi: Int? = 0

    print("Mời nhập tên: ")
    var s: String? = readLine()
    if (s != null) tenSv = s;

    print("Mời nhập mã: ")
    s = readLine()
    if (s != null) maSv = s

    print("Mời nhập điểm: ")
    s = readLine()
    if (s != null) diemTb = s.toFloat()

    print("Mời nhập trạng thái tốt nghiệp(r/c): ")
    s = readlnOrNull()
    //daTn = s == "r"
    daTn = when (s) {
        "r" -> {
            true
        }

        "c" -> {
            false
        }

        else -> {
            false
        }
    }

    print("Mời nhập tuổi: ")
    s = readlnOrNull()
    tuoi = if (s != null && s.toIntOrNull() != null) s.toInt() else 0

    if ( tuoi == 0 && daTn == false){
        val sv: SinhVienDTO = SinhVienDTO(tenSv, maSv, diemTb)
        listSv.add(sv)
    }else{
        val sv: SinhVienDTO = SinhVienDTO(tenSv, maSv, diemTb,daTn,tuoi)
        listSv.add(sv)
    }

    println("Thêm thành công !!!")


}

fun danhSachSv() {

    for (i in listSv) {
        println(i.getThongTinSv())
    }

}

fun xoaSv() {

    var maSv: String = ""

    print("Mời nhập mã sv muốn xóa: ")
    var s = readlnOrNull()
    if (s != null) maSv = s.toString()
    var sv: SinhVienDTO? = null
    for (i in listSv) {
        if (maSv == i.maSv) {
            sv = i
            break
        }
    }
    if (sv == null) {
        println("Mã sv $maSv không tồn tại")
    } else {
        listSv.remove(sv)
        println("Xóa thành công !!!")
    }


}


fun case2(obj: Any) {

    when (obj) {
        1 -> {
            println("Bạn chọn chức năng xem danh sách sinh viên: ")
            println("--------------------------------------------")
            danhSachSv()
        }

        2 -> {
            println("Bạn chọn chức năng thêm sinh viên: ")
            println("--------------------------------------------")
            themSinhVien()
        }

        3 -> {
            println("Bạn chọn chức năng xóa sinh viên nhập : ")
            println("--------------------------------------------")
            xoaSv()
        }

        4 -> println("Bạn chọn thoát chương trình")
        else -> println("Mời chọn các chức năng từ 1 -> 4 ")
    }
}


fun main() {

    while (true) {

        try {
            menu()
            var index = 0
            print("Mời chọn chức năng từ 1-> 4: ")
            var s = readlnOrNull()

            if (s != null && s.toInt() > 0 && s.toIntOrNull() != null) index =
                s.toInt() else println("Mời chon 1->4")

            if (index == 4) {
                println("Bạn chon thoát chương trình")
                break
            } else {
                case2(index)
            }
        } catch (e: NumberFormatException) {
            println("Mời nhập số")
        }

    }


}