package ss4_extend;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneManagement {
    static Scanner scanner = new Scanner(System.in);

    //    static ArrayList<OldPhone> oldPhones = new ArrayList<>();
//    static ArrayList<NewPhone> newPhones = new ArrayList<>();
    static ArrayList<Phone> phones = new ArrayList<>();

    public static void main(String[] args) {
//        oldPhones.add(new OldPhone("DTC0001", "Iphone 15 Promax", 20000000, 1, "Apple", 95.5, "Da qua su dung, tinh trang tot"));
//        oldPhones.add(new OldPhone("DTC0002", "SamSung GALAXY S8", 10000000, 2, "SamSung", 98.0, "Da qua su dung, tinh trang tot"));
//
//        newPhones.add(new NewPhone("DTM0001", "Iphone 12 Promax", 18000000, 3, "Apple", 10));
//        newPhones.add(new NewPhone("DTM0002", "Iphone 13 Promax", 21000000, 4, "Apple", 20));

        phones.add(new OldPhone("DTC0001", "Iphone 15 Promax", 20000000, 1, "Apple", 95.5, "Da qua su dung, tinh trang tot"));
        phones.add(new OldPhone("DTC0002", "SamSung GALAXY S8", 10000000, 2, "SamSung", 98.0, "Da qua su dung, tinh trang tot"));
        phones.add(new NewPhone("DTM0001", "Iphone 12 Promax", 18000000, 3, "Apple", 10));
        phones.add(new NewPhone("DTM0002", "Iphone 13 Promax", 21000000, 4, "Apple", 20));

        int choose;
        while (true) {
            do {
                mainMenu();
                System.out.print("Hay nhap tuy chon: ");
                choose = Integer.parseInt(scanner.nextLine());

                switch (choose) {
                    case 1:
                        showListPhone();
                        break;
                    case 2:
                        addNew();
                        break;
                    case 3:
                        update();
                        break;
                    case 4:
                        delete();
                        break;
                    case 5:
                        sortByPrice();
                        break;
                    case 6:
                        search();
                        break;
                    case 7:
                        return;
                    default:
                        System.out.println("Lua chon khong hop le, xin vui long nhap lai!!");
                }
            } while (choose < 1 || choose > 9);
        }
    }

    private static void mainMenu() {
        System.out.println("============================================================");
        System.out.println("=           ---CHUONG TRINH QUAN LY DIEN THOAI---          =");
        System.out.println("=           1. Xem danh sach dien thoai                    =");
        System.out.println("=           2. Thêm mới                                    =");
        System.out.println("=           3. Cập nhật                                    =");
        System.out.println("=           4. Xóa                                         =");
        System.out.println("=           5. Sắp xếp theo giá                            =");
        System.out.println("=           6. Tìm kiếm                                    =");
        System.out.println("=           7. Thoát                                       =");
        System.out.println("============================================================");
    }

    private static void showListPhone() {
        int choose;
        while (true) {
            do {
                System.out.println("===================================");
                System.out.println("=         1. Xem tất cả           =");
                System.out.println("=         2. Xem điện thoại cũ    =");
                System.out.println("=         3. Xem điện thoại mới   =");
                System.out.println("=         4. Trở về menu chính    =");
                System.out.println("===================================");
                System.out.print("Hay nhap tuy chon: ");
                choose = Integer.parseInt(scanner.nextLine());

                switch (choose) {
                    case 1:
                        System.out.println("=============================================");
                        System.out.println("      ---Danh sach tat ca dien thoai---     ");
                        for (int i = 0; i < phones.size(); i++) {
                            System.out.printf("Thong tin cua dien thoai thu %d:\n", i + 1);
                            phones.get(i).output();
                            System.out.println();
                        }
                        break;
                    case 2:
                        System.out.println("---Danh sach dien thoai cu---");
                        int count = 1;
                        for (Phone phone : phones) {
                            if (phone instanceof OldPhone) {
                                System.out.printf("Thong tin cua dien thoai thu %d:\n", count++);
                                phone.output();
                                System.out.println();
                            }
                        }
                        break;
                    case 3:
                        System.out.println("---Danh sach dien thoai moi---");
                        count = 1;
                        for (Phone phone : phones) {
                            if (phone instanceof NewPhone) {
                                System.out.printf("Thong tin cua dien thoai thu %d:\n", count++);
                                phone.output();
                                System.out.println();
                            }
                        }
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Lua chon khong hop le, xin vui long nhap lai!!");
                }
            } while (choose < 1 || choose > 4);
        }
    }

    private static void addNew() {
        int choose;
        while (true) {
            do {
                System.out.println("1. Thêm mới điện thoại cũ");
                System.out.println("2. Thêm mới điện thoại mới");
                System.out.println("3. Trở về menu chính");

                System.out.print("Hay nhap tuy chon: ");
                choose = Integer.parseInt(scanner.nextLine());

                switch (choose) {
                    case 1:
                        System.out.println("---Thong tin dien thoai cu them vao---");
                        OldPhone oldPhone = new OldPhone();
                        oldPhone.input();
                        oldPhone.setId(getOldIdPhone());
                        phones.add(oldPhone);
                        System.out.println("Da them thong tin dien thoai thanh cong");
                        oldPhone.output();
                        break;
                    case 2:
                        System.out.println("---Thong tin dien thoai moi them vao---");
                        NewPhone newPhone = new NewPhone();
                        newPhone.input();
                        newPhone.setId(getNewIdPhone());
                        phones.add(newPhone);
                        System.out.println("Da them thong tin dien thoai thanh cong");
                        newPhone.output();
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("Lua chon khong hop le, xin vui long nhap lai!!");
                }
            } while (choose < 1 || choose > 3);
        }
    }

    private static String getOldIdPhone() {
        int count = 0;
        for (Phone phone : phones) {
            if (phone instanceof OldPhone) {
                count++;
            }
        }
        return String.format("DTC%4d", count + 1).replace(" ", "0");
    }

    private static String getNewIdPhone() {
        int count = 0;
        for (Phone phone : phones) {
            if (phone instanceof NewPhone) {
                count++;
            }
        }
        return String.format("DTM%4d", count + 1).replace(" ", "0");
    }

    private static void update() {
        boolean isExist = false;
        do {
            System.out.print("Hay nhap ID dien thoai ban muon update: ");
            String id = scanner.nextLine();
            for (Phone phone : phones) {
                if (phone.getId().equals(id)) {
                    isExist = true;
                    phone.input();
                    System.out.println("Cap nhat thong tin thanh cong!");
                    break;
                }
            }
//            for (NewPhone newPhone : newPhones) {
//                if (newPhone.getId().equals(id)) {
//                    isExist = true;
//                    newPhone.input();
//                    System.out.println("Cap nhat thong tin thanh cong!");
//                    break;
//                }
//            }
            if (isExist == false) {
                System.out.println("Khong ton tai ID dien thoai!!");
            }
        } while (isExist == false);
    }

    private static void delete() {
        boolean isExist = false;
        int index = 0;
        do {
            System.out.print("Hay nhap ID dien thoai ban muon xoa: ");
            String id = scanner.nextLine();
            for (Phone phone : phones) {
                if (phone.getId().equals(id)) {
                    isExist = true;
                    phones.remove(phone);
                    System.out.println("Cap nhat thong tin thanh cong!");
                    break;
                }
            }
            int count = 1;
            if (id.contains("DTC")) {
                for (Phone phone : phones) {
                    if (phone instanceof OldPhone) {
                        phone.setId(String.format("DTC%4d", count++).replace(" ", "0"));
                    }
//                for (OldPhone oldPhone : oldPhones) {
//                    oldPhone.setId(String.format("DTC%4d",index).replace(" ","0"));
//                }
//            } else {
//                for (NewPhone newPhone : newPhones) {
//                    if (newPhone.getId().equals(id)) {
//                        isExist = true;
//                        newPhones.remove(newPhone);
//                        System.out.println("Cap nhat thong tin thanh cong!");
//                        break;
//                    }
//                }
                }
            } else {
                for (Phone phone : phones) {
                    if (phone instanceof NewPhone) {
                        phone.setId(String.format("DTM%4d", count++).replace(" ", "0"));
                    }
                }
                if (isExist == false) {
                    System.out.println("Khong ton tai ID dien thoai!!");
                }
            }
        } while (isExist == false);
    }

    private static void sortByPrice() {
        int choose;
        while (true) {
            do {
                System.out.println("1. Tăng gần");
                System.out.println("2. Giảm dần");
                System.out.println("3. Trở về menu chính");

                System.out.print("Hay lua chon tuy chon: ");
                choose = Integer.parseInt(scanner.nextLine());

                switch (choose) {
                    case 1:
                        sortASCPrice();
                        break;
                    case 2:
                        sortDESCPrice();
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("Tuy chon khong chinh xac. Hay nhap lai tuy chon: ");
                }
            } while (choose < 1 || choose > 3);

        }
    }

    private static void sortASCPrice() {
        for (int i = 0; i < phones.size() - 1; i++) {
            for (int j = i + 1; j < phones.size(); j++) {
                if (phones.get(i).getPrice() > phones.get(j).getPrice()) {
                    Phone phoneTemp = new Phone();
                    phoneTemp = phones.get(i);
                    phones.set(i, phones.get(j));
                    phones.set(j, phoneTemp);
                }
            }
        }
    }

    private static void sortDESCPrice() {
        for (int i = 0; i < phones.size() - 1; i++) {
            for (int j = i + 1; j < phones.size(); j++) {
                if (phones.get(i).getPrice() < phones.get(j).getPrice()) {
                    Phone phoneTemp = new Phone();
                    phoneTemp = phones.get(i);
                    phones.set(i, phones.get(j));
                    phones.set(j, phoneTemp);
                }
            }
        }
    }

    private static void search() {
        int choose;
        while (true) {
            do {
                System.out.println("1. Tìm kiếm tất cả điện thoại");
                System.out.println("2. Tìm kiếm điện thoại cũ");
                System.out.println("3. Tìm kiếm điện thoại mới");
                System.out.println("4. Trở về menu chính");

                System.out.print("Hay lua chon tuy chon: ");
                choose = Integer.parseInt(scanner.nextLine());

                switch (choose) {
                    case 1:
                        subSearchMenu(1);
                        break;
                    case 2:
                        subSearchMenu(2);
                        break;
                    case 3:
                        subSearchMenu(3);
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Tuy chon khong chinh xac. Hay nhap lai tuy chon: ");
                }
            } while (choose < 1 || choose > 3);
        }
    }

    private static void subSearchMenu(int phoneType) {
        int choose;
        while (true) {
            do {
                System.out.println("1. Tìm kiếm theo giá (Nhập khoảng từ bao nhiêu đến bao nhiêu)");
                System.out.println("2. Tìm kiếm theo tên");
                System.out.println("3. Tìm kiếm theo hãng");
                System.out.println("4. Trở về menu Tìm kiếm");

                System.out.print("Hay lua chon tuy chon: ");
                choose = Integer.parseInt(scanner.nextLine());

                switch (choose) {
                    case 1:
                        if (phoneType == 1) {
                            searchByPriceAll();
                        } else if (phoneType == 2) {
                            searchByPriceOldPhone();
                        } else if (phoneType == 3) {
                            searchByPriceNewPhone();
                        }
                        break;
                    case 2:
                        if (phoneType == 1) {
                            searchByNameAll();
                        } else if (phoneType == 2) {
                            searchByNameOldphone();
                        } else if (phoneType == 3) {
                            searchByNameNewphone();
                        }
                        break;
                    case 3:
                        if (phoneType == 1) {
                            searchByProductorAll();
                        } else if (phoneType == 2) {
                            searchByProductorOldphone();
                        } else if (phoneType == 3) {
                            searchByProductorNewphone();
                        }
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Tuy chon khong chinh xac. Hay nhap lai tuy chon: ");
                }
            } while (choose < 1 || choose > 4);
        }
    }

    private static void searchByPriceAll() {
        boolean isMatchResult = false;
        int priceFrom;
        int priceTo;
        do {
            System.out.print("Hay nhap khoang gia bat dau tu: ");
            priceFrom = Integer.parseInt(scanner.nextLine());
            System.out.print("Hay nhap khoang gia bat dau tu: ");
            priceTo = Integer.parseInt(scanner.nextLine());

            if (priceTo < priceFrom || priceFrom < 0) {
                System.out.print("Gia tri khong hop le. Hay nhap lai!!");
            }
        } while (priceTo < priceFrom || priceFrom < 0);

        for (Phone phone : phones) {
            if (phone.getPrice() >= priceFrom && phone.getPrice() <= priceTo) {
                phone.output();
                isMatchResult = true;
            }
        }
        if (isMatchResult == false) {
            System.out.println("Khong tim thay ket qua phu hop!!");
        }
    }

    private static void searchByPriceOldPhone() {
        boolean isMatchResult = false;
        int priceFrom;
        int priceTo;
        do {
            System.out.print("Hay nhap khoang gia bat dau tu: ");
            priceFrom = Integer.parseInt(scanner.nextLine());
            System.out.print("Hay nhap khoang gia bat dau tu: ");
            priceTo = Integer.parseInt(scanner.nextLine());

            if (priceTo < priceFrom || priceFrom < 0) {
                System.out.print("Gia tri khong hop le. Hay nhap lai!!");
            }
        } while (priceTo < priceFrom || priceFrom < 0);

        for (Phone phone : phones) {
            if (phone instanceof OldPhone && phone.getPrice() >= priceFrom && phone.getPrice() <= priceTo) {
                phone.output();
                isMatchResult = true;
            }
        }
        if (isMatchResult == false) {
            System.out.println("Khong tim thay ket qua phu hop!!");
        }
    }

    private static void searchByPriceNewPhone() {
        boolean isMatchResult = false;
        int priceFrom;
        int priceTo;
        do {
            System.out.print("Hay nhap khoang gia bat dau tu: ");
            priceFrom = Integer.parseInt(scanner.nextLine());
            System.out.print("Hay nhap khoang gia bat dau tu: ");
            priceTo = Integer.parseInt(scanner.nextLine());

            if (priceTo < priceFrom || priceFrom < 0) {
                System.out.print("Gia tri khong hop le. Hay nhap lai!!");
            }
        } while (priceTo < priceFrom || priceFrom < 0);

        for (Phone phone : phones) {
            if (phone instanceof NewPhone && phone.getPrice() >= priceFrom && phone.getPrice() <= priceTo) {
                phone.output();
                isMatchResult = true;
            }
        }
        if (isMatchResult == false) {
            System.out.println("Khong tim thay ket qua phu hop!!");
        }
    }

    private static void searchByNameAll() {
        boolean isMatchResult = false;
        String name;
        System.out.print("Hay nhap ten cua san pham muon tim: ");
        name = scanner.nextLine();

        for (Phone phone : phones) {
            if (phone.getName().contains(name)) {
                phone.output();
                isMatchResult = true;
            }
        }
        if (isMatchResult == false) {
            System.out.println("Khong tim thay ket qua phu hop!!");
        }
    }

    private static void searchByNameOldphone() {
        boolean isMatchResult = false;
        String name;
        System.out.print("Hay nhap ten cua san pham muon tim: ");
        name = scanner.nextLine();

        for (Phone phone : phones) {
            if (phone instanceof OldPhone && phone.getName().contains(name)) {
                phone.output();
                isMatchResult = true;
            }
        }
        if (isMatchResult == false) {
            System.out.println("Khong tim thay ket qua phu hop!!");
        }
    }

    private static void searchByNameNewphone() {
        boolean isMatchResult = false;
        String name;
        System.out.print("Hay nhap ten cua san pham muon tim: ");
        name = scanner.nextLine();

        for (Phone phone : phones) {
            if (phone instanceof NewPhone && phone.getName().contains(name)) {
                phone.output();
                isMatchResult = true;
            }
        }
        if (isMatchResult == false) {
            System.out.println("Khong tim thay ket qua phu hop!!");
        }
    }

    private static void searchByProductorAll() {
        boolean isMatchResult = false;
        String product;
        System.out.print("Hay nhap ten cua san pham muon tim: ");
        product = scanner.nextLine();

        for (Phone phone : phones) {
            if (phone.getProductor().contains(product)) {
                phone.output();
                isMatchResult = true;
            }
        }
        if (isMatchResult == false) {
            System.out.println("Khong tim thay ket qua phu hop!!");
        }
    }

    private static void searchByProductorOldphone() {
        boolean isMatchResult = false;
        String product;
        System.out.print("Hay nhap ten cua san pham muon tim: ");
        product = scanner.nextLine();

        for (Phone phone : phones) {
            if (phone instanceof OldPhone && phone.getProductor().contains(product)) {
                phone.output();
                isMatchResult = true;
            }
        }
        if (isMatchResult == false) {
            System.out.println("Khong tim thay ket qua phu hop!!");
        }
    }

    private static void searchByProductorNewphone() {
        boolean isMatchResult = false;
        String product;
        System.out.print("Hay nhap ten cua san pham muon tim: ");
        product = scanner.nextLine();

        for (Phone phone : phones) {
            if (phone instanceof NewPhone && phone.getProductor().contains(product)) {
                phone.output();
                isMatchResult = true;
            }
        }
        if (isMatchResult == false) {
            System.out.println("Khong tim thay ket qua phu hop!!");
        }
    }
}

