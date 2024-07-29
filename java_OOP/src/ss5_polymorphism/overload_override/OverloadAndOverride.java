//package ss5_polymorphism.PhoneManagement;
//
//*TH1: Override (ghi de)
//        package abc;
//
//public class HocVien {
//    public void a() {
//        System.out.println("a cha");
//    }
//}
//    package abc;
//
//public class SinhVien extends HocVien {
//    public void a() {
//        System.out.println("a con");
//    }
//}
//
//TH2: Override
//        package abc;
//public class HocVien {
//    void a() {
//        System.out.println("a cha");
//    }
//}
//package abc;
//public class SinhVien extends HocVien {
//    public void a() {
//        System.out.println("a con");
//    }
//}
//
//TH3: kHONG THE GHI DE VI CO LOP PRIVATE
//        package abc;
//public class HocVien {
//    private void a() {
//        System.out.println("a cha");
//    }
//}
//package abc;
//public class SinhVien extends HocVien {
//    public void a() {
//        System.out.println("a con");
//    }
//}
//
//TH4: Override
//        package abc;
//public class HocVien {
//    public void a() {
//        System.out.println("a cha");
//    }
//}
//package abc;
//public class SinhVien extends HocVien {
//    protected void a() {
//        System.out.println("a con");
//    }
//}
//
//TH5: Overload
//        package abc;
//public class HocVien {
//    public byte a() {
//        System.out.println("a cha");
//        return 1;
//    }
//}
//package abc;
//public class SinhVien extends HocVien {
//    public int a() {
//        System.out.println("a con");
//        return 1;
//    }
//}
//
//TH6:override
//package abc;
//public class HocVien {
//    public Animal a() {
//        System.out.println("a cha");
//        return null;
//    }
//}
//package abc;
//public class SinhVien extends HocVien {
//    public Dog a() {
//        System.out.println("a con");
//        return null;
//    }
//}
//TH7:overload
//        package abc;
//public class HocVien {
//    public void a(){
//    }
//}
//package abc;
//public class SinhVien extends HocVien {
//    public void a(int i){
//    }
//}
//
//TH8:static không thể ghi đè -> ko có hiện tượng gì cả
//        package abc;
//public class HocVien {
//    public static void a(){
//    }
//}
//package abc;
//public class SinhVien extends HocVien {
//    public static void a(){
//    }
//}
//
//TH9: overload
//package abc;
//public class HocVien {
//    public void a(int b, int c){
//        System.out.println(b+""+c)
//    }
//}
//package abc;
//public class SinhVien extends HocVien {
//    public void a(double d, int c){
//        System.out.println(d+""+c)
//    }
//}
//
//TH10: ko xay ra gi ca
//package abc;
//public class HocVien {
//    public void a(int b, int c){
//        System.out.println(b+""+c)
//    }
//}
//package abc;
//public class SinhVien extends HocVien {
//    public void b(double d, int c){
//        System.out.println(d+""+c)
//    }
//}