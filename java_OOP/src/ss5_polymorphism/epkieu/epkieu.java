//package ss5_polymorphism.epkieu;
//
//HocVien hocVien1 = new HocVien(); -> ko có lỗi
//HocVien hocVien2 = (SinhVien) hocVien1; -> lỗi downcasting, compile
//ChuyenVien hocVien3 = (ChuyenVien) hocVien2; ->lỗi downcasting, compile
//NVChinhThuc hocVien4 = hocVien3; -> ko có lỗi
//HocVien hocVien5 = hocVien3; -> không lỗi
//HocVien hocVien6 = (HocVien) hocVien2; -> không lỗi
//HocVien hocVien7 = (NVQuanLy) hocVien6;
//NVChinhThuc hocVien8 = (NVChinhThuc) hocVien7;
//SinhVien hocVien9 = (SinhVien) hocVien3;
//HocVien hocVien10 = new SinhVien();
//ChuyenVien hocVien11 = (ChuyenVien) hocVien10;
