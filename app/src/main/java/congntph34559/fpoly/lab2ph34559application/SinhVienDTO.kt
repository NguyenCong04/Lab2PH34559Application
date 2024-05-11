package congntph34559.fpoly.lab2ph34559application

class SinhVienDTO(var tenSv: String, var maSv: String, var diemTb: Float) {

    var daTn: Boolean? = null
    var tuoi: Int? = null

    constructor(tenSv: String, maSv: String, diemTb: Float, daTn: Boolean, tuoi: Int) : this(
        tenSv,
        maSv,
        diemTb
    ) {
        this.daTn = daTn;
        this.tuoi = tuoi;
    }

    fun getThongTinSv(): String {
        var thongTin: String

        if (daTn == null && tuoi == null) {
            thongTin = " Tên: $tenSv \n Mã: $maSv \n Điểm TB: $diemTb \n "
            println("-------------------")
        } else {
            thongTin =
                " Tên: $tenSv \n Mã: $maSv \n Điểm TB: $diemTb \n Tốt nghiệp: $daTn \n Tuổi: $tuoi \n"
            println("-------------------")
        }
        return thongTin
    }


}